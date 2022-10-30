package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputData = scanner.nextLine().split(" ");
        HashSet<String> data = new HashSet<String>();
        for (String item: inputData) {
            if(data.add(item)){
                System.out.print(item + " ");
            }
        }
        System.out.println();
        for (String item: data) {
            System.out.print(item + " ");
        }
    }
}
