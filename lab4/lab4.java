// task #2
import java.util.Arrays;
import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        int[] array = new int[] {};
        Scanner scanner = new Scanner(System.in);
        int x = 0;

        System.out.println("Enter an element of integer array"); //Initialising array
        while (!scanner.hasNext("quit")) {
            if (scanner.hasNextInt()){
                array = Arrays.copyOf(array, array.length + 1);
                array[array.length - 1] = scanner.nextInt();
                System.out.println("Enter another integer or type quit to stop");
        }
            else {

                System.out.println("Error type! Please enter an integer");
                scanner.next();
            }
        }
        if (array.length != 0){ //Setting a target
            scanner.next();
            System.out.println("Enter a target that will be deleted");
            if (scanner.hasNextInt())
                x = scanner.nextInt();
            else{
                System.out.println("Error type! Please enter an integer");
                scanner.next();
            }
            System.out.println("Your array:" + Arrays.toString(array));
            System.out.println("Your target:" + x);

            int n = 0;
            for (int i = 0; i < array.length; i++){
                if (array[i] == x)
                    n +=1;
            }
            int[] newArray = null;
            while (n != 0) {
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == x) {
                        newArray = new int[array.length - 1];
                        for (int index = 0; index < i; index++) {
                            newArray[index] = array[index];
                        }
                        for (int j = i; j < array.length - 1; j++) {
                            newArray[j] = array[j + 1];
                        }
                        array = Arrays.copyOf(newArray, newArray.length);
                        break;
                    }
                }
                n -= 1;
                continue;
            }
            System.out.println("Result array:" + Arrays.toString(array));

        }
        else
            System.out.println("Error! Null array");
        scanner.close();
    }
}
