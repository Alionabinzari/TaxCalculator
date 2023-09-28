public class Main {

    public static void main(String[] args) {

        double price=100;
        double tax=24;
        int quantity=5;
        double total=0;


        System.out.println("I want to buy "+ quantity + " shirt!");

        total=price*quantity*tax;

        System.out.println("Total cost with tax is: "+ total);

    }
}