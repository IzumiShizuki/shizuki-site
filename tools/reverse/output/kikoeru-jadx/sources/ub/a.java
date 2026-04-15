package ub;

import ce.j0;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zb.a f21525a = zb.a.f26667a;

    public static void a(Throwable th2, Throwable th3) {
        jc.l.e(th2, "<this>");
        jc.l.e(th3, "exception");
        if (th2 != th3) {
            Integer num = dc.a.f5863a;
            if (num == null || num.intValue() >= 19) {
                th2.addSuppressed(th3);
                return;
            }
            Method method = cc.a.f3887a;
            if (method != null) {
                method.invoke(th2, th3);
            }
        }
    }

    public static final m b(Throwable th2) {
        jc.l.e(th2, "exception");
        return new m(th2);
    }

    public static h c(i iVar, ic.a aVar) {
        x xVar = x.f21562a;
        int iOrdinal = iVar.ordinal();
        if (iOrdinal == 0) {
            return new p(aVar);
        }
        if (iOrdinal == 1) {
            o oVar = new o();
            oVar.f21548a = aVar;
            oVar.f21549b = xVar;
            return oVar;
        }
        if (iOrdinal != 2) {
            throw new j0();
        }
        b0 b0Var = new b0();
        b0Var.f21530a = aVar;
        b0Var.f21531b = xVar;
        return b0Var;
    }

    public static p d(ic.a aVar) {
        jc.l.e(aVar, "initializer");
        return new p(aVar);
    }

    public static String e(Throwable th2) {
        jc.l.e(th2, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        jc.l.d(string, "toString(...)");
        return string;
    }

    public static final void f(Object obj) {
        if (obj instanceof m) {
            throw ((m) obj).f21545a;
        }
    }

    public static final double g(long j10) {
        return ((j10 >>> 11) * ((double) 2048)) + (j10 & 2047);
    }

    public static final String h(int i10, long j10) {
        if (j10 >= 0) {
            gh.g.j(i10);
            String string = Long.toString(j10, i10);
            jc.l.d(string, "toString(...)");
            return string;
        }
        long j11 = i10;
        long j12 = ((j10 >>> 1) / j11) << 1;
        long j13 = j10 - (j12 * j11);
        if (j13 >= j11) {
            j13 -= j11;
            j12++;
        }
        gh.g.j(i10);
        String string2 = Long.toString(j12, i10);
        jc.l.d(string2, "toString(...)");
        gh.g.j(i10);
        String string3 = Long.toString(j13, i10);
        jc.l.d(string3, "toString(...)");
        return string2.concat(string3);
    }
}
