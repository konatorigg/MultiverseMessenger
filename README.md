# Multiverse Messenger — SDP Bonus Task 20 (6 points)

## Pattern: Bridge

The program separates **message types** from **delivery channels**, allowing them to vary independently.

- **Abstraction:** `MessageType`
- **Refined abstractions:** `TextMessage`, `VoiceMessage`
- **Implementor:** `DeliveryChannel`
- **Concrete implementors:** `CarrierPigeon`, `QuantumTeleporter`
- **Additional implementor for the live defense:** `DroneDelivery`

## Run

Install Java JDK. Open a terminal in the folder with the `.java` files:

```bash
javac *.java
java Main
```

In IntelliJ IDEA, open this folder, open `Main.java`, and click the green Run icon next to `main`.

## Required combinations

1. TextMessage + CarrierPigeon
2. TextMessage + QuantumTeleporter
3. VoiceMessage + CarrierPigeon
4. VoiceMessage + QuantumTeleporter

Also demonstrates 2 extra combinations with `DroneDelivery`.

## Live defense (simple explanation)

`MessageType` stores a `DeliveryChannel` reference. When a message's `send()` method runs, it delegates delivery to `channel.deliver()`. This is the Bridge pattern: messages decide **what** is being sent, while channels decide **how** it is delivered.

To add a new channel, create a class that `implements DeliveryChannel` and implement `deliver(String message)`. `DroneDelivery` is the example. Neither `MessageType`, `TextMessage`, nor `VoiceMessage` needs any edits.

This supports the Open/Closed Principle: new channels are added through new classes instead of modifying existing message classes.
