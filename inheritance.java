 class A{
    public A(int a){
        
        System.out.println("this is the A() constructor is: "+a);

    }
    
    public void test_A(){
        System.out.println("this is the test_A() function test class");
    }
}
class B extends A{
    public B(){
        super(8);
    }
    // B(){
    //     System.out.println("this is the B constructor");
    // }
    public void test_B(){
         System.out.println("this is the B() test class");
    }
}
// class C extends B{
//     // B(){
//     //     System.out.println("this is the B constructor");
//     // }
//     public void test_C(){
//          System.out.println("this is the C() test class");
//     }
// }
public class inheritance{
    public static void main(String[] args) {
        // A a1=new A();
        // a1.test_A();
        B b1=new B();

        // b1.test_B();
        // b1.test_A();
        // C c1=new C();
        // c1.test_C();
        // c1.test_A();
        // c1.test_B();
        

        
    }
}