# Real-Time Chat App Sequence Diagram

This repository contains the sequence diagram for a real-time chat application. The diagram illustrates the interaction between different components such as the User, ChatClient, ChatServer, and ChatDatabase.

## System Overview

```mermaid
sequenceDiagram
    participant User
    participant ChatClient
    participant ChatServer
    participant ChatDatabase

    User->>ChatClient: Sends message
    ChatClient->>ChatServer: Transmit message
    ChatServer->>ChatDatabase: Store message
    ChatDatabase-->>ChatServer: Message stored
    ChatServer-->>ChatClient: Acknowledge message
    ChatClient-->>User: Message sent confirmation
    User->>ChatClient: Receives message notification
    ChatClient-->>User: Display incoming message
```
