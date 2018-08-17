package javachallenge;
import java.util.*;
import java.io.*;
import java.util.Date;

public class JavaChallenge{
    
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        
        ArrayList <User> list = new ArrayList <User>();  
        User kevi = new User("ragu","ravi",20,1000,"18-11-1998");
        User ragu = new User("anushka","sharma",20,1000,"01-01-2000");
        list.add(kevi);
        list.add(ragu);  
        
        for(User u:list){
            System.out.println(u.firstname+" "+u.lastname+" "+u.age+" "+" "+u.salary+" "+u.date);
        }
        
    }
}   