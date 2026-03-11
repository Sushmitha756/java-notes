public class coverloading {
    public coverloading(){
        System.out.println("this is the zero parametrised constructor");
    }
        public coverloading(int a){
        System.out.println("coverloading(int a) a value is:" +a);
    }
        public coverloading(int b,int a){
        System.out.println("coverloading(int b,int a) b value and a value:" +b+" "+a);
    }
        public coverloading(float b,char a){
        System.out.println("coverloading(float b,char a) b value and a value:" +b+" "+a);
    }
    public static void main(String[] args) {
      new coverloading();
     new coverloading(23);
      new coverloading(15,20);
     new coverloading(40.4f,'G');

    }
    
}
