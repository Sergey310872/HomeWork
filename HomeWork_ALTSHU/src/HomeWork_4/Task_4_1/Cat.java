package HomeWork_4.Task_4_1;
//extends Animals
public class Cat  implements Animal {
    private String name;

    public Cat(String n) {
        this.name = n;
    }

    @Override
    public void tellMeWhoYouAre() {
        System.out.print(" Кошка: " + name+".");
    }

    public String getName() {
        return name;
    }


}
