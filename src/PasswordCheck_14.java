import java.util.Scanner;

public class PasswordCheck_14 {
    /*
    A Java method to check whether a string is a valid password or not
 Password rules:
 A password must have at least ten characters.
 A password consists of only letters and digits.
 A password must contain at least two digits.
Expected Output:
1. A password must have at least eight characters.
2. A password consists of only letters and digits.
3. A password must contain at least two digits
 Input a password (You are agreeing to the above Terms and Conditions.): abcd1234
    */
    /*
    This program I get help from SACHIN PATEL
     */

    public static void main(String[] args) {
        PasswordCheck_14 objvb = new PasswordCheck_14();
        Scanner scanner = new Scanner(System.in);

        System.out.println("A password must have at least eight characters");
        System.out.println("A password consists of only letters and digit ");
        System.out.println("A password must contain at least two digits");

        System.out.print("Enter The Password : ");
        String a = scanner.nextLine();

        if (CheckPass(a)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    public static boolean CheckPass(String a) {

        String x;
        int n = 0;

        // Check Length Of Password
        if (a.length() < 8 || a.length() > 10) {
            return false;
        }

        // Password Between a to z and 1 to 9 :

        for (int i = 0; i < a.length(); i++) {
            x = a.toLowerCase();

            if (!Character.isLetterOrDigit(x.charAt(i))) { //x<='a'&& x>='z'
                return false;
            }

            if (Character.isDigit(x.charAt(i))) {
                n++;
            }

        }
        if (n < 2) {
            return false;
        }

        return true;
    }

}




