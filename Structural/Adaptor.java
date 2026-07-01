package Structural;
interface Payment{

    void pay(double amount);
}
class PaytmAdaptor implements Payment{

    public PaytmAdaptor(){

    }
    public void paytmpay(double amount){
        System.out.println("Payment "+amount+"  done through Paytm");
    }
    @Override
    public void pay(double amount) {
        paytmpay(amount);
    }
    
}
class GpayAdaptor implements Payment{
    public GpayAdaptor(){

    }
     public void Gpay(double amount){
        System.out.println("Payment "+amount+" done through Gpay");
    }
    @Override
    public void pay(double amount) {
        Gpay(amount);
    } 
}
public class Adaptor {
    public static void main(String[] args) {
        Payment payment=new PaytmAdaptor();
        payment.pay(5000);
    }
}
