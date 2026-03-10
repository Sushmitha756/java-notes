class test{
    public test(){
        System.out.println("Hello world");
    }
    public test(int a){
        System.out.println("a value:" +a);
    }
    public void demo(){
        System.out.println("This is the demo function");
    }
}
public class Constructor{
    public static void main(String[] args) {
        test t1=new test();
        t1.demo();
         test t2=new test(90);
    }
}