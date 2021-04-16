package com.example.unittestingproject;

public class ChatPresenterImpl implements ChatsContract.chat_presenter {

    ChatsContract.chat_view chat_view;

    public ChatPresenterImpl(ChatsContract.chat_view chat_view) {
        this.chat_view = chat_view;
    }

    @Override
    public void sendMessage(String msg) {
        if (msg!=null && !msg.isEmpty())
        {
            chat_view.addMessage(msg);
        }
    }
}
