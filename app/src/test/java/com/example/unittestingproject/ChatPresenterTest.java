package com.example.unittestingproject;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class ChatPresenterTest {

    ChatsContract.chat_presenter chatPresenter;

    @Mock
    ChatsContract.chat_view chat_view;

    @Before
    public void setup()
    {
        MockitoAnnotations.initMocks(this);
        chatPresenter=new ChatPresenterImpl(chat_view);
    }

    @Test
    public void msgNull()
    {
        chatPresenter.sendMessage(null);
        verify(chat_view,never()).addMessage(anyString());
    }

    @Test
    public void msgEmpty()
    {
        chatPresenter.sendMessage("");
        verify(chat_view,never()).addMessage(anyString());
    }

    @Test
    public void msgSend()
    {
        chatPresenter.sendMessage("This is message");
        verify(chat_view).addMessage("This is message");
    }



}
