# Multiverse Messenger — SDP Bonus Task 20 (6 points)

## Pattern: Bridge

The program separates **message types** from **delivery channels**, allowing them to vary independently.

- **Abstraction:** `MessageType`
- **Refined abstractions:** `TextMessage`, `VoiceMessage`
- **Implementor:** `DeliveryChannel`
- **Concrete implementors:** `CarrierPigeon`, `QuantumTeleporter`
- **Additional implementor for the live defense:** `DroneDelivery`

