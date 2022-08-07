package dao;

import annotations.Column;
import annotations.Id;
import annotations.Table;

import javax.persistence.GeneratedValue;
import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MetaInfo<T> {
    private static final Map<Class<?>, String> JavaTypeToSqlType = Map.of(
            int.class, "INTEGER",
            Integer.class, "INTEGER",
            double.class, "FLOAT",
            Double.class, "FLOAT",
            long.class, "BIGINTEGER",
            Long.class, "BIGINTEGER",
            String.class, "VARCHAR(250)"
    );

    private static final Map<Class<?>, MetaInfo> cache = new HashMap<>();

    Class<T> cls;
     String tableName;
    PrimaryKey primaryKey;
     List<ColumnInfo> columns = new ArrayList<>();

     ColumnInfo instance;

    static class PrimaryKey extends ColumnInfo {

    }

     static class ColumnInfo {
        Field field;
        String columnName;

        public ColumnInfo() {

        }

        public ColumnInfo(Field field, String columnName) {
            this.field = field;
            this.columnName = columnName;
        }

        Object getValue(Object o) {
            field.setAccessible(true);
            try {
                return field.get(o);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        String getType() {
            field.setAccessible(true);
            return field.getType().getSimpleName();
        }
    }

    private MetaInfo(Class<T> cls) {
        this.cls = cls;
        init();
    }

    public static <T1> MetaInfo<T1> of(Class<T1> cls) {
        return cache.computeIfAbsent(cls, c -> new MetaInfo(cls));
    }

    private void init() {
        setTableName();
        setPrimaryKey();
        setColumns();
    }

    private void setColumns() {
        for (Field field : cls.getDeclaredFields()) {
            if (field.isAnnotationPresent(Column.class) && !field.isAnnotationPresent(Id.class)) {
                columns.add(new ColumnInfo(field, field.getName()));
            }
        }
    }

    private void setPrimaryKey() {
        for (var field : cls.getDeclaredFields()) {
            if (field.isAnnotationPresent(Id.class)) {
                var res = new PrimaryKey();
                res.field = field;
                res.columnName = field.getName();
                this.primaryKey = res;
                break;
            }
        }
    }

    private void setTableName() {
        var ann = cls.getDeclaredAnnotation(Table.class);
        if (ann != null && !ann.value().isEmpty()) {
            tableName = ann.value();
        } else {
            tableName = cls.getSimpleName();
        }
    }

    public String createTableSql() {
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE ").append(tableName).append(" (");
        sb.append(columnDefinition(primaryKey)).append(" NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY");
        for (var column : columns) {
            sb.append(", \n");
            sb.append(columnDefinition(column));
        }
        sb.append(");");
        return sb.toString();
    }

    private String columnDefinition(ColumnInfo column) {
        // -> name VARCHAR(250)
        String sqlType = JavaTypeToSqlType.get(column.field.getType());
        return column.columnName + " " + sqlType;
    }
}
