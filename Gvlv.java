 class Gvlv {
 
    int a=40;     //global variable
    static int b;   //global variale
    // public static void test(){
    //     int x = 90;   //local variable
    //     System.out.println("local:" +x);
    // }

    public static void main(String[] args) {
        System.out.println("global:" +b);
        System.out.println("global:" +new Gvlv().a);
        new Lv().test();
    }
    
}

class Lv{
       public static void test(){
        int x = 90;   //local variable
        System.out.println("local:" +x);
    }
}