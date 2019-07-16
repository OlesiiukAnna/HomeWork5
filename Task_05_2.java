package org.anna.task_5;
/*
Написать метод который проверяет число простое или нет. Если нет вывести все его делители.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_05_2 {
    public static void main(String[] args) {
        int[] numbers = {2, 18, 27, 31, 48, 53, 84, 97, 176, 241};

        for (int number : numbers) {
            checkIsNumberIsSimple(number);
        }
    }

    public static boolean checkIsNumberIsSimple(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                printDivisors(number);
                return false;
            }
        }
        return true;
    }

    public static void printDivisors(int number) {
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                divisors.add(i);
            }
        }
        System.out.format("Divisors of %d: " + Arrays.toString(divisors.toArray()) +"\n", number);
    }
}
