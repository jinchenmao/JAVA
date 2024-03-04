import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = reader.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = reader.nextInt();
        }

        BubbleSort.bubbleSort(array);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        reader.close();
    }
}