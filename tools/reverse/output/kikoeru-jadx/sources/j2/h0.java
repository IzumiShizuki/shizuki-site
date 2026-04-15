package j2;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class h0 {
    public static /* synthetic */ String A(int i10) {
        switch (i10) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                return "BOOLEAN";
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                return "NULL";
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static o6.b a(o6.l lVar, byte[] bArr, int i10) {
        ya.f0 f0VarP = ya.i0.p();
        lVar.w(bArr, 0, i10, o6.k.f16267c, new androidx.media3.exoplayer.offline.g(17, f0VarP));
        return new o6.b(f0VarP.f());
    }

    public static Serializable b(oa.e eVar, String str, String str2, String str3, int i10) {
        jc.l.e(str, "text");
        jc.l.e(str2, "src");
        jc.l.e(str3, "dst");
        try {
            if (str.length() <= i10) {
                Serializable serializableB = eVar.b(str, str2, str3);
                ub.a.f(serializableB);
                return (String) serializableB;
            }
            StringBuilder sb = new StringBuilder();
            int length = str.length() - 1;
            if (i10 <= 0) {
                throw new IllegalArgumentException("Step must be positive, was: " + i10 + ".");
            }
            int i11 = 0;
            int iX = gh.g.x(0, length, i10);
            if (iX >= 0) {
                while (true) {
                    int i12 = i11 + i10;
                    Serializable serializableB2 = eVar.b(i12 < str.length() ? ef.n.I0(str, new oc.d(i11, i12, 1)) : ef.n.I0(str, new oc.d(i11, ef.n.s0(str), 1)), str2, str3);
                    ub.a.f(serializableB2);
                    sb.append((String) serializableB2);
                    if (i11 == iX) {
                        break;
                    }
                    i11 = i12;
                }
            }
            return sb.toString();
        } catch (Throwable th2) {
            return ub.a.b(th2);
        }
    }

    public static void c(o1.i iVar) {
        ((o1.k) iVar).b(false, 8, true);
    }

    public static /* synthetic */ boolean d(int i10) {
        if (i10 == 1 || i10 == 2) {
            return false;
        }
        if (i10 == 3 || i10 == 4) {
            return true;
        }
        throw null;
    }

    public static int e(int i10, int i11, String str) {
        return (str.hashCode() + i10) * i11;
    }

    public static int f(int i10, int i11, t2.l0 l0Var) {
        return (l0Var.hashCode() + i10) * i11;
    }

    public static ce.j0 g(String str) {
        f2.a.c(str);
        return new ce.j0();
    }

    public static hd.q0 h(float f10, float f11) {
        hd.q0 q0Var = new hd.q0((byte) 0, 6);
        q0Var.u(f10, f11);
        return q0Var;
    }

    public static String i(long j10, String str) {
        return str + j10;
    }

    public static String j(String str, String str2) {
        return str + str2;
    }

    public static String k(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String l(StringBuilder sb, float f10, char c3) {
        sb.append(f10);
        sb.append(c3);
        return sb.toString();
    }

    public static String m(StringBuilder sb, int i10, char c3) {
        sb.append(i10);
        sb.append(c3);
        return sb.toString();
    }

    public static String n(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder o(int i10, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i10);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder p(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static /* synthetic */ void q(int i10, String str) {
        if (i10 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = jc.l.class.getName();
            int i11 = 0;
            while (!stackTrace[i11].getClassName().equals(name)) {
                i11++;
            }
            while (stackTrace[i11].getClassName().equals(name)) {
                i11++;
            }
            StackTraceElement stackTraceElement = stackTrace[i11];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            jc.l.i(nullPointerException, jc.l.class.getName());
            throw nullPointerException;
        }
    }

    public static void r(int i10, HashMap map, String str, int i11, String str2) {
        map.put(str, Integer.valueOf(i10));
        map.put(str2, Integer.valueOf(i11));
    }

    public static void s(int i10, x0.o oVar, int i11, i2.h hVar) {
        oVar.h0(Integer.valueOf(i10));
        oVar.b(hVar, Integer.valueOf(i11));
    }

    public static void t(hd.q0 q0Var, float f10, float f11, float f12) {
        q0Var.s(f10, f11);
        q0Var.z(f12);
        q0Var.l();
    }

    public static /* synthetic */ void u(AutoCloseable autoCloseable) throws Exception {
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (autoCloseable instanceof ExecutorService) {
            p4.z.q((ExecutorService) autoCloseable);
            return;
        }
        if (autoCloseable instanceof TypedArray) {
            ((TypedArray) autoCloseable).recycle();
            return;
        }
        if (autoCloseable instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) autoCloseable).release();
            return;
        }
        if (autoCloseable instanceof MediaDrm) {
            ((MediaDrm) autoCloseable).release();
        } else if (autoCloseable instanceof DrmManagerClient) {
            ((DrmManagerClient) autoCloseable).release();
        } else {
            if (!(autoCloseable instanceof ContentProviderClient)) {
                throw new IllegalArgumentException();
            }
            ((ContentProviderClient) autoCloseable).release();
        }
    }

    public static void v(String str, String str2, String str3) {
        p4.c.B(str3, str + str2);
    }

    public static void w(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static String x(String str, String str2) {
        return str + str2;
    }

    public static /* synthetic */ void y(int i10, String str) {
        if (i10 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(j(str, " must not be null"));
        jc.l.i(nullPointerException, jc.l.class.getName());
        throw nullPointerException;
    }
}
