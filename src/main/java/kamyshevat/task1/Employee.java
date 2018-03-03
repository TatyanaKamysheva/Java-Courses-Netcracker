package kamyshevat.task1;

public class Employee {
    int id;
    String firstName;
    String lastName;
    int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int persent) {
        salary *= 1 + (double) persent / 100;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
    }
}
