package DesignPatterns.ObserverPattern;

public interface Subject
{
    void addSubscriber(Observer observer);
    void removeSubscriber(Observer observer);
    void notifyAllSubscribers(YouTubeEvent event);

}
