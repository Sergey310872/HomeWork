package HomeWork_4.Task_4_2;

import java.util.Comparator;

public class AnimalComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1.getType() == o2.getType()) {
            if (o1.getAge() == o2.getAge()) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            } else {
                Integer age1 = o1.getAge();
                Integer age2 = o2.getAge();
                return age1.compareTo(age2);
            }
        } else {
            String type1 = o1.toString();
            String type2 = o2.toString();
            return type1.compareTo(type2);
        }
    }
}
