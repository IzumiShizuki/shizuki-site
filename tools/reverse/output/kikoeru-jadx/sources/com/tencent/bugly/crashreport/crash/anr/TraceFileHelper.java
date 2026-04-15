package com.tencent.bugly.crashreport.crash.anr;

import com.tencent.bugly.proguard.X;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class TraceFileHelper {

    /* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f4686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f4687b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f4688c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Map<String, String[]> f4689d;
    }

    /* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
    public interface b {
        boolean a(long j10);

        boolean a(long j10, long j11, String str);

        boolean a(String str, int i10, String str2, String str3, boolean z10);

        boolean a(String str, long j10, long j11);
    }

    public static Object[] a(BufferedReader bufferedReader, Pattern... patternArr) throws IOException {
        if (bufferedReader != null && patternArr != null) {
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                for (Pattern pattern : patternArr) {
                    if (pattern.matcher(line).matches()) {
                        return new Object[]{pattern, line};
                    }
                }
            }
        }
        return null;
    }

    public static String b(BufferedReader bufferedReader) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < 3; i10++) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return null;
            }
            stringBuffer.append(line.concat("\n"));
        }
        return stringBuffer.toString();
    }

    public static a readFirstDumpInfo(String str, boolean z10) throws Throwable {
        if (str == null) {
            X.b("path:%s", str);
            return null;
        }
        a aVar = new a();
        readTraceFile(str, new c(aVar, z10));
        if (aVar.f4686a > 0 && aVar.f4688c > 0 && aVar.f4687b != null) {
            return aVar;
        }
        X.b("first dump error %s", aVar.f4686a + " " + aVar.f4688c + " " + aVar.f4687b);
        return null;
    }

    public static a readTargetDumpInfo(String str, String str2, boolean z10) throws Throwable {
        if (str == null || str2 == null) {
            return null;
        }
        a aVar = new a();
        readTraceFile(str2, new com.tencent.bugly.crashreport.crash.anr.b(aVar, str, z10));
        if (aVar.f4686a <= 0 || aVar.f4688c <= 0 || aVar.f4687b == null) {
            return null;
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0145, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014a, code lost:
    
        if (com.tencent.bugly.proguard.X.b(r0) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014c, code lost:
    
        r0.printStackTrace();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void readTraceFile(java.lang.String r16, com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.readTraceFile(java.lang.String, com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$b):void");
    }

    public static String a(BufferedReader bufferedReader) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null || line.trim().length() <= 0) {
                break;
            }
            stringBuffer.append(line.concat("\n"));
        }
        return stringBuffer.toString();
    }
}
