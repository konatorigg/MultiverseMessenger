public abstract class MessageType {
    protected final DeliveryChannel channel;

    public MessageType(DeliveryChannel channel) {
        this.channel = channel;
    }

    public abstract void send(String content);
}
