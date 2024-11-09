package com.zerobase.cms.user.service;

import com.zerobase.cms.user.client.MailgunClient;
import com.zerobase.cms.user.client.mailgun.SendMailForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailSendService {

    private final MailgunClient mailgunClient;

    public String sendEmail() {

        SendMailForm form = SendMailForm.builder()
                .from("zerobase-test@sandboxdbe6d6f5eac24ee6a5a221d73ba0b36f.mailgun.org")
                .to("9hjcho2@gmail.com")
                .subject("Test email from zero base")
                .text("my text")
                .build();

        return mailgunClient.sendEmail(form).getBody();
    }

}
