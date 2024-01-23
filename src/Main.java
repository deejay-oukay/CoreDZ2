public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        System.out.println(countEvens(new int[] {2, 1, 2, 3, 4}));
        System.out.println(countEvens(new int[] {2, 2, 0}));
        System.out.println(countEvens(new int[] {1, 3, 5}));
        System.out.println("----------");
        System.out.println("Задание 2:");
        System.out.println(dif(new float[] {2.1f, -1f, 20.2f, -30f, 4.3f}));
        System.out.println(dif(new float[] {20f, -2.4f, 0f}));
        System.out.println(dif(new float[] {1.5f, -3f, 5.6f}));
        System.out.println("----------");
        System.out.println("Задание 3:");
        System.out.println((isDoubleZero(new int[] {2, 1, 2, 3, 4, 2, 2, 0, 1, 3, 5}) ? "Есть два соседних элемента" : "Нет двух соседних элементов") + " с нулевым значением");
        System.out.println((isDoubleZero(new int[] {2, 1, 2, 3, 4, 2, 0, 0, 1, 3, 5}) ? "Есть два соседних элемента" : "Нет двух соседних элементов") + " с нулевым значением");
        System.out.println((isDoubleZero(new int[] {2, 0, 2, 3, 4, 2, 2, 0, 1, 3, 5}) ? "Есть два соседних элемента" : "Нет двух соседних элементов") + " с нулевым значением");
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
    private static float dif(float[] array){
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

    //3. Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
    private static Boolean isDoubleZero(int[] array){
        for (int i = 0; i < array.length-1; i++)
            if ((array[i] == 0) && (array[i+1] == 0))
                return true;
        return false;
    }
}