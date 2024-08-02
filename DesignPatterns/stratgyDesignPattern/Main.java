package DesignPatterns.stratgyDesignPattern;

public class Main
{
    public static void main(String args[])
    {
        try
        {
            shareUrlOnSocialMedia("https://myawsomelink.dev");
        }catch(Exception exception)
        {
            System.out.println(exception);
        }
    }

    private static void shareUrlOnSocialMedia(String url) throws Exception {
        SocialActivity socialActivityContext = new SocialActivity();
        socialActivityContext.useAdapter(new FacebookAdapter()).shareLink(url);
        socialActivityContext.useAdapter(new LinkedInAdapter()).shareLink(url);
        socialActivityContext.useAdapter(new WhatsAppAdapter()).shareLink(url);
    }
}
