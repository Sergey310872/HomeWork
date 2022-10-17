package HomeWork_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Repository {
    private HashMap<String, Person> repository;

    public Repository() {
        this.repository = new HashMap<String, Person>();
    }

    public Person getRepPerson(String pn) {
        return repository.get(pn);
    }

    public void setRepPerson(String pn, Person person) {
        this.repository.put(pn, person);
    }

    public HashMap<String, Person> getRepository() {
        return repository;
    }

    public ArrayList<String> getRepName(String n){
        ArrayList<String> listNames=new ArrayList<>();
        Set<Map.Entry<String, Person>> repSet = repository.entrySet();
        for (Map.Entry<String, Person> pair : repSet) {
            if (pair.getValue().getNameAndSurname().contains(n)) {
                listNames.add(pair.getKey());
            }
        }
        return listNames;
    }
}
