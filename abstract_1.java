abstract class demo3{
    abstract public void test();
    abstract public void test1();
}
    class demo1 extends demo3{
    @Override
    public void test(){
        int a=10;
        int b=20;
        System.out.println("addition of a and b:"+(a+b));
    }
    @Override
    public void test1(){
        System.out.println("This is the test1() method from demo");
    }

}
public class abstract_1{
    public static void main(String[] args){
        demo1 d1=new demo1();
        d1.test1();
        d1.test();
    }  
}
