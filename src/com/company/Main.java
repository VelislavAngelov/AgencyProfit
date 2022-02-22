package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        String companyName= scanner.nextLine();
        int countOld= Integer.parseInt(scanner.nextLine());
        int countTeen= Integer.parseInt(scanner.nextLine());
        double netoPrice=Double.parseDouble((scanner.nextLine()));
        double priceService=Double.parseDouble((scanner.nextLine()));

        double priceOld=(netoPrice + priceService) * countOld;
        double priceTeenService= (netoPrice * 70 / 100);
        double priceTeen=countTeen * (netoPrice-priceTeenService + priceService);
        double totalPrice=(priceTeen+priceOld)*20/100;

            System.out.printf("The profit of your agency from "+companyName+" tickets is %.2f lv.",totalPrice);
    }
}
