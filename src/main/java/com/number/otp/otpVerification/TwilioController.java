package com.number.otp.otpVerification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/twilio")
public class TwilioController {

    @Autowired
    private TwilioService twilioService;

    @PostMapping("/send-sms")
    public ResponseEntity<String> sendSms(@RequestParam String to, @RequestParam String message) {
        String response = twilioService.sendSms(to, message);
        return ResponseEntity.ok(response);
    }
}
