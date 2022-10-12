package HomeWork_4.Task_4_2;

public abstract class Animal {

    private String name;
    private int age;
    enum Type {COW, CAT, DOG, SNAKE}
    private Type type;

    public Animal(String name, int age, Type type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void tellMeWhoYouAre() {
        System.out.println("" + this.type + ", Age:" + this.age + "  Name: " + this.name + ".");
    }
}
