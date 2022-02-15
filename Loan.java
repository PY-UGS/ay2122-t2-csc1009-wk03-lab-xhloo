public class Loan 
{
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;
  
    // Default constructor 
    Loan() 
    {
        this(2.5, 1, 1000);
    }
  
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) 
    {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }
  
    // Return annualInterestRate 
    public double getAnnualInterestRate() 
    {
        return annualInterestRate;
    }

    // Return numberOfYears 
    public int getNumberOfYears() 
    {
        return numberOfYears;
    }

    // Return loanAmount 
    public double getLoanAmount() 
    {
        return loanAmount;
    }
  
    // Set a new annual interest rate for this loan
    public void setAnnualInterestRate(double annualInterestRate) 
    {
        this.annualInterestRate = annualInterestRate;
    }
  
    // Set a new number of years for this loan
    public void setNumberOfYears(int numberOfYears) 
    {
        this.numberOfYears = numberOfYears;
    }
  
    // Set a new amount for this loan 
    public void setLoanAmount(double loanAmount) 
    {
        this.loanAmount = loanAmount;
    }
  
    // Find monthly payment 
    public double getMonthlyPayment() 
    {
        // annualInterestRate = 2.5 = 0.025 
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
        (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
        return monthlyPayment;    
    }
  
    // Find total payment 
    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;    
    }
  
    /** Return loan date */
    public java.util.Date getLoanDate() {
        return loanDate;
    }
}
