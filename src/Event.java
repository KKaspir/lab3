import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Event {
    private String eventName;
    private String date;
    private String location;
    private List<Student> eventMembers;

    public Event(String eventName, String date, String location, List<Student> eventMembers) {
        this.eventName = eventName;
        this.date = date;
        this.location = location;
        this.eventMembers = eventMembers;
    }

    public void addParticipant(Student student) {
        eventMembers.add(student);
    }

    public void printEvent() {
        System.out.println("Название мероприятия: " + eventName);
        System.out.println("Дата: " + date);
        System.out.println("Место проведения: " + location);

        System.out.println("\nУчастники:");
        for (Student student : eventMembers) {
            System.out.println("Имя: " + student.getFirstName() + " " + student.getLastName());
        }
    }

    public static Event inputFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название мероприятия: ");
        String eventName = scanner.next();
        System.out.print("Введите дату мероприятия: ");
        String date = scanner.next();
        System.out.print("Введите место проведения мероприятия: ");
        String location = scanner.next();

        List<Student> eventMembers = new ArrayList<>();
        char addParticipant;
        do {
            Student student = Student.inputFromConsole();
            eventMembers.add(student);

            System.out.print("Добавить еще одного участника мероприятия? (y/n): ");
            addParticipant = scanner.next().charAt(0);
        } while (addParticipant == 'y' || addParticipant == 'Y');

        return new Event(eventName, date, location, eventMembers);
    }

    public String getEventName() {
        return eventName;
    }
}
