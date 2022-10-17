package HomeWork_5;

public class Main {
    public static void main(String[] args){
//        List<String> names= Files.lines(Path.of("C:/Java/Names.txt")).collect(Collectors.toList());
//        for (int i=0; i< names.size(); i++){
//            System.out.println(names.get(i));
//        }

        Service service=new Service();
        service.work();
    }
}
