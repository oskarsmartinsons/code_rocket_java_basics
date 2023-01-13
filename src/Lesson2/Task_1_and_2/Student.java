package Lesson2.Task_1_and_2;

public class Student {
    private final String name;
    private final Integer rollNumber;
    private final String phone;
    private final String address;

    public Student(String name, Integer rollNumber, String phone, String address) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.phone = phone;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public Integer getRollNumber() {
        return rollNumber;
    }
    public String getPhone() {
        return phone;
    }
    public String getAddress() {
        return address;
    }
}