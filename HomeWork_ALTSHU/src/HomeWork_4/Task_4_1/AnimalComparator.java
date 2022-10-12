package HomeWork_4.Task_4_1;

import java.util.Comparator;

class AnimalComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        String name1=o1.getName();
        String name2=o2.getName();
        return name1.compareToIgnoreCase(name2);
    }
}
