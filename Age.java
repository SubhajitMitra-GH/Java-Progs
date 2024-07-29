
import java.util.*;
class Age{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age;
        System.out.println("enter age");
        age=sc.nextInt();
        if(age>=18){
            System.out.println("You are eligible to vote");
        } 
        else{
            System.out.println("You are ineligible to vote");
        }
        

    }
}
    

