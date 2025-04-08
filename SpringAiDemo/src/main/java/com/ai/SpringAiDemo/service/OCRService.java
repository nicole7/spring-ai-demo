package com.ai.SpringAiDemo.service;

import com.ai.SpringAiDemo.model.GeneratedText;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@Service
public class OCRService {

//    public void executeOCRCommand(MultipartFile inputFile, GeneratedText generatedText) {
//        File file = null;
//        try {
//            // Convert MultipartFile to a File
//            file = File.createTempFile("uploaded", ".tmp");
//            try (FileOutputStream fos = new FileOutputStream(file)) {
//                fos.write(inputFile.getBytes());
//            }
//
//            // Execute Tesseract OCR
//            ProcessBuilder processBuilder = new ProcessBuilder("tesseract", file.getAbsolutePath(), "output");
//            Process process = processBuilder.start();
//            process.waitFor();
//
//            // Read the output from Tesseract
//            File outputFile = new File("output.txt");
//            StringBuilder outputContent = new StringBuilder();
//
//            try (BufferedReader reader = new BufferedReader(new FileReader(outputFile))) {
//                String line;
//                while ((line = reader.readLine()) != null) {
//                    outputContent.append(line).append(System.lineSeparator());
//                }
//            }
//
//            System.out.println(outputContent.toString());
//            generatedText.setImageText(outputContent.toString());
//
//        } catch (IOException | InterruptedException e) {
//            e.printStackTrace();
//        } finally {
//            // Clean up temporary file
//            if (file != null && file.exists()) {
//                file.delete();
//            }
//        }
//    }
}