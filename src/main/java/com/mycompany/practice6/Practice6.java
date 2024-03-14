package com.mycompany.practice6;

import java.util.Scanner;

class Telephone {
    private String manufacturer;

    public Telephone(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}

class Seller {
    public void modify(Telephone telephone) {
        String originalManufacturer = telephone.getManufacturer();
        String modifiedManufacturer;
        if (originalManufacturer.toLowerCase().startsWith("n")) {
            modifiedManufacturer = originalManufacturer.replaceAll("o", "a");
        } else {
            modifiedManufacturer = originalManufacturer.toLowerCase().replaceAll("o", "a");
        }
        telephone.setManufacturer(modifiedManufacturer);
    }
}

public class Practice6 {
    public static void main(String[] args) {
        System.out.println("Practical task 1.6, Student Korneev Arseniy, RIBO-04-22, Variant 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the manufacturer of the telephone:");
        String manufacturer = scanner.nextLine();
        Telephone telephone = new Telephone(manufacturer);
        Seller seller = new Seller();
        seller.modify(telephone);
        System.out.println("Original Manufacturer: " + manufacturer);
        System.out.println("Modified Manufacturer: " + telephone.getManufacturer());
    }
}