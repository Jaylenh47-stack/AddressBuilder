package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Prompt user for their address, Store it in String builder and append the information,display information
//        Grover Smith

//        Billing Address:
//        123 Main Street
//        Middleton, TX 75111
//
//        Shipping Address:
//        456 Big Sky Blvd
//        Outer Rim, TX 75333


        StringBuilder fullAddress = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        //user Name
        System.out.print("Full name: ");
        String name = scanner.nextLine();
        fullAddress.append(name + "\n\n");

        fullAddress.append("Billing Address:\n");

        System.out.print("Billing Street: ");
        String billingStreet = scanner.nextLine();
        fullAddress.append(billingStreet +"\n");

        System.out.print("Billing City: ");
        String billingCity = scanner.nextLine();
        fullAddress.append(billingCity +"," + " ");

        System.out.print("Billing State: ");
        String billingState = scanner.nextLine();
        fullAddress.append(billingState + " ");

        System.out.print("Billing Zip: ");
        int billingZip = scanner.nextInt();
        scanner.nextLine();
        fullAddress.append(billingZip + "\n\n");

        fullAddress.append("Shipping Address: \n" );

        System.out.print("Shipping Street: ");
        String shippingStreet = scanner.nextLine();
        fullAddress.append(shippingStreet + "\n");

        System.out.print("Shipping City: ");
        String shippingCity = scanner.nextLine();
        fullAddress.append(shippingCity + "," + " ");

        System.out.print("Shipping State: ");
        String shippingState = scanner.nextLine();
        fullAddress.append(shippingState + " ");

        System.out.print("Shipping Zip: ");
        int shippingZip = scanner.nextInt();
        scanner.nextLine();
        fullAddress.append(shippingZip);

        String fullAddressString = fullAddress.toString();
        System.out.println(fullAddress);

    }
}