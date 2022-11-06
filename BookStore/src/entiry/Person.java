package entiry;

public class Person {

    private String id;
    private String name;
    private int number;
    private String address;
    public Person() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person(String id, String name, int number, String address) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.address = address;
    }
}
