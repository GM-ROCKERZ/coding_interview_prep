package DesignPatterns.stratgyDesignPattern;

public class FacebookAdapter implements SocialActions
{

    @Override
    public void share(String content) {
        System.out.println("Your content "+content+ " has been shared on facebook");
    }
}
