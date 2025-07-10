public class ChatDatabase {
    public void storeMessage(String message) {
        // Code to store message in the database
        System.out.println("Message stored: " + message);
    }

    public static void main(String[] args) {
        ChatDatabase database = new ChatDatabase();
        database.storeMessage("Hello, Database!");
    }
}