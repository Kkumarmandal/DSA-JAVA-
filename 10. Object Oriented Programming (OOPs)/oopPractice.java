public class oopPractice {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "aman";
        System.out.println(s.name);
        
    }
}
class Student{
    String name;
    int marks;
}
class Person {
    String name;
    int weight;
}
class Student1 extends Person{
    int rollNumber;
    String schoolName;
}