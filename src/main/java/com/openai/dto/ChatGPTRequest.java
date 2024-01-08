package com.openai.dto;

import java.util.ArrayList;
import java.util.List;


public class ChatGPTRequest {

    private String model;
    private List<Message> messages;
    private int max_tokens;

    public ChatGPTRequest(String model, String prompt, int maxTokens) {
        this.model = model;
        this.messages = new ArrayList<>();
        this.messages.add(new Message("user",prompt));
        this.max_tokens = maxTokens;
    }

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public int getMax_tokens() {
		return max_tokens;
	}

	public void setMax_tokens(int max_tokens) {
		this.max_tokens = max_tokens;
	}
    
}
