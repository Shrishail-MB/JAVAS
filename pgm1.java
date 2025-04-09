public class pgm1 {
    int b = 20;
    int c = 200;

    public static void main(String[] args) {
        pgm1 ob1 = new pgm1();
        ob1.method1();
        System.out.println("Instance Variable = " + ob1.b);
        ob1.method2();
    }

    public void method1() {
        int a = 10;
        System.out.println(a);
        System.out.println(b);
    }

    public void method2() {
        int d = 100;
        System.out.println(d);
        System.out.println(c);
    }
}
