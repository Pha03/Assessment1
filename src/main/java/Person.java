import java.util.*;
import java.util.UUID;
public class Person {

    public static void main(String[] args){
        Scanner input=new Scanner (System.in);
        String Name;
        System.out.println("How many names do you want to enter");
        int count = input.nextInt();
        for (int i = 0; i < count; i++) {
            UUID uniqueKey = UUID.randomUUID();
            System.out.println("Please enter your name");
            Name=input.next();
            System.out.println("Your name is " + Name + " and your ID is " + uniqueKey);
        }
    }
}
