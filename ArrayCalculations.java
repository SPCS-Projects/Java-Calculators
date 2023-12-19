import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean cont = false;
        int num = 0;
        int i = 0;
        Scanner keyboard = new Scanner(System.in);
        while(cont == false) {
            System.out.println("Enter a positive number between 10 and 20: ");
            num = keyboard.nextInt();
            if(num >= 10 && num <= 20){
                cont = true;
            }
            else{
                System.out.println("The number entered is not a positive number between 10 and 20, please try again");
            }
        }
        int[] numArr = new int[num];
        System.out.println("The state of the array before initialization");
        for (i = 0; i < num; i++) {
            System.out.printf("%d\t",  numArr[i]);
        }
        System.out.println("\nThe state of the array after initialization");
        for (i = 0; i < num; i++) {
            numArr[i] = i;
            System.out.printf("%d\t",  numArr[i]);
        }
        System.out.println("\nThe state of the array after random filling");
        for (i = 0; i < num; i++) {
            numArr[i] = 1 + (int)(Math.random() * 200);
            System.out.printf("%d\t",  numArr[i]);
        }
        System.out.println("\nThe odd numbers are");
        for (i = 0; i < num; i++) {
            if(numArr[i]%2 > 0) {
                System.out.printf("%d\t", numArr[i]);
            }
        }
        int sum = 0;
        for (i = 0; i < num; i++) {
            sum += numArr[i];
        }
        System.out.printf("\nthe sum is: %d", sum);
        System.out.printf("\nthe avg is: %.2f", (double)sum/num);

        int max = 0;
        int min = 201;
        for (int number : numArr){
            if (number > max){
                max = number;
            }
            if (number < min){
                min = number;
            }
        }
        System.out.printf("\nthe max is: %d", max);
        System.out.printf("\nthe min is: %d", min);
    }
}