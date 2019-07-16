package org.anna.task_5;

import java.util.HashMap;
import java.util.Map;
/*
1. Есть поле из клеток по средине которого находится робот. Робот умеет выполнять 4 команды:
двигаться на 1 клетку в сторону: R (right), L (left), U (up), and D (down).
Задана строка из движений робота например "UUDLDR".
Написать метод который вернет true если робот вернется в ту же клетку с которой начал.

Input: "UD"
Output: true
Input: "LL"
Output: false
 */
public class Task_05_1 {
    private static final Character MOVE_UP_COMMAND_KEY = 'U';
    private static final Character MOVE_DOWN_COMMAND_KEY = 'D';
    private static final Character MOVE_RIGHT_COMMAND_KEY = 'R';
    private static final Character MOVE_LEFT_COMMAND_KEY = 'L';

    public static void main(String[] args) {
        String commandPath = "UUDLDR";
        checkReturn(commandPath);
    }

    public static boolean checkReturn(String path) {
        char[] pathBySteps = path.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        map.put(MOVE_UP_COMMAND_KEY, 0);
        map.put(MOVE_DOWN_COMMAND_KEY, 0);
        map.put(MOVE_RIGHT_COMMAND_KEY, 0);
        map.put(MOVE_LEFT_COMMAND_KEY, 0);

        for (char step : pathBySteps) {
            for (HashMap.Entry<Character, Integer> pair : map.entrySet()) {
                if (step == pair.getKey()) {
                    pair.setValue(pair.getValue() + 1);
                }
            }
        }
        return isHeightChanged(map) && isWidthChanged(map);
    }

    private static boolean isHeightChanged(Map<Character, Integer> map) {
        return map.get(MOVE_UP_COMMAND_KEY) - map.get(MOVE_DOWN_COMMAND_KEY) == 0;
    }

    private static boolean isWidthChanged(Map<Character, Integer> map) {
        return map.get(MOVE_RIGHT_COMMAND_KEY) - map.get(MOVE_LEFT_COMMAND_KEY) == 0;
    }
}
