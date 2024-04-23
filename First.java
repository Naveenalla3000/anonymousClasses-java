package anonymousClasses;

/**
 * Interface one
 */
interface one {
    public void show();
    
}

class ABC implements one{
    public void show(){
        System.out.println("Hello from ABC class");
    }
}


public class First {
    public static void main(String[] args) {
        // ABC k = new ABC();
        // k.show();

        //implementing anonymous class
        //inner class without name = anonymous class
        one k = new one()
        {
            public void show(){
                System.out.println("Hello from Anonymous class");
            }
        };
        k.show();
    }
}
