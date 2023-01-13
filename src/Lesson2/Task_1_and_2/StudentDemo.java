package Lesson2.Task_1_and_2;

public class StudentDemo {
    public static void main(String[] args) {
        Student studentJohn = new Student("John", 2,
                        "+371 12345678", "Lielais prospekt 12, Ventpsils");

        Student studentSam = new Student("Sam", 1,
                "+371 87654321", "Vasarnicu iela 1, Ventpsils");

        //print out
        printStudent(studentJohn);
        printStudent(studentSam);
    }
    static void printStudent(Student student) {
        System.out.printf("Name: %s %n", student.getName() );
        System.out.printf("Roll number: %d %n", student.getRollNumber() );
        System.out.printf("Phone number: %s %n", student.getPhone());
        System.out.printf("Address: %s %n", student.getAddress());
        System.out.printf("============================================ %n");
    }
}
