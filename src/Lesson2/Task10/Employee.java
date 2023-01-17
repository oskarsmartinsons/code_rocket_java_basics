package Lesson2.Task10;

class Employee {
    private String name;
    private double salary;
    private int hours;

    public Employee(String name, double salary, int hours) {
        this.name = name;
        this.salary = salary;
        this.hours = hours;
    }
    public void getInfo(double salary, int hours) {
        this.salary =salary;
        this.hours=hours;
    }
   public double addSalary() {
       if (salary<500) {
           salary+=10;
       }
       return salary;
    }
   public double addWork() {
       if (hours >6) {
           salary+=5;
       }
        return salary;
   }
   void printOut() {
        System.out.println("Name: " + name + ", Salary =  " + salary);
    }
}
