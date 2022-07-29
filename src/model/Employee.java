package model;

public class Employee {
    int id;
    String sal;
    String Name;

    public Employee(int id, String sal, String name) {
        this.id = id;
        this.sal = sal;
        Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSal() {
        return sal;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", sal='" + sal + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }
}
