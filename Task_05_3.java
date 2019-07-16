package org.anna.task_5;

/*
Написать метод. Входящие параметры: отсортированный массив и число.
Метод должен вернуть true если это число есть в массиве, используя бинарный поиск.
 */
public class Task_05_3 {
    public static void main(String[] args) {
        int[] array = {-40, -24, -7, 0, 15, 22, 37, 48, 59, 80};
        int number = -40;
        System.out.println(checkNumberInArray(array, number));
    }

    public static boolean checkNumberInArray(int[] array, int number) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        while (firstIndex <= lastIndex) {
            int pivot = (firstIndex + lastIndex) / 2;
            if (number == array[pivot]) {
                return true;
            } else if (number < array[pivot]) {
                lastIndex = pivot - 1;
            } else {
                firstIndex = pivot + 1;
            }
        }
        return false;
    }
}
