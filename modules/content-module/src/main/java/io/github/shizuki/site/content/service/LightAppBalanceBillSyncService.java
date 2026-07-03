package io.github.shizuki.site.content.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.content.entity.LightAppBalanceAccountEntity;
import io.github.shizuki.site.content.entity.LightAppBalanceBindSessionEntity;
import io.github.shizuki.site.content.entity.LightAppBalanceImportJobEntity;
import io.github.shizuki.site.content.entity.LightAppBalanceImportMappingEntity;
import io.github.shizuki.site.content.entity.LightAppBalanceSourceAccountEntity;
import io.github.shizuki.site.content.mapper.LightAppBalanceAccountMapper;
import io.github.shizuki.site.content.mapper.LightAppBalanceBindSessionMapper;
import io.github.shizuki.site.content.mapper.LightAppBalanceImportJobMapper;
import io.github.shizuki.site.content.mapper.LightAppBalanceImportMappingMapper;
import io.github.shizuki.site.content.mapper.LightAppBalanceSourceAccountMapper;
import io.github.shizuki.site.content.mapper.LightAppProviderSecretMapper;
import io.github.shizuki.site.content.request.LightAppBalanceLocalSyncTransactionRequest;
import io.github.shizuki.site.content.request.LightAppBalanceLocalSyncUploadRequest;
import io.github.shizuki.site.content.request.LightAppBalanceSourceAccountUpsertRequest;
import io.github.shizuki.site.content.response.LightAppBalanceBindSessionCreateResponse;
import io.github.shizuki.site.content.response.LightAppBalanceBindSessionStatusResponse;
import io.github.shizuki.site.content.response.LightAppBalanceImportJobResponse;
import io.github.shizuki.site.content.response.LightAppBalanceSourceAccountStatusResponse;
import io.github.shizuki.site.content.support.LightAppBalanceBillSyncAgentClient;
import io.github.shizuki.site.content.support.LightAppBalanceBillSyncCryptoService;
import io.github.shizuki.site.content.support.LightAppBalanceBillSyncProperties;
import io.github.shizuki.site.user.entity.UserProviderSecretEntity;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HexFormat;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestClientResponseException;

@Service
public class LightAppBalanceBillSyncService {

    private static final Logger LOGGER = LoggerFactory.getLogger(LightAppBalanceBillSyncService.class);

    private static final List<String> SUPPORTED_PROVIDERS = List.of("qianji");

    private static final String SOURCE_STATUS_UNBOUND = "UNBOUND";
    private static final String SOURCE_STATUS_PENDING = "PENDING";
    private static final String SOURCE_STATUS_BOUND = "BOUND";
    private static final String SOURCE_STATUS_REAUTH_REQUIRED = "REAUTH_REQUIRED";

    private static final String BIND_STATUS_PENDING = "PENDING";
    private static final String BIND_STATUS_BOUND = "BOUND";
    private static final String BIND_STATUS_FAILED = "FAILED";
    private static final String BIND_STATUS_EXPIRED = "EXPIRED";

    private static final String JOB_TRIGGER_MANUAL = "MANUAL";
    private static final String JOB_TRIGGER_NIGHTLY = "NIGHTLY";
    private static final String JOB_TRIGGER_LOCAL = "LOCAL_PUSH";
    private static final String JOB_STATUS_PENDING = "PENDING";
    private static final String JOB_STATUS_RUNNING = "RUNNING";
    private static final String JOB_STATUS_SUCCESS = "SUCCESS";
    private static final String JOB_STATUS_FAILED = "FAILED";

    private static final String DIRECTION_INCOME = "INCOME";
    private static final String DIRECTION_EXPENSE = "EXPENSE";

    private static final String STORAGE_STATE_PROVIDER_PREFIX = "balance_storage_";
    private static final String SOURCE_ACCOUNT_UNIQUE_CONSTRAINT = "ak_ctn_la_bal_source_account_1";
    private static final String PROVIDER_SECRET_UNIQUE_CONSTRAINT = "ak_usr_provider_secret_1";

    private final LightAppBalanceSourceAccountMapper sourceAccountMapper;
    private final LightAppBalanceBindSessionMapper bindSessionMapper;
    private final LightAppBalanceImportJobMapper importJobMapper;
    private final LightAppBalanceImportMappingMapper importMappingMapper;
    private final LightAppBalanceAccountMapper balanceAccountMapper;
    private final LightAppProviderSecretMapper providerSecretMapper;
    private final LightAppBalanceBillSyncCryptoService cryptoService;
    private final LightAppBalanceBillSyncAgentClient agentClient;
    private final LightAppBalanceBillSyncProperties properties;
    private final LightAppBalanceTransactionWriter transactionWriter;
    private final Executor balanceBillSyncExecutor;

    public LightAppBalanceBillSyncService(LightAppBalanceSourceAccountMapper sourceAccountMapper,
                                          LightAppBalanceBindSessionMapper bindSessionMapper,
                                          LightAppBalanceImportJobMapper importJobMapper,
                                          LightAppBalanceImportMappingMapper importMappingMapper,
                                          LightAppBalanceAccountMapper balanceAccountMapper,
                                          LightAppProviderSecretMapper providerSecretMapper,
                                          LightAppBalanceBillSyncCryptoService cryptoService,
                                          LightAppBalanceBillSyncAgentClient agentClient,
                                          LightAppBalanceBillSyncProperties properties,
                                          LightAppBalanceTransactionWriter transactionWriter,
                                          @Qualifier("balanceBillSyncExecutor") Executor balanceBillSyncExecutor) {
        this.sourceAccountMapper = sourceAccountMapper;
        this.bindSessionMapper = bindSessionMapper;
        this.importJobMapper = importJobMapper;
        this.importMappingMapper = importMappingMapper;
        this.balanceAccountMapper = balanceAccountMapper;
        this.providerSecretMapper = providerSecretMapper;
        this.cryptoService = cryptoService;
        this.agentClient = agentClient;
        this.properties = properties;
        this.transactionWriter = transactionWriter;
        this.balanceBillSyncExecutor = balanceBillSyncExecutor;
    }

    public List<LightAppBalanceSourceAccountStatusResponse> listSourceAccountStatus(Long userId) {
        Long checkedUserId = requireValidUserId(userId);
        Map<String, LightAppBalanceSourceAccountEntity> sourceMap = new LinkedHashMap<>();
        sourceAccountMapper.selectList(new LambdaQueryWrapper<LightAppBalanceSourceAccountEntity>()
                .eq(LightAppBalanceSourceAccountEntity::getUserId, checkedUserId)
                .in(LightAppBalanceSourceAccountEntity::getProviderCode, SUPPORTED_PROVIDERS))
            .forEach(item -> sourceMap.put(normalizeProvider(item.getProviderCode()), item));

        return SUPPORTED_PROVIDERS.stream()
            .map(provider -> {
                LightAppBalanceSourceAccountEntity source = sourceMap.get(provider);
                LightAppBalanceBindSessionEntity activeSession = findLatestOpenBindSession(checkedUserId, provider);
                return toSourceAccountStatusResponse(provider, source, activeSession);
            })
            .toList();
    }

