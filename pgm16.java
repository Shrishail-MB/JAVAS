class A {
    void display() {
        System.out.println("Class A");
    }
}

class B extends A {
    void show() {
        System.out.println("Class B");
    }
}

public class pgm16 {
    public static void main(String[] args) {
        B obj = new B();
        obj.display(); // Inherited from class A
        obj.show();    // Defined in class B
    }
}
