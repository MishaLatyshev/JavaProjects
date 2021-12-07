import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class lab3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a date in dd/mm/yyyy format: ");
            String input = scanner.nextLine();
            scanner.close();

            String datePattern = "[\\d]{2}[/][\\d]{2}[/][\\d]{4}"; //Simple date pattern
            String myPattern = "([0-2][\\d]|[30]|[31])[/](([0][1-9])|([1][0-2]))[/](([19][\\d][\\d])|([2-9][\\d][\\d][\\d]))"; //Date between 1900 and 9999 pattern
            Pattern myP = Pattern.compile(myPattern);
            Pattern dateP = Pattern.compile(datePattern);
            Matcher myM = myP.matcher(input);
            Matcher dateM = dateP.matcher(input);

            if (myM.matches())
                System.out.println("Yes, it is a date located between 1900 and 9999");
            else if (dateM.matches())
                System.out.println("Input date is not between 1900 and 9999");
            else
                System.out.println("It is not a date");

        }
    }

