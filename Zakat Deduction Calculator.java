package DataStructers;

import java.util.Scanner;

public class Obj2 {
    public static void main(String[] args) {
        //System.out.println("Zakat Deduction only on 7.5 tola gold, 52.5 tola silver or your savings equal or greater than the \nprice of 52.5 tola silver (i.e. 131,250) or the sum of your savings, silver, gold is equal or greater than \nthe price of 52.5 tola silver on duration minimum 1 year.");
        //System.out.println("Zakat deduction ratio 2.5 percent or /40 on the above mention amounts. \ni.e. 131,250*2.5% or 131,250/40 = 3,281.25 PRs.");
        //System.out.println("Gold price \uF0E0 1 tola = 203,437 PKR and Silver price \uF0E0 1 tola = 2,540 PKR");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your saving amount in PKR: ");
        double saving = sc.nextDouble();
        System.out.print("Enter your gold in tola: ");
        float gold = sc.nextFloat();
        System.out.print("Enter your silver in tola: ");
        float silver = sc.nextFloat();
        sc.close();

        double goldPrice = gold * 203437;
        double silverPrice = silver * 2540;
        double totalAmount = saving + goldPrice + silverPrice;

        if (totalAmount < 131250){
            System.out.println("You are not eligible for Zakat.");
        } else if (totalAmount >= 131250) {
            double finalDeduction = totalAmount / 40;
            System.out.println("Your Zakat Deduction package is " + finalDeduction + " PRs");
        }
    }
}
