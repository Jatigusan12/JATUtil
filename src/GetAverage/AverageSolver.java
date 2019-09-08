package GetAverage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AverageSolver {


    public double getAverage() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many input needed: ");
        int value = input.nextInt();
        int result = 0; String average;
        for (int i = 0; i < value;) {
            try {
                System.out.print("Enter a Number: ");
                int num = input.nextInt();
                result += num;
                 i++;
            } catch (Exception e) {
                continue;
            }
            
        }
        System.out.println("Total= "+result);
        System.out.print("Avarage= ");
        return result/value;
    }

}
