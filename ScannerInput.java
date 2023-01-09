import java.util.Scanner;

public class ScannerInput {
    public static void main(String args[]) {
        // created Object class
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter Your Name, Email and Password :");
        // this is string userName
        String userName = myObj.nextLine();
        // String type emailId
        String emailId = myObj.nextLine();
        // int password
        int passWord = myObj.nextInt();

        // Print output and User Deteils
        System.out.println("UserName is : " + userName);
        System.out.println("EmailId is : " + emailId);
        System.out.println("PassWord is : " + passWord);

    }
}
