package DesignPatterns.stratgyDesignPattern;

public class LinkedInAdapter implements SocialActions
{

    @Override
    public void share(String content) {
        System.out.println("Posted "+ content + "on LinkedIn Successfully");
    }
}
