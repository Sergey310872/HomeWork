package HomeWork_4.Task_4_1;

public class Cow implements Animal {
    private String name;

    public Cow(String n) {
        this.name = n;
    }

    @Override
    public void tellMeWhoYouAre() {
        System.out.print(" Корова: " + name+".");
    }

    public String getName() {
        return name;
    }
}