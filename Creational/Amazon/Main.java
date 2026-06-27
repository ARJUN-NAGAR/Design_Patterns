package Amazon;

import java.util.Scanner;

interface Elect_equip{
    void run();
}
class User{
    private static User user;
    private User(){

    }
    public static User getInstance(){
        if(user==null){
            return user =new User();
        }
        return user;
    }
}
class Product{
    private int id;
    private String name;
    private String brand;
    public Product(Builder b){
        this.id=b.id;
        this.name=b.name;
        this.brand=b.brand;
    }
    public void product_info(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(brand);
    }
    static class Builder{
        private int id;
        private String name;
        private String brand;
        void Builder(){

        }
        public Builder setid(int id){
            this.id=id;
            return this;
        }
        public Builder setname(String name){
            this.name=name;
            return this;
        }
        public Builder setbrand(String brand){
            this.brand=brand;
            return this;
        }
    
        public Product build(){
            return new Product(this);
        }

    }
}
class Ac implements Elect_equip{
    public void run(){
        System.out.println("AC is Running");
    }
}
class WashingMachine implements Elect_equip{
    public void run(){
        System.out.println("Washing Machine is Running");
    }
}
class Fan implements Elect_equip{
    public void run(){
        System.out.println("Fan is Running");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        User user=User.getInstance();
        System.out.println("Give your electronic equipment : Ac,WashingMachine,Fan");
        String machine=sc.nextLine();
        int id=0;
        switch(machine){
            case "Ac":
                String brand=sc.nextLine();
                Product p1=new Product.Builder().setid(id++).setname("AC").setbrand(brand).build();
                p1.product_info();
                
                break;
            case "WashingMachine":
                String brand1=sc.nextLine();
                Product p2=new Product.Builder().setid(id++).setname("WashingMachine").setbrand(brand1).build();
                p2.product_info();
                break;
            case "Fan":
                String brand2=sc.nextLine();
                Product p3=new Product.Builder().setid(id++).setname("Fan").setbrand(brand2).build();
                p3.product_info();
                break;
            default:
                System.out.println("Give the valid machine type");
                break;
        }
        //p.product_info();
    }
    
}
