//На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.

import java.util.Arrays;

public class Task04 {
    private static int count = 0;
    private final static int boardSize = 8;

    public static void main(String[] args) {
        //Засекаем время начала операции поиска вариантов
        long start = System.currentTimeMillis();

        //Поиск всех вариантов
        tryToPlace(createEmptyBoard(), 0);
        if (count == 0) {
            System.out.println("Нет решений");
        }

        //Засекаем время окончания операции поиска вариантов
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("На выполнение потребовалось " + (double) (elapsed) / 1000 + " сек");
    }

    /**
     * Метод создает пустое игровое поле
     *
     * @param boardSize размер игрового поля
     * @return пустое игровое поле
     */
    private static String[][] createEmptyBoard() {
        String[][] emptyBoard = new String[boardSize][boardSize];
        for (String[] strings : emptyBoard) {
            Arrays.fill(strings, "[ ]");
        }
        return emptyBoard;
    }

    /**
     * Метод печатает игровое поле в командную строку
     *
     * @param gameBoard игровое поле
     */
    private static void printBoard(String[][] gameBoard) {
        for (String[] strings : gameBoard) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Метод проверяет безопасно ли установить ферзя в текущую клетку
     *
     * @param gameBoard игровое поле
     * @param row       строка в, которую планируется установка ферзя
     * @param column    столбец в, который планируется установка ферзя
     * @return установка безопасна?
     */
    private static boolean isSafe(String[][] gameBoard, int row, int column) {
        for (int i = 0; i < column; i++) {
            if (gameBoard[row][i].equals("[X]")) {
                return false;
            }
        }
        for (int i = row, j = column; i >= 0 && j >= 0; i--, j--) {
            if (gameBoard[i][j].equals("[X]")) {
                return false;
            }
        }
        for (int i = row, j = column; i < gameBoard.length && j >= 0; i++, j--) {
            if (gameBoard[i][j].equals("[X]")) {
                return false;
            }
        }
        return true;
    }

    /**
     * Рекурсивный метод для установки ферзей.
     * Печатает игровые поля, в которых удалось расставить ферзей согласно условию
     *
     * @param gameBoard игровое поле
     * @param column    колонка для установки ферзя
     */
    private static void tryToPlace(String[][] gameBoard, int column) {
        if (column == gameBoard.length) {
            System.out.println("[" + ++count + " Вариант]");
            printBoard(gameBoard);
            return;
        }
        for (int i = 0; i < gameBoard.length; i++) {
            if (isSafe(gameBoard, i, column)) {
                gameBoard[i][column] = "[X]";
                tryToPlace(gameBoard, column + 1);
                gameBoard[i][column] = "[ ]";
            }
        }
    }
}