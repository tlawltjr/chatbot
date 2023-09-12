package com.example.chatbot.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {
    @Value("${openai.api.key}") // API 키를 외부 설정으로 관리하는 것을 권장합니다.
    private String apiKey;

}
