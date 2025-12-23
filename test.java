public class test{
    static boolean x=true;
    static int y=12;
    static String name="meowy";
        //try use "static void" method note: this should be after the class or the main class
    static void method(){
        System.out.println("Welcome to the meow world");
    }
    void hello(){
        System.out.println("heloo");
    }
    public void message(){
        System.out.println("this is a test message");
    }
    public void msgs(String messages){
        System.out.println("let's say:"+ messages);
    }
    public static void main(String[] args){
        test t=new test();// test
        //try use object with a logical
        if(!x){
            System.out.println("false");
        }else {
            System.out.println("true");
        }
        //trying object in a simple mention
        System.out.println(t.y);
        //try manipulate the class variable
        t.y=15;
        System.out.println(t.y);
        test m=new test();//create new object
        //try do simple manipulated variable
        m.y=39;
        System.out.println(m.y);
        //try use string with a different obj, still works WOW!
        System.out.println(m.name);
        System.out.println(t.name);
        //try use simple calling method
        method();//outputs inside the static void main99
        //try use void method then call it here
        test msg = new test();
        msg.hello();
        //call the two public void main method wich is messages and and msgs
        test ply= new test();
        ply.message();
        ply.msgs("Hello this to my creator");
    }

}