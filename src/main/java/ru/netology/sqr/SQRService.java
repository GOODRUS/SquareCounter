package ru.netology.sqr;

public class SQRService {
    public int squareСounter(int firstNumberRanged, int lastNumberRanged) {
        int squrNumber = 0;
        for (int i = firstNumberRanged - firstNumberRanged; i <= lastNumberRanged; i++) {
            if (firstNumberRanged <= Math.pow(i, 2) && Math.pow(i, 2) <= lastNumberRanged) {
                /*
                Для вывод квадратов чисел попавших в заданный диапазон:
                int square = (int) Math.sqrt(Math.pow(i, 2));
                System.out.print("Квадрат числа " + square + " попал в диапозон;" + "\n");
                 */
                squrNumber++;
            }
        }
        return squrNumber;
    }
}

