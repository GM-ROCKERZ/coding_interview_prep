package DesignPatterns.ObserverPattern;


public class YouTubeEvent
{
    private EventType eventType;
    private String topic;

    public YouTubeEvent(EventType eventType, String topic) {
        this.eventType = eventType;
        this.topic = topic;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "YouTubeEvent{" +
                "eventType=" + eventType +
                ", topic='" + topic + '\'' +
                '}';
    }
}
