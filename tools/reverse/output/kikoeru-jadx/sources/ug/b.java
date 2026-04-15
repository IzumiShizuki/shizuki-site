package ug;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements p, i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f21722c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f21723d = new b();

    public static final l b(b bVar, String str) {
        l lVar = new l(str);
        l.f21811d.put(str, lVar);
        return lVar;
    }

    public static final void c(StringBuilder sb, List list) {
        oc.b bVarD = nh.b.D(nh.b.E(0, list.size()), 2);
        int i10 = bVarD.f16307a;
        int i11 = bVarD.f16308b;
        int i12 = bVarD.f16309c;
        if ((i12 <= 0 || i10 > i11) && (i12 >= 0 || i11 > i10)) {
            return;
        }
        while (true) {
            String str = (String) list.get(i10);
            String str2 = (String) list.get(i10 + 1);
            if (i10 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i10 == i11) {
                return;
            } else {
                i10 += i12;
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static h0 e(String str) {
        jc.l.e(str, "javaName");
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return h0.f21800e;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return h0.f21799d;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return h0.f21798c;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return h0.f21801f;
            }
        } else if (str.equals("SSLv3")) {
            return h0.f21802g;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public static y f(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return y.f21934c;
        }
        if (str.equals("http/1.1")) {
            return y.f21935d;
        }
        if (str.equals("h2_prior_knowledge")) {
            return y.f21938g;
        }
        if (str.equals("h2")) {
            return y.f21937f;
        }
        if (str.equals("spdy/3.1")) {
            return y.f21936e;
        }
        if (str.equals("quic")) {
            return y.f21939h;
        }
        if (ef.u.k0(str, "h3", false)) {
            return y.f21940i;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    @Override // ug.p
    public List a(String str) throws UnknownHostException {
        jc.l.e(str, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            jc.l.d(allByName, "getAllByName(...)");
            return vb.l.M0(allByName);
        } catch (NullPointerException e10) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e10);
            throw unknownHostException;
        }
    }

    public synchronized l d(String str) {
        l lVar;
        String strConcat;
        try {
            jc.l.e(str, "javaName");
            LinkedHashMap linkedHashMap = l.f21811d;
            lVar = (l) linkedHashMap.get(str);
            if (lVar == null) {
                if (ef.u.k0(str, "TLS_", false)) {
                    String strSubstring = str.substring(4);
                    jc.l.d(strSubstring, "substring(...)");
                    strConcat = "SSL_".concat(strSubstring);
                } else if (ef.u.k0(str, "SSL_", false)) {
                    String strSubstring2 = str.substring(4);
                    jc.l.d(strSubstring2, "substring(...)");
                    strConcat = "TLS_".concat(strSubstring2);
                } else {
                    strConcat = str;
                }
                lVar = (l) linkedHashMap.get(strConcat);
                if (lVar == null) {
                    lVar = new l(str);
                }
                linkedHashMap.put(str, lVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return lVar;
    }
}
