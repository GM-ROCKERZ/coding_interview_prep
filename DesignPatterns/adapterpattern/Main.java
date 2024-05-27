package DesignPatterns.adapterpattern;

public class Main
{
    public static void main(String args[])
    {
        FriendCellPhone adaptee = new FriendCellPhone();
        CellPhoneAdapter cellPhoneAdapter = new CellPhoneAdapter(adaptee);
        cellPhoneAdapter.call();
    }
}
