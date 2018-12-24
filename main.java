import java.util.Scanner;
import java.io.*;
import java.util.*;



public class main{

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String username;
    String password;
    char initial;

    System.out.println("WELCOME TO THE GRADEBOOK: ");
    System.out.println("-------------------------");
    System.out.println("If you are student, type S. If you are teacher, type T. If you are admin, type A: ");
    initial = input.next().charAt(0);
    if(initial == 'S'){
      System.out.println("Username: "); //Whole First Name + Last Name Initial
      username = input.next();
      System.out.println("Password: ");
      password = input.next();
      //System.out.println(username + "S" + password); //debug
      input.close();
    }else if(initial == 'T'){
      System.out.println("Username: "); //Whole First Name + Last Name Initial
      username = input.next();
      System.out.println("Password: ");
      password = input.next();
      // System.out.println(username + "T" + password); //debug
      input.close();
    }else if(initial == 'A'){
      System.out.println("Password: ");
      password = input.next();
      //System.out.println("A" + password); //debug
      input.close();
    }else{
      System.out.println("Wrong Inital.");
    }


  }




}
