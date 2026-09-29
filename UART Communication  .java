import java.util.Scanner;

public class UARTCommunication {

    // UART Transmitter
    static String transmit(String data) {
        System.out.println("\nTransmitter:");
        System.out.println("Sending: " + data);

        // Add start and stop bits for simulation
        String frame = "0" + data + "1";

        System.out.println("UART Frame: " + frame);

        return frame;
    }

    // UART Receiver
    static String receive(String frame) {
        System.out.println("\nReceiver:");
        System.out.println("Received Frame: " + frame);

        // Remove start and stop bits
        String data = frame.substring(1, frame.length() - 1);

        System.out.println("Received Data: " + data);

        return data;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== UART Communication =====");

        System.out.print("Enter data to transmit: ");
        String data = sc.nextLine();

        String frame = transmit(data);

        receive(frame);

        System.out.println("\nUART Communication Completed.");

        sc.close();
    }
}
