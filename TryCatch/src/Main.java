import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //array has been defined.
        int[] arr = {31, 321, 4, 54, 3, 6, 45, 89, 8, 10};

        //The method that contains Try-Catch block has been called!
        getByIndexNumber(arr);
    }

    //This method will take an array of integers as a parameter!
    public static void getByIndexNumber(int[] arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter index number: ");
        int choice = input.nextInt();
        //The operation possible to cause an Exception.
        try {
            System.out.println("The number you want to see: " + arr[choice]);
            //Processing to be done in case of an exception is caught.
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Index out of bounds!");
            System.out.println("You must enter a number between 0-9");
        }
    }
}
