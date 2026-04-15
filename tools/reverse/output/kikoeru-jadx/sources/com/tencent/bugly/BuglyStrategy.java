package com.tencent.bugly;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class BuglyStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f4322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f4323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f4324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f4325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f4326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f4327f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private a f4338q;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f4328g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f4329h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f4330i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f4331j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Class<?> f4332k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f4333l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f4334m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f4335n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f4336o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f4337p = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected int f4339r = 31;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected boolean f4340s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f4341t = true;

    /* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
    public static class a {
        public static final int CRASHTYPE_ANR = 4;
        public static final int CRASHTYPE_BLOCK = 7;
        public static final int CRASHTYPE_COCOS2DX_JS = 5;
        public static final int CRASHTYPE_COCOS2DX_LUA = 6;
        public static final int CRASHTYPE_JAVA_CATCH = 1;
        public static final int CRASHTYPE_JAVA_CRASH = 0;
        public static final int CRASHTYPE_NATIVE = 2;
        public static final int CRASHTYPE_U3D = 3;
        public static final int MAX_USERDATA_KEY_LENGTH = 100;
        public static final int MAX_USERDATA_VALUE_LENGTH = 100000;

        public synchronized Map<String, String> onCrashHandleStart(int i10, String str, String str2, String str3) {
            return null;
        }

        public synchronized byte[] onCrashHandleStart2GetExtraDatas(int i10, String str, String str2, String str3) {
            return null;
        }
    }

    public synchronized String getAppChannel() {
        String str;
        str = this.f4323b;
        if (str == null) {
            str = com.tencent.bugly.crashreport.common.info.a.m().I;
        }
        return str;
    }

    public synchronized String getAppPackageName() {
        String str;
        str = this.f4324c;
        if (str == null) {
            str = com.tencent.bugly.crashreport.common.info.a.m().f4575g;
        }
        return str;
    }

    public synchronized long getAppReportDelay() {
        return this.f4325d;
    }

    public synchronized String getAppVersion() {
        String str;
        str = this.f4322a;
        if (str == null) {
            str = com.tencent.bugly.crashreport.common.info.a.m().E;
        }
        return str;
    }

    public synchronized int getCallBackType() {
        return this.f4339r;
    }

    public synchronized boolean getCloseErrorCallback() {
        return this.f4340s;
    }

    public synchronized a getCrashHandleCallback() {
        return this.f4338q;
    }

    public synchronized String getDeviceID() {
        return this.f4327f;
    }

    public synchronized String getLibBuglySOFilePath() {
        return this.f4326e;
    }

    public synchronized Class<?> getUserInfoActivity() {
        return this.f4332k;
    }

    public synchronized boolean isBuglyLogUpload() {
        return this.f4333l;
    }

    public synchronized boolean isEnableANRCrashMonitor() {
        return this.f4329h;
    }

    public synchronized boolean isEnableCatchAnrTrace() {
        return this.f4330i;
    }

    public synchronized boolean isEnableNativeCrashMonitor() {
        return this.f4328g;
    }

    public synchronized boolean isEnableUserInfo() {
        return this.f4331j;
    }

    public boolean isMerged() {
        return this.f4341t;
    }

    public boolean isReplaceOldChannel() {
        return this.f4334m;
    }

    public synchronized boolean isUploadProcess() {
        return this.f4335n;
    }

    public synchronized boolean isUploadSpotCrash() {
        return this.f4336o;
    }

    public synchronized boolean recordUserInfoOnceADay() {
        return this.f4337p;
    }

    public synchronized BuglyStrategy setAppChannel(String str) {
        this.f4323b = str;
        return this;
    }

    public synchronized BuglyStrategy setAppPackageName(String str) {
        this.f4324c = str;
        return this;
    }

    public synchronized BuglyStrategy setAppReportDelay(long j10) {
        this.f4325d = j10;
        return this;
    }

    public synchronized BuglyStrategy setAppVersion(String str) {
        this.f4322a = str;
        return this;
    }

    public synchronized BuglyStrategy setBuglyLogUpload(boolean z10) {
        this.f4333l = z10;
        return this;
    }

    public synchronized void setCallBackType(int i10) {
        this.f4339r = i10;
    }

    public synchronized void setCloseErrorCallback(boolean z10) {
        this.f4340s = z10;
    }

    public synchronized BuglyStrategy setCrashHandleCallback(a aVar) {
        this.f4338q = aVar;
        return this;
    }

    public synchronized BuglyStrategy setDeviceID(String str) {
        this.f4327f = str;
        return this;
    }

    public synchronized BuglyStrategy setEnableANRCrashMonitor(boolean z10) {
        this.f4329h = z10;
        return this;
    }

    public void setEnableCatchAnrTrace(boolean z10) {
        this.f4330i = z10;
    }

    public synchronized BuglyStrategy setEnableNativeCrashMonitor(boolean z10) {
        this.f4328g = z10;
        return this;
    }

    public synchronized BuglyStrategy setEnableUserInfo(boolean z10) {
        this.f4331j = z10;
        return this;
    }

    public synchronized BuglyStrategy setLibBuglySOFilePath(String str) {
        this.f4326e = str;
        return this;
    }

    public void setMerged(boolean z10) {
        this.f4341t = z10;
    }

    public synchronized BuglyStrategy setRecordUserInfoOnceADay(boolean z10) {
        this.f4337p = z10;
        return this;
    }

    public void setReplaceOldChannel(boolean z10) {
        this.f4334m = z10;
    }

    public synchronized BuglyStrategy setUploadProcess(boolean z10) {
        this.f4335n = z10;
        return this;
    }

    public synchronized void setUploadSpotCrash(boolean z10) {
        this.f4336o = z10;
    }

    public synchronized BuglyStrategy setUserInfoActivity(Class<?> cls) {
        this.f4332k = cls;
        return this;
    }
}
