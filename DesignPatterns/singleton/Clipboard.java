package DesignPatterns.singleton;

public class Clipboard
{
    private String value;
    private static Clipboard clipboard =null;

    //private constructor to prevent instantiation from outside
    private Clipboard()
    {

    }
    public static Clipboard getInstance()
    {
        if(clipboard == null)
        {
            clipboard = new Clipboard();
        }
        return clipboard;
    }
    public void copy(String value)
    {
        this.value = value;
    }
    public String paste()
    {
        return value;
    }
}