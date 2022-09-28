import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the total price? ");
        double total = scan.nextDouble();
        System.out.print("What is the tip percentage? ");
        int tipPercentage = scan.nextInt();
        System.out.print("How many people are in your party? ");
        int numPeople = scan.nextInt();
        double tipAmount = Math.round(total * tipPercentage)/100;
        System.out.println("The tip amount is $" + tipAmount);
        double subTotal = tipAmount + total;
        System.out.println("The subtotal is $" + subTotal);
        double tipPerPerson = tipAmount/numPeople;
        System.out.println("The tip per person is $" + String.format("%.2f", tipPerPerson));
        double totalPerPerson = subTotal / numPeople;
        System.out.println("The total per person is $" + String.format("%.2f", totalPerPerson));
    }
}
