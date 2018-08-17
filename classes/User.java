package javachallenge;

public class User {
    String firstname,lastname,date;
    int age;
    long salary;
    public User(String first,String last){
        firstname = first.toUpperCase().charAt(0)+""+first.substring(1, first.length());
        lastname = last.toUpperCase().charAt(0)+""+last.substring(1, last.length());
    }
    
    public User(String first,String last,int age,long salary,String date){
        firstname = first.toUpperCase().charAt(0)+""+first.substring(1, first.length());
        lastname = last.toUpperCase().charAt(0)+""+last.substring(1, last.length());
        this.age = age;
        this.salary = salary;
        this.date = date;
    }
}

