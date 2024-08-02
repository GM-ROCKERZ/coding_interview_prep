package DesignPatterns.stratgyDesignPattern;

public class WhatsAppAdapter implements SocialActions
{

    @Override
    public void share(String content)
    {
        System.out.println("Shared "+content+"on whatsapp Successfully");
    }
}
