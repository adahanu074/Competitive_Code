class EagerSingleton {
    private static volatile EagerSingleton instance = new EagerSingleton();
 
    // private constructor
    private EagerSingleton() {
    }
 
    public static EagerSingleton getInstance() {
        return instance;
    }
}

public class Singleton
{
    public static void main(String [] args)
    {
        // EagerSingleton eager = new EagerSingleton();
        // EagerSingleton eager1 = new EagerSingleton();
        System.out.println("Hello india");
        System.out.println(eager);
        System.out.println(eager1);
    }
}