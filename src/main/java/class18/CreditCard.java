package class18;

public class CreditCard {
    protected double balance;
    public CreditCard(double balance){
        this.balance=balance;
    }

    public double calcInterest(){
        return balance *0.5;
    }
}
class Visa extends CreditCard{
    public Visa(double balance){
        super(balance);
    }
}
class Chase extends CreditCard{
    public Chase(double balance){
        super(balance);
    }


    @Override
    public double calcInterest() {
        return balance *0.15;
    }
}
class CreditCardtester{
    public static void main(String[] args) {
        CreditCard crcd= new CreditCard(1000);
        Visa vs=new Visa(2000);
        Chase ch=new Chase(3000);
        System.out.println("Credit Cerd "+crcd.calcInterest());
        System.out.println("visa "+vs.calcInterest());
        System.out.println("Chase "+ch.calcInterest());

    }
}