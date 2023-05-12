import java.lang.*;
import java.lang.String;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

class verifyOTP {
    public void sendOTPEmail(String toEmail, String otp) {
        final String fromEmail = "toffeestore592@gmail.com"; // your Gmail account
        final String appPassword = "zwahtynuhunuumfu"; // your Gmail app password

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(fromEmail, appPassword);
                    }
                });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject("Your OTP Code");
            message.setText("Your OTP Code is: " + otp);

            Transport.send(message);

            System.out.println("OTP email sent to " + toEmail);
        } catch (MessagingException e) {
            System.out.println("Error sending OTP email: " + e.getMessage());
        }
    }
}
