package com.tencent.bugly.crashreport.crash.h5;

import android.webkit.JavascriptInterface;
import com.tencent.bugly.crashreport.CrashReport;
import com.tencent.bugly.crashreport.inner.InnerApi;
import com.tencent.bugly.proguard.X;
import com.tencent.bugly.proguard.ca;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class H5JavaScriptInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HashSet<Integer> f4763a = new HashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f4764b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Thread f4765c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f4766d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, String> f4767e = null;

    private H5JavaScriptInterface() {
    }

    private static String a(Thread thread) {
        if (thread == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("\n");
        for (int i10 = 2; i10 < thread.getStackTrace().length; i10++) {
            StackTraceElement stackTraceElement = thread.getStackTrace()[i10];
            if (!stackTraceElement.toString().contains("crashreport")) {
                sb.append(stackTraceElement.toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static H5JavaScriptInterface getInstance(CrashReport.WebViewInterface webViewInterface) {
        if (webViewInterface == null || f4763a.contains(Integer.valueOf(webViewInterface.hashCode()))) {
            return null;
        }
        H5JavaScriptInterface h5JavaScriptInterface = new H5JavaScriptInterface();
        f4763a.add(Integer.valueOf(webViewInterface.hashCode()));
        Thread threadCurrentThread = Thread.currentThread();
        h5JavaScriptInterface.f4765c = threadCurrentThread;
        h5JavaScriptInterface.f4766d = a(threadCurrentThread);
        h5JavaScriptInterface.f4767e = a(webViewInterface);
        return h5JavaScriptInterface;
    }

    @JavascriptInterface
    public void printLog(String str) {
        X.e("Log from js: %s", str);
    }

    @JavascriptInterface
    public void reportJSException(String str) {
        if (str == null) {
            X.e("Payload from JS is null.", new Object[0]);
            return;
        }
        String strC = ca.c(str.getBytes());
        String str2 = this.f4764b;
        if (str2 != null && str2.equals(strC)) {
            X.e("Same payload from js. Please check whether you've injected bugly.js more than one times.", new Object[0]);
            return;
        }
        this.f4764b = strC;
        X.e("Handling JS exception ...", new Object[0]);
        a aVarA = a(str);
        if (aVarA == null) {
            X.e("Failed to parse payload.", new Object[0]);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(aVarA.a());
        linkedHashMap.putAll(this.f4767e);
        linkedHashMap.put("Java Stack", this.f4766d);
        a(aVarA, this.f4765c, linkedHashMap);
    }

    private static Map<String, String> a(CrashReport.WebViewInterface webViewInterface) {
        HashMap map = new HashMap();
        map.put("[WebView] ContentDescription", "" + ((Object) webViewInterface.getContentDescription()));
        return map;
    }

    private a a(String str) {
        a aVar;
        if (str == null || str.length() <= 0) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            a aVar2 = new a();
            String string = jSONObject.getString("projectRoot");
            aVar2.f4768a = string;
            if (string == null) {
                return null;
            }
            String string2 = jSONObject.getString("context");
            aVar2.f4769b = string2;
            if (string2 == null) {
                return null;
            }
            String string3 = jSONObject.getString("url");
            aVar2.f4770c = string3;
            if (string3 == null) {
                return null;
            }
            String string4 = jSONObject.getString("userAgent");
            aVar2.f4771d = string4;
            if (string4 == null) {
                return null;
            }
            String string5 = jSONObject.getString("language");
            aVar2.f4772e = string5;
            if (string5 == null) {
                return null;
            }
            String string6 = jSONObject.getString("name");
            aVar2.f4773f = string6;
            if (string6 == null || string6.equals("null")) {
                return null;
            }
            String string7 = jSONObject.getString("stacktrace");
            if (string7 == null) {
                return null;
            }
            int iIndexOf = string7.indexOf("\n");
            aVar = null;
            try {
                if (iIndexOf < 0) {
                    X.e("H5 crash stack's format is wrong!", new Object[0]);
                    return null;
                }
                aVar2.f4775h = string7.substring(iIndexOf + 1);
                String strSubstring = string7.substring(0, iIndexOf);
                aVar2.f4774g = strSubstring;
                int iIndexOf2 = strSubstring.indexOf(":");
                if (iIndexOf2 > 0) {
                    aVar2.f4774g = aVar2.f4774g.substring(iIndexOf2 + 1);
                }
                aVar2.f4776i = jSONObject.getString("file");
                if (aVar2.f4773f == null) {
                    return null;
                }
                long j10 = jSONObject.getLong("lineNumber");
                aVar2.f4777j = j10;
                if (j10 < 0) {
                    return null;
                }
                long j11 = jSONObject.getLong("columnNumber");
                aVar2.f4778k = j11;
                if (j11 < 0) {
                    return null;
                }
                X.c("H5 crash information is following: ", new Object[0]);
                X.c("[projectRoot]: " + aVar2.f4768a, new Object[0]);
                X.c("[context]: " + aVar2.f4769b, new Object[0]);
                X.c("[url]: " + aVar2.f4770c, new Object[0]);
                X.c("[userAgent]: " + aVar2.f4771d, new Object[0]);
                X.c("[language]: " + aVar2.f4772e, new Object[0]);
                X.c("[name]: " + aVar2.f4773f, new Object[0]);
                X.c("[message]: " + aVar2.f4774g, new Object[0]);
                X.c("[stacktrace]: \n" + aVar2.f4775h, new Object[0]);
                X.c("[file]: " + aVar2.f4776i, new Object[0]);
                X.c("[lineNumber]: " + aVar2.f4777j, new Object[0]);
                X.c("[columnNumber]: " + aVar2.f4778k, new Object[0]);
                return aVar2;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            aVar = null;
        }
        if (X.b(th)) {
            return aVar;
        }
        th.printStackTrace();
        return aVar;
    }

    private static void a(a aVar, Thread thread, Map<String, String> map) {
        if (aVar != null) {
            InnerApi.postH5CrashAsync(thread, aVar.f4773f, aVar.f4774g, aVar.f4775h, map);
        }
    }
}
