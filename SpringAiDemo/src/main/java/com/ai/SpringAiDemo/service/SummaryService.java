package com.ai.SpringAiDemo.service;

import com.ai.SpringAiDemo.model.AISummaryResponse;
import com.ai.SpringAiDemo.model.GeneratedText;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class SummaryService {
    private final ChatModel chatModel;

    public SummaryService(ChatModel chatModel) {
        this.chatModel = chatModel;
    }
//
    private final GeneratedText generatedtext = new GeneratedText();

    private final AISummaryResponse aiSummaryResponse = new AISummaryResponse();


//    public String createSummary() {
//        var template = """
//                I want to create a a summary of {audioGeneratedText}, {ocrGeneratedText}, {inputText}.
//                Please summarize the given input in 1 to 2 paragraphs.
//                Respond to the summary and include any resources and references.
//                """;
//
//        PromptTemplate promptTemplate = new PromptTemplate(template);
//        Map<String, Object> params = Map.of(
//                "audioText", generatedtext.getAudioText(),
//                "imageText", generatedtext.getImageText(),
//                "promptText", generatedtext.getChatText()
//        );
//
//        Prompt prompt = promptTemplate.create(params);
//        aiSummaryResponse.setContent(chatModel.call(prompt).getResult().getOutput().getContent());
//        return chatModel.call(prompt).getResult().getOutput().getContent();
//    }

}

