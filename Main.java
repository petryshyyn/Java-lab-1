package com.company;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println(CreditСard.ExpirationDate);
        CreditСard FirstСard = new CreditСard();
        CreditСard SecondCard = new CreditСard(4141485933331111L,"Viza",556,"AlfaBank");
        CreditСard ThirdCard = new CreditСard(5678414141412314L,"American Express","Hryvnia",1.5f, "Ivanov", 2022, 221, "Privat24");
        System.out.println("First Card" + "\n" + FirstСard.toString());
        System.out.println(FirstСard.printStaticExpirationDate() +"\n");
        System.out.println("Second Card" + "\n" + SecondCard.toString());
        System.out.println(SecondCard.printStaticExpirationDate() +"\n");
        System.out.println("Third Card" + "\n" + ThirdCard.toString());
        System.out.println(ThirdCard.printStaticExpirationDate() + "\n");

        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter card number: ");
        long newNumber  = input.nextLong();
        System.out.print("Enter card type: ");
        String newCardType = input.nextLine();
        System.out.print("Enter currency type: ");
        String newCurrencyType = input.nextLine();
        System.out.print("Enter commission: ");
        double newPaymentCommission = input.nextDouble();
        System.out.print("Enter card holder: ");
        String newCardHolder = input.nextLine();
        System.out.print("Enter expiration date: ");
        int newExpirationDate = input.nextInt();
        System.out.print("Enter CVC: ");
        int newCVC = input.nextInt();
        System.out.print("Enter card name: ");
        String newCardName = input.nextLine();

        FirstСard.resetValues(newNumber, newCardType, newCurrencyType, newPaymentCommission, newCardHolder, newExpirationDate, newCVC, newCardName);
        SecondCard.resetValues(newNumber, newCardType, newCurrencyType, newPaymentCommission, newCardHolder, newExpirationDate, newCVC, newCardName);
        ThirdCard.resetValues(newNumber, newCardType, newCurrencyType, newPaymentCommission, newCardHolder, newExpirationDate, newCVC, newCardName);
    }
}