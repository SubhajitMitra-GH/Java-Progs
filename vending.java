import java.util.*;

class vending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.println("Press 1 for juice or 2 for soda");
        ch = sc.nextInt();
        if (ch == 1) {
            System.out.println("Dispensing juice");
        } else if (ch == 2) {
            System.out.println("Dispensing soda");
        } else {
            System.out.println("Invalid choice");
        }
       
    }
}