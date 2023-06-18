public class App {
        public static void main(String[] args) {
            Employee[] employees = new Employee[3];
            employees[0] = new Employee("Евгений", 30000);
            employees[1] = new Employee("Пётр", 25000);
            employees[2] = new Manager("Анна", 50000);

            System.out.println("Зарплаты до повышения: ");

            for (int i = 0; i < employees.length; i++) {
                System.out.println(employees[i].getClass()+" "+ employees[i].name + ": " + employees[i].salary);
            }

            Manager.raiseSalary(employees, 10);

            System.out.println("Зарплаты после повышения: ");

            for (int i = 0; i < employees.length; i++) {
                System.out.println(employees[i].getClass()+" "+ employees[i].name + ": " + employees[i].salary);
            }
        }
    }
