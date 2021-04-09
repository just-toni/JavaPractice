package chapterSeven;

public class EnhancedForLoop {

    public static void main(String[] args) {
        String[] names = {"Rose", "Michael", "Jamal", "Rebecca", "Joy", "Sam Smith", "Jennifer", "Joshua", "Sarah"};
        int[] numbers = {1, 4, 2, 6, 7, 2, 4, 6, 8, 9};

        for (String name : names) {
            System.out.println(name);
        }

        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        System.out.println(total);

        int result = sum(numbers);
        System.out.println(result);


    }

    public static int sum (int[] array) {
        int total = 0;
        for (int number : array) {
            total += number;
        }
        return total;
    }

}
