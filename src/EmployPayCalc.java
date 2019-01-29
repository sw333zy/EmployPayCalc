import java.util.Scanner;

public class EmployPayCalc {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter employee number: ");
        int employNum = keyboard.nextInt();

        System.out.println("Enter pay rate: ");
        int payRate = keyboard.nextInt();

        System.out.println("Enter hours worked");
        int hoursWorked = keyboard.nextInt();

        // employees cant get paid more than 25
        if (payRate > 25){
            System.out.println("Exceeds maximum pay");
            System.exit(0);

        //employees cant work more than 60hrs
        } else if (hoursWorked > 60){
                System.out.println("Exceeds maximum hours");
                System.exit(0);
        // employees working more than 36 hours get overtime and you cant work over 60 hrs
        } else if (hoursWorked >= 36 && hoursWorked <=60){
            int otHours = hoursWorked - 35;
            double otPay = (otHours) * (payRate * 1.5);
            double wkOtPay = (otPay) + (35 * payRate);
            System.out.println("Employee number: " + employNum + " Weekly Pay: " + wkOtPay);
            //employees who work no overtime
        } else if (hoursWorked <= 35){
            double wkPay = (hoursWorked) * (payRate);
            System.out.println("Employee number: " + employNum + " Weekly Pay: " + wkPay);
        }
}

}
