package wg;

import ef.n;
import hd.q0;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import jc.l;
import lh.h;
import lh.h0;
import ua.j;
import ug.d0;
import ug.r;
import ug.t;
import ug.x;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeZone f24231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f24232b;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        l.b(timeZone);
        f24231a = timeZone;
        f24232b = n.G0(n.F0(x.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(t tVar, t tVar2) {
        l.e(tVar, "<this>");
        l.e(tVar2, "other");
        return l.a(tVar.f21872d, tVar2.f21872d) && tVar.f21873e == tVar2.f21873e && l.a(tVar.f21869a, tVar2.f21869a);
    }

    public static final void b(Socket socket) {
        l.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!l.a(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final String c(String str, Object... objArr) {
        l.e(str, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final long d(d0 d0Var) {
        String strA = d0Var.f21761f.a("Content-Length");
        if (strA == null) {
            return -1L;
        }
        byte[] bArr = e.f24227a;
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final Charset e(h hVar, Charset charset) {
        l.e(hVar, "<this>");
        l.e(charset, "default");
        int iK = hVar.K(e.f24228b);
        if (iK == -1) {
            return charset;
        }
        if (iK == 0) {
            return ef.a.f6541a;
        }
        if (iK == 1) {
            return ef.a.f6542b;
        }
        if (iK == 2) {
            Charset charset2 = ef.a.f6541a;
            Charset charset3 = ef.a.f6544d;
            if (charset3 != null) {
                return charset3;
            }
            Charset charsetForName = Charset.forName("UTF-32LE");
            l.d(charsetForName, "forName(...)");
            ef.a.f6544d = charsetForName;
            return charsetForName;
        }
        if (iK == 3) {
            return ef.a.f6543c;
        }
        if (iK != 4) {
            throw new AssertionError();
        }
        Charset charset4 = ef.a.f6541a;
        Charset charset5 = ef.a.f6545e;
        if (charset5 != null) {
            return charset5;
        }
        Charset charsetForName2 = Charset.forName("UTF-32BE");
        l.d(charsetForName2, "forName(...)");
        ef.a.f6545e = charsetForName2;
        return charsetForName2;
    }

    public static final boolean f(h0 h0Var, int i10) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        l.e(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = h0Var.a().e() ? h0Var.a().c() - jNanoTime : Long.MAX_VALUE;
        h0Var.a().d(Math.min(jC, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            lh.f fVar = new lh.f();
            while (h0Var.W(fVar, 8192L) != -1) {
                fVar.skip(fVar.f12571b);
            }
            if (jC == Long.MAX_VALUE) {
                h0Var.a().a();
                return true;
            }
            h0Var.a().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                h0Var.a().a();
                return false;
            }
            h0Var.a().d(jNanoTime + jC);
            return false;
        } catch (Throwable th2) {
            if (jC == Long.MAX_VALUE) {
                h0Var.a().a();
            } else {
                h0Var.a().d(jNanoTime + jC);
            }
            throw th2;
        }
    }

    public static final r g(List list) {
        q0 q0Var = new q0((byte) 0, 5);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ch.d dVar = (ch.d) it.next();
            j.h(q0Var, dVar.f4165a.s(), dVar.f4166b.s());
        }
        return q0Var.k();
    }

    public static final String h(t tVar, boolean z10) {
        l.e(tVar, "<this>");
        int i10 = tVar.f21873e;
        String strG = tVar.f21872d;
        if (n.n0(strG, ":", false)) {
            strG = a0.c.G(']', "[", strG);
        }
        if (!z10) {
            String str = tVar.f21869a;
            l.e(str, "scheme");
            if (i10 == (str.equals("http") ? 80 : str.equals("https") ? 443 : -1)) {
                return strG;
            }
        }
        return strG + ':' + i10;
    }

    public static final List i(List list) {
        l.e(list, "<this>");
        if (list.isEmpty()) {
            return vb.r.f22819a;
        }
        if (list.size() == 1) {
            List listSingletonList = Collections.singletonList(list.get(0));
            l.d(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        Object[] array = list.toArray();
        l.d(array, "toArray(...)");
        List listUnmodifiableList = Collections.unmodifiableList(vb.l.c0(array));
        l.d(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    public static final List j(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return vb.r.f22819a;
        }
        if (objArr.length == 1) {
            List listSingletonList = Collections.singletonList(objArr[0]);
            l.d(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        List listUnmodifiableList = Collections.unmodifiableList(vb.l.c0((Object[]) objArr.clone()));
        l.d(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }
}
