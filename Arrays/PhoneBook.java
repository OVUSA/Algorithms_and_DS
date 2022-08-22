package Algorithms_and_DS.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String []argh)
    {
        Map<String,String> phoneBook = new HashMap<>();

        Scanner sc = new Scanner (System.in);
        int entries = sc.nextInt();
        sc.nextLine();
        for ( int i = 0;i < entries;i++){
            String name = sc.nextLine();
            String phone = sc.nextLine();
            phoneBook.put(name,phone);
        }
        while(sc.hasNext()){
            String query = sc.nextLine();
            if(phoneBook.get(query)!=null){
                System.out.println(query+"="+ phoneBook.get(query));
            }else{
                System.out.println("Not found");
            }
        }
    }
}
