public class methodoverloading{
    public static void test(){
        System.out.println("this is a zero parameterized");
    }
        public static void test(int a){
        System.out.println("test(int a) a value is" +a);
    }
        public static void test(int b,int a){
        System.out.println("test(int b,int a) b value and a value is" +b+ " " +a);
    }
        public static void test(float b,char a,int c){
        System.out.println("test(float b,char a,int c) a value and b value and c value is" +b+ " " +c+ " " +a);
    }

    public static void main(String[] args) {
        test();
        test(3);
        test(4, 6);
        test(10.8f,'s',6);

    }
}