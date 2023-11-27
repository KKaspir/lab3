import java.util.Scanner;

class Grade {
    private String subject;
    private double score;
    private String date;

    public Grade(String subject, double score, String date) {
        this.subject = subject;
        this.score = score;
        this.date = date;
    }

    public void print() {
        System.out.println("Предмет: " + subject);
        System.out.println("Оценка: " + score);
        System.out.println("Дата: " + date);
    }

    public static Grade inputFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите предмет: ");
        String subject = scanner.next();
        System.out.print("Введите оценку: ");
        double score = scanner.nextDouble();
        System.out.print("Введите дату: ");
        String date = scanner.next();

        return new Grade(subject, score, date);
    }

    public double getScore() {
        return score;
    }
}