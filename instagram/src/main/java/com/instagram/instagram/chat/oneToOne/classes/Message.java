package com.instagram.instagram.chat.oneToOne.classes;

public class Message {
    private String content;
    private String sender;
    private String receiver;
    private Status status;

    @Override
    public String toString() {
        return "Message [content=" + content + ", sender=" + sender + ", receiver=" + receiver + ", status=" + status
                + "]";
    }

    public Message() {
    }

    public Message(String content, String sender, String receiver, Status status) {
        this.content = content;
        this.sender = sender;
        this.receiver = receiver;
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
