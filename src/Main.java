public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        System.out.println(countEvens(new int[] {2, 1, 2, 3, 4}));
        System.out.println(countEvens(new int[] {2, 2, 0}));
        System.out.println(countEvens(new int[] {1, 3, 5}));
        System.out.println("----------");
        System.out.println("Задание 2");
        System.out.println(dif(new float[] {2.1f, -1f, 20.2f, -30f, 4.3f}));
        System.out.println(dif(new float[] {20f, -2.4f, 0f}));
        System.out.println(dif(new float[] {1.5f, -3f, 5.6f}));
    }

    //1. Написать метод, возвращающий количество чётных элементов массива.
    //countEvens([2, 1, 2, 3, 4]) → 3
    //countEvens([2, 2, 0]) → 3
    //countEvens([1, 3, 5]) → 0
    private static int countEvens(int[] array){
        int counter = 0;
        for (int i = 0; i < array.length; i++)
            if ((array[i] % 2) == 0)
                counter++;
        return counter;
    }

    //2. Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.
    private static Float dif(float[] array){
        float min = array[0];
        float max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
            else if (array[i] > max)
                max = array[i];
        }
        return max-min;
    }
}