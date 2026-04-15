package com.tencent.bugly.proguard;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static O f4879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f4880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<String, String> f4881c = null;

    private O(Context context) {
        this.f4880b = context;
    }

    private Map<String, String> b(HttpURLConnection httpURLConnection) {
        HashMap map = new HashMap();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        if (headerFields == null || headerFields.size() == 0) {
            return null;
        }
        for (String str : headerFields.keySet()) {
            List<String> list = headerFields.get(str);
            if (list.size() >= 1) {
                map.put(str, list.get(0));
            }
        }
        return map;
    }

    public boolean a(int i10) {
        return i10 == 301 || i10 == 302 || i10 == 303 || i10 == 307;
    }

    public static O a(Context context) {
        if (f4879a == null) {
            f4879a = new O(context);
        }
        return f4879a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:129|25|26|(7:119|28|(1:30)(2:31|32)|33|115|34|40)(13:47|121|48|(4:50|125|51|(7:127|53|54|55|117|56|62)(7:65|131|66|67|135|68|69))(1:77)|133|78|79|80|(1:82)|83|139|84|90)|44|95|(1:97)|137|98|90) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x017a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x017f, code lost:
    
        if (com.tencent.bugly.proguard.X.b(r0) == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0181, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0181 A[PHI: r0 r4 r10 r11 r12
      0x0181: PHI (r0v18 'th' java.lang.Throwable) = (r0v17 'th' java.lang.Throwable), (r0v31 'th' java.lang.Throwable) binds: [B:102:0x017f, B:88:0x0160] A[DONT_GENERATE, DONT_INLINE]
      0x0181: PHI (r4v9 int) = (r4v8 int), (r4v11 int) binds: [B:102:0x017f, B:88:0x0160] A[DONT_GENERATE, DONT_INLINE]
      0x0181: PHI (r10v6 java.lang.String) = (r10v5 java.lang.String), (r10v8 java.lang.String) binds: [B:102:0x017f, B:88:0x0160] A[DONT_GENERATE, DONT_INLINE]
      0x0181: PHI (r11v6 int) = (r11v5 int), (r11v8 int) binds: [B:102:0x017f, B:88:0x0160] A[DONT_GENERATE, DONT_INLINE]
      0x0181: PHI (r12v7 boolean) = (r12v6 boolean), (r12v10 boolean) binds: [B:102:0x017f, B:88:0x0160] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0173 A[Catch: all -> 0x00cd, TRY_LEAVE, TryCatch #7 {all -> 0x00cd, blocks: (B:25:0x009e, B:28:0x00a6, B:33:0x00bb, B:95:0x016d, B:97:0x0173, B:31:0x00b7, B:48:0x00db, B:51:0x00e3, B:53:0x00e9, B:55:0x00f0, B:66:0x0115, B:68:0x011a, B:78:0x0133, B:80:0x013a, B:83:0x0154), top: B:129:0x009e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] a(java.lang.String r22, byte[] r23, com.tencent.bugly.proguard.U r24, java.util.Map<java.lang.String, java.lang.String> r25) {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.O.a(java.lang.String, byte[], com.tencent.bugly.proguard.U, java.util.Map):byte[]");
    }

    public byte[] a(HttpURLConnection httpURLConnection) {
        BufferedInputStream bufferedInputStream;
        if (httpURLConnection == null) {
            return null;
        }
        try {
            bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = bufferedInputStream.read(bArr);
                    if (i10 > 0) {
                        byteArrayOutputStream.write(bArr, 0, i10);
                    } else {
                        byteArrayOutputStream.flush();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        try {
                            bufferedInputStream.close();
                            return byteArray;
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                            return byteArray;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    if (!X.b(th)) {
                        th.printStackTrace();
                    }
                    return null;
                } finally {
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th4) {
                            th4.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th5) {
            th = th5;
            bufferedInputStream = null;
        }
    }

    public HttpURLConnection a(String str, byte[] bArr, String str2, Map<String, String> map) {
        if (str == null) {
            X.b("destUrl is null.", new Object[0]);
            return null;
        }
        a();
        HttpURLConnection httpURLConnectionA = a(str2, str);
        if (httpURLConnectionA == null) {
            X.b("Failed to get HttpURLConnection object.", new Object[0]);
            return null;
        }
        try {
            httpURLConnectionA.setRequestProperty("wup_version", "3.0");
            if (map != null && map.size() > 0) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    httpURLConnectionA.setRequestProperty(entry.getKey(), URLEncoder.encode(entry.getValue(), "utf-8"));
                }
            }
            httpURLConnectionA.setRequestProperty("A37", URLEncoder.encode(str2, "utf-8"));
            httpURLConnectionA.setRequestProperty("A38", URLEncoder.encode(str2, "utf-8"));
            OutputStream outputStream = httpURLConnectionA.getOutputStream();
            if (bArr == null) {
                outputStream.write(0);
                return httpURLConnectionA;
            }
            outputStream.write(bArr);
            return httpURLConnectionA;
        } catch (Throwable th2) {
            if (!X.b(th2)) {
                th2.printStackTrace();
            }
            X.b("Failed to upload, please check your network.", new Object[0]);
            return null;
        }
    }

    public HttpURLConnection a(String str, String str2) {
        HttpURLConnection httpURLConnection;
        try {
            URL url = new URL(str2);
            if (Y.a() != null) {
                httpURLConnection = (HttpURLConnection) url.openConnection(Y.a());
            } else if (str != null && str.toLowerCase(Locale.US).contains("wap")) {
                httpURLConnection = (HttpURLConnection) url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(System.getProperty("http.proxyHost"), Integer.parseInt(System.getProperty("http.proxyPort")))));
            } else {
                httpURLConnection = (HttpURLConnection) url.openConnection();
            }
            httpURLConnection.setConnectTimeout(30000);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(false);
            return httpURLConnection;
        } catch (Throwable th2) {
            if (X.b(th2)) {
                return null;
            }
            th2.printStackTrace();
            return null;
        }
    }

    private static void a() {
        TrustManager[] trustManagerArr = {new a0()};
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
