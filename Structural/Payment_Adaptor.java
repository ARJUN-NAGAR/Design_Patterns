package Structural;
import java.util.*;

interface Payment{
    void pay(double amount);
}
class Paytm{
    public void paytmPayment(double amount){
        System.out.println("Payment " + amount +" done through paytm");
    } 
}
class Gpay{
    public void GpayPayment(double amount){
        System.out.println("Payment " + amount +" done through Gpay");
    } 
}
class GpayAdaptor implements Payment{
    private Gpay gpay;
    public GpayAdaptor(Gpay gpay){
        this.gpay=gpay;
    }
    @Override
    public void pay(double amount){
        gpay.GpayPayment(amount);
    }
}
class PaytmAdaptor implements Payment{
    private Paytm paytm;
    public PaytmAdaptor(Paytm paytm){
        this.paytm=paytm;
    }
    @Override
    public void pay(double amount){
        paytm.paytmPayment(amount);
    }
}
public class Payment_Adaptor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Which adaptor you want to use");
        String s=sc.nextLine();
        Payment payment;
        int amount;
        switch(s){
            case "Paytm":
                payment =new PaytmAdaptor(new Paytm());
                System.out.println("Enter the amount");
                amount=sc.nextInt();
                payment.pay(amount);
                break;
            case "Gpay":
                payment =new GpayAdaptor(new Gpay());
                System.out.println("Enter the amount");
                amount=sc.nextInt();
                payment.pay(amount);
                break;
            default:
                System.out.println("Invalid method");
        }
        /*Payment payment =new PaytmAdaptor(new Paytm());
        payment.pay(5000);*/
    }
}
