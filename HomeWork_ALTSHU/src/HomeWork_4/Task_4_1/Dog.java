package HomeWork_4.Task_4_1;
//extends Animals
public class Dog  implements Animal {
    private String name;

    public Dog(String n) {
        this.name = n;
    }

    @Override
    public void tellMeWhoYouAre() {
        System.out.print(" Собака: " + name+".");
    }

    public String getName() {
        return name;
    }


}
