package io.github.shizuki.site.user.service.auth;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.user.config.AuthProperties;
import io.github.shizuki.site.user.response.auth.ImageCaptchaResponse;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.util.Base64;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class ImageCaptchaService {

    private final StringRedisTemplate redisTemplate;
    private final AuthProperties authProperties;

    public ImageCaptchaService(StringRedisTemplate redisTemplate, AuthProperties authProperties) {
        this.redisTemplate = redisTemplate;
        this.authProperties = authProperties;
    }

    public ImageCaptchaResponse createImageCaptcha() {
        int left = ThreadLocalRandom.current().nextInt(1, 10);
        int right = ThreadLocalRandom.current().nextInt(1, 10);
        String operator = ThreadLocalRandom.current().nextBoolean() ? "+" : "-";
        int result = "+".equals(operator) ? left + right : left - right;
        String expression = left + " " + operator + " " + right + " = ?";

        String captchaId = UUID.randomUUID().toString();
        String answerHash = sha256(String.valueOf(result));
        redisTemplate.opsForValue().set(
            buildCaptchaKey(captchaId),
            answerHash,
            Duration.ofSeconds(authProperties.getCaptcha().getImageTtlSeconds())
        );

        String svg = buildSvg(expression);
        return new ImageCaptchaResponse(captchaId, svg, authProperties.getCaptcha().getImageTtlSeconds());
    }

    public void validateAndConsume(String captchaId, String answer) {
        if (!StringUtils.hasText(captchaId) || !StringUtils.hasText(answer)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Captcha id and answer are required");
        }

        String captchaKey = buildCaptchaKey(captchaId);
        String attemptKey = buildCaptchaAttemptKey(captchaId);
        String expectedHash = redisTemplate.opsForValue().get(captchaKey);
        if (!StringUtils.hasText(expectedHash)) {
            redisTemplate.delete(attemptKey);
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Captcha expired");
        }

        long maxAttempts = authProperties.getCaptcha().getImageMaxAttempts();
        String actualHash = sha256(answer.trim());
        if (!expectedHash.equals(actualHash)) {
            Long attempts = redisTemplate.opsForValue().increment(attemptKey);
            redisTemplate.expire(
                attemptKey,
                Duration.ofSeconds(authProperties.getCaptcha().getImageTtlSeconds())
            );
            if (attempts != null && attempts >= maxAttempts) {
                redisTemplate.delete(captchaKey);
                redisTemplate.delete(attemptKey);
                throw new BusinessException(ErrorCode.BAD_REQUEST, "Captcha expired");
            }
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Captcha answer invalid");
        }
        redisTemplate.delete(captchaKey);
        redisTemplate.delete(attemptKey);
    }

    private String buildCaptchaKey(String captchaId) {
        return "auth:captcha:image:" + captchaId;
    }

    private String buildCaptchaAttemptKey(String captchaId) {
        return "auth:captcha:image:attempt:" + captchaId;
    }

    private String buildSvg(String expression) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        String[] palette = new String[] {"#111827", "#1F2937", "#4C1D95", "#0F766E", "#7C2D12"};
        StringBuilder svg = new StringBuilder(4096);

        svg.append("<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"220\" height=\"64\" viewBox=\"0 0 220 64\">");
        svg.append("<defs>");
        svg.append("<filter id=\"wave\" x=\"-20%\" y=\"-20%\" width=\"140%\" height=\"140%\">");
        svg.append("<feTurbulence type=\"fractalNoise\" baseFrequency=\"0.02 0.08\" numOctaves=\"2\" seed=\"")
            .append(random.nextInt(1, 10000))
            .append("\" result=\"noise\"/>");
        svg.append("<feDisplacementMap in=\"SourceGraphic\" in2=\"noise\" scale=\"5\" xChannelSelector=\"R\" yChannelSelector=\"G\"/>");
        svg.append("</filter>");
        svg.append("</defs>");

        svg.append("<rect width=\"220\" height=\"64\" fill=\"#F8F9FB\"/>");
        svg.append("<rect x=\"2\" y=\"2\" width=\"216\" height=\"60\" rx=\"10\" fill=\"#F3F7FF\" stroke=\"#D5DFEF\"/>");

        for (int i = 0; i < 7; i++) {
            int x1 = random.nextInt(0, 220);
            int y1 = random.nextInt(0, 64);
            int x2 = random.nextInt(0, 220);
            int y2 = random.nextInt(0, 64);
            svg.append("<line x1=\"")
                .append(x1)
                .append("\" y1=\"")
                .append(y1)
                .append("\" x2=\"")
                .append(x2)
                .append("\" y2=\"")
                .append(y2)
                .append("\" stroke=\"#64748B\" stroke-opacity=\"0.20\" stroke-width=\"1\"/>");
        }

        for (int i = 0; i < 24; i++) {
            int cx = random.nextInt(4, 216);
            int cy = random.nextInt(4, 60);
            int r = random.nextInt(1, 3);
            int opacity = random.nextInt(15, 36);
            svg.append("<circle cx=\"")
                .append(cx)
                .append("\" cy=\"")
                .append(cy)
                .append("\" r=\"")
                .append(r)
                .append("\" fill=\"#94A3B8\" fill-opacity=\"0.")
                .append(opacity)
                .append("\"/>");
        }

        svg.append("<g filter=\"url(#wave)\">");
        int cursorX = 18;
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == ' ') {
                cursorX += 10;
                continue;
            }
            int x = cursorX + random.nextInt(-2, 3);
            int y = 41 + random.nextInt(-5, 6);
            int rotate = random.nextInt(-18, 19);
            String color = palette[random.nextInt(palette.length)];
            svg.append("<text x=\"")
                .append(x)
                .append("\" y=\"")
                .append(y)
                .append("\" font-family=\"monospace\" font-size=\"29\" fill=\"")
                .append(color)
                .append("\" transform=\"rotate(")
                .append(rotate)
                .append(" ")
                .append(x)
                .append(" ")
                .append(y)
                .append(")\">")
                .append(escapeSvgChar(ch))
                .append("</text>");
            cursorX += 16;
        }
        svg.append("</g>");

        for (int i = 0; i < 3; i++) {
            int y1 = random.nextInt(16, 48);
            int y2 = y1 + random.nextInt(-8, 9);
            svg.append("<line x1=\"8\" y1=\"")
                .append(y1)
                .append("\" x2=\"212\" y2=\"")
                .append(y2)
                .append("\" stroke=\"#334155\" stroke-opacity=\"0.25\" stroke-width=\"1\"/>");
        }

        svg.append("</svg>");
        return svg.toString();
    }

    private String escapeSvgChar(char value) {
        return switch (value) {
            case '&' -> "&amp;";
            case '<' -> "&lt;";
            case '>' -> "&gt;";
            case '"' -> "&quot;";
            case '\'' -> "&apos;";
            default -> String.valueOf(value);
        };
    }

    private String sha256(String value) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = digest.digest(value.getBytes(StandardCharsets.UTF_8));
            return Base64.getUrlEncoder().withoutPadding().encodeToString(bytes);
        } catch (NoSuchAlgorithmException ex) {
            throw new IllegalStateException("SHA-256 not supported", ex);
        }
    }
}
