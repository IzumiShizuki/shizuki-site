package io.github.shizuki.site.ai.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "shizuki.ai.chat")
public class AiChatProperties {

    private boolean enabled = false;
    private String baseUrl = "";
    private String apiKey = "";
    private String model = "gpt-5.5";
    private String systemPrompt = "";
    private long connectTimeoutMs = 2_500L;
    private long readTimeoutMs = 90_000L;
    private int maxTokens = 800;
    private int maxContextMessages = 12;
    private int maxWorldbookEntries = 8;
    private double temperature = 0.7D;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl == null ? "" : baseUrl.trim();
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey == null ? "" : apiKey.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        String normalized = model == null ? "" : model.trim();
        this.model = normalized.isEmpty() ? "gpt-5.5" : normalized;
    }

    public String getSystemPrompt() {
        return systemPrompt;
    }

    public void setSystemPrompt(String systemPrompt) {
        this.systemPrompt = systemPrompt == null ? "" : systemPrompt.trim();
    }

    public long getConnectTimeoutMs() {
        return connectTimeoutMs;
    }

    public void setConnectTimeoutMs(long connectTimeoutMs) {
        this.connectTimeoutMs = Math.max(100L, connectTimeoutMs);
    }

    public long getReadTimeoutMs() {
        return readTimeoutMs;
    }

    public void setReadTimeoutMs(long readTimeoutMs) {
        this.readTimeoutMs = Math.max(500L, readTimeoutMs);
    }

    public int getMaxTokens() {
        return maxTokens;
    }

    public void setMaxTokens(int maxTokens) {
        this.maxTokens = Math.max(64, Math.min(maxTokens, 8_192));
    }

    public int getMaxContextMessages() {
        return maxContextMessages;
    }

    public void setMaxContextMessages(int maxContextMessages) {
        this.maxContextMessages = Math.max(0, Math.min(maxContextMessages, 30));
    }

    public int getMaxWorldbookEntries() {
        return maxWorldbookEntries;
    }

    public void setMaxWorldbookEntries(int maxWorldbookEntries) {
        this.maxWorldbookEntries = Math.max(0, Math.min(maxWorldbookEntries, 20));
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = Math.max(0.0D, Math.min(temperature, 2.0D));
    }
}
