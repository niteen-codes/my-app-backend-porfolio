package com.portfolio.com;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "https://my-app-frontend-two.vercel.app")  // Allow the React frontend to access the backend
@RestController
@RequestMapping("/contact")
public class ContactController {

    private final EmailService emailService;

    public ContactController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/send-email")
    public String sendEmail(@RequestBody ContactRequest request) {
        emailService.sendEmail(request);
        return "Email sent successfully!";
    }
}