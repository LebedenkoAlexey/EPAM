package main.Java.Lebedenko.lesson3;

import main.Java.Lebedenko.lesson3.*;

public class Lesson3{
    public static void main(String[] args) {
        WorkWithHumans workWithHumans = new WorkWithHumans ();
        workWithHumans.doHumans ();
        workWithHumans.searchForDuplicateHumans ();

        System.out.println ("Первоначальный список:");
        workWithHumans.printAllHumans ();

        System.out.println ();
        workWithHumans.deleteAndPrintDuplicatesHumans ();

        System.out.println ();
        System.out.println ("Список без дублей:");
        workWithHumans.printAllHumans ();

        workWithHumans.printSortedHumans ();


    }

}
