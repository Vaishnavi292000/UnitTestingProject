package com.example.unittestingproject;

public interface ChatsContract {

    public interface chat_view{
        void addMessage(String msg);
    }

    public interface chat_presenter{
        void sendMessage(String msg);
    }
}
