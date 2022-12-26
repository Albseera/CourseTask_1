import java.util.Objects;

public class Employee {

    public static int count=0; // Счетчик
    private String fullName;
    private int department;
    private float pay;
    private int id ;


    public Employee(String fullName, int department, int pay) {
        this.fullName = fullName;
        this.department = department;
        this.pay = pay;
        count++;
        id=count;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
    public int getId() {
        return id;
    }

    public float getPay() {
        return pay;
    }

    public void setPay(float pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Ид: "+id+" Ф.И.О : "+fullName+" Отдел: "+department+" Зарплата: "+pay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return fullName.equals(employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName);
    }
}
