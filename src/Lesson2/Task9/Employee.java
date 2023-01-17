package Lesson2.Task9;

class Employee {
    private final String name;
    private final int year;
    private final double salary;
    private final String address;
    public Employee(String name, int year, double salary, String address) {
        this.name = name;
        this.year = year;
        this.salary = salary;
        this.address = address;
    }
    public String getName() {return name;}
    public int getYear() {return year;}
    public double getSalary() {return salary;}
    public String getAddress() {return address;}

    static void printOut(Employee myEmployee) {
        System.out.println(myEmployee.getName()+" "+myEmployee.getYear()+" "+ myEmployee.getSalary()+" "+myEmployee.getAddress());
    }
}
