public class VoiceMessage extends MessageType {
    public VoiceMessage(DeliveryChannel channel) {
        super(channel);
    }

    @Override
    public void send(String content) {
        channel.deliver("[VOICE] " + content);
    }
}
