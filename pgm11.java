 class Details {
    int e=10;
    int salary;
    static String ceo;
    public Details(int eid,int salary)
    {
        this.e=eid;
        this.salary=salary;
    }
    static{
        ceo="Reddy";
    }
}
public class pgm11{
    public static void main(String[] args) {
        Details n=new Details(10, 25000);
        Details r=new Details(12, 26000);
        System.out.println(n.e+n.salary+Details.ceo);
        System.out.println(r.e+r.salary+Details.ceo);
    }
}
