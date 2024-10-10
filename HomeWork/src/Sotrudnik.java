import static java.lang.System.*;

public class Sotrudnik {
    private String fullName;
    private String position;
    private String email;
    private String number;
    private double salary;
    private int age;

    public Sotrudnik(String fullName, String position, String email, String number, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        out.printf("Имя: %s, Должность: %s, Email: %s, Телефон: %s, Зарплата: %.2f, Возраст: %d%n",
                fullName, position, email, number, salary, age);
    }

    public static void main(String[] args) {
        Sotrudnik sotrudnik = new Sotrudnik("Петров Алексей Юрьевич", "Тестировщик", "petrov@gmail.ru", "79261456974", 50000.00, 35);
        sotrudnik.printInfo();
    }
}



