package DesignPatterns.ObserverPattern;

public class Main
{
    public static void main(String args[]) throws InterruptedException {
        YouTubeChannel myChannel = new YouTubeChannel("MyChannel");
        Observer john = new YoutubeSubscriber("Jhon");
        Observer bob = new YoutubeSubscriber("Bob");
        Observer tom = new YoutubeSubscriber("Tom");

        myChannel.addSubscriber(john);
        myChannel.addSubscriber(bob);
        myChannel.addSubscriber(tom);
        myChannel.notifyAllSubscribers(new YouTubeEvent(EventType.NEW_VIDEO,"Design Pattern"));
        myChannel.removeSubscriber(tom);
        System.out.println();
        Thread.sleep(5000);
        myChannel.notifyAllSubscribers(new YouTubeEvent(EventType.LIVE_STREAM,"Java for beginners"));

    }
}