    @Transactional(rollbackFor = Exception.class)
    public LightAppBalanceSourceAccountStatusResponse upsertSourceAccount(Long userId,
                                                                          String provider,
                                                                          LightAppBalanceSourceAccountUpsertRequest request) {
        Long checkedUserId = requireValidUserId(userId);
        String normalizedProvider = normalizeProvider(provider);
        LightAppBalanceSourceAccountEntity source = getOrCreateSourceAccount(checkedUserId, normalizedProvider);
        applySourceAccountUpsert(source, checkedUserId, request, false);
        persistSourceAccount(source);
        return toSourceAccountStatusResponse(normalizedProvider, source, findLatestOpenBindSession(checkedUserId, normalizedProvider));
    }

    @Transactional(rollbackFor = Exception.class)
    public LightAppBalanceBindSessionCreateResponse createBindSession(Long userId,
                                                                      String provider,
                                                                      LightAppBalanceSourceAccountUpsertRequest request) {
        Long checkedUserId = requireValidUserId(userId);
        String normalizedProvider = normalizeProvider(provider);
        if (providerSupportsLocalOnly(normalizedProvider)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "This source only supports local file import");
        }
        LightAppBalanceSourceAccountEntity source = getOrCreateSourceAccount(checkedUserId, normalizedProvider);
        applySourceAccountUpsert(source, checkedUserId, request, true);
        if (!SOURCE_STATUS_BOUND.equals(normalizeStatus(source.getStatusCode()))) {
            source.setStatusCode(SOURCE_STATUS_PENDING);
        }
        persistSourceAccount(source);
        LOGGER.info("BALANCE_BIND_SESSION_CREATE provider={} userId={} sourceAccountId={} targetAccountId={}",
            normalizedProvider, checkedUserId, source.getId(), source.getTargetAccountId());

        String sessionId = UUID.randomUUID().toString();
        LocalDateTime expiresAt = LocalDateTime.now().plusMinutes(properties.getBindSessionTtlMinutes());
        LightAppBalanceBillSyncAgentClient.BindSessionResult agentResult = agentClient.createBindSession(
            normalizedProvider,
            sessionId,
            expiresAt
        );

