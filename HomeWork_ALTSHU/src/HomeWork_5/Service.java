package HomeWork_5;

import java.util.*;

public class Service {
    private Repository repository;

    public Service() {
        this.repository = new Repository();
        //Первичная инициализация репозитория
        this.repository.setRepPerson("+79218001111", new Person("+79218001111", "Иванов Иван Иванович"));
        this.repository.setRepPerson("+79218002222", new Person("+79218002222", "Петров Иван Петрович"));
        this.repository.setRepPerson("+79218003333", new Person("+79218003333", "Сидоров Иван Иванович"));
        this.repository.setRepPerson("+79218004444", new Person("+79218004444", "Иванов Иван Иванович", "address@mail.ru", "г.Москва"));
        this.repository.setRepPerson("+79218005555", new Person("+79218005555", "Fedor"));
    }

    public void work() {
        int choice = 0;
        while (choice != 6) {
            choice = mainMenu();
            switch (choice) {
                case 1:
                    listOfPerson();
                    returnMenu();
                    break;
                case 2:
                    searchPerson();
                    returnMenu();
                    break;
                case 3:
                    addPerson();
                    break;
                case 4:
                    dalitPerson();
                    break;
                case 5:
                    changePersonData();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Неверное значение. Попробуйте ещё раз.");
                    break;
            }
        }
        clearScreen();
        System.out.println("До свидания! Хорошего дня!");
    }

