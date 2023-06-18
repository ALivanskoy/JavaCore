public class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    public static void raiseSalary(Employee[] employees, double percent) {
        for (int i = 0; i < employees.length; i++) {
            if (!(employees[i] instanceof Manager)) {
                double newSalary = employees[i].salary * (1 + percent / 100);
                employees[i].salary = newSalary;
            }
        }
    }
}
