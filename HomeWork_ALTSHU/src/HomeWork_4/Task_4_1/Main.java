package HomeWork_4.Task_4_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        String tip="", name="";
        Scanner in=new Scanner(System.in);
        while (!tip.equals("достаточно")){
            System.out.print("Введите тип тип животного (Cow, Cat, Dog, Snake): ");
            tip= in.nextLine();
            System.out.print("Введите имя (кличку): ");
            switch (tip.toLowerCase()){
                case ("cat"):
                    name=in.nextLine();
                    Cat cat=new Cat(name);
                    animals.add(cat);
                    break;
                case ("cow"):
                    name=in.nextLine();
                    Cow cow=new Cow(name);
                    animals.add(cow);
                    break;
                case ("dog"):
                    name=in.nextLine();
                    Dog dog=new Dog(name);
                    animals.add(dog);
                    break;
                case ("snake"):
                    name=in.nextLine();
                    Snake snake=new Snake(name);
                    animals.add(snake);
                    break;
                case ("достаточно"):
                    break;
                default:
                    System.out.println("Неверное значение (только: Cow, Cat, Dog или Snake");
                    System.out.println("Попробуйте ещё раз или введите слово «Достаточно»");
            }
            System.out.println();
        }

        Comparator compAnimal=new AnimalComparator();
        animals.sort(compAnimal);
        String prevName="";
        for (Animal o:animals) {
            //У разных животных могут быть одинаковые клички. Сортировка по кличкам.
            //Разделяем строки между именами (кличками).
            if (!prevName.equals(o.getName())){
                System.out.println();
                prevName=o.getName();
            }
            o.tellMeWhoYouAre();
        }
    }
}

