package ru.netology.services;

public class FreelancerService {
    public int calculate(int income, int expenses, int threshold) {
        int counter = 0;
        int wallet = 0;

        for (int i = 0; i < 12; i++) {
            if (wallet >= threshold) {
                //отдых
                wallet -= expenses;
                wallet /= 3;
                counter++;
            } else {
                //работа
                wallet += income;
                wallet -= expenses;

            }
        }
        return counter;
    }
}
