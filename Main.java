public class Main {
    public static void main(String[] args) {
        DeliveryChannel pigeon = new CarrierPigeon();
        DeliveryChannel teleporter = new QuantumTeleporter();

        // The four required combinations
        new TextMessage(pigeon).send("Hello universe!");
        new TextMessage(teleporter).send("Hello universe!");
        new VoiceMessage(pigeon).send("Voice recording");
        new VoiceMessage(teleporter).send("Voice recording");

        // A new channel, added without changing any message class
        DeliveryChannel drone = new DroneDelivery();
        new TextMessage(drone).send("Hello from the drone!");
        new VoiceMessage(drone).send("Drone voice recording");
    }
}
