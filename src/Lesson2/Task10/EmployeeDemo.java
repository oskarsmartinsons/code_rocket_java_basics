package Lesson2.Task10;

class EmployeeDemo {
    public static void main(String[] args) {
        String name = "Rob";
        double salary = 450;
        int hours = 7;

        Employee employee = new Employee(name,salary,hours);

        employee.getInfo(salary, hours);
        employee.addWork();
        employee.addSalary();
        //print out
        employee.printOut();
    }
}
