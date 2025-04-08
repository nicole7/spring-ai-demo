package com.ai.SpringAiDemo.controller;

import com.ai.SpringAiDemo.model.AISummaryResponse;
import com.ai.SpringAiDemo.model.GeneratedText;
import com.ai.SpringAiDemo.service.*;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.thymeleaf.context.Context;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

//@RestController
//@RequestMapping("/api/transcribe")
public class GenAIController {
//    private final SummaryService summaryService;
//    private final GeneratedText generatedText = new GeneratedText();
//    private final AISummaryResponse aiSummaryResponse = new AISummaryResponse();
//
//    @Autowired
//    private OCRService ocrService;
//
//    @Autowired
//    private AudioService audioService;
//
//    @Autowired
//    private ChatService chatService;
//
//    @Autowired
//    private EmailService emailService;
//
//    public GenAIController(SummaryService summaryService) {
//        this.summaryService = summaryService;
//    }
//
//    @GetMapping("chat-ai")
//    public void getChatText(@RequestParam String prompt){
//        chatService.getChatResponse(prompt, generatedText);
//        System.out.println("Image Response Text: " + generatedText.getImageText());
//    }
//
//    @PostMapping("/image-generated-text")
//    public String generateTextFromImage(@RequestParam("file") MultipartFile file) {
//        try {
//            ocrService.executeOCRCommand(file, generatedText);
//            return generatedText.getImageText();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return "Error processing file";
//        }
//    }
//
//    @PostMapping("audio-generated-text")
//    public void generateTextFromAudio(@RequestParam MultipartFile audioFile) {
//        audioService.getTranscribeAudio(audioFile, generatedText);
//        System.out.println("Audio Response Text: " + generatedText.getAudioText());
//    }
//
//    @GetMapping("/send-email")
//    public String sendEmailSummary() throws InterruptedException, ExecutionException {
//        Context context = new Context();
//        Future<String> generatedResponse = generateAIResponse();
//        String aiResponse = generatedResponse.get();
//        context.setVariable("messageContent", aiResponse);
//        try {
//            emailService.sendEmail("recipient@example.com", "Email Summary", "email-template", context);
//        } catch (MessagingException e) {
//            e.printStackTrace();
//            return "error";
//        }
//        return "success";
//    }
//
//
//    @Async
//    public Future<String> generateAIResponse() {
//        var summary = summaryService.createSummary();
//        aiSummaryResponse.setContent(summary);
//        return new AsyncResult<>(summary);
//    }
}
