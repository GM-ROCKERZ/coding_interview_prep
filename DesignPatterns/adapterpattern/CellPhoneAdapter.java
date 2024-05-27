package DesignPatterns.adapterpattern;

//Adapter class implementing the Target interface
public class CellPhoneAdapter implements CellPhone
{
    private FriendCellPhone friendCellPhone;

    public CellPhoneAdapter(FriendCellPhone friendCellPhone)
    {
        this.friendCellPhone = friendCellPhone;
    }

    @Override
    public void call()
    {
        friendCellPhone.ring();
    }
}
