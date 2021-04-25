package home.work;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        one();
        System.out.println("-------------");
        two();
        System.out.println("-------------");
        three();
        System.out.println("-------------");
        four();
        System.out.println("-------------");
        int length = 4;
        int initialValue = 32;
        int[] five = five(length, initialValue);
        System.out.println(Arrays.toString(five));
        System.out.println("-------------");
    }

    private static void one() {
        int[] one = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < one.length; i++) {
            if (one[i] == 1) {
                one[i] = 0;
            } else {
                one[i] = 1;
            }
        }
        System.out.println(Arrays.toString(one));
    }

    private static void two() {
        int[] two = new int[100];
        for (int i = 0; i < two.length; i++) {
            two[i] = i;
        }
        System.out.println(Arrays.toString(two));
    }

    private static void three() {
        int[] three = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < three.length; i++) {
            int value = three[i];
            if (three[i] < 6) {
                three[i] = value * 2;
            }
        }
        System.out.println(Arrays.toString(three));
    }

    private static void four() {
        int[][] four = new int[6][6];
        int index = four.length - 1;
        for (int i = 0; i < four.length; i++) {
            four[i][i] = four[i][index - i] = 1;
            System.out.println(Arrays.toString(four[i]));
        }
    }

    private static int[] five(int l, int value) {
        int[] five = new int[l];
        for (int i = 0; i < five.length; i++) {
            five[i] = value;
        }
        return five;
    }
}
