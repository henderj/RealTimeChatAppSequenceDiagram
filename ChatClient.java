public class ChatClient {
    private String serverAddress;
    private int serverPort;

    public ChatClient(String serverAddress, int serverPort) {
        this.serverAddress = serverAddress;
        this.serverPort = serverPort;
    }

    public void sendMessage(String message) {
        // Code to transmit message to ChatServer
        System.out.println("Sending message: " + message);
    }

    public void receiveMessage(String message) {
        // Code to display incoming message
        System.out.println("Received message: " + message);
    }

    public static void main(String[] args) {
        ChatClient client = new ChatClient("localhost", 8080);
        client.sendMessage("Hello, Server!");
        client.receiveMessage("Hello, Client!");
    }
}