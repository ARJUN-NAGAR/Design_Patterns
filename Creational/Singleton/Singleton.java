import java.util.*;
public class Singleton{
    private static Singleton single;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if(single==null){
            single=new Singleton();
            return single;
        }
        else{
            System.out.println("Object is already created");
            return single;
        }
    }
    public static void main(String [] args){
        Singleton obj1=new Singleton();
        Singleton obj2=Singleton.getInstance();
        System.out.println(obj1==obj2);
    }
}