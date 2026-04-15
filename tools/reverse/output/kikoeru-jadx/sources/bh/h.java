package bh;

import b7.b1;
import ef.n;
import hd.q0;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.util.Arrays;
import jc.l;
import lh.a0;
import lh.f0;
import lh.g0;
import lh.h0;
import tc.b0;
import ua.j;
import ug.c0;
import ug.d0;
import ug.r;
import ug.t;
import ug.x;
import ug.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h implements ah.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r f3025f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f3026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ah.e f3027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f3028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f3030e;

    static {
        r rVar = r.f21859b;
        String[] strArr = (String[]) Arrays.copyOf(new String[]{"OkHttp-Response-Body", "Truncated"}, 2);
        l.e(strArr, "inputNamesAndValues");
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        int length = strArr2.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (strArr2[i11] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i11] = n.X0(strArr[i11]).toString();
        }
        int iX = gh.g.x(0, strArr2.length - 1, 2);
        if (iX >= 0) {
            while (true) {
                String str = strArr2[i10];
                String str2 = strArr2[i10 + 1];
                j.n(str);
                j.o(str2, str);
                if (i10 == iX) {
                    break;
                } else {
                    i10 += 2;
                }
            }
        }
        f3025f = new r(strArr2);
    }

    public h(x xVar, ah.e eVar, b0 b0Var) {
        l.e(b0Var, "socket");
        this.f3026a = xVar;
        this.f3027b = eVar;
        this.f3028c = b0Var;
        this.f3030e = new a((lh.b0) b0Var.f20619c);
    }

    @Override // ah.f
    public final void a() {
        ((a0) this.f3028c.f20620d).flush();
    }

    @Override // ah.f
    public final boolean b() {
        return this.f3029d == 6;
    }

    @Override // ah.f
    public final h0 c(d0 d0Var) {
        b1 b1Var = d0Var.f21756a;
        if (!ah.g.a(d0Var)) {
            return k((t) b1Var.f1650b, 0L);
        }
        String strA = d0Var.f21761f.a("Transfer-Encoding");
        if (strA == null) {
            strA = null;
        }
        if ("chunked".equalsIgnoreCase(strA)) {
            t tVar = (t) b1Var.f1650b;
            if (this.f3029d == 4) {
                this.f3029d = 5;
                return new d(this, tVar);
            }
            throw new IllegalStateException(("state: " + this.f3029d).toString());
        }
        long jD = wg.g.d(d0Var);
        if (jD != -1) {
            return k((t) b1Var.f1650b, jD);
        }
        t tVar2 = (t) b1Var.f1650b;
        if (this.f3029d != 4) {
            throw new IllegalStateException(("state: " + this.f3029d).toString());
        }
        this.f3029d = 5;
        this.f3027b.f();
        l.e(tVar2, "url");
        return new g(this, tVar2);
    }

    @Override // ah.f
    public final void cancel() {
        this.f3027b.cancel();
    }

    @Override // ah.f
    public final c0 d(boolean z10) {
        a aVar = this.f3030e;
        int i10 = this.f3029d;
        if (i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3) {
            throw new IllegalStateException(("state: " + this.f3029d).toString());
        }
        try {
            String strX = ((lh.h) aVar.f3008c).x(aVar.f3007b);
            aVar.f3007b -= (long) strX.length();
            ah.j jVarI = lc.b.I(strX);
            int i11 = jVarI.f390b;
            c0 c0Var = new c0();
            c0Var.f21730b = (y) jVarI.f391c;
            c0Var.f21731c = i11;
            c0Var.f21732d = (String) jVarI.f392d;
            q0 q0Var = new q0((byte) 0, 5);
            while (true) {
                String strX2 = ((lh.h) aVar.f3008c).x(aVar.f3007b);
                aVar.f3007b -= (long) strX2.length();
                if (strX2.length() == 0) {
                    break;
                }
                q0Var.h(strX2);
            }
            c0Var.c(q0Var.k());
            if (z10 && i11 == 100) {
                return null;
            }
            if (i11 == 100) {
                this.f3029d = 3;
                return c0Var;
            }
            if (102 > i11 || i11 >= 200) {
                this.f3029d = 4;
                return c0Var;
            }
            this.f3029d = 3;
            return c0Var;
        } catch (EOFException e10) {
            throw new IOException(j2.h0.x("unexpected end of stream on ", this.f3027b.h().f21794a.f21716h.h()), e10);
        }
    }

    @Override // ah.f
    public final long e(d0 d0Var) {
        if (!ah.g.a(d0Var)) {
            return 0L;
        }
        String strA = d0Var.f21761f.a("Transfer-Encoding");
        if (strA == null) {
            strA = null;
        }
        if ("chunked".equalsIgnoreCase(strA)) {
            return -1L;
        }
        return wg.g.d(d0Var);
    }

    @Override // ah.f
    public final void f() {
        ((a0) this.f3028c.f20620d).flush();
    }

    @Override // ah.f
    public final g0 g() {
        return this.f3028c;
    }

    @Override // ah.f
    public final void h(b1 b1Var) {
        l.e(b1Var, "request");
        Proxy.Type type = this.f3027b.h().f21795b.type();
        l.d(type, "type(...)");
        StringBuilder sb = new StringBuilder();
        sb.append((String) b1Var.f1651c);
        sb.append(' ');
        t tVar = (t) b1Var.f1650b;
        if (tVar.f() || type != Proxy.Type.HTTP) {
            String strB = tVar.b();
            String strD = tVar.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb.append(strB);
        } else {
            sb.append(tVar);
        }
        sb.append(" HTTP/1.1");
        l((r) b1Var.f1652d, sb.toString());
    }

    @Override // ah.f
    public final ah.e i() {
        return this.f3027b;
    }

    @Override // ah.f
    public final f0 j(long j10, b1 b1Var) {
        l.e(b1Var, "request");
        if ("chunked".equalsIgnoreCase(((r) b1Var.f1652d).a("Transfer-Encoding"))) {
            if (this.f3029d == 1) {
                this.f3029d = 2;
                return new c(this);
            }
            throw new IllegalStateException(("state: " + this.f3029d).toString());
        }
        if (j10 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f3029d == 1) {
            this.f3029d = 2;
            return new f(this);
        }
        throw new IllegalStateException(("state: " + this.f3029d).toString());
    }

    public final e k(t tVar, long j10) {
        if (this.f3029d == 4) {
            this.f3029d = 5;
            return new e(this, tVar, j10);
        }
        throw new IllegalStateException(("state: " + this.f3029d).toString());
    }

    public final void l(r rVar, String str) {
        l.e(rVar, "headers");
        l.e(str, "requestLine");
        if (this.f3029d != 0) {
            throw new IllegalStateException(("state: " + this.f3029d).toString());
        }
        b0 b0Var = this.f3028c;
        a0 a0Var = (a0) b0Var.f20620d;
        a0 a0Var2 = (a0) b0Var.f20620d;
        a0Var.E(str);
        a0Var.E("\r\n");
        int size = rVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            a0Var2.E(rVar.i(i10));
            a0Var2.E(": ");
            a0Var2.E(rVar.k(i10));
            a0Var2.E("\r\n");
        }
        a0Var2.E("\r\n");
        this.f3029d = 1;
    }
}
