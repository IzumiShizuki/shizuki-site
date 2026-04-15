package na;

import android.content.ClipData;
import android.content.ClipboardManager;
import j2.h0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import m0.l3;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xf.r f15765a = ua.l.E(new l3(15));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ef.l f15766b = new ef.l("[^A-Za-z0-9]");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ub.p f15767c = ub.a.d(new i9.f(26));

    public static final String a(long j10) {
        return j10 >= 2000000000000L ? String.format("VJ%08d", Arrays.copyOf(new Object[]{Long.valueOf(j10 - 2000000000000L)}, 1)) : j10 >= 1000000000000L ? String.format("BJ%08d", Arrays.copyOf(new Object[]{Long.valueOf(j10 - 1000000000000L)}, 1)) : j10 >= 1000000 ? String.format("RJ%08d", Arrays.copyOf(new Object[]{Long.valueOf(j10)}, 1)) : String.format("RJ%06d", Arrays.copyOf(new Object[]{Long.valueOf(j10)}, 1));
    }

    public static void b(String str) {
        jc.l.e(str, "<this>");
        Object systemService = a9.i.a().getSystemService("clipboard");
        jc.l.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(null, str));
    }

    public static final String c(ArrayList arrayList) {
        String str;
        synchronized (f()) {
            try {
                f().c();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    f().b((byte[]) it.next());
                }
                f().a();
                str = f().f16471g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public static final String d(byte[] bArr) {
        String str;
        jc.l.e(bArr, "<this>");
        synchronized (f()) {
            f().c();
            f().b(bArr);
            f().a();
            str = f().f16471g;
        }
        return str;
    }

    public static final String e(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            String strSubstring = str.substring(i11, i11 + 2);
            jc.l.d(strSubstring, "substring(...)");
            bArr[i10] = (byte) Integer.valueOf(strSubstring, 16).intValue();
        }
        return new String(bArr, ef.a.f6541a);
    }

    public static final oh.b f() {
        return (oh.b) f15767c.getValue();
    }

    public static final String g(String str) throws UnsupportedEncodingException {
        jc.l.e(str, "<this>");
        String strEncode = URLEncoder.encode(str, ef.a.f6541a.displayName());
        jc.l.d(strEncode, "encode(...)");
        return strEncode;
    }

    public static final String h(String str) {
        jc.l.e(str, "<this>");
        return ef.n.R0(str, ".");
    }

    public static final String i(ef.l lVar, String str) {
        jc.l.e(lVar, "<this>");
        jc.l.e(str, "text");
        ef.j jVarC = lVar.c(str);
        if (jVarC != null) {
            return (String) vb.m.b0(1, jVarC.a());
        }
        return null;
    }

    public static final String j(String str) {
        jc.l.e(str, "<this>");
        byte[] bytes = str.getBytes(ef.a.f6541a);
        jc.l.d(bytes, "getBytes(...)");
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(bytes);
        jc.l.d(bArrDigest, "digest(...)");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i10 = 0;
        for (byte b10 : bArrDigest) {
            i10++;
            if (i10 > 1) {
                sb.append((CharSequence) "");
            }
            sb.append((CharSequence) String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1)));
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static final String k(String str) {
        jc.l.e(str, "<this>");
        byte[] bytes = str.getBytes(ef.a.f6541a);
        jc.l.d(bytes, "getBytes(...)");
        StringBuilder sb = new StringBuilder();
        for (byte b10 : bytes) {
            sb.append(String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1)));
        }
        return sb.toString();
    }

    public static final String l(long j10) {
        if (j10 < 0) {
            return h0.i(j10, "negative! ");
        }
        if (j10 < 1024) {
            return j10 + "B";
        }
        if (j10 < 1048576) {
            return String.format("%.2fKB", Arrays.copyOf(new Object[]{Float.valueOf(j10 / 1024)}, 1));
        }
        if (j10 < 1073741824) {
            float f10 = 1024;
            return String.format("%.2fMB", Arrays.copyOf(new Object[]{Float.valueOf((j10 / f10) / f10)}, 1));
        }
        if (j10 < 1099511627776L) {
            float f11 = 1024;
            return String.format("%.2fGB", Arrays.copyOf(new Object[]{Float.valueOf(((j10 / f11) / f11) / f11)}, 1));
        }
        float f12 = 1024;
        return String.format("%.2fTB", Arrays.copyOf(new Object[]{Float.valueOf((((j10 / f12) / f12) / f12) / f12)}, 1));
    }

    public static final String m(String str) {
        jc.l.e(str, "<this>");
        return ef.n.V0(str, ".", str);
    }
}
