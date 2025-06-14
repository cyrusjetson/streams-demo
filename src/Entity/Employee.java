package Entity;

public class Employee {
    private int id;
    private String name;
    private String department;
    private Address address;

    public Employee(int id, String department) {
        this.id = id;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", address=" + address +
                '}';
    }

    public Employee(int id, String name, String department, Address address) {
        id = id;
        this.name = name;
        this.department = department;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
