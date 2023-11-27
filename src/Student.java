import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String studentID;
    private String email;
    private List<Grade> grades;

    public Student(String firstName, String lastName, String dateOfBirth, String studentID, String email, List<Grade> grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.studentID = studentID;
        this.email = email;
        this.grades = grades;
    }

    public double avgGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double totalScore = 0.0;
        for (Grade grade : grades) {
            totalScore += grade.getScore();
        }
        return totalScore / grades.size();
    }

    public void print() {
        System.out.println("Имя: " + firstName);
        System.out.println("Фамилия: " + lastName);
        System.out.println("Дата рождения: " + dateOfBirth);
        System.out.println("Номер студенческого билета: " + studentID);
        System.out.println("Email: " + email);

        System.out.println("\nОценки:");
        for (Grade grade : grades) {
            grade.print();
            System.out.println();
        }
    }

    public static Student inputFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String firstName = scanner.next();
        System.out.print("Введите фамилию: ");
        String lastName = scanner.next();
        System.out.print("Введите дату рождения: ");
        String dateOfBirth = scanner.next();
        System.out.print("Введите номер студенческого билета: ");
        String studentID = scanner.next();
        System.out.print("Введите email: ");
        String email = scanner.next();

        List<Grade> grades = new ArrayList<>();
        char addGrade;
        do {
            Grade grade = Grade.inputFromConsole();
            grades.add(grade);

            System.out.print("Добавить еще одну оценку? (y/n): ");
            addGrade = scanner.next().charAt(0);
        } while (addGrade == 'y' || addGrade == 'Y');

        return new Student(firstName, lastName, dateOfBirth, studentID, email, grades);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
