public class TextMessage extends MessageType {
    public TextMessage(DeliveryChannel channel) {
        super(channel);
    }

    @Override
    public void send(String content) {
        channel.deliver("[TEXT] " + content);
    }
}
