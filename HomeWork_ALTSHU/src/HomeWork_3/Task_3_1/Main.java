package HomeWork_3.Task_3_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList();
        Scanner in = new Scanner(System.in);
        String str, strUnic="";
        int ni, nj;

        System.out.print("Введите количество чисел, которые будете считывать: ");
        int n = in.nextInt();
        System.out.println("Введите " + n + " целых чисел: ");
        for (int i = 0; i < n; i++) {
            arr.add(in.nextInt());
        }

        System.out.println("Выводимый результат:");
        for (int i = 0; i < arr.size(); i++) {
            ni = arr.get(i);
            str = "" + ni + " ";
            for (int j = (i + 1); j < arr.size(); j++) {
                nj = arr.get(j);
                if (ni == nj) {
                    str = str + nj + " ";
                    arr.remove(j);
                    j--;
                }
            }
            if (!str.equals("" + ni + " ")) {
                System.out.println(str);
                arr.remove(i);
                i--;
            }else {
                strUnic=strUnic+ni+" ";
            }
        }
        System.out.println("Уникальные числа: "+strUnic);
    }
}
