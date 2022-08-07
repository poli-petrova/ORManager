package org.example;

import columns.Students;
import columns.Subjects;
import columns.Teachers;
import dao.Manager;

public class Main {
    public static void main(String[] args) throws Exception {
        Manager manager = new Manager();
        manager.withPropertiesFrom("persistence.properties");

        // --------DROP ALL TABLE----------
//        manager.dropTable(Subjects.class);
//        manager.dropTable(Students.class);
//        manager.dropTable(Teachers.class);
        //--------------------


//        Subjects newSubject = new Subjects();
//        newSubject.setId(2022);
//
//        var delete = manager.delete(newSubject);
//        System.out.println(delete);

//        var find = manager.findByID(2023,Subjects.class);
//        System.out.println(find);
//


//        manager.dropTable(Students.class);


//        Students students2 = new Students();
//        students2.setStudentId(5);
//        students2.setFirstName("Second");
//        students2.setLastName("Third");
//        manager.save(students2);


//        Subjects newGeography = new Subjects();
//        newGeography.setId(3);
//
//        manager.save(geography);


//        manager.merge(newGeography);

//        var update = manager.update(newGeography);
//        System.out.println(update.getSubjectName());


//        var delete = manager.delete(newGeography);
//        System.out.println(delete);


//        var list = manager.findAll(Subjects.class);

//        for(var i : list){
//            System.out.print(i + " ");
//        }


//        Subjects math = new Subjects();
//        math.setId(1);
//        math.setSubjectName("Math");

//        Subjects mostPowerfulSubject = new Subjects();
//        mostPowerfulSubject.setId(4);
//        mostPowerfulSubject.setSubjectName("Most Powerful");

//        var update = manager.update(mostPowerfulSubject);
//        System.out.println(update.getSubjectName());

//        boolean test = manager.delete(math);
//        System.out.println(test);

//        boolean test = manager.delete()
//        manager.register(Students.class,Subjects.class);
//        manager.register(Students.class,Subjects.class, Teachers.class);

//        Subjects subjects = new Subjects();
//        subjects.setId(4);
//        subjects.setSubjectName("Biology");
//
//        boolean result = manager.insert(subjects);
//        System.out.println(result);

//        Subjects computerScience = new Subjects();
//        computerScience.setId(2);
//        computerScience.setSubjectName("Computer Science");
//
//        boolean result = manager.insert(computerScience);
//        System.out.println(result);

//        var id = manager.findByID(2,Subjects.class);
//        System.out.println(id);

//        var findAll = manager.findAll(Subjects.class);

//        Subjects subjects = new Subjects();

//        Subjects subjects = new Subjects();
//        subjects.setId(2);
//
//        Subjects biology = new Subjects();
//        biology.setId(4);
//        biology.setSubjectName("Biology");
//
//        var findById = manager.findByID(4,biology.getClass());
//        System.out.println(findById);

//        Optional<Subjects> t1 = manager.findByID(4,Subjects.class);
//        t1.ifPresent((name) -> System.out.println(name.getSubjectName()));

//        var findAll = manager.findAll(Subjects.class);

//
//        Subjects subjects = new Subjects();
//        subjects.setId(3);
//        subjects.setSubjectName("New Computer Science First");
//        var update = manager.merge(subjects);
//        System.out.println(update);

//        Subjects newSubject = new Subjects();
//        newSubject.setId(3);
//        newSubject.setSubjectName("New Subject");

//        var insert = manager.insert(newSubject);
//
//        Subjects mostPowerfulSubject = new Subjects();
//        mostPowerfulSubject.setId(2);
//        mostPowerfulSubject.setSubjectName("Most Powerful Subject Is Computer Science");
//
//        var update = manager.update(mostPowerfulSubject);

//        var findById = manager.findByID(2, Subjects.class);
//        System.out.println(findById);

//        var findById = manager.findByID(3,Subjects.class);
//        System.out.println(findById);

//        var select = manager.findAll(Subjects.class);

//        select.stream().forEach(e -> System.out.print(e + " "));

//        ConnectionFactory connectionFactory = new ConnectionFactory();
//        connectionFactory.connect();

//        connectionFactory.disconnect();

//        Subjects math = new Subjects();
//        math.setSubjectId(1);
//        math.setSubjectName("Math");
//
//        Subjects literature = new Subjects();
//        literature.setSubjectId(2);
//        literature.setSubjectName("Literature");
//
//        Subjects computerSciense = new Subjects();
//        computerSciense.setSubjectId(3);
//        computerSciense.setSubjectName("Computer Sciense");
//
//        Subjects biology = new Subjects();
//        biology.setSubjectId(4);
//        biology.setSubjectName("Biology");
//
//        Teachers firstTeacher = new Teachers();
//        firstTeacher.setTeacherId(1);
//        firstTeacher.setTeacherFirstName("John");
//        firstTeacher.setTeacherLastName("Rambo");
//        firstTeacher.getSubjects().add(math);
//        firstTeacher.getSubjects().add(literature);
//
//        Teachers secondTeacher = new Teachers();
//        secondTeacher.setTeacherId(2);
//        secondTeacher.setTeacherFirstName("Britnie");
//        secondTeacher.setTeacherLastName("Spierse");
//        secondTeacher.getSubjects().add(computerScience);
//        secondTeacher.getSubjects().add(biology);
//
//
//        Students student1 = new Students();
//        student1.setStudentId(1);
//        student1.setFirstName("Alex");
//        student1.setLastName("Alexov");
//
//        Students student2 = new Students();
//        student2.setStudentId(2);
//        student2.setFirstName("Petra");
//        student2.setLastName("Petrova");
//
//        Students student3 = new Students();
//        student3.setStudentId(3);
//        student3.setFirstName("Miryan");
//        student3.setLastName("Miryanova");
//
//        Students student4 = new Students();
//        student4.setStudentId(4);
//        student4.setFirstName("Stavre");
//        student4.setLastName("Stavrevski");
//
//        Students student5 = new Students();
//        student5.setStudentId(5);
//        student5.setFirstName("Mihail");
//        student5.setLastName("Mihailov");
//
//
//        GroupOfStudents firstGruop = new GroupOfStudents();
//        firstGruop.setGroupId(1);
//        firstGruop.setGroupName("First Group");
//        firstGruop.getGroup().add(student1);
//        firstGruop.getGroup().add(student2);
//
//        GroupOfStudents secondGroup = new GroupOfStudents();
//        secondGroup.setGroupId(2);
//        secondGroup.setGroupName("Second Group");
//        secondGroup.getGroup().add(student3);
//        secondGroup.getGroup().add(student4);
//        secondGroup.getGroup().add(student5);
//
//        firstGruop.getSubjects().add(math);
//        firstGruop.getSubjects().add(literature);
//
//        secondGroup.getSubjects().add(computerSciense);
//        secondGroup.getSubjects().add(biology);

//        Grades a = new Grades();
//        a.setGradeId(1);
//        a.setGradeName("A");
//
//        Grades a1 = new Grades();
//        a1.setGradeId(2);
//        a1.setGradeName("A+");
//
//        Grades b = new Grades();
//        b.setGradeId(3);
//        b.setGradeName("B");
//
//        Grades b1 = new Grades();
//        b1.setGradeId(4);
//        b1.setGradeName("B+");
//
//        Grades c = new Grades();
//        c.setGradeId(5);
//        c.setGradeName("C");
//
//        Grades c1 = new Grades();
//        c1.setGradeId(6);
//        c1.setGradeName("C+");
//
//
//        firstTeacher.getSubjects().stream().map(e -> e.getSubjectName() == "Math").collect(Collectors.toList());
//
//        firstTeacher.getStudents().getSubjects().setGrades(a);


//        Configuration config = new Configuration().configure().addAnnotatedClass(Students.class).addAnnotatedClass(Subjects.class).addAnnotatedClass(Teachers.class).addAnnotatedClass(GroupOfStudents.class);
//        config.addClass(columns.Subjects.class);

//        Configuration configuration = new Configuration();

//        configuration.addClass(columns.Subjects.class);
//        configuration.addClass(columns.Students.class);
//        configuration.addClass(columns.Teachers.class);
//        configuration.addClass(columns.GroupOfStudents.class);

        //        Configuration config = new Configuration().configure().addAnnotatedClass(GroupOfStudents.class).addAnnotatedClass(Teachers.class);
//        ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
//        SessionFactory sessionFactory = config.buildSessionFactory(registry);
//        Session session = sessionFactory.openSession();
//
//        session.beginTransaction();
//
//        session.save(math);
//        session.save(literature);
//        session.save(computerScience);
//        session.save(biology);
//        session.save(firstTeacher);
//        session.save(secondTeacher);
//        session.save(student1);
//        session.save(student2);
//        session.save(student3);
//        session.save(student4);
//        session.save(student5);
//        session.save(firstGruop);
//        session.save(secondGroup);
//
//        session.getTransaction().commit();

    }
}