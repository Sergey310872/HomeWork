package HomeWork_2.Task_2_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Scanner in2=new Scanner(System.in);
        ArrayList arrList=new ArrayList();
        ArrayList arrListDabl=new ArrayList();
        ArrayList arrAnagram = new ArrayList();
        System.out.print("Введите количество слов:");
        int n=in.nextInt();
        String string;
        for (int i=0; i<n; i++){
            string=in2.nextLine().trim().toLowerCase();
            arrList.add(string);

            //Создаем параллельный массив с упорядоченными буквами в порядке возрастания
            char chArry[]=string.toCharArray();
            Arrays.sort(chArry);
            String str=new String(chArry);

            arrListDabl.add(str);

            // Вспомогательная проверка
//            for (char a:chArry) {
//                System.out.print(a);
//            }
//            System.out.println();
//            System.out.println("     "+string+"  "+str);
        }

        // Удаляем повторяющиеся слова
        int ind;
        Object s;
        for (int j=0; j<arrList.size(); j++){
            s=arrList.get(j);
//            System.out.println("индекс: " + j + s);
            ind = j+1;//arrList.indexOf(s)+1;
            for (int i = ind; i < arrList.size(); i++){
                if (s.equals(arrList.get(i))) {
                    arrList.remove(i);
                    arrListDabl.remove(i);
                    i--;//чтобы не пропустить элемент, который занял место удаленного элемента
                }
            }
        }

        // Проверяем на анограммы
        int ind1, score;
        Object s1;
        for (int j=0; j<arrListDabl.size(); j++){
            s1=arrListDabl.get(j);
            score=0;
//            System.out.println("индекс Dabl: " + arrListDabl.indexOf(s1) + s1);
            ind1 = j+1;//arrListDabl.indexOf(s1)+1;
            for (int i = ind1; i < arrListDabl.size(); i++){
                if (s1.equals(arrListDabl.get(i))) {
                    score++;
                    arrAnagram.add(arrList.get(i));
                    arrList.remove(i);
                    arrListDabl.remove(i);
                    i--;
                }
//                System.out.println("score: "+score);
            }
            if(score>0){
                arrAnagram.add(arrList.get(j));
                arrList.remove(j);
                arrListDabl.remove(j);
                --j;
            }
        }

        // Выводим результат
        System.out.println("Анаграммы: "+arrAnagram);
        System.out.println("Не анаграммы: "+arrList);
    }
}
