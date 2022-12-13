import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int arrayOne[] = new int[]{1, 2, 3};

        for (int i = 0; i < arrayOne.length; i++) {
            if (i == arrayOne.length - 1) {
                System.out.println(arrayOne[i]);
                break;
            }
            System.out.print(arrayOne[i] + ", ");
        }

        double arrayTwo[] = {1.57, 7.654, 9.986};

        for (int i = 0; i < arrayTwo.length; i++) {
            if (i == arrayOne.length - 1) {
                System.out.println(arrayTwo[i]);
                break;
            }
            System.out.print(arrayTwo[i] + ", ");
        }

        String array[] = {"One", "two", "zero"};

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
                break;
            }
            System.out.print(array[i] + ", ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int arrayOne[] = new int[]{1, 2, 3};

        for (int i = arrayOne.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrayOne[i]);
                break;
            }
            System.out.print(arrayOne[i] + ", ");
        }

        double arrayTwo[] = {1.57, 7.654, 9.986};

        for (int i = arrayTwo.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrayTwo[i]);
                break;
            }
            System.out.print(arrayTwo[i] + ", ");
        }

        String array[] = {"One", "two", "zero"};

        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(array[i]);
                break;
            }
            System.out.print(array[i] + ", ");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int arrayOne[] = new int[]{1, 2, 3};
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] % 2 != 0) {
                arrayOne[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arrayOne));
    }
}