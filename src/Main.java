import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Grade few = new Grade("Математика", 5.0, "20.09.2023");

        ArrayList<Grade> studentGrades = new ArrayList<>();
        studentGrades.add(new Grade("Математика", 5.0, "20.09.2023"));
        studentGrades.add(new Grade("Физика", 4.5, "20.09.2023"));


        Student student = new Student("Иван", "Иванов", "01.01.2000", "12345", "ivan@example.com", studentGrades);

        ArrayList<Student> teamMembers = new ArrayList<>();
        teamMembers.add(student);

        Project project = new Project("name", "description", "1", "1", teamMembers);
        Student student3 = new Student("Третий", "Студент", "03.03.2003", "33333", "student3@example.com", List.of());
        project.addTeamMember(student3);

        ArrayList<Event> courseEvents = new ArrayList<>();

        Course course = new Course("Программирование", "01.01.2001", "10.10.2001", "Троицкий", courseEvents);
        Event event = new Event("Конференция", "20.10.2023", "Конференц-зал", teamMembers);
        course.addEvent(event);
        Event event2 = new Event("Семинар", "25.10.2023", "Аудитория 101", teamMembers);
        course.addEvent(event2);

        System.out.println("Вызов printStudent\n");
        student.printStudent();
        System.out.println();

        double gpa = student.avgGrade();
        System.out.println("Средний балл студента: " + gpa);
        System.out.println();

        System.out.println("Вызов printProject\n");
        project.printProject();
        System.out.println();

        System.out.println("Вызов printProject после добавления 3 студента\n");
        project.addTeamMember(student3);
        project.printProject();
        System.out.println();

        System.out.println("Вызов printCourse\n");
//        course.print();
        System.out.println();

        System.out.println("Вызов printCourse с новым event\n");
        course.addEvent(event2);
//        course.print();
        System.out.println();

        System.out.println("Вызов printEvent\n");
        event.printEvent();
        System.out.println();

        System.out.println("Вызов grade inputFromConsole\n");
        Grade grade = Grade.inputFromConsole();
        grade.printGrade();

        System.out.println("Вызов student inputFromConsole\n");
        Student studente = Student.inputFromConsole();
        studente.printStudent();
    }
}