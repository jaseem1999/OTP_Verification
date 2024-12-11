package com.number.otp.otpVerification;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.twilio.Twilio;

@Configuration
public class TwilioConfig {

    @PostConstruct
    public void initializeTwilio() {
        Twilio.init(accountSid, authToken);
    }


    @Value("${twilio.AccountSID}")
    private String accountSid;

    @Value("${twilio.AuthToken}")
    private String authToken;

    @Value("${twilio.phoneNumber}")
    private String phoneNumber;



    public String getAccountSid() {
        return accountSid;
    }

    public String getAuthToken() {
        return authToken;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}