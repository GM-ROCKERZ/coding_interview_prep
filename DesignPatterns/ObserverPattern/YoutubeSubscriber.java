package DesignPatterns.ObserverPattern;

public class YoutubeSubscriber implements Observer
{
    private String name;

    public YoutubeSubscriber(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void notifyMe(String youtubeChannelName, YouTubeEvent event) {
        System.out.println("Dear "+getName()+",Notification from "+youtubeChannelName+": "+event);
    }
}
