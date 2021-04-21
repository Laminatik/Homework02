package home.work;

public class Main {

    public static void main(String[] args) {
        System.out.println("Числа 2 и 12 попадают в предел от 10 до 20? " + Exone());
        Extwo();
        System.out.println("Число -2 негативное? " + Exthree());
        Exfour();
    }

    public static boolean Exone() {
        int a = 2;
        int b = 12;
        int sum = a + b;
        return sum >=10 && sum <=20;
    }

    public static void Extwo() {
        int number = 0;
        if (number >= 0) {
            System.out.println("Число положительно");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean Exthree() {
        int number = -2;
        return number < 0;
    }

    public static void Exfour() {
        String text = "Hello";
        int one = 3;
        for (int i = 0; i < one; i++) {
            System.out.println(text);
        }
    }


}
