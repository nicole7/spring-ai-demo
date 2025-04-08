package com.ai.SpringAiDemo.service;

import com.ai.SpringAiDemo.model.GeneratedText;
import org.springframework.ai.openai.OpenAiAudioTranscriptionModel;
import org.springframework.ai.openai.OpenAiAudioTranscriptionOptions;
import org.springframework.ai.openai.audio.transcription.AudioTranscriptionPrompt;
import org.springframework.ai.openai.audio.transcription.AudioTranscriptionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

//@Service
public class AudioService {
//    private final OpenAiAudioTranscriptionModel model;
//
//    public AudioService(OpenAiAudioTranscriptionModel model) {
//        this.model = model;
//    }
//
//    @PostMapping("/transcribe")
//    public void getTranscribeAudio(@RequestParam("audio") MultipartFile audioFile, GeneratedText generatedText) {
//        Resource audioResource = audioFile.getResource();
//        OpenAiAudioTranscriptionOptions options =
//                OpenAiAudioTranscriptionOptions.builder().build();
//        AudioTranscriptionPrompt request =
//                new AudioTranscriptionPrompt(audioResource, options);
//        AudioTranscriptionResponse response =
//                this.model.call(request);
//        System.out.println(response.getResult().getOutput());
//        generatedText.setAudioText(response.getResult().getOutput());
//    }

}