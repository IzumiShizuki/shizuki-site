package io.github.shizuki.site.user.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "shizuki.auth")
public class AuthProperties {

    private Jwt jwt = new Jwt();
    private Captcha captcha = new Captcha();
    private Verify verify = new Verify();
    private Bind bind = new Bind();
    private Retry retry = new Retry();

    public Jwt getJwt() {
        return jwt;
    }

    public void setJwt(Jwt jwt) {
        this.jwt = jwt == null ? new Jwt() : jwt;
    }

    public Captcha getCaptcha() {
        return captcha;
    }

    public void setCaptcha(Captcha captcha) {
        this.captcha = captcha == null ? new Captcha() : captcha;
    }

    public Verify getVerify() {
        return verify;
    }

    public void setVerify(Verify verify) {
        this.verify = verify == null ? new Verify() : verify;
    }

    public Bind getBind() {
        return bind;
    }

    public void setBind(Bind bind) {
        this.bind = bind == null ? new Bind() : bind;
    }

    public Retry getRetry() {
        return retry;
    }

    public void setRetry(Retry retry) {
        this.retry = retry == null ? new Retry() : retry;
    }

    public static class Jwt {

        private String secret = "PLEASE_CHANGE_ME";
        private long accessTtlSeconds = 7200L;
        private long refreshTtlSeconds = 2592000L;
        private boolean refreshRotate = true;

        public String getSecret() {
            return secret;
        }

        public void setSecret(String secret) {
            this.secret = secret;
        }

        public long getAccessTtlSeconds() {
            return accessTtlSeconds;
        }

        public void setAccessTtlSeconds(long accessTtlSeconds) {
            this.accessTtlSeconds = Math.max(300L, accessTtlSeconds);
        }

        public long getRefreshTtlSeconds() {
            return refreshTtlSeconds;
        }

        public void setRefreshTtlSeconds(long refreshTtlSeconds) {
            this.refreshTtlSeconds = Math.max(3600L, refreshTtlSeconds);
        }

        public boolean isRefreshRotate() {
            return refreshRotate;
        }

        public void setRefreshRotate(boolean refreshRotate) {
            this.refreshRotate = refreshRotate;
        }
    }

    public static class Captcha {

        private long imageTtlSeconds = 120L;
        private int imageLength = 2;

        public long getImageTtlSeconds() {
            return imageTtlSeconds;
        }

        public void setImageTtlSeconds(long imageTtlSeconds) {
            this.imageTtlSeconds = Math.max(30L, imageTtlSeconds);
        }

        public int getImageLength() {
            return imageLength;
        }

        public void setImageLength(int imageLength) {
            this.imageLength = Math.max(2, Math.min(3, imageLength));
        }
    }

    public static class Verify {

        private long emailTtlSeconds = 300L;
        private long emailCooldownSeconds = 60L;
        private int emailMaxAttempts = 5;

        public long getEmailTtlSeconds() {
            return emailTtlSeconds;
        }

        public void setEmailTtlSeconds(long emailTtlSeconds) {
            this.emailTtlSeconds = Math.max(60L, emailTtlSeconds);
        }

        public long getEmailCooldownSeconds() {
            return emailCooldownSeconds;
        }

        public void setEmailCooldownSeconds(long emailCooldownSeconds) {
            this.emailCooldownSeconds = Math.max(10L, emailCooldownSeconds);
        }

        public int getEmailMaxAttempts() {
            return emailMaxAttempts;
        }

        public void setEmailMaxAttempts(int emailMaxAttempts) {
            this.emailMaxAttempts = Math.max(1, emailMaxAttempts);
        }
    }

    public static class Bind {

        private long ticketTtlSeconds = 600L;

        public long getTicketTtlSeconds() {
            return ticketTtlSeconds;
        }

        public void setTicketTtlSeconds(long ticketTtlSeconds) {
            this.ticketTtlSeconds = Math.max(60L, ticketTtlSeconds);
        }
    }

    public static class Retry {

        private int count = 1;
        private long backoffMs = 120L;
        private long maxBackoffMs = 1000L;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = Math.max(0, count);
        }

        public long getBackoffMs() {
            return backoffMs;
        }

        public void setBackoffMs(long backoffMs) {
            this.backoffMs = Math.max(50L, backoffMs);
        }

        public long getMaxBackoffMs() {
            return maxBackoffMs;
        }

        public void setMaxBackoffMs(long maxBackoffMs) {
            this.maxBackoffMs = Math.max(this.backoffMs, maxBackoffMs);
        }
    }
}

