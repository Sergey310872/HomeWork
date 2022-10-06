package HomeWork_2.Task_2_3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер двумерного массива целых чисел: ");
        System.out.print("Ширина: ");
        int n1 = in.nextInt();
        System.out.print("Высота: ");
        int n2 = in.nextInt();

        int n=n1*n2;
        int arr1[] = new int[n];
        int k=0;
        int arr[][] = new int[n1][n2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print("Введите элемент [" + i + ", " + j + "]: ");
                arr[i][j] = in.nextInt();
                arr1[k]=arr[i][j];
                k++;
            }
        }

        Arrays.sort(arr1);

        k=0;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                arr[i][j] = arr1[k];
                k++;
            }
        }

         for (int i = (n1-1); i >=0; --i) {
            for (int j = (n2-1); j >=0; --j) {
               System.out.print(" "+arr[i][j]);
            }
            System.out.println();
         }

    }

}
