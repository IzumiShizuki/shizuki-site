package gh;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import ug.x;
import vb.w;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArraySet f7551a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f7552b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = x.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(x.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(ch.h.class.getName(), "okhttp.Http2");
        linkedHashMap.put(yg.c.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f7552b = w.B(linkedHashMap);
    }

    public static void a(String str, int i10, String str2, Throwable th2) {
        int iMin;
        String strW0 = (String) f7552b.get(str);
        if (strW0 == null) {
            strW0 = ef.n.W0(23, str);
        }
        if (Log.isLoggable(strW0, i10)) {
            if (th2 != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th2);
            }
            int length = str2.length();
            int i11 = 0;
            while (i11 < length) {
                int iV0 = ef.n.v0(str2, '\n', i11, 4);
                if (iV0 == -1) {
                    iV0 = length;
                }
                while (true) {
                    iMin = Math.min(iV0, i11 + 4000);
                    String strSubstring = str2.substring(i11, iMin);
                    jc.l.d(strSubstring, "substring(...)");
                    Log.println(i10, strW0, strSubstring);
                    if (iMin >= iV0) {
                        break;
                    } else {
                        i11 = iMin;
                    }
                }
                i11 = iMin + 1;
            }
        }
    }

    public static void b(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (f7551a.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(d.f7553a);
        }
    }
}
