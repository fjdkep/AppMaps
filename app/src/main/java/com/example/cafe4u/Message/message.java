package com.example.cafe4u.Message;

public class message {
    String username, context;
    int imageUser;

    public message(String username, String context, int imageUser) {
        this.username = username;
        this.context = context;
        this.imageUser = imageUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public int getImageUser() {
        return imageUser;
    }

    public void setImageUser(int imageUser) {
        this.imageUser = imageUser;
    }
}
