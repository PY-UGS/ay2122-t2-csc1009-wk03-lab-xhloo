import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Loan newLoan = new Loan();
        Scanner input = new Scanner(System.in);

        // annualInterestRate
        System.out.println("Enter annual interest rate, for example, 8.25:");
        double annualInterestRate = input.nextDouble();
        newLoan.setAnnualInterestRate(annualInterestRate);
        
        // numberOfYears
        System.out.println("Enter number of years as an integer: ");
        int numberOfYears = input.nextInt();
        newLoan.setNumberOfYears(numberOfYears);

        // loanAmount
        System.out.println("Enter loan amount, for example, 120000.95: ");
        double loanAmount = input.nextDouble();
        newLoan.setLoanAmount(loanAmount);

        //loanDate
        java.util.Date loanDate = new java.util.Date();
        System.out.println("The loan was created on " + loanDate);

        System.out.println("The monthly payment is " + String.format("%.2f", newLoan.getMonthlyPayment()));
        System.out.println("The total payment is " + String.format("%.2f", newLoan.getTotalPayment()));
    }
}
