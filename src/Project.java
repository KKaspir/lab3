import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Project {
    private String projectName;
    private String description;
    private String startDate;
    private String endDate;
    private List<Student> teamMembers;

    public Project(String projectName, String description, String startDate, String endDate, List<Student> teamMembers) {
        this.projectName = projectName;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.teamMembers = teamMembers;
    }

    public void addTeamMember(Student student) {
        teamMembers.add(student);
    }

    public void print() {
        System.out.println("Название проекта: " + projectName);
        System.out.println("Описание: " + description);
        System.out.println("Дата начала: " + startDate);
        System.out.println("Дата окончания: " + endDate);

        System.out.println("\nУчастники:");
        for (Student student : teamMembers) {
            System.out.println("Имя: " + student.getFirstName() + " " + student.getLastName());
        }
    }

    public static Project inputFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название проекта: ");
        String projectName = scanner.next();
        System.out.print("Введите описание проекта: ");
        String description = scanner.next();
        System.out.print("Введите дату начала: ");
        String startDate = scanner.next();
        System.out.print("Введите дату окончания: ");
        String endDate = scanner.next();

        List<Student> teamMembers = new ArrayList<>();
        char addMember;
        do {
            Student student = Student.inputFromConsole();
            teamMembers.add(student);

            System.out.print("Добавить еще одного участника? (y/n): ");
            addMember = scanner.next().charAt(0);
        } while (addMember == 'y' || addMember == 'Y');

        return new Project(projectName, description, startDate, endDate, teamMembers);
    }
}
