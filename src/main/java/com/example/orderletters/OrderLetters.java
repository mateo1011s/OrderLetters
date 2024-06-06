package com.example.orderletters;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class OrderLetters {
    public static void main(String[] args) {
        System.out.println("This code will help you to order numbers inside an array");
        char[] array = {'z','b','e','f','a','c','D'};
        System.out.println();
        System.out.println("For now your array is:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int NumberToOrder= array.length;
        boolean SwapNumber;
        for (int i = 0; i < NumberToOrder - 1; i++) {
            SwapNumber= false;
            for (int j = 0; j < NumberToOrder - 1 - i; j++) {
                if (Character.toLowerCase(array[j])>Character.toLowerCase(array[j+1])){
                    char auxiliary=array[j];
                    array[j]=array[j+1];
                    array[j+1]=auxiliary;
                    SwapNumber=true;
                }
            }
            if(!SwapNumber){
                break;
            }
        }
        System.out.println();
        System.out.println("The array ordered from smallest to largest is: ");
        for (int k=0;k< array.length;k++) {
            System.out.print(array[k]+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Thanks for using :)");
    }
}
