//На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.

public class Task04 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String[][] game_board = new String[8][8];
        for (int i = 0; i < game_board.length; i++) {
            for (int j = 0; j < game_board.length; j++) {
                if (j == 0) {
                    game_board[i][j] = "[+]";
                } else {
                    game_board[i][j] = "[ ]";
                }
            }
        }
        enumeration_of_options(game_board);
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("На выполнение потребовалось " + (double) (elapsed) / 1000 + " сек");
    }

    public static void enumeration_of_options(String[][] game_board) {
        for (int i = 1; i < game_board.length; i++) {
            for (int j = 1; j < game_board.length; j++) {
                for (int k = 1; k < game_board.length; k++) {
                    for (int l = 1; l < game_board.length; l++) {
                        for (int m = 1; m < game_board.length; m++) {
                            for (int n = 1; n < game_board.length; n++) {
                                for (int o = 1; o < game_board.length; o++) {
                                    for (int p = 1; p < game_board.length; p++) {
                                        game_board[0][p - 1] = "[ ]";
                                        game_board[0][p] = "[+]";
                                        if (checker(game_board)) {
                                            printer(game_board);
                                            System.out.println();
                                        }
                                        if (p == game_board.length - 1) {
                                            game_board[0][p] = "[ ]";
                                            game_board[0][0] = "[+]";
                                        }
                                    }
                                    game_board[1][o - 1] = "[ ]";
                                    game_board[1][o] = "[+]";
                                    if (o == game_board.length - 1) {
                                        game_board[1][o] = "[ ]";
                                        game_board[1][0] = "[+]";
                                    }
                                }
                                game_board[2][n - 1] = "[ ]";
                                game_board[2][n] = "[+]";
                                if (n == game_board.length - 1) {
                                    game_board[2][n] = "[ ]";
                                    game_board[2][0] = "[+]";
                                }
                            }
                            game_board[3][m - 1] = "[ ]";
                            game_board[3][m] = "[+]";
                            if (m == game_board.length - 1) {
                                game_board[3][m] = "[ ]";
                                game_board[3][0] = "[+]";
                            }
                        }
                        game_board[4][l - 1] = "[ ]";
                        game_board[4][l] = "[+]";
                        if (l == game_board.length - 1) {
                            game_board[4][l] = "[ ]";
                            game_board[4][0] = "[+]";
                        }
                    }
                    game_board[5][k - 1] = "[ ]";
                    game_board[5][k] = "[+]";
                    if (k == game_board.length - 1) {
                        game_board[5][k] = "[ ]";
                        game_board[5][0] = "[+]";
                    }
                }
                game_board[6][j - 1] = "[ ]";
                game_board[6][j] = "[+]";
                if (j == game_board.length - 1) {
                    game_board[6][j] = "[ ]";
                    game_board[6][0] = "[+]";
                }
            }
            game_board[7][i - 1] = "[ ]";
            game_board[7][i] = "[+]";
        }
        for (int i = 1; i < game_board.length; i++) {
            for (int j = 1; j < game_board.length; j++) {
                for (int k = 1; k < game_board.length; k++) {
                    for (int l = 1; l < game_board.length; l++) {
                        for (int m = 1; m < game_board.length; m++) {
                            for (int n = 1; n < game_board.length; n++) {
                                for (int o = 1; o < game_board.length; o++) {
                                    game_board[0][o - 1] = "[ ]";
                                    game_board[0][o] = "[+]";
                                    if (checker(game_board)) {
                                        printer(game_board);
                                        System.out.println();
                                    }
                                    if (o == game_board.length - 1) {
                                        game_board[0][o] = "[ ]";
                                        game_board[0][0] = "[+]";
                                    }
                                }
                                game_board[1][n - 1] = "[ ]";
                                game_board[1][n] = "[+]";
                                if (n == game_board.length - 1) {
                                    game_board[1][n] = "[ ]";
                                    game_board[1][0] = "[+]";
                                }
                            }
                            game_board[2][m - 1] = "[ ]";
                            game_board[2][m] = "[+]";
                            if (m == game_board.length - 1) {
                                game_board[2][m] = "[ ]";
                                game_board[2][0] = "[+]";
                            }
                        }
                        game_board[3][l - 1] = "[ ]";
                        game_board[3][l] = "[+]";
                        if (l == game_board.length - 1) {
                            game_board[3][l] = "[ ]";
                            game_board[3][0] = "[+]";
                        }
                    }
                    game_board[4][k - 1] = "[ ]";
                    game_board[4][k] = "[+]";
                    if (k == game_board.length - 1) {
                        game_board[4][k] = "[ ]";
                        game_board[4][0] = "[+]";
                    }
                }
                game_board[5][j - 1] = "[ ]";
                game_board[5][j] = "[+]";
                if (j == game_board.length - 1) {
                    game_board[5][j] = "[ ]";
                    game_board[5][0] = "[+]";
                }
            }
            game_board[6][i - 1] = "[ ]";
            game_board[6][i] = "[+]";
        }
        for (int i = 1; i < game_board.length; i++) {
            for (int j = 1; j < game_board.length; j++) {
                for (int k = 1; k < game_board.length; k++) {
                    for (int l = 1; l < game_board.length; l++) {
                        for (int m = 1; m < game_board.length; m++) {
                            for (int n = 1; n < game_board.length; n++) {
                                game_board[0][n - 1] = "[ ]";
                                game_board[0][n] = "[+]";
                                if (checker(game_board)) {
                                    printer(game_board);
                                    System.out.println();
                                }
                                if (n == game_board.length - 1) {
                                    game_board[0][n] = "[ ]";
                                    game_board[0][0] = "[+]";
                                }
                            }
                            game_board[1][m - 1] = "[ ]";
                            game_board[1][m] = "[+]";
                            if (m == game_board.length - 1) {
                                game_board[1][m] = "[ ]";
                                game_board[1][0] = "[+]";
                            }
                        }
                        game_board[2][l - 1] = "[ ]";
                        game_board[2][l] = "[+]";
                        if (l == game_board.length - 1) {
                            game_board[2][l] = "[ ]";
                            game_board[2][0] = "[+]";
                        }
                    }
                    game_board[3][k - 1] = "[ ]";
                    game_board[3][k] = "[+]";
                    if (k == game_board.length - 1) {
                        game_board[3][k] = "[ ]";
                        game_board[3][0] = "[+]";
                    }
                }
                game_board[4][j - 1] = "[ ]";
                game_board[4][j] = "[+]";
                if (j == game_board.length - 1) {
                    game_board[4][j] = "[ ]";
                    game_board[4][0] = "[+]";
                }
            }
            game_board[5][i - 1] = "[ ]";
            game_board[5][i] = "[+]";
        }
        for (int i = 1; i < game_board.length; i++) {
            for (int j = 1; j < game_board.length; j++) {
                for (int k = 1; k < game_board.length; k++) {
                    for (int l = 1; l < game_board.length; l++) {
                        for (int m = 1; m < game_board.length; m++) {
                            game_board[0][m - 1] = "[ ]";
                            game_board[0][m] = "[+]";
                            if (checker(game_board)) {
                                printer(game_board);
                                System.out.println();
                            }
                            if (m == game_board.length - 1) {
                                game_board[0][m] = "[ ]";
                                game_board[0][0] = "[+]";
                            }
                        }
                        game_board[1][l - 1] = "[ ]";
                        game_board[1][l] = "[+]";
                        if (l == game_board.length - 1) {
                            game_board[1][l] = "[ ]";
                            game_board[1][0] = "[+]";
                        }
                    }
                    game_board[2][k - 1] = "[ ]";
                    game_board[2][k] = "[+]";
                    if (k == game_board.length - 1) {
                        game_board[2][k] = "[ ]";
                        game_board[2][0] = "[+]";
                    }
                }
                game_board[3][j - 1] = "[ ]";
                game_board[3][j] = "[+]";
                if (j == game_board.length - 1) {
                    game_board[3][j] = "[ ]";
                    game_board[3][0] = "[+]";
                }
            }
            game_board[4][i - 1] = "[ ]";
            game_board[4][i] = "[+]";
        }
        for (int i = 1; i < game_board.length; i++) {
            for (int j = 1; j < game_board.length; j++) {
                for (int k = 1; k < game_board.length; k++) {
                    for (int l = 1; l < game_board.length; l++) {
                        game_board[0][l - 1] = "[ ]";
                        game_board[0][l] = "[+]";
                        if (checker(game_board)) {
                            printer(game_board);
                            System.out.println();
                        }
                        if (l == game_board.length - 1) {
                            game_board[0][l] = "[ ]";
                            game_board[0][0] = "[+]";
                        }
                    }
                    game_board[1][k - 1] = "[ ]";
                    game_board[1][k] = "[+]";
                    if (k == game_board.length - 1) {
                        game_board[1][k] = "[ ]";
                        game_board[1][0] = "[+]";
                    }
                }
                game_board[2][j - 1] = "[ ]";
                game_board[2][j] = "[+]";
                if (j == game_board.length - 1) {
                    game_board[2][j] = "[ ]";
                    game_board[2][0] = "[+]";
                }
            }
            game_board[3][i - 1] = "[ ]";
            game_board[3][i] = "[+]";
        }
        for (int i = 1; i < game_board.length; i++) {
            for (int j = 1; j < game_board.length; j++) {
                for (int k = 1; k < game_board.length; k++) {
                    game_board[0][k - 1] = "[ ]";
                    game_board[0][k] = "[+]";
                    if (checker(game_board)) {
                        printer(game_board);
                        System.out.println();
                    }
                    if (k == game_board.length - 1) {
                        game_board[0][k] = "[ ]";
                        game_board[0][0] = "[+]";
                    }
                }
                game_board[1][j - 1] = "[ ]";
                game_board[1][j] = "[+]";
                if (j == game_board.length - 1) {
                    game_board[1][j] = "[ ]";
                    game_board[1][0] = "[+]";
                }
            }
            game_board[2][i - 1] = "[ ]";
            game_board[2][i] = "[+]";
        }
        for (int i = 1; i < game_board.length; i++) {
            for (int j = 1; j < game_board.length; j++) {
                game_board[0][j - 1] = "[ ]";
                game_board[0][j] = "[+]";
                if (checker(game_board)) {
                    printer(game_board);
                    System.out.println();
                }
                if (j == game_board.length - 1) {
                    game_board[0][j] = "[ ]";
                    game_board[0][0] = "[+]";
                }
            }
            game_board[1][i - 1] = "[ ]";
            game_board[1][i] = "[+]";
            if (i == game_board.length - 1) {
                game_board[1][i] = "[ ]";
                game_board[1][0] = "[+]";
            }
        }
        for (int i = 1; i < game_board.length; i++) {
            game_board[0][i - 1] = "[ ]";
            game_board[0][i] = "[+]";
            if (checker(game_board)) {
                printer(game_board);
                System.out.println();
            }
        }
    }

    public static void printer(String[][] game_board) {
        for (String[] strings : game_board) {
            for (int j = 0; j < game_board.length; j++) {
                System.out.print(strings[j]);
            }
            System.out.println();
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
        return true;
    }

    public static boolean check_vertical(String[][] game_board) {
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
        return true;
    }

    public static boolean check_diagonal_left_right(String[][] game_board) {
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
        return true;
    }

    public static boolean check_diagonal_right_left(String[][] game_board) {
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
        return true;
    }
}