package com.ai.SpringAiDemo.service;

import com.ai.SpringAiDemo.model.GeneratedText;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.openai.OpenAiChatOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class ChatService {
 //   private final ChatModel chatModel;

//    public ChatService(ChatModel chatModel) {
//        this.chatModel = chatModel;
//    }
//
//    public void getChatResponse(String prompt, GeneratedText generatedText){
//        System.out.println(chatModel.call(prompt));
//        generatedText.setChatText(chatModel.call(prompt));
//    }
//
//    public void getResponseOptions(String prompt, GeneratedText generatedText){
//         ChatResponse response = chatModel.call(
//                new Prompt(
//                        prompt,
//                        OpenAiChatOptions.builder()
//                                .withModel("gpt-4o")
//                                .withTemperature(0.4F)
//                                .build()
//                ));
//         System.out.println(response.getResult().getOutput().getContent());
//        generatedText.setChatText(response.getResult().getOutput().getContent());
//    }
}
