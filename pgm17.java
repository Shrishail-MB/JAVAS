class Animal {
    String colour = "White";
}

class Dog extends Animal {
    String colour = "Black";

    void display() {
        System.out.println("Dog's colour: " + colour);         // Accesses Dog's colour
        System.out.println("Animal's colour: " + super.colour); // Accesses Animal's colour
    }
}

public class pgm17 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}
