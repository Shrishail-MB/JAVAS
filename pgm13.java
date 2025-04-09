 class pgm13 {
    int age;
    String name;
    pgm13(int age,String name){
        this.age=age;
        this.name=name;
    }
    pgm13(pgm13 c){
        this.age=c.age;
        this.name=c.name;
    }
    public void display(){
        System.out.println(age+" "+name+"");
    }
    public static void main(String[] args) {
        pgm13 c1=new pgm13(10,"Devoops");
        pgm13 c2=new pgm13(c1);
        c1.display();
        c2.display();
    }
}
