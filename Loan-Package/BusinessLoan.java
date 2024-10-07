/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUILoanPackage;

/**
 *
 * @author Rextine
 */
public class BusinessLoan extends Loan{

    public BusinessLoan(int loanNum, String lastName, double loanAmt, int term,  int primeInterest) {
        super(loanNum, lastName, loanAmt, term);
        setInterestRate(primeInterest + 1);
    }
    
}
