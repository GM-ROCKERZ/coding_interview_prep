package DesignPatterns.FacadePattern;

public class BillPaymentService
{
    public void payBill(String accountId,String billId,double amount)
    {
        System.out.println("paying bill "+ billId+" from account "+accountId+" with amount "+amount);
    }

}
