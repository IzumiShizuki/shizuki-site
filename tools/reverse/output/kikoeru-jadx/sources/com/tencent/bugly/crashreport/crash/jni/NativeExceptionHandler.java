package com.tencent.bugly.crashreport.crash.jni;

import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public interface NativeExceptionHandler {
    void handleNativeException(int i10, int i11, long j10, long j11, String str, String str2, String str3, String str4, int i12, String str5, int i13, int i14, int i15, String str6, String str7);

    void handleNativeException2(int i10, int i11, long j10, long j11, String str, String str2, String str3, String str4, int i12, String str5, int i13, int i14, int i15, String str6, String str7, String[] strArr);

    CrashDetailBean packageCrashDatas(String str, String str2, long j10, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, byte[] bArr, Map<String, String> map, boolean z10, boolean z11);
}
