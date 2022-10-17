package HomeWork_5;

import java.util.ArrayList;

public class Person {
    private String phoneNumber;
    private String nameAndSurname;
    private ArrayList<String> emailList;
    private String address;

    public Person() {
        this.phoneNumber = "";
        this.nameAndSurname = "";
        this.emailList=new ArrayList<>();
        this.address=new String();
    }
    public Person(String pn, String p) {
        this.phoneNumber = pn;
        this.nameAndSurname = p;
        this.emailList=new ArrayList<>();
        this.address="";
    }
    public Person(String pn, String p, String e_mail, String address) {
        this.phoneNumber = pn;
        this.nameAndSurname = p;
        this.emailList = new ArrayList<>();
        this.emailList.add(e_mail);
        this.address=address;
    }


    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public void setNameAndSurname(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;
    }

    public ArrayList<String> getEmailList() {
        return emailList;
    }

    public void setEmailList(ArrayList<String> emailList) {
        this.emailList = emailList;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
