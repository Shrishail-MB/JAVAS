class Cars {
    String carno;
    int price;
    static String brand;

    // Constructor
    public Cars(String carno, int price) {
        this.carno = carno;
        this.price = price;
    }

    static {
        brand = "Bajaj";
    }
}

public class pgm14 {
    public static void main(String[] args) {
        Cars Reddy = new Cars("KA63K000", 100000);
        Cars Adi = new Cars("KA63L000", 145000);

        System.out.println(Reddy.carno + " " + Reddy.price + " " + Cars.brand);
        System.out.println(Adi.carno + " " + Adi.price + " " + Cars.brand);
    }
}
