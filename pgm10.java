public class pgm10 {
    String language;
    pgm10(String lang){
        language=lang;
        System.out.println(language+"Programming Languages");
    }
    public static void main(String[] args) {
        pgm10 s1=new pgm10("java");
        pgm10 s2=new pgm10("Python");
        pgm10 s3=new pgm10("Devoops");
    }
}
