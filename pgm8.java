public class pgm8 {
    private String name;
    pgm8(){
        System.out.println("Constructor Called");
        name="Devoops";
    }
    public static void main(String[] args) {
        pgm8 c=new pgm8();
        System.out.println("The Name is "+c.name);
    }
}
