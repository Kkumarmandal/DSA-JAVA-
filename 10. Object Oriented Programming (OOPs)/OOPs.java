public class OOPs {
    public static void main(String[] args) {
        /*Student s1 = new Student();
        s1.name = "Kishan";
        s1.rollNo = 113;     
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1); //copy
        s2.password = "xyz";
        s1.marks[2] = 100;

        for (int i = 0; i < 3; i++){
            System.out.println(s2.marks[i]);
        }*/

        /*Fish shark = new Fish();
        shark.eat();*/

        /*Dogs dobby = new Dogs();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);*/

        /*Fish catfish = new Fish();
        catfish.Swim();*/

        /*Claculator calc = new Claculator();
        System.out.println(calc.sum((float)1.9, (float)5.4));
        System.out.println(calc.sum(1, 2, 3));

        Deer d = new Deer();
        d.eat();*/  
        
        /*Horse h = new Horse();
        h.eat();
        h.walk();
        
        Mustang myHorse = new Mustang();
        // Animal > Horse > Mustang*/

        // chicken c = new chicken();
        // c.eat();;
        // c.walk();

        /*Queen q = new Queen();
        q.moves();

        Bear b = new Bear();
        b.Food();*/

        Studentk s1 = new Studentk();
        s1.schoolName = "jmv";

        Studentk s2 = new Studentk();
        System.out.println(s2.schoolName);

        Studentk s3 = new Studentk();
        s3.schoolName = "lfhs";
       


    
    }    
}

class Pen {
    private String color;
    private int tip;
    int length;
    String name;

    String getColor (){
        return this.color;
    }
    int getTip () {
        return this.tip;
    }
    int getLength (){
        return this.length;
    }

    void setColor (String newcolor){
        color = newcolor;
    }
    void setTip (int newTip){
        tip = newTip;
    }
    void setLength (int newlength){
        length = newlength;
    }
}

class Student {
    String name;  // Properties
    int  rollNo;  // Properties
    String password; // Properties
    int marks [] ; //

    // Shallow Copy Constructor
    /*Student (Student s1){
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        marks = new int [3];
        this.marks = s1.marks;
    }*/

    // Deep Copy constructor
    Student (Student s1){
        marks = new int [3];
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        for (int i = 0; i < marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }


    Student (){
        marks = new int [3];
        System.out.println("Constructor is called ...!");
    }

    Student (String name){
        marks = new int [3];
        this.name = name;   
    }

    Student (int rollNo){
        marks = new int [3];
        this.rollNo = rollNo;   
    }

}

// Base class
/*class Animal {
    String color;
    void eat (){
        System.out.println("eats");
    }
    void breathe (){
        System.out.println("Breathes");
    }
}*/

// Derived class
/*class Fish extends Animal {
    int fins;

    void Swim(){
        System.out.println("swim in watter");
    }
}*/

/*class Mamals extends Animal {
    void walk (){
        System.out.println("Walk");
    }
}*/
/*class Dogs extends Mamals {
    String breed;
}*/
/*class Fish extends Animal {
    void Swim (){
        System.out.println("swim");
    }
}*/
/*class bird extends Animal {
    void fly (){
        System.out.println("fly");
    }
}*/
 
/*class Claculator {
    int sum (int a , int b){
        return a + b;
    }

    float sum (float a , float b){
        return a + b; 
    }
    
    int sum (int a , int b, int c){
        return a +b +c;
    }
}*/

/*class Animal {
    void eat (){
        System.out.println("Eat Anything");
    }
}
class Deer extends Animal {
    void eat (){
        System.out.println("Eat grass ");
    }
}*/

abstract class Animal {
    String color ;

    Animal(){
        System.out.println("Animal Contructor is called");
    }

    void eat (){
        System.out.println("Animal can eat");
    }

    abstract void walk();
}
class Horse extends Animal {
    Horse (){
        System.out.println("Horse Constructor is called");
    }
    void changeColor() {
        color = "Darkbrown";
    }
    void walk (){
        System.out.println("Walk on 4 leg");
    }
}
class Mustang extends Horse {
    Mustang (){
        System.out.println("Mustang Constructor is called");
    }
}
class chicken extends Animal {
    void walk (){
        System.out.println("Walk on 2 leg");
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal {in all 4 direction}");
    }
}
class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}
class King implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal {by 1 Step }");
    }
}

interface Herbivore {
    void food1 ();
}
interface Canivore {
    void Food2 ();
}
class Bear implements Herbivore, Canivore {
    public void food1 (){
        System.out.println("Eat only Green food");
    }
    public void Food2 (){
        System.out.println("Eat only meat food");
    }
}
class Studentk {
    String name;
    int roll;

    static String schoolName;

    void setName (String name){
        this.name = name;
    }
    String getName (){
        return this.name;
    }
}



