import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = {15, 12, 788, 1, -1, -778, 2, 0};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the target number: ");
        int targetNumber = scanner.nextInt();


        int closestSmaller = closest.findClosestSmaller(array , targetNumber);
        int closestLarger = closest.findClosestLarger(array ,targetNumber);

        System.out.println("Closest number smaller than the entered number: " + closestSmaller);
        System.out.println("Closest number larger than the entered number: " + closestLarger);


        }

    }
