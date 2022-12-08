//На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.

public class Task04 {
    public static void main(String[] args) {
        String[][] game_board = new String[8][8];
        int count = 0;
        System.out.println("Ожидайте, перебираю варианты...");
        do {
            for (int i = 0; i < game_board.length; i++) {
                for (int j = 0; j < game_board.length; j++) {
                    game_board[i][j] = "[ ]";
                }
            }
            int amount = 0;
            while (amount < 8) {
                int line = (int) (Math.random() * 8);
                int column = (int) (Math.random() * 8);
                if (!game_board[line][column].equals("[+]")) {
                    game_board[line][column] = "[+]";
                    amount += 1;
                }
            }
            count += 1;
        } while (!checker(game_board));
        System.out.println("Я перебрал " + count + " вариантов и нашел расположение ферзей удовлетворяющих условию");
        for (String[] strings : game_board) {
            System.out.println();
            for (int j = 0; j < game_board.length; j++) {
                System.out.print(strings[j]);
            }
        }
    }

    public static boolean checker(String[][] game_board) {
        boolean flag = check_horizontal(game_board);
        if (!check_vertical(game_board)) flag = false;
        if (!check_diagonal_left_right(game_board)) flag = false;
        if (!check_diagonal_right_left(game_board)) flag = false;
        return flag;
    }

    public static boolean check_horizontal(String[][] game_board) {
        boolean flag = true;
        for (String[] strings : game_board) {
            int number_of_coincidences = 0;
            for (int j = 0; j < game_board.length; j++) {
                if (strings[j].equals("[+]")) {
                    number_of_coincidences += 1;
                }
            }
            if (number_of_coincidences > 1) {
                return false;
            }
        }
        return flag;
    }

    public static boolean check_vertical(String[][] game_board) {
        boolean flag = true;
        for (int i = 0; i < game_board.length; i++) {
            int number_of_coincidences = 0;
            for (String[] strings : game_board) {
                if (strings[i].equals("[+]")) {
                    number_of_coincidences += 1;
                }
            }
            if (number_of_coincidences > 1) {
                return false;
            }
        }
        return flag;
    }

    public static boolean check_diagonal_left_right(String[][] game_board) {
        boolean flag = true;
        int bias2 = 1;
        for (int bias = 0; bias < 7; bias++) {
            int number_of_coincidences = 0;
            for (int i = 1 + bias; i >= 0; i--) {
                int j;
                if (i == 1 + bias) {
                    j = 0;
                } else if (i == 0) {
                    j = 1 + bias;
                } else {
                    j = bias2 - i;
                }
                if (game_board[i][j].equals("[+]")) {
                    number_of_coincidences += 1;
                }
            }
            if (number_of_coincidences > 1) {
                return false;
            }
            bias2 += 1;
        }
        bias2 = 13;
        for (int bias = 0; bias < 6; bias++) {
            int number_of_coincidences = 0;
            for (int j = 7; j >= 6 - bias; j--) {
                int i;
                if (j == 7) {
                    i = 6 - bias;
                } else if (j == 6 - bias) {
                    i = 7;
                } else {
                    i = bias2 - j;
                }
                if (game_board[i][j].equals("[+]")) {
                    number_of_coincidences += 1;
                }
            }
            if (number_of_coincidences > 1) {
                return false;
            }
            bias2 -= 1;
        }
        return flag;
    }

    public static boolean check_diagonal_right_left(String[][] game_board) {
        boolean flag = true;
        int bias2 = 6;
        for (int bias = 0; bias < 7; bias++) {
            int number_of_coincidences = 0;
            for (int i = 6 - bias; i <= 7; i++) {
                int j;
                if (i == 6 - bias) {
                    j = 0;
                } else if (i == 7) {
                    j = 1 + bias;
                } else {
                    j = i - bias2;
                }
                if (game_board[i][j].equals("[+]")) {
                    number_of_coincidences += 1;
                }

            }
            if (number_of_coincidences > 1) {
                return false;
            }
            bias2 -= 1;
        }
        bias2 = 6;
        for (int bias = 0; bias < 6; bias++) {
            int number_of_coincidences = 0;
            for (int i = 0; i <= 1 + bias; i++) {
                int j;
                if (i == 0) {
                    j = 6 - bias;
                } else if (i == 1 + bias) {
                    j = 7;
                } else {
                    j = bias2 + i;
                }
                if (game_board[i][j].equals("[+]")) {
                    number_of_coincidences += 1;
                }
            }
            if (number_of_coincidences > 1) {
                return false;
            }
            bias2 -= 1;
        }
        return flag;
    }
}