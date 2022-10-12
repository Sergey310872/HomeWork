package HomeWork_4.Task_4_1;

public class Snake implements Animal {
    private String name;

    public Snake(String n) {
        this.name = n;
    }

    @Override
    public void tellMeWhoYouAre() {
        System.out.print(" Змея: " + name+".");
    }

    public String getName() {
        return name;
    }
}