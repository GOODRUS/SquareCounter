package ru.netology.sqr;

public class Main {

    public static void main(String[] args) {
        SQRService counter = new SQRService();
        int firstNumberRanged = 10;
        int lastNumberRanged = 99;

        System.out.println("Квадратов чисел в данном диапозоне: " + counter.squareСounter(firstNumberRanged, lastNumberRanged));
    }
}