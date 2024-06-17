package DesignPatterns.FacadePattern;

public class main
{
    public static void main(String args[])
    {
        BankingFacade bankingFacade = new BankingFacade();
        bankingFacade.getAccountDetails("123456");
        bankingFacade.transferFund("123456","654321",100.0);
        bankingFacade.payBill("123456","BILL001",50.0);
    }
}
