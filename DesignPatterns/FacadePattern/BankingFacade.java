package DesignPatterns.FacadePattern;

public class BankingFacade
{
    private AccountService accountService;
    private TransferService transferService;

    private BillPaymentService billPaymentService;

    public BankingFacade() {
        this.accountService = accountService;
        this.transferService = transferService;
        this.billPaymentService = billPaymentService;
    }

    public void getAccountDetails(String accountId)
    {
        accountService.getAccountDetails(accountId);
    }

    public void transferFund(String fromAccount,String toAccount,double amount)
    {
        transferService.transferFunds(fromAccount,toAccount,amount);
    }

    public void payBill(String accountId,String billId,double amount)
    {
        billPaymentService.payBill(accountId,billId,amount);
    }
}
