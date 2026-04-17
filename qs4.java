package workshop5;


interface Animal {
    void eat();
    void walk();
}

interface Printable {
    void display();
}

class Cow implements Animal, Printable {
    public void eat() {
        System.out.println("The Cow is eating.");
    }

    public void walk() {
        System.out.println("The Cow is walking.");
    }

    public void display() {
        System.out.println("Displaying Cow information.");
    }
}

public class qs4 {
    public static void main(String[] args) {
        Cow myCow = new Cow();
        myCow.eat();
        myCow.walk();
        myCow.display();
    }
}
