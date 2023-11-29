import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Course {
    private String courseName;
    private String startDate;
    private String endDate;
    private String instructor;
    private List<Event> events;

    public Course(String courseName, String startDate, String endDate, String instructor, List<Event> events) {
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.instructor = instructor;
        this.events = events;
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public void printCourse() {
        System.out.println("Название курса: " + courseName);
        System.out.println("Дата начала: " + startDate);
        System.out.println("Дата окончания: " + endDate);
        System.out.println("Предподаватель: " + instructor);

        System.out.println("Мероприятия: ");
        for (Event event : events) {
            System.out.println("Название: " + event.getEventName());
        }
    }

    public static Course inputFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название курса: ");
        String courseName = scanner.next();
        System.out.print("Введите дату начала курса: ");
        String startDate = scanner.next();
        System.out.print("Введите дату окончания курса: ");
        String endDate = scanner.next();
        System.out.print("Введите имя предподавателя: ");
        String instructor = scanner.next();

        List<Event> events = new ArrayList<>();
        char addEvent;
        do {
            Event event = Event.inputFromConsole();
            events.add(event);

            System.out.print("Добавить еще одно мероприятие курса? (y/n): ");
            addEvent = scanner.next().charAt(0);
        } while (addEvent == 'y' || addEvent == 'Y');

        return new Course(courseName, startDate, endDate, instructor, events);
    }
}