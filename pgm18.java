abstract class sunstar {
    abstract void printfo();
}
class Employee extends sunstar{
    String name;
    int age;
    int salary;
    Employee(String name,int age,int salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    void printfo(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("salary:"+salary);
    }
}
public class pgm18{
    public static void main(String[] args) {
        sunstar e1=new Employee(null, 21, 50000);
        e1.printfo();
    }
}