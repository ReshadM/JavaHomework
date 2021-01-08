package Employee;

public class Employee {

    public String name;
    public String position;
    public String email;
    public String phoneNumber;
    public int salary;
    public int age;


    public Employee(String name, String position, String email, String phoneNumber, int salary, int age) {

        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

    }

    public static void main(String[] args) {

        Employee employee = new Employee("Maksim", "Software Engineer", "maksim@mail.ru", "79215556655", 500000, 28);

        Employee[] staffArray = new Employee[5];
        staffArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        staffArray[1] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 45);
        staffArray[2] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 26);
        staffArray[3] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 25);
        staffArray[4] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 41);

        for (int i = 0; i < 5; i++) {
            if (staffArray[i].age > 40) {
                System.out.println(staffArray[i].age);
            }

        }
        printInfo(employee);

    }

    public static void printInfo(Employee employee) {
        System.out.printf("Employee name: %s; position: %s; email: %s; phoneNumber: %s; salary: %s; age: %s;", employee.name, employee.position, employee.email, employee.phoneNumber, employee.salary, employee.age);
    }

}


