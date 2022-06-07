package ru.netology.sqr;

public class SQRService {
    public int calcAmountSqr(int minLimit, int maxLimit) {
        int amount = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i >= minLimit) & (i * i <= maxLimit)) {
                amount++;
//                System.out.println(i + " корень для " + i*i);
            }
        }
        return amount;
    }

}
