/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUILoanPackage;

import java.text.NumberFormat;

/**
 *
 * @author Rextine
 */
public abstract class Loan implements LoanConstants {
    private int loanNum;
    private String lastName;
    private double loanAmt;
    public  double interestRate;
    private int term;
    

    public Loan(int loanNum, String lastName, double loanAmt, int term){
        this.loanNum = loanNum;
        this.lastName = lastName;
        this.loanAmt = loanAmt;
        this.term = term;
    }

    public int getLoanNum() {
        return loanNum;
    }

    public void setLoanNum(int loanNum) {
        this.loanNum = loanNum;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    
    public double calculateTotalAmt() {
        if(loanAmt > MAX_LOAN_AMOUNT){
           loanAmt = MAX_LOAN_AMOUNT;
       }
        return loanAmt + (loanAmt * (interestRate/100) * term);
    }
    
    
    public String toString(){
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setGroupingUsed(true);
        String loan = numberFormat.format(loanAmt);
        String total = numberFormat.format(calculateTotalAmt());
        
        return  "Loan Number: \t" + loanNum + "\n" +
                "===============================================" +
                "\nCustomer Last Name: \t" + lastName.toUpperCase() +
                "\nAmount of Loan: \t$" + loan +
                "\nInterest Rate: \t\t" + interestRate + "%" +
                "\nTerm: \t\t" + term + " year(s)" +
                "\nTotal Amount Owed: \t$" + total + "\n" +
                 "===============================================" + "\n";
    }
}
