import static java.lang.System.out;

public class Sotrudniki {

    private  String fio;
    private  String position;
    private  String email;
    private  String number;
    private  double salary;
    private int age;

    public Sotrudniki(String fio, String position, String email, String number, double salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        out.printf("ФИО: %s, Должность: %s, Email: %s, Телефон: %s, Зарплата: %.2f, Возраст: %d%n",
                fio, position, email,number, salary, age);
    }
    public static void main(String[] args) {

        Sotrudniki[] sotrudniki = {
                new Sotrudniki("Иванов Иван Петрович", "Инженер", "ivanov@mailbox.com", "892312312", 30000, 30),
                new Sotrudniki("Петров Пётр Анатольевич", "Менеджер", "petrov@mailbox.com", "892312313", 35000, 32),
                new Sotrudniki("Сидоров Егор Александрович", "Аналитик", "sidorov@mailbox.com", "892312314", 40000, 28),
                new Sotrudniki("Иванова Мария Евгеньевна", "Бухгалтер", "maria@mailbox.com", "892312315", 45000, 40),
                new Sotrudniki("Маркелов Алексей Иванович", "Директор", "alexey@mailbox.com", "892312316", 50000, 45)
        };
        for (Sotrudniki sotrudnik : sotrudniki) {
            sotrudnik.printInfo();
        }
    }
}
