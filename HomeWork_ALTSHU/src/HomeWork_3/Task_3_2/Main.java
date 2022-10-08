package HomeWork_3.Task_3_2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n3[]=new int[3];
        System.out.println("Введите последовательно длины сторон треугольника (целые числа):");
        for (int i=0; i<3; i++){
            n3[i]=in.nextInt();
        }

        Arrays.sort(n3);

        if ((n3[0]+n3[1])>=n3[2]){
            System.out.println("Треугольник существует");
        }else {
            System.out.println("Треугольник НЕ существует");
        }
    }
}