    public int mainMenu() {
        clearScreen();
        System.out.println("Главное меню:");
        System.out.println("1 - Вывести всех людей и их данные");
        System.out.println("2 - Найти человека по имени, номеру телефона, электронной почте");
        System.out.println("3 - Добавить человека");
        System.out.println("4 - Удалить человека с определенным номером телефона");
        System.out.println("5 - Редактировать данные участника с определенным номером телефона");
        System.out.println("6 - Завершить выполнение");
        System.out.print("Введите значение: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();

    }

    public int returnMenu() {
//        System.out.println();
        System.out.println("\n1 - вернуться в главное меню");
        Scanner inInt = new Scanner(System.in);
        do {
            System.out.print("Введите значение: ");
        }
        while (inInt.nextInt() != 1);
        return 4;
    }

    public void listOfPerson() {
        clearScreen();
        System.out.println("Список всех людей и их данные:");
        HashMap<String, Person> rep = repository.getRepository();
        for (String pn : rep.keySet()) {
            printPerson(pn);
        }
//        returnMenu();
    }

    public String searchPerson() {
        String pn = new String();
        Scanner inInt = new Scanner(System.in);
        System.out.println("По какому параметру ищем?");
        System.out.println("1 - по имени");
        System.out.println("2 - по номеру телефона");
        System.out.println("3 - по почте");
//        System.out.println("4 - вернуться в Главное меню");
        System.out.print("Введите значение: ");
        int choice = 0;
        while (choice != 1 && choice != 2 && choice != 3) {
            choice = inInt.nextInt();
            switch (choice) {
                case 1:
                    pn = searchName();
                    break;
                case 2:
                    pn = searchPhoneNumber();
                    break;
                case 3:
                    pn = searchEmail();
                    break;
            }
//            choice = returnMenu();
        }
        return pn;
    }

    public String searchPhoneNumber() {
        String pn = new String();
        Scanner inStr = new Scanner(System.in);
        System.out.print("Введите номер телефона для поиска: ");
        String str = inStr.nextLine();
        Person person = repository.getRepPerson(str);
        if (person == null) {
            System.out.println("Запись не найдена");
        } else {
            printPerson(str);
            pn = str;
        }
        return pn;
    }

    public String searchName() {
        String pn1 = new String();
        Scanner inStr = new Scanner(System.in);
        System.out.print("Введите Ф.И.О. для поиска: ");
        String str = inStr.nextLine().trim();
        ArrayList<String> listNames = repository.getRepName(str);
        if (listNames.size() == 0) {
            System.out.println("Запись не найдена");
        } else {
            for (String pn : listNames) {
                printPerson(pn);
                pn1 = pn;
            }
        }

//        Set<Map.Entry<String, Person>> repSet = repository.getRepository().entrySet();
//        for (Map.Entry<String, Person> pair : repSet) {
//            if (pair.getValue().getNameAndSurname().equals(str)) {
//                pn = pair.getKey();
//                printPerson(pn);
//            }
//        }
        return pn1;
    }

    public String searchEmail() {
        String pn = new String();
        Scanner inStr = new Scanner(System.in);
        System.out.print("Введите E-mail для поиска: ");
        String str = inStr.nextLine();
        Set<Map.Entry<String, Person>> repSet = repository.getRepository().entrySet();
        for (Map.Entry<String, Person> pair : repSet) {
            for (String e : pair.getValue().getEmailList()) {
                if (e.equals(str)) {
                    pn = pair.getKey();
                    printPerson(pn);
                }
            }
        }
        if (pn.length() == 0) {
            System.out.println("Запись не найдена");
        }
        return pn;
    }

    public void addPerson() {
        Scanner inStr = new Scanner(System.in);
        Scanner inInt = new Scanner(System.in);
        System.out.print("Введите номер телефона: ");
        String pn = inStr.nextLine();
        Person person = repository.getRepPerson(pn);
        if (person == null) {
            System.out.println("Запись не найдена");
            System.out.print("Введите новые ФИО: ");
            String nameAndSurname = inStr.nextLine();
            this.repository.setRepPerson(pn, new Person(pn, nameAndSurname));
            System.out.println("Создана новая запись:");
            printPerson(pn);
            changeData(pn);

        } else {
            System.out.println("Запись с таким телефоном уже существует.");
//            printPerson(pn);
            System.out.print("\nВыберите дальнейшие действия: \n1 - вернуться в главное меню, \n2 - редактировать имеющегося участника \nВведите значение: ");
            int choice = 0;
            while (choice != 1 && choice != 2) {
                choice = inInt.nextInt();
                if (choice == 2) changeData(pn);
            }
        }
    }

    public void dalitPerson() {
        clearScreen();
        Scanner inStr = new Scanner(System.in);
        Scanner inInt = new Scanner(System.in);
        System.out.print("Введите номер телефона для удаления: ");
        String phoneNumber = inStr.nextLine();
        Person p = repository.getRepPerson(phoneNumber);
        if (p == null) {
            System.out.println("Запись с таким номером телефона отсутствует.");
        } else {
            System.out.println("Удаленная запись: ");
            printPerson(phoneNumber);
//            System.out.println("Запись удалена: " + repository.getRepository().remove(phoneNumber));
        }
        System.out.println("Выберите дальнейшие действия: \n1 - вернуться в главное меню, \n2 - продолжить удаление ");
        int choice = 0;
        while (choice != 1 && choice != 2) {
            System.out.print("Введите значение: ");
            choice = inInt.nextInt();
            if (choice == 2) dalitPerson();
        }
    }

    public void changePersonData() {
        String pn = searchPerson();
        if (!pn.equals("")) {
            changeData(pn);
        }
    }

    public void changeData(String pn) {
        Scanner inInt = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);
        Person p = repository.getRepPerson(pn);
        int choice_1 = 2;
        while (choice_1 == 2) {
            clearScreen();
            System.out.println("Редактируем запись:");
            printPerson(pn);
            System.out.println("Какой параметр редактируем? \n" +
                    "1 - номер телефона, \n" +
                    "2 - имя и фамилию, \n" +
                    "3 - электронную почту, \n" +
                    "4 - адрес проживания");
            int choice = 0;
            while (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
                System.out.print("Введите значение: ");
                choice = inInt.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Введите новый номер телефона: ");
                        String phoneNumber = inStr.nextLine();
                        Person p1 = repository.getRepPerson(phoneNumber);
                        if (p1 == null) {
                            repository.getRepository().remove(pn);
                            this.repository.setRepPerson(phoneNumber, p);
                        }
                        break;
                    case 2:
                        System.out.print("Введите новые ФИО: ");
                        String nameAndSurname = inStr.nextLine();
                        p.setNameAndSurname(nameAndSurname);
                        break;
                    case 3:
                        ArrayList<String> emailList = p.getEmailList();
                        System.out.println("Список E-mail:");
                        int counter = 0;
                        for (String email : emailList) {
                            counter++;
                            System.out.println("" + counter + ". " + email);
                        }
                        System.out.print("Введите порядковый номер редактируемого E-mail, либо 0- для ввода нового адреса: ");
                        int choiceEmail = -1;
                        while (choiceEmail > emailList.size() || choiceEmail < 0) {
                            choiceEmail = inInt.nextInt();
                        }
                        System.out.print("Введите новый E-mail: ");
                        String str = inStr.nextLine();
                        if (choiceEmail == 0) {
                            emailList.add(str);
                        } else {
                            emailList.set(choiceEmail - 1, str);
                        }
                        p.setEmailList(emailList);
                        break;
                    case 4:
                        System.out.print("Введите новый адрес: ");
                        String address = inStr.nextLine();
                        p.setAddress(address);
                        break;
                    default:
                        System.out.print("Введите одно из значений (1, 2, 3 или 4): ");
                        break;
                }
            }
            System.out.println("\nВыберите дальнейшие действия: \n1 - вернуться в главное меню, \n2 - продолжить редактирование участника ");
            choice = 0;
            while (choice != 1 && choice != 2) {
                System.out.print("Введите значение: ");
                choice = inInt.nextInt();

//                if (choice == 2) choice_1=2;
//                else choice_1=1
            }
            choice_1=choice;
        }
        clearScreen();
        System.out.println("Окончательный вариант записи:");
        printPerson(pn);
        returnMenu();
    }

    public static void clearScreen() {
        try {
//            final String os = System.getProperty("os.name");
//            System.out.println("oper system:" + os);
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
            //System.out.print("\033\143");

        } catch (Exception E) {
            System.out.println(E);
        }

//        for(int i = 0; i < 30*300; i++) // Default Height of cmd is 300 and Default width is 80
//            System.out.println("\b"); // Prints a backspace

//       Runtime.getRuntime().exec("cls");

//               System.out.print("\033[H\033[2J");
//               System.out.flush();
    }

    public void printPerson(String pn) {
        Person p = repository.getRepPerson(pn);
        String email = "отсутствует";
        if (p.getEmailList().size() != 0) {
            email = "";
            for (String e : p.getEmailList()) {
                email = email + " " + e;
            }
        }
        String address = p.getAddress();
        address= (address.equals(""))?"отсутствует":address;
        System.out.println("Фамилия и имя: " + p.getNameAndSurname() + ", номер телефона: " + pn + ", Адреса электронной почты:" + email + ", Адрес проживания: " + address);
    }
}
