package com.ai.SpringAiDemo;

import org.springframework.ai.openai.OpenAiAudioTranscriptionModel;
import org.springframework.ai.openai.OpenAiAudioTranscriptionOptions;
import org.springframework.ai.openai.api.OpenAiAudioApi;
import org.springframework.ai.openai.audio.transcription.AudioTranscriptionPrompt;
import org.springframework.ai.openai.audio.transcription.AudioTranscriptionResponse;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;

@RestController
public class AudioTranscribeController {

    private final  OpenAiAudioTranscriptionModel transcriptionModel;

    public AudioTranscribeController () {
        OpenAiAudioApi openAiAudioApi = new OpenAiAudioApi(System.getenv("OPENAI_API_KEY"));
        this.transcriptionModel = new OpenAiAudioTranscriptionModel(openAiAudioApi);
    }

    @PostMapping("/api/transcribe")
    public ResponseEntity<String> transcribeAudio(@RequestParam("file") MultipartFile file) throws IOException {
        File tempFile = File.createTempFile("audio", ".mp3");
        file.transferTo(tempFile);

        var transcriptionOptions = OpenAiAudioTranscriptionOptions.builder()
                .withResponseFormat(OpenAiAudioApi.TranscriptResponseFormat.TEXT)
                .withLanguage("en")
                .withTemperature(0f)
                .build();

//        var audioFile = new FileSystemResource("resources/audio/test-audio.mp3");
           var audioFile = new FileSystemResource(tempFile);
        AudioTranscriptionPrompt transcriptionRequest = new AudioTranscriptionPrompt(audioFile, transcriptionOptions);
        AudioTranscriptionResponse response = transcriptionModel.call(transcriptionRequest);
        System.out.println(response);

        tempFile.delete();
        return new ResponseEntity<>(response.getResult().getOutput(), HttpStatus.OK);
    }
}

