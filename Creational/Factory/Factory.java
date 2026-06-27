package Factory;
import java.util.*;
interface Washing{
    void wash();
}
class LG implements Washing{
    @Override
    public void wash(){
        System.out.println("LG Washing Machine");
    }
}
class Samsung implements Washing{
    @Override
    public void wash(){
        System.out.println("Samsung Washing Machine");
    }
}
public class Factory {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give your washing maching input : LG or Samsung");
        String machine=sc.nextLine();
        switch(machine){
            case "LG":
                Washing lg=new LG();
                lg.wash();
                break;
            case "Samsung":
                Washing samsung=new Samsung();
                samsung.wash();
                break;
            default:
                System.out.println("Give the valid machine type");
                break;
        }
    }
} 
