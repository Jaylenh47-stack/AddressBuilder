package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Prompt user for their address, Store it in String builder and append the information,display information
        //Grover Smith
        //Billing Address:
        //123 Main Street
        //Middleton, TX 75111
        //Shipping Address:
        //456 Big Sky Blvd
        //Outer Rim, TX 75333

        //Variables needed, remember to get from user
        StringBuilder fullAddress = new StringBuilder();

        Scanner scanner = new Scanner(System.in);

        String namePrompt = "Full name: ";
        System.out.print(namePrompt);
        String name = scanner.nextLine();
        fullAddress.append(name + "\n");

        String billingStreetPrompt = "Billing Street: ";
        System.out.print(billingStreetPrompt);
        String billingStreet = scanner.nextLine();
        fullAddress.append(billingStreet);

        String billingCityPrompt = "Billing City: ";
        String billingStatePrompt = "Billing State: ";
        String billingZipPrompt = "Billing Zip: ";

        String shippingStreetPrompt = "Shipping Street: ";
        String shippingCityPrompt = "Shipping City: ";
        String shippingStatePrompt = "Shipping State: ";
        String shippingZipPrompt = "Shipping Zip";

        String fullAddressString = fullAddress.toString();
        System.out.println(fullAddress);

    }
}