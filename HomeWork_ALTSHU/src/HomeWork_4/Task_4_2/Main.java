package HomeWork_4.Task_4_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        String tip = "", name = "";
        int age;
        while (!tip.equals("достаточно")) {
            //Если обявить Scanner  за пределами цикла, то он работает не корректно.
            Scanner in = new Scanner(System.in);
            System.out.print("Введите тип тип животного (Cow, Cat, Dog, Snake): ");
            tip = in.nextLine();
            if (!tip.equalsIgnoreCase("достаточно")) {
                System.out.print("Введите имя (кличку): ");
                name = in.nextLine();
                System.out.print("Введите возраст: ");
                age = in.nextInt();

                switch (tip.toLowerCase()) {
                    case ("cat"):
                        Animal cat = new Cat(name, age, Animal.Type.CAT);
                        animals.add(cat);
                        break;
                    case ("cow"):
                        Animal cow = new Cow(name, age, Animal.Type.COW);
                        animals.add(cow);
                        break;
                    case ("dog"):
                        Animal dog = new Dog(name, age, Animal.Type.DOG);
                        animals.add(dog);
                        break;
                    case ("snake"):
                        Animal snake = new Snake(name, age, Animal.Type.SNAKE);
                        animals.add(snake);
                        break;
                    default:
                        System.out.println("Неверное значение (только: Cow, Cat, Dog или Snake");
                        System.out.println("Попробуйте ещё раз или введите слово «Достаточно»");
                        break;
                }
                System.out.println();
            }
        }
        Comparator compAnimal = new AnimalComparator();
        Collections.sort(animals, compAnimal);
        for (Animal o : animals) {
            o.tellMeWhoYouAre();
        }
    }
}
