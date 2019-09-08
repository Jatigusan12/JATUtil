package InputOutput;

import java.util.*;

public class Input {

    public double getInput() {
        double value = 0;
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        value = Input.nextDouble();
        return value;
    }

    public double getvalue(double value) {
        return value;
    }

    public void inputAndSort() {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of Input: ");
        int num = input.nextInt();
        ArrayList<Double> lista = new ArrayList<Double>(num);
        for (int i = 0; i < num;) {
            System.out.print("Enter a Numbers: ");
//            double num1 = input.nextDouble();?
            if(input.hasNextDouble()){
                double num1 = input.nextDouble();
                i++;
            }else{
                continue;
            }
            }      
        }
    }
