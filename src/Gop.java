import java.util.Scanner;

public class Gop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr1[], arr2[], arr3[];
        int size1, size2, size3;
        System.out.println("Enter size of arr1:");
        size1 = scanner.nextInt();
        arr1 = new int[size1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter value of element " + (i + 1) + ":");
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
        System.out.println("Enter size of arr2:");
        size2 = scanner.nextInt();
        arr2 = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter value of element " + (i + 1) + ":");
            arr2[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
        }
        size3 = size1 + size2;
        arr3 = new int[size3];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = arr1.length; i < arr1.length + arr2.length; i++) {
            arr3[i] = arr2[i - arr1.length];
        }
        System.out.println(" \n arr3:");
        for (int i = 0 ; i < arr3.length ; i++){
            System.out.print(arr3[i] + "\t");
        }
    }
}