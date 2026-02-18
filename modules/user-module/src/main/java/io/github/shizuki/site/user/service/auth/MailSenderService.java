package io.github.shizuki.site.user.service.auth;

import io.github.shizuki.common.core.resilience.RetrySpec;
import io.github.shizuki.common.core.resilience.SpringRetryExecutor;
import io.github.shizuki.site.user.auth.EmailVerificationPurpose;
import io.github.shizuki.site.user.config.AuthProperties;
import java.util.Set;
import org.springframework.mail.MailAuthenticationException;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSendException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class MailSenderService {

    private static final Set<Class<? extends Throwable>> RETRYABLE_EXCEPTIONS =
        Set.of(TransientMailException.class);

    private final JavaMailSender mailSender;
    private final SpringRetryExecutor retryExecutor;
    private final AuthProperties authProperties;

    public MailSenderService(JavaMailSender mailSender,
                             SpringRetryExecutor retryExecutor,
                             AuthProperties authProperties) {
        this.mailSender = mailSender;
        this.retryExecutor = retryExecutor;
        this.authProperties = authProperties;
    }

    public void sendVerificationCode(String email, EmailVerificationPurpose purpose, String code) {
        RetrySpec retrySpec = RetrySpec.exponentialJitter(
            authProperties.getRetry().getCount() + 1,
            authProperties.getRetry().getBackoffMs(),
            authProperties.getRetry().getMaxBackoffMs()
        );
        retryExecutor.execute(retrySpec, RETRYABLE_EXCEPTIONS, () -> {
            sendOnce(email, purpose, code);
            return null;
        });
    }

    private void sendOnce(String email, EmailVerificationPurpose purpose, String code) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(email);
            message.setSubject("[Shizuki] Email Verification Code");
            message.setText(buildBody(purpose, code));
            mailSender.send(message);
        } catch (MailAuthenticationException ex) {
            throw ex;
        } catch (MailSendException ex) {
            throw new TransientMailException("mail_send_transient", ex);
        } catch (MailException ex) {
            throw new TransientMailException("mail_transient", ex);
        }
    }

    private String buildBody(EmailVerificationPurpose purpose, String code) {
        return "Purpose: " + purpose.name()
            + "\nVerification code: " + code
            + "\nThis code will expire in " + authProperties.getVerify().getEmailTtlSeconds() + " seconds.";
    }

    private static class TransientMailException extends RuntimeException {

        private TransientMailException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}

