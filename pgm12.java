 class over {
        public void add(int i,int j){
            System.out.println(i+j);
        }
        public void add(int a,int b,int c){
            System.out.println(a+b+c);
        }
        public void add(double a,double b){
            System.out.println(a+b);
        }
}
class pgm12{
    public static void main(String[] args) {
        over m=new over();
        m.add(2, 4);
        m.add(2, 3, 4);
        m.add(1.5, 2.5);
    }
}
