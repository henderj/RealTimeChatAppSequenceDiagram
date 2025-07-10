public class User {
    public void sendMessage(ChatClient client, String message) {
        // Code to send message via ChatClient
        client.sendMessage(message);
    }

    public void receiveMessage(ChatClient client) {
        // Code to receive message from ChatClient
        client.receiveMessage("Hello, User!");
    }

    public static void main(String[] args) {
        ChatClient client = new ChatClient("localhost", 8080);
        User user = new User();
        user.sendMessage(client, "Hello, Server!");
        user.receiveMessage(client);
    }
}