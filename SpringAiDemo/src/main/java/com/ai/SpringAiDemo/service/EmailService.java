package com.ai.SpringAiDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import java.nio.charset.StandardCharsets;

// USE THIS ONE

@Service
public class EmailService {

//    @Autowired
//    private JavaMailSender emailSender;
//
//    @Autowired
//    private TemplateEngine templateEngine;
//
//    public void sendEmail(String to, String subject, String templateName, Context context) throws MessagingException {
//        MimeMessage message = emailSender.createMimeMessage();
//        MimeMessageHelper helper = new MimeMessageHelper(message,
//                MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
//                StandardCharsets.UTF_8.name());
//
//        String html = templateEngine.process(templateName, context);
//
//        helper.setTo(to);
//        helper.setSubject(subject);
//        helper.setText(html, true);
//
//        emailSender.send(message);
//    }
}