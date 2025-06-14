package Entity;

public class Student {
    private int id;
    private String name;
    private Address address;

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public Student(int id, String name, Address address) {
        id = id;
        this.name = name;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
