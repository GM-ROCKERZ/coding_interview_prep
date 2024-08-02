package DesignPatterns.stratgyDesignPattern;

public class SocialActivity
{
    private SocialActions socialMediumContext;

    public SocialActivity useAdapter(SocialActions socialActionsAdapter)
    {
        this.socialMediumContext = socialActionsAdapter;
        return this;
    }

    public void shareLink(String link) throws Exception
    {
        if(this.socialMediumContext==null)
        {
            throw new Exception("Social Adapter should be specified");
        }
        socialMediumContext.share(link);
    }
}
