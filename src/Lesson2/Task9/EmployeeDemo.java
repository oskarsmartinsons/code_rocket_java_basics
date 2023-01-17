package Lesson2.Task9;

class EmployeeDemo {
    public static void main(String[] args) {
        Employee employeeOne = new Employee("Robert", 1994,1500, "64C - WallStreets");
        Employee employeeTwo = new Employee("Sam", 2000,2000, "68D - WallStreets");
        Employee employeeThree = new Employee("Robert", 1999,3000, "26B - WallStreets");

        Employee.printOut(employeeOne);
        Employee.printOut(employeeTwo);
        Employee.printOut(employeeThree);
    }
}
