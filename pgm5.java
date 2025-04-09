class Calculator {
    int add() {
        int n1 = 10;
        int n2 = 20;
        System.out.println(n1 + n2);
        return n1 + n2;
    }
}

public class pgm5 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add();
    }
}
