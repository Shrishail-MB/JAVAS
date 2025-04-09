public class pgm15 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        demo p = new demo();
        p.add(a, b); 
        System.out.println(a);

        p.add1(p);
        System.out.println(p.a); 
    }
}

class demo {
    int a = 9;
    int b = 2;


    void add(int x, int y) {
        int sum = x + y;
        System.out.println("Sum of x and y = " + sum);
    }

    // Method to modify the object's 'a' value
    void add1(demo d) {
        d.a = d.a + 10;
    }
}
