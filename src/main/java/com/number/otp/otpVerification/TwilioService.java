package com.number.otp.otpVerification;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TwilioService {

    @Autowired
    private TwilioConfig twilioConfig;

    public String sendSms(String to, String messageBody) {
        try {
            Message message = Message.creator(
                    new PhoneNumber(to),
                    new PhoneNumber(twilioConfig.getPhoneNumber()),
                    messageBody
            ).create();
            return "Message sent successfully: " + messageBody;
        } catch (Exception e) {
            return "Failed to send message: " + e.getMessage();
        }
    }
}