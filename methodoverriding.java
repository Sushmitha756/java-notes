class demo{
    public void test(){//declaration
        int a=70;
        int b=80;
        int c=a+b;
        System.out.println("add aand b is :"+c);

    }
     public void test1(){

     }
}
class demo1 extends demo{
    @Override
    public void test(){
        int d=90;
        int e=50;
       
        System.out.println("sub of d and e is :"+(d-e));

    }
    @Override
    public void test1(){
        System.out.println("This is the function");
    }
}






public class methodoverriding {
public static void main(String[] args) {
    demo1 d1=new demo1();
    
  
    d1.test();
    d1.test1();
    
   
}
    
}
