import java.util.List;

public class Employee {
    int id;
    String Name;
    String salary;
    List<String> placesWOrked;

    public Employee(int id, String name, String salary, List<String> placesWOrked) {
        this.id = id;
        Name = name;
        this.salary = salary;
        this.placesWOrked = placesWOrked;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", salary='" + salary + '\'' +
                ", placesWOrked=" + placesWOrked +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public List<String> getPlacesWOrked() {
        return placesWOrked;
    }

    public void setPlacesWOrked(List<String> placesWOrked) {
        this.placesWOrked = placesWOrked;
    }
}