        LightAppBalanceBindSessionEntity entity = new LightAppBalanceBindSessionEntity();
        entity.setUserId(checkedUserId);
        entity.setProviderCode(normalizedProvider);
        entity.setTargetAccountId(source.getTargetAccountId());
        entity.setSessionCode(sessionId);
        entity.setStatusCode(resolveBindStatus(agentResult.status(), agentResult.expiresAt(), expiresAt));
        entity.setQrCodePayload(normalizeOptionalText(agentResult.qrCodePayload()));
        entity.setQrCodeImageDataUrl(normalizeOptionalText(agentResult.qrCodeImageDataUrl()));
        entity.setLoginUrl(normalizeOptionalText(agentResult.loginUrl()));
        entity.setExpiresAt(agentResult.expiresAt() == null ? expiresAt : agentResult.expiresAt());
        entity.setCompletedAt(agentResult.completedAt());
        entity.setFailureReason(normalizeOptionalText(agentResult.failureReason()));
        bindSessionMapper.insert(entity);
        LOGGER.info("BALANCE_BIND_SESSION_CREATED provider={} userId={} sessionId={} status={}",
            normalizedProvider, checkedUserId, sessionId, normalizeBindStatus(entity.getStatusCode()));
        String initialBindStatus = normalizeBindStatus(entity.getStatusCode());
        if (BIND_STATUS_BOUND.equals(initialBindStatus)) {
            String storageState = normalizeOptionalText(agentResult.storageState());
            if (!StringUtils.hasText(storageState)) {
                entity.setStatusCode(BIND_STATUS_FAILED);
                entity.setFailureReason("Bill sync agent did not return storage state");
                bindSessionMapper.updateById(entity);
                revertSourceStatusAfterBindWindow(source);
                persistSourceAccount(source);
            } else {
                saveStorageState(checkedUserId, normalizedProvider, storageState);
                source.setStatusCode(SOURCE_STATUS_BOUND);
                source.setLastVerifiedAt(LocalDateTime.now());
                source.setLastSyncErrorText(null);
                persistSourceAccount(source);
            }
        } else if (BIND_STATUS_FAILED.equals(initialBindStatus) || BIND_STATUS_EXPIRED.equals(initialBindStatus)) {
            revertSourceStatusAfterBindWindow(source);
            persistSourceAccount(source);
        } else if (agentResult.reauthRequired()) {
            source.setStatusCode(SOURCE_STATUS_REAUTH_REQUIRED);
            source.setLastSyncErrorText(StringUtils.hasText(entity.getFailureReason()) ? entity.getFailureReason() : "Rebind required");
            persistSourceAccount(source);
        }
        return toBindSessionCreateResponse(entity);
    }

    @Transactional(rollbackFor = Exception.class)
    public LightAppBalanceBindSessionStatusResponse getBindSessionStatus(Long userId, String provider, String sessionId) {
        Long checkedUserId = requireValidUserId(userId);
        String normalizedProvider = normalizeProvider(provider);
        if (providerSupportsLocalOnly(normalizedProvider)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "This source only supports local file import");
        }
        String normalizedSessionId = requireSessionId(sessionId);

        LightAppBalanceBindSessionEntity session = requireBindSession(checkedUserId, normalizedProvider, normalizedSessionId);
        LightAppBalanceSourceAccountEntity source = getOrCreateSourceAccount(checkedUserId, normalizedProvider);

        LocalDateTime now = LocalDateTime.now();
        String currentStatus = normalizeBindStatus(session.getStatusCode());
        if (isTerminalBindStatus(currentStatus)) {
            if (BIND_STATUS_FAILED.equals(currentStatus) || BIND_STATUS_EXPIRED.equals(currentStatus)) {
                revertSourceStatusAfterBindWindow(source);
                persistSourceAccount(source);
            } else if (BIND_STATUS_BOUND.equals(currentStatus)
                && !SOURCE_STATUS_BOUND.equals(normalizeStatus(source.getStatusCode()))) {
                source.setStatusCode(SOURCE_STATUS_BOUND);
                persistSourceAccount(source);
            }
            return toBindSessionStatusResponse(session);
        }
        if (session.getExpiresAt() != null && session.getExpiresAt().isBefore(now)) {
            session.setStatusCode(BIND_STATUS_EXPIRED);
            session.setFailureReason("Bind session expired");
            bindSessionMapper.updateById(session);
            revertSourceStatusAfterBindWindow(source);
            persistSourceAccount(source);
            return toBindSessionStatusResponse(session);
        }

        LightAppBalanceBillSyncAgentClient.BindSessionResult result;
        try {
            result = agentClient.getBindSessionStatus(normalizedProvider, normalizedSessionId);
        } catch (RestClientResponseException exception) {
            if (exception.getStatusCode().value() != 404) {
                throw exception;
            }
            session.setStatusCode(BIND_STATUS_FAILED);
            session.setFailureReason("Bind session expired on server, please refresh the QR code and retry");
            bindSessionMapper.updateById(session);
            revertSourceStatusAfterBindWindow(source);
            persistSourceAccount(source);
            LOGGER.info("BALANCE_BIND_SESSION_MISSING provider={} userId={} sessionId={} status={}",
                normalizedProvider, checkedUserId, normalizedSessionId, normalizeBindStatus(session.getStatusCode()));
            return toBindSessionStatusResponse(session);
        }
        session.setStatusCode(resolveBindStatus(result.status(), result.expiresAt(), session.getExpiresAt()));
        session.setQrCodePayload(normalizeOptionalText(result.qrCodePayload()));
        session.setQrCodeImageDataUrl(normalizeOptionalText(result.qrCodeImageDataUrl()));
        session.setLoginUrl(normalizeOptionalText(result.loginUrl()));
        session.setExpiresAt(result.expiresAt() == null ? session.getExpiresAt() : result.expiresAt());
        session.setCompletedAt(result.completedAt());
        session.setFailureReason(normalizeOptionalText(result.failureReason()));
        bindSessionMapper.updateById(session);
        LOGGER.info("BALANCE_BIND_SESSION_STATUS provider={} userId={} sessionId={} status={} failureReason={}",
            normalizedProvider,
            checkedUserId,
            normalizedSessionId,
            normalizeBindStatus(session.getStatusCode()),
            normalizeOptionalText(session.getFailureReason()));

        if (BIND_STATUS_BOUND.equals(normalizeBindStatus(session.getStatusCode()))) {
            String storageState = normalizeOptionalText(result.storageState());
            if (!StringUtils.hasText(storageState)) {
                session.setStatusCode(BIND_STATUS_FAILED);
                session.setFailureReason("Bill sync agent did not return storage state");
                bindSessionMapper.updateById(session);
                revertSourceStatusAfterBindWindow(source);
                persistSourceAccount(source);
                return toBindSessionStatusResponse(session);
            }
            saveStorageState(checkedUserId, normalizedProvider, storageState);
            source.setStatusCode(SOURCE_STATUS_BOUND);
            source.setLastVerifiedAt(now);
            source.setLastSyncErrorText(null);
            persistSourceAccount(source);
        } else if (result.reauthRequired()) {
            source.setStatusCode(SOURCE_STATUS_REAUTH_REQUIRED);
            source.setLastSyncErrorText(StringUtils.hasText(session.getFailureReason()) ? session.getFailureReason() : "Rebind required");
            persistSourceAccount(source);
        } else if (BIND_STATUS_FAILED.equals(normalizeBindStatus(session.getStatusCode()))
            || BIND_STATUS_EXPIRED.equals(normalizeBindStatus(session.getStatusCode()))) {
            revertSourceStatusAfterBindWindow(source);
            persistSourceAccount(source);
        }
        return toBindSessionStatusResponse(session);
    }

    @Transactional(rollbackFor = Exception.class)
    public LightAppBalanceImportJobResponse createSyncJob(Long userId, String provider) {
        Long checkedUserId = requireValidUserId(userId);
        String normalizedProvider = normalizeProvider(provider);
        if (providerSupportsLocalOnly(normalizedProvider)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "This source only supports local file import");
        }
        LightAppBalanceSourceAccountEntity source = requireSourceAccount(checkedUserId, normalizedProvider);
        if (!SOURCE_STATUS_BOUND.equals(normalizeStatus(source.getStatusCode()))) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Source account is not bound");
        }
        if (source.getTargetAccountId() == null || source.getTargetAccountId() <= 0) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Source account target balance account is required");
        }

        LightAppBalanceImportJobEntity activeJob = findActiveImportJob(checkedUserId, normalizedProvider);
        if (activeJob != null) {
            return toImportJobResponse(activeJob);
        }

        LocalDateTime now = LocalDateTime.now();
        LightAppBalanceImportJobEntity job = new LightAppBalanceImportJobEntity();
        job.setUserId(checkedUserId);
        job.setProviderCode(normalizedProvider);
        job.setSourceAccountId(source.getId());
        job.setTargetAccountId(source.getTargetAccountId());
        job.setTriggerType(JOB_TRIGGER_MANUAL);
        job.setStatusCode(JOB_STATUS_PENDING);
        job.setImportedCount(0);
        job.setDuplicateCount(0);
        job.setSkippedCount(0);
        job.setRequestFromAt(resolveSyncWindowStart(source, now));
        job.setRequestToAt(now);
        importJobMapper.insert(job);
        LOGGER.info("BALANCE_IMPORT_JOB_CREATED provider={} userId={} jobId={} fromAt={} toAt={}",
            normalizedProvider, checkedUserId, job.getId(), job.getRequestFromAt(), job.getRequestToAt());
        submitJobAfterCommit(job.getId());
        return toImportJobResponse(job);
    }

    @Transactional(rollbackFor = Exception.class)
    public LightAppBalanceImportJobResponse createLocalSyncJob(Long userId,
                                                               String provider,
                                                               LightAppBalanceLocalSyncUploadRequest request) {
        Long checkedUserId = requireValidUserId(userId);
        String normalizedProvider = normalizeProvider(provider);
        LightAppBalanceSourceAccountEntity source = requireSourceAccount(checkedUserId, normalizedProvider);
        if (source.getTargetAccountId() == null || source.getTargetAccountId() <= 0) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Source account target balance account is required");
        }

        LightAppBalanceImportJobEntity activeJob = findActiveImportJob(checkedUserId, normalizedProvider);
        if (activeJob != null) {
            return toImportJobResponse(activeJob);
        }

        LocalDateTime now = LocalDateTime.now();
        LightAppBalanceImportJobEntity job = new LightAppBalanceImportJobEntity();
        job.setUserId(checkedUserId);
        job.setProviderCode(normalizedProvider);
        job.setSourceAccountId(source.getId());
        job.setTargetAccountId(source.getTargetAccountId());
        job.setTriggerType(JOB_TRIGGER_LOCAL);
        job.setStatusCode(JOB_STATUS_RUNNING);
        job.setImportedCount(0);
        job.setDuplicateCount(0);
        job.setSkippedCount(0);
        job.setRequestFromAt(request == null || request.getRequestFromAt() == null
            ? resolveSyncWindowStart(source, now)
            : request.getRequestFromAt());
        job.setRequestToAt(request == null || request.getRequestToAt() == null
            ? now
            : request.getRequestToAt());
        job.setStartedAt(now);
        importJobMapper.insert(job);

        try {
            ImportedJobSummary summary = importTransactions(
                job,
                source,
                toImportedTransactions(request)
            );
            String rawFilePath = resolveLocalRawFilePath(request);
            finishJobSuccess(job, source, rawFilePath, summary);
            LOGGER.info("BALANCE_IMPORT_JOB_LOCAL_SUCCESS provider={} userId={} jobId={} imported={} duplicate={} skipped={}",
                job.getProviderCode(), job.getUserId(), job.getId(),
                summary.importedCount(), summary.duplicateCount(), summary.skippedCount());
        } catch (Exception exception) {
            failJob(job, source, exception.getMessage(), false);
        }
        return toImportJobResponse(job);
    }

    public LightAppBalanceImportJobResponse getImportJob(Long userId, Long jobId) {
        Long checkedUserId = requireValidUserId(userId);
        if (jobId == null || jobId <= 0) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "job_id is required");
        }
        LightAppBalanceImportJobEntity job = importJobMapper.selectOne(new LambdaQueryWrapper<LightAppBalanceImportJobEntity>()
            .eq(LightAppBalanceImportJobEntity::getId, jobId)
            .eq(LightAppBalanceImportJobEntity::getUserId, checkedUserId)
            .last("LIMIT 1"));
        if (job == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Import job not found");
        }
        return toImportJobResponse(job);
    }

    public void runNightlySync() {
        if (SUPPORTED_PROVIDERS.stream().allMatch(this::providerSupportsLocalOnly)) {
            return;
        }
        if (!properties.isConfigured()) {
            return;
        }
        List<LightAppBalanceSourceAccountEntity> sources = sourceAccountMapper.selectList(new LambdaQueryWrapper<LightAppBalanceSourceAccountEntity>()
            .eq(LightAppBalanceSourceAccountEntity::getNightlyEnabled, true)
            .eq(LightAppBalanceSourceAccountEntity::getStatusCode, SOURCE_STATUS_BOUND)
            .in(LightAppBalanceSourceAccountEntity::getProviderCode, SUPPORTED_PROVIDERS));
        LocalDateTime now = LocalDateTime.now();
        for (LightAppBalanceSourceAccountEntity source : sources) {
            try {
                if (findActiveImportJob(source.getUserId(), source.getProviderCode()) != null) {
                    continue;
                }
                LightAppBalanceImportJobEntity job = new LightAppBalanceImportJobEntity();
                job.setUserId(source.getUserId());
                job.setProviderCode(source.getProviderCode());
                job.setSourceAccountId(source.getId());
                job.setTargetAccountId(source.getTargetAccountId());
                job.setTriggerType(JOB_TRIGGER_NIGHTLY);
                job.setStatusCode(JOB_STATUS_PENDING);
                job.setImportedCount(0);
                job.setDuplicateCount(0);
                job.setSkippedCount(0);
                job.setRequestFromAt(resolveSyncWindowStart(source, now));
                job.setRequestToAt(now);
                importJobMapper.insert(job);
                submitJob(job.getId());
            } catch (Exception exception) {
                LOGGER.warn("BALANCE_BILL_SYNC_NIGHTLY_CREATE_FAIL provider={} userId={} reason={}",
                    source.getProviderCode(), source.getUserId(), exception.getMessage());
            }
        }
    }

    public void executeJob(Long jobId) {
        if (jobId == null || jobId <= 0) {
            return;
        }
        LightAppBalanceImportJobEntity job = importJobMapper.selectById(jobId);
        if (job == null) {
            return;
        }
        if (!JOB_STATUS_PENDING.equals(normalizeJobStatus(job.getStatusCode()))
            && !JOB_STATUS_RUNNING.equals(normalizeJobStatus(job.getStatusCode()))) {
            return;
        }

        LocalDateTime now = LocalDateTime.now();
        if (!JOB_STATUS_RUNNING.equals(normalizeJobStatus(job.getStatusCode()))) {
            job.setStatusCode(JOB_STATUS_RUNNING);
            job.setStartedAt(now);
            job.setErrorText(null);
            importJobMapper.updateById(job);
        }

        LightAppBalanceSourceAccountEntity source = requireSourceAccount(job.getUserId(), job.getProviderCode());
        if (source.getTargetAccountId() == null || source.getTargetAccountId() <= 0) {
            failJob(job, source, "Source account target balance account is missing", false);
            return;
        }
        if (!SOURCE_STATUS_BOUND.equals(normalizeStatus(source.getStatusCode()))) {
            failJob(job, source, "Source account is not bound", false);
            return;
        }

        String storageState = loadStorageState(job.getUserId(), job.getProviderCode());
        if (providerRequiresStorageState(job.getProviderCode()) && !StringUtils.hasText(storageState)) {
            failJob(job, source, "Storage state is missing, please rebind source account", true);
            return;
        }

        try {
            LightAppBalanceBillSyncAgentClient.SyncResult result = agentClient.sync(
                job.getProviderCode(),
                storageState,
                job.getRequestFromAt(),
                job.getRequestToAt(),
                properties.getTimezone(),
                properties.getRawArchiveRoot()
            );
            if (result.reauthRequired()) {
                failJob(job, source, StringUtils.hasText(result.failureReason()) ? result.failureReason() : "Rebind required", true);
                return;
            }
            if (!"SUCCESS".equalsIgnoreCase(String.valueOf(result.status()))) {
                failJob(job, source, StringUtils.hasText(result.failureReason()) ? result.failureReason() : "Bill sync agent failed", false);
                return;
            }

            ImportedJobSummary summary = importTransactions(job, source, result.transactions());
            finishJobSuccess(job, source, result.rawFilePath(), summary);
            LOGGER.info("BALANCE_IMPORT_JOB_SUCCESS provider={} userId={} jobId={} imported={} duplicate={} skipped={}",
                job.getProviderCode(), job.getUserId(), job.getId(),
                summary.importedCount(), summary.duplicateCount(), summary.skippedCount());
        } catch (Exception exception) {
            failJob(job, source, exception.getMessage(), false);
        }
    }

    private void submitJobAfterCommit(Long jobId) {
        if (TransactionSynchronizationManager.isSynchronizationActive()) {
            TransactionSynchronizationManager.registerSynchronization(new TransactionSynchronization() {
                @Override
                public void afterCommit() {
                    submitJob(jobId);
                }
            });
            return;
        }
        submitJob(jobId);
    }

    private void submitJob(Long jobId) {
        balanceBillSyncExecutor.execute(() -> {
            try {
                executeJob(jobId);
            } catch (Exception exception) {
                LOGGER.warn("BALANCE_BILL_SYNC_JOB_FAIL jobId={} reason={}", jobId, exception.getMessage());
            }
        });
    }

    private ImportedJobSummary importTransactions(LightAppBalanceImportJobEntity job,
                                                  LightAppBalanceSourceAccountEntity source,
                                                  List<LightAppBalanceBillSyncAgentClient.ImportedTransaction> transactions) {
        int importedCount = 0;
        int duplicateCount = 0;
        int skippedCount = 0;
        String lastRecordError = "";
        List<LightAppBalanceBillSyncAgentClient.ImportedTransaction> normalizedTransactions =
            transactions == null ? List.of() : transactions;

        for (LightAppBalanceBillSyncAgentClient.ImportedTransaction item : normalizedTransactions) {
            if (!isImportable(item)) {
                skippedCount += 1;
                continue;
            }
            String externalId = normalizeOptionalText(item.externalId());
            String digest = resolveDigest(job.getProviderCode(), item);
            if (isImportedAlready(job.getUserId(), job.getProviderCode(), externalId, digest)) {
                duplicateCount += 1;
                continue;
            }
            try {
                LightAppBalanceAccountEntity account = requireBalanceAccount(job.getUserId(), source.getTargetAccountId());
                String category = resolveImportedCategory(item.categoryHint());
                String note = composeImportedNote(job.getProviderCode(), item.counterparty(), item.note());
                var transaction = transactionWriter.createImportedTransaction(
                    job.getUserId(),
                    account.getId(),
                    resolveDirection(item.direction()),
                    normalizeAmount(item.amount()),
                    normalizeCurrency(item.currencyCode(), account.getCurrencyCode()),
                    category,
                    note,
                    item.occurredAt()
                );

                LightAppBalanceImportMappingEntity mapping = new LightAppBalanceImportMappingEntity();
                mapping.setUserId(job.getUserId());
                mapping.setProviderCode(job.getProviderCode());
                mapping.setSourceAccountId(source.getId());
                mapping.setImportJobId(job.getId());
                mapping.setTransactionId(transaction.getId());
                mapping.setExternalId(externalId);
                mapping.setDigestCode(digest);
                mapping.setOccurredAt(item.occurredAt());
                importMappingMapper.insert(mapping);
                importedCount += 1;
            } catch (Exception recordException) {
                skippedCount += 1;
                lastRecordError = StringUtils.hasText(recordException.getMessage())
                    ? recordException.getMessage()
                    : "Skipped one record";
            }
        }
        return new ImportedJobSummary(importedCount, duplicateCount, skippedCount, lastRecordError);
    }

    private void finishJobSuccess(LightAppBalanceImportJobEntity job,
                                  LightAppBalanceSourceAccountEntity source,
                                  String rawFilePath,
                                  ImportedJobSummary summary) {
        LocalDateTime now = LocalDateTime.now();
        job.setStatusCode(JOB_STATUS_SUCCESS);
        job.setImportedCount(summary.importedCount());
        job.setDuplicateCount(summary.duplicateCount());
        job.setSkippedCount(summary.skippedCount());
        job.setRawFilePath(normalizeOptionalText(rawFilePath));
        job.setErrorText(StringUtils.hasText(summary.lastRecordError()) ? summary.lastRecordError() : null);
        job.setFinishedAt(now);
        importJobMapper.updateById(job);

        source.setLastVerifiedAt(now);
        source.setLastSyncedAt(now);
        source.setLastSyncStatusCode(JOB_STATUS_SUCCESS);
        source.setLastSyncErrorText(null);
        source.setStatusCode(SOURCE_STATUS_BOUND);
        persistSourceAccount(source);
    }

    private List<LightAppBalanceBillSyncAgentClient.ImportedTransaction> toImportedTransactions(
        LightAppBalanceLocalSyncUploadRequest request
    ) {
        if (request == null || request.getTransactions() == null || request.getTransactions().isEmpty()) {
            return List.of();
        }
        List<LightAppBalanceBillSyncAgentClient.ImportedTransaction> result = new ArrayList<>();
        for (LightAppBalanceLocalSyncTransactionRequest item : request.getTransactions()) {
            if (item == null) {
                continue;
            }
            result.add(new LightAppBalanceBillSyncAgentClient.ImportedTransaction(
                normalizeOptionalText(item.getExternalId()),
                item.getOccurredAt(),
                normalizeOptionalText(item.getDirection()),
                item.getAmount(),
                normalizeOptionalText(item.getCurrencyCode()),
                normalizeOptionalText(item.getCounterparty()),
                normalizeOptionalText(item.getCategoryHint()),
                normalizeOptionalText(item.getNote()),
                normalizeOptionalText(item.getRawPayload()),
                normalizeOptionalText(item.getDigest())
            ));
        }
        return result;
    }

    private String resolveLocalRawFilePath(LightAppBalanceLocalSyncUploadRequest request) {
        if (request == null) {
            return "";
        }
        String rawFilePath = normalizeOptionalText(request.getRawFilePath());
        if (StringUtils.hasText(rawFilePath)) {
            return rawFilePath;
        }
        return normalizeOptionalText(request.getRawFileName());
    }

    private record ImportedJobSummary(
        int importedCount,
        int duplicateCount,
        int skippedCount,
        String lastRecordError
    ) {
    }

    private LightAppBalanceSourceAccountEntity getOrCreateSourceAccount(Long userId, String provider) {
        LightAppBalanceSourceAccountEntity entity = sourceAccountMapper.selectOne(new LambdaQueryWrapper<LightAppBalanceSourceAccountEntity>()
            .eq(LightAppBalanceSourceAccountEntity::getUserId, userId)
            .eq(LightAppBalanceSourceAccountEntity::getProviderCode, provider)
            .last("LIMIT 1"));
        if (entity != null) {
            return entity;
        }
        LightAppBalanceSourceAccountEntity created = new LightAppBalanceSourceAccountEntity();
        created.setUserId(userId);
        created.setProviderCode(provider);
        created.setStatusCode(SOURCE_STATUS_UNBOUND);
        created.setNightlyEnabled(false);
        return created;
    }

    private void applySourceAccountUpsert(LightAppBalanceSourceAccountEntity source,
                                          Long userId,
                                          LightAppBalanceSourceAccountUpsertRequest request,
                                          boolean requireTargetAccount) {
        String normalizedProvider = normalizeProvider(source.getProviderCode());
        Long targetAccountId = request == null ? null : request.getTargetAccountId();
        Boolean nightlyEnabled = request == null ? null : request.getNightlyEnabled();
        if (targetAccountId == null || targetAccountId <= 0) {
            targetAccountId = source.getTargetAccountId();
        }
        if ((targetAccountId == null || targetAccountId <= 0) && requireTargetAccount) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "target_account_id is required");
        }
        if (targetAccountId != null && targetAccountId > 0) {
            requireBalanceAccount(userId, targetAccountId);
            source.setTargetAccountId(targetAccountId);
        }
        if (providerSupportsLocalOnly(normalizedProvider)) {
            source.setNightlyEnabled(false);
            source.setStatusCode(targetAccountId != null && targetAccountId > 0 ? SOURCE_STATUS_BOUND : SOURCE_STATUS_UNBOUND);
        } else if (nightlyEnabled != null) {
            source.setNightlyEnabled(nightlyEnabled);
        } else if (source.getNightlyEnabled() == null) {
            source.setNightlyEnabled(false);
        }
        if (!StringUtils.hasText(source.getStatusCode())) {
            source.setStatusCode(SOURCE_STATUS_UNBOUND);
        }
    }

    private void persistSourceAccount(LightAppBalanceSourceAccountEntity source) {
        if (source.getId() == null || source.getId() <= 0) {
            try {
                sourceAccountMapper.insert(source);
            } catch (RuntimeException exception) {
                if (!isDuplicateConstraint(exception, SOURCE_ACCOUNT_UNIQUE_CONSTRAINT)) {
                    throw exception;
                }
                LightAppBalanceSourceAccountEntity existing = requireSourceAccount(source.getUserId(), source.getProviderCode());
                overwriteSourceAccount(existing, source);
                sourceAccountMapper.updateById(existing);
                syncSourceAccountIdentity(existing, source);
                LOGGER.info("BALANCE_SOURCE_ACCOUNT_CONFLICT_RESOLVED provider={} userId={} sourceAccountId={}",
                    source.getProviderCode(), source.getUserId(), source.getId());
            }
            return;
        }
        sourceAccountMapper.updateById(source);
    }

    private LightAppBalanceSourceAccountEntity requireSourceAccount(Long userId, String provider) {
        LightAppBalanceSourceAccountEntity entity = sourceAccountMapper.selectOne(new LambdaQueryWrapper<LightAppBalanceSourceAccountEntity>()
            .eq(LightAppBalanceSourceAccountEntity::getUserId, userId)
            .eq(LightAppBalanceSourceAccountEntity::getProviderCode, provider)
            .last("LIMIT 1"));
        if (entity == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Source account not found");
        }
        return entity;
    }

    private LightAppBalanceBindSessionEntity requireBindSession(Long userId, String provider, String sessionId) {
        LightAppBalanceBindSessionEntity entity = bindSessionMapper.selectOne(new LambdaQueryWrapper<LightAppBalanceBindSessionEntity>()
            .eq(LightAppBalanceBindSessionEntity::getUserId, userId)
            .eq(LightAppBalanceBindSessionEntity::getProviderCode, provider)
            .eq(LightAppBalanceBindSessionEntity::getSessionCode, sessionId)
            .last("LIMIT 1"));
        if (entity == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Bind session not found");
        }
        return entity;
    }

    private LightAppBalanceBindSessionEntity findLatestOpenBindSession(Long userId, String provider) {
        return bindSessionMapper.selectOne(new LambdaQueryWrapper<LightAppBalanceBindSessionEntity>()
            .eq(LightAppBalanceBindSessionEntity::getUserId, userId)
            .eq(LightAppBalanceBindSessionEntity::getProviderCode, provider)
            .notIn(LightAppBalanceBindSessionEntity::getStatusCode, List.of(BIND_STATUS_BOUND, BIND_STATUS_FAILED, BIND_STATUS_EXPIRED))
            .orderByDesc(LightAppBalanceBindSessionEntity::getId)
            .last("LIMIT 1"));
    }

    private LightAppBalanceImportJobEntity findActiveImportJob(Long userId, String provider) {
        return importJobMapper.selectOne(new LambdaQueryWrapper<LightAppBalanceImportJobEntity>()
            .eq(LightAppBalanceImportJobEntity::getUserId, userId)
            .eq(LightAppBalanceImportJobEntity::getProviderCode, provider)
            .in(LightAppBalanceImportJobEntity::getStatusCode, List.of(JOB_STATUS_PENDING, JOB_STATUS_RUNNING))
            .orderByDesc(LightAppBalanceImportJobEntity::getId)
            .last("LIMIT 1"));
    }

    private void failJob(LightAppBalanceImportJobEntity job,
                         LightAppBalanceSourceAccountEntity source,
                         String reason,
                         boolean reauthRequired) {
        job.setStatusCode(JOB_STATUS_FAILED);
        job.setErrorText(normalizeOptionalText(reason));
        job.setFinishedAt(LocalDateTime.now());
        importJobMapper.updateById(job);

        source.setLastSyncStatusCode(reauthRequired ? SOURCE_STATUS_REAUTH_REQUIRED : JOB_STATUS_FAILED);
        source.setLastSyncErrorText(normalizeOptionalText(reason));
        if (reauthRequired) {
            source.setStatusCode(SOURCE_STATUS_REAUTH_REQUIRED);
        }
        persistSourceAccount(source);
        LOGGER.warn("BALANCE_IMPORT_JOB_FAILED provider={} userId={} jobId={} reauthRequired={} reason={}",
            job.getProviderCode(), job.getUserId(), job.getId(), reauthRequired, normalizeOptionalText(reason));
    }

    private void revertSourceStatusAfterBindWindow(LightAppBalanceSourceAccountEntity source) {
        if (hasStorageState(source.getUserId(), source.getProviderCode())) {
            source.setStatusCode(SOURCE_STATUS_BOUND);
            return;
        }
        source.setStatusCode(SOURCE_STATUS_UNBOUND);
    }

    private void saveStorageState(Long userId, String provider, String storageState) {
        String providerCode = toStorageStateProviderCode(provider);
        UserProviderSecretEntity entity = providerSecretMapper.selectOne(new LambdaQueryWrapper<UserProviderSecretEntity>()
            .eq(UserProviderSecretEntity::getUserId, userId)
            .eq(UserProviderSecretEntity::getProviderCode, providerCode)
            .last("LIMIT 1"));
        String cipherText = cryptoService.encrypt(storageState);
        String keyMask = maskStorageState(storageState);
        LocalDateTime now = LocalDateTime.now();
        if (entity == null) {
            entity = new UserProviderSecretEntity();
            entity.setUserId(userId);
            entity.setProviderCode(providerCode);
            entity.setCipherText(cipherText);
            entity.setKeyMask(keyMask);
            entity.setCreatedAt(now);
            entity.setUpdatedAt(now);
            try {
                providerSecretMapper.insert(entity);
            } catch (RuntimeException exception) {
                if (!isDuplicateConstraint(exception, PROVIDER_SECRET_UNIQUE_CONSTRAINT)) {
                    throw exception;
                }
                UserProviderSecretEntity existing = requireProviderSecret(userId, providerCode);
                existing.setCipherText(cipherText);
                existing.setKeyMask(keyMask);
                existing.setUpdatedAt(now);
                providerSecretMapper.updateById(existing);
            }
            return;
        }
        entity.setCipherText(cipherText);
        entity.setKeyMask(keyMask);
        entity.setUpdatedAt(now);
        providerSecretMapper.updateById(entity);
    }

    private void overwriteSourceAccount(LightAppBalanceSourceAccountEntity target, LightAppBalanceSourceAccountEntity source) {
        target.setUserId(source.getUserId());
        target.setProviderCode(source.getProviderCode());
        target.setStatusCode(source.getStatusCode());
        target.setTargetAccountId(source.getTargetAccountId());
        target.setNightlyEnabled(source.getNightlyEnabled());
        target.setLastVerifiedAt(source.getLastVerifiedAt());
        target.setLastSyncedAt(source.getLastSyncedAt());
        target.setLastSyncStatusCode(source.getLastSyncStatusCode());
        target.setLastSyncErrorText(source.getLastSyncErrorText());
    }

    private void syncSourceAccountIdentity(LightAppBalanceSourceAccountEntity persisted, LightAppBalanceSourceAccountEntity source) {
        source.setId(persisted.getId());
        source.setCreatedAt(persisted.getCreatedAt());
        source.setUpdatedAt(persisted.getUpdatedAt());
        source.setDeleted(persisted.getDeleted());
        source.setVersion(persisted.getVersion());
    }

    private UserProviderSecretEntity requireProviderSecret(Long userId, String providerCode) {
        UserProviderSecretEntity entity = providerSecretMapper.selectOne(new LambdaQueryWrapper<UserProviderSecretEntity>()
            .eq(UserProviderSecretEntity::getUserId, userId)
            .eq(UserProviderSecretEntity::getProviderCode, providerCode)
            .last("LIMIT 1"));
        if (entity == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Provider secret not found");
        }
        return entity;
    }

    private boolean isDuplicateConstraint(Throwable exception, String constraintName) {
        Throwable current = exception;
        String normalizedConstraint = normalizeOptionalText(constraintName).toLowerCase(Locale.ROOT);
        while (current != null) {
            if (current instanceof DuplicateKeyException) {
                return true;
            }
            String message = normalizeOptionalText(current.getMessage()).toLowerCase(Locale.ROOT);
            if (StringUtils.hasText(message) && message.contains(normalizedConstraint)) {
                return true;
            }
            current = current.getCause();
        }
        return false;
    }

    private String loadStorageState(Long userId, String provider) {
        UserProviderSecretEntity entity = providerSecretMapper.selectOne(new LambdaQueryWrapper<UserProviderSecretEntity>()
            .eq(UserProviderSecretEntity::getUserId, userId)
            .eq(UserProviderSecretEntity::getProviderCode, toStorageStateProviderCode(provider))
            .last("LIMIT 1"));
        if (entity == null || !StringUtils.hasText(entity.getCipherText())) {
            return "";
        }
        return cryptoService.decrypt(entity.getCipherText());
    }

    private boolean hasStorageState(Long userId, String provider) {
        UserProviderSecretEntity entity = providerSecretMapper.selectOne(new LambdaQueryWrapper<UserProviderSecretEntity>()
            .eq(UserProviderSecretEntity::getUserId, userId)
            .eq(UserProviderSecretEntity::getProviderCode, toStorageStateProviderCode(provider))
            .last("LIMIT 1"));
        return entity != null && StringUtils.hasText(entity.getCipherText());
    }

    private boolean providerRequiresStorageState(String provider) {
        return "alipay".equals(normalizeProvider(provider));
    }

    private boolean providerSupportsLocalOnly(String provider) {
        return "qianji".equals(normalizeProvider(provider));
    }

    private String toStorageStateProviderCode(String provider) {
        return STORAGE_STATE_PROVIDER_PREFIX + normalizeProvider(provider);
    }

    private LightAppBalanceAccountEntity requireBalanceAccount(Long userId, Long accountId) {
        LightAppBalanceAccountEntity entity = balanceAccountMapper.selectOne(new LambdaQueryWrapper<LightAppBalanceAccountEntity>()
            .eq(LightAppBalanceAccountEntity::getId, accountId)
            .eq(LightAppBalanceAccountEntity::getUserId, userId)
            .last("LIMIT 1"));
        if (entity == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Balance account not found");
        }
        return entity;
    }

    private boolean isImportedAlready(Long userId, String provider, String externalId, String digest) {
        if (StringUtils.hasText(externalId)) {
            LightAppBalanceImportMappingEntity byExternalId = importMappingMapper.selectOne(
                new LambdaQueryWrapper<LightAppBalanceImportMappingEntity>()
                    .eq(LightAppBalanceImportMappingEntity::getUserId, userId)
                    .eq(LightAppBalanceImportMappingEntity::getProviderCode, provider)
                    .eq(LightAppBalanceImportMappingEntity::getExternalId, externalId)
                    .last("LIMIT 1")
            );
            if (byExternalId != null) {
                return true;
            }
        }
        LightAppBalanceImportMappingEntity byDigest = importMappingMapper.selectOne(
            new LambdaQueryWrapper<LightAppBalanceImportMappingEntity>()
                .eq(LightAppBalanceImportMappingEntity::getUserId, userId)
                .eq(LightAppBalanceImportMappingEntity::getProviderCode, provider)
                .eq(LightAppBalanceImportMappingEntity::getDigestCode, digest)
                .last("LIMIT 1")
        );
        return byDigest != null;
    }

    private boolean isImportable(LightAppBalanceBillSyncAgentClient.ImportedTransaction item) {
        return item != null
            && item.occurredAt() != null
            && item.amount() != null
            && item.amount().compareTo(BigDecimal.ZERO) > 0
            && StringUtils.hasText(item.direction());
    }

    private String resolveDigest(String provider, LightAppBalanceBillSyncAgentClient.ImportedTransaction item) {
        if (StringUtils.hasText(item.digest())) {
            return item.digest().trim();
        }
        String payload = String.join("|",
            normalizeProvider(provider),
            String.valueOf(item.occurredAt()),
            resolveDirection(item.direction()),
            String.valueOf(normalizeAmount(item.amount())),
            normalizeCurrency(item.currencyCode(), "CNY"),
            normalizeOptionalText(item.counterparty()),
            normalizeOptionalText(item.categoryHint()),
            normalizeOptionalText(item.note())
        );
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            return HexFormat.of().formatHex(messageDigest.digest(payload.getBytes(StandardCharsets.UTF_8)));
        } catch (Exception exception) {
            return UUID.nameUUIDFromBytes(payload.getBytes(StandardCharsets.UTF_8)).toString().replace("-", "");
        }
    }

    private String resolveImportedCategory(String raw) {
        String normalized = normalizeOptionalText(raw);
        return StringUtils.hasText(normalized) ? normalized : "Imported";
    }

    private String composeImportedNote(String provider, String counterparty, String note) {
        String providerLabel = providerLabel(provider);
        String normalizedCounterparty = normalizeOptionalText(counterparty);
        String normalizedNote = normalizeOptionalText(note);
        StringBuilder builder = new StringBuilder(providerLabel);
        if (StringUtils.hasText(normalizedCounterparty)) {
            builder.append(" | ").append(normalizedCounterparty);
        }
        if (StringUtils.hasText(normalizedNote)) {
            builder.append(" | ").append(normalizedNote);
        }
        return builder.toString();
    }

    private LocalDateTime resolveSyncWindowStart(LightAppBalanceSourceAccountEntity source, LocalDateTime now) {
        if (source.getLastSyncedAt() != null) {
            return source.getLastSyncedAt().minusHours(properties.getResyncLookbackHours());
        }
        if (source.getLastVerifiedAt() != null) {
            return source.getLastVerifiedAt().minusHours(properties.getInitialLookbackHours());
        }
        return now.minusHours(properties.getInitialLookbackHours());
    }

    private String maskStorageState(String storageState) {
        if (!StringUtils.hasText(storageState) || storageState.length() < 16) {
            return "storage-state";
        }
        String raw = storageState.trim();
        return raw.substring(0, 6) + "****" + raw.substring(raw.length() - 6);
    }

    private LightAppBalanceSourceAccountStatusResponse toSourceAccountStatusResponse(String provider,
                                                                                     LightAppBalanceSourceAccountEntity source,
                                                                                     LightAppBalanceBindSessionEntity activeSession) {
        String normalizedProvider = normalizeProvider(provider);
        Long targetAccountId = source == null ? null : source.getTargetAccountId();
        LightAppBalanceAccountEntity targetAccount = (targetAccountId == null || targetAccountId <= 0 || source == null)
            ? null
            : balanceAccountMapper.selectById(targetAccountId);
        String rawStatus = source == null ? SOURCE_STATUS_UNBOUND : normalizeStatus(source.getStatusCode());
        String status = providerSupportsLocalOnly(normalizedProvider) && targetAccountId != null && targetAccountId > 0
            ? SOURCE_STATUS_BOUND
            : rawStatus;
        boolean bound = providerSupportsLocalOnly(normalizedProvider)
            ? targetAccountId != null && targetAccountId > 0
            : source != null
                && SOURCE_STATUS_BOUND.equals(status)
                && (!providerRequiresStorageState(normalizedProvider) || hasStorageState(source.getUserId(), normalizedProvider));
        LightAppBalanceBindSessionEntity session = providerSupportsLocalOnly(normalizedProvider) ? null : activeSession;
        return new LightAppBalanceSourceAccountStatusResponse(
            normalizedProvider,
            providerLabel(normalizedProvider),
            bound,
            status,
            targetAccountId,
            targetAccount == null ? "" : targetAccount.getAccountName(),
            targetAccount == null ? "" : targetAccount.getCurrencyCode(),
            source != null && Boolean.TRUE.equals(source.getNightlyEnabled()),
            source == null ? null : source.getLastVerifiedAt(),
            source == null ? null : source.getLastSyncedAt(),
            source == null ? "" : normalizeOptionalText(source.getLastSyncStatusCode()),
            source == null ? "" : normalizeOptionalText(source.getLastSyncErrorText()),
            session == null ? "" : session.getSessionCode(),
            session == null ? "" : normalizeBindStatus(session.getStatusCode()),
            session == null ? null : session.getExpiresAt(),
            source == null ? null : source.getUpdatedAt()
        );
    }

    private LightAppBalanceBindSessionCreateResponse toBindSessionCreateResponse(LightAppBalanceBindSessionEntity entity) {
        return new LightAppBalanceBindSessionCreateResponse(
            normalizeProvider(entity.getProviderCode()),
            entity.getSessionCode(),
            normalizeBindStatus(entity.getStatusCode()),
            normalizeOptionalText(entity.getLoginUrl()),
            normalizeOptionalText(entity.getQrCodePayload()),
            normalizeOptionalText(entity.getQrCodeImageDataUrl()),
            entity.getExpiresAt()
        );
    }

    private LightAppBalanceBindSessionStatusResponse toBindSessionStatusResponse(LightAppBalanceBindSessionEntity entity) {
        return new LightAppBalanceBindSessionStatusResponse(
            normalizeProvider(entity.getProviderCode()),
            entity.getSessionCode(),
            normalizeBindStatus(entity.getStatusCode()),
            normalizeOptionalText(entity.getLoginUrl()),
            normalizeOptionalText(entity.getQrCodePayload()),
            normalizeOptionalText(entity.getQrCodeImageDataUrl()),
            entity.getExpiresAt(),
            entity.getCompletedAt(),
            normalizeOptionalText(entity.getFailureReason())
        );
    }

    private LightAppBalanceImportJobResponse toImportJobResponse(LightAppBalanceImportJobEntity job) {
        return new LightAppBalanceImportJobResponse(
            job.getId(),
            normalizeProvider(job.getProviderCode()),
            providerLabel(job.getProviderCode()),
            normalizeOptionalText(job.getTriggerType()),
            normalizeJobStatus(job.getStatusCode()),
            job.getSourceAccountId(),
            job.getTargetAccountId(),
            job.getImportedCount() == null ? 0 : job.getImportedCount(),
            job.getDuplicateCount() == null ? 0 : job.getDuplicateCount(),
            job.getSkippedCount() == null ? 0 : job.getSkippedCount(),
            normalizeOptionalText(job.getRawFilePath()),
            normalizeOptionalText(job.getErrorText()),
            job.getRequestFromAt(),
            job.getRequestToAt(),
            job.getStartedAt(),
            job.getFinishedAt(),
            job.getCreatedAt(),
            job.getUpdatedAt()
        );
    }

    private Long requireValidUserId(Long userId) {
        if (userId == null || userId <= 0) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Login required");
        }
        return userId;
    }

    private String requireSessionId(String sessionId) {
        if (!StringUtils.hasText(sessionId)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "session_id is required");
        }
        return sessionId.trim();
    }

    private String normalizeProvider(String provider) {
        if (!StringUtils.hasText(provider)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Provider is required");
        }
        String normalized = provider.trim().toLowerCase(Locale.ROOT);
        if (!SUPPORTED_PROVIDERS.contains(normalized)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported source provider: " + provider);
        }
        return normalized;
    }

    private String normalizeStatus(String raw) {
        String normalized = String.valueOf(raw == null ? SOURCE_STATUS_UNBOUND : raw).trim().toUpperCase(Locale.ROOT);
        return StringUtils.hasText(normalized) ? normalized : SOURCE_STATUS_UNBOUND;
    }

    private String normalizeBindStatus(String raw) {
        String normalized = String.valueOf(raw == null ? BIND_STATUS_PENDING : raw).trim().toUpperCase(Locale.ROOT);
        return StringUtils.hasText(normalized) ? normalized : BIND_STATUS_PENDING;
    }

    private String normalizeJobStatus(String raw) {
        String normalized = String.valueOf(raw == null ? JOB_STATUS_PENDING : raw).trim().toUpperCase(Locale.ROOT);
        return StringUtils.hasText(normalized) ? normalized : JOB_STATUS_PENDING;
    }

    private String resolveBindStatus(String rawStatus, LocalDateTime resultExpiresAt, LocalDateTime fallbackExpiresAt) {
        String status = normalizeBindStatus(rawStatus);
        LocalDateTime expiresAt = resultExpiresAt == null ? fallbackExpiresAt : resultExpiresAt;
        if (!BIND_STATUS_BOUND.equals(status)
            && expiresAt != null
            && expiresAt.isBefore(LocalDateTime.now())
            && !BIND_STATUS_FAILED.equals(status)) {
            return BIND_STATUS_EXPIRED;
        }
        return status;
    }

    private boolean isTerminalBindStatus(String status) {
        String normalized = normalizeBindStatus(status);
        return BIND_STATUS_BOUND.equals(normalized)
            || BIND_STATUS_FAILED.equals(normalized)
            || BIND_STATUS_EXPIRED.equals(normalized);
    }

    private String providerLabel(String provider) {
        return switch (normalizeProvider(provider)) {
            case "alipay" -> "支付宝";
            case "wechat" -> "微信";
            case "bankcard" -> "银行卡";
            case "qianji" -> "钱迹";
            default -> provider;
        };
    }

    private String normalizeOptionalText(String raw) {
        String normalized = String.valueOf(raw == null ? "" : raw).trim();
        return StringUtils.hasText(normalized) ? normalized : "";
    }

    private String resolveDirection(String raw) {
        String normalized = String.valueOf(raw == null ? DIRECTION_EXPENSE : raw).trim().toUpperCase(Locale.ROOT);
        if (DIRECTION_INCOME.equals(normalized) || DIRECTION_EXPENSE.equals(normalized)) {
            return normalized;
        }
        return DIRECTION_EXPENSE;
    }

    private BigDecimal normalizeAmount(BigDecimal raw) {
        return raw == null ? BigDecimal.ZERO : raw;
    }

    private String normalizeCurrency(String raw, String fallback) {
        String normalized = String.valueOf(StringUtils.hasText(raw) ? raw : fallback).trim().toUpperCase(Locale.ROOT);
        return StringUtils.hasText(normalized) ? normalized : "CNY";
    }
}
