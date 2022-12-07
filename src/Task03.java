//Реализовать алгоритм пирамидальной сортировки (HeapSort).

import java.util.ArrayList;

public class Task03 {
    public static void main(String[] args) {
        int[] massive = new int[]{1, 7, 12, 8, 15, 19, 15, 10, 1, -15};
        ArrayList<Integer> support_massive = new ArrayList<>();
        sorter(massive, support_massive);
        System.out.println(support_massive);
    }

    public static void sorter(int[] massive, ArrayList<Integer> support_massive) {
        if (massive.length > 1) {
            for (int i = massive.length - 1; i > 0; i -= 2) {
                int index_a;
                if (i % 2 == 0) {
                    index_a = (i - 2) / 2;
                } else {
                    index_a = (i - 1) / 2;
                }
                if (index_a * 2 + 2 <= massive.length - 1) {
                    if (massive[index_a * 2 + 1] > massive[index_a]) {
                        int temp = massive[index_a];
                        massive[index_a] = massive[index_a * 2 + 1];
                        massive[index_a * 2 + 1] = temp;
                    }
                    if (massive[index_a * 2 + 2] > massive[index_a]) {
                        int temp = massive[index_a];
                        massive[index_a] = massive[index_a * 2 + 2];
                        massive[index_a * 2 + 2] = temp;
                    }
                } else {
                    if (massive[index_a * 2 + 1] > massive[index_a]) {
                        int temp = massive[index_a];
                        massive[index_a] = massive[index_a * 2 + 1];
                        massive[index_a * 2 + 1] = temp;
                    }
                }
            }
            int temp = massive[0];
            massive[0] = massive[massive.length - 1];
            massive[massive.length - 1] = temp;
            int[] massive2 = new int[massive.length - 1];
            int index = 0;
            for (int item : massive) {
                if (index < massive2.length) {
                    massive2[index] = item;
                    index += 1;
                }
            }
            sorter(massive2, support_massive);
            support_massive.add(temp);
        } else {
            support_massive.add(massive[0]);
        }
    }
}