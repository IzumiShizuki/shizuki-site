package ch;

import b7.b1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import lh.f0;
import lh.g0;
import lh.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q implements ah.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f4236g = wg.g.j(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f4237h = wg.g.j(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zg.o f4238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ah.h f4239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f4240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile x f4241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ug.y f4242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f4243f;

    public q(ug.x xVar, zg.o oVar, ah.h hVar, p pVar) {
        jc.l.e(pVar, "http2Connection");
        this.f4238a = oVar;
        this.f4239b = hVar;
        this.f4240c = pVar;
        List list = xVar.f21925s;
        ug.y yVar = ug.y.f21938g;
        this.f4242e = list.contains(yVar) ? yVar : ug.y.f21937f;
    }

    @Override // ah.f
    public final void a() {
        x xVar = this.f4241d;
        jc.l.b(xVar);
        xVar.f4273i.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    @Override // ah.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            r5 = this;
            ch.x r0 = r5.f4241d
            r1 = 0
            if (r0 == 0) goto L21
            monitor-enter(r0)
            ch.v r2 = r0.f4272h     // Catch: java.lang.Throwable -> L17
            boolean r3 = r2.f4259b     // Catch: java.lang.Throwable -> L17
            r4 = 1
            if (r3 == 0) goto L19
            lh.f r2 = r2.f4261d     // Catch: java.lang.Throwable -> L17
            boolean r2 = r2.i()     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L19
            r2 = 1
            goto L1a
        L17:
            r1 = move-exception
            goto L1f
        L19:
            r2 = 0
        L1a:
            monitor-exit(r0)
            if (r2 != r4) goto L1e
            return r4
        L1e:
            return r1
        L1f:
            monitor-exit(r0)
            throw r1
        L21:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.q.b():boolean");
    }

    @Override // ah.f
    public final h0 c(ug.d0 d0Var) {
        x xVar = this.f4241d;
        jc.l.b(xVar);
        return xVar.f4272h;
    }

    @Override // ah.f
    public final void cancel() {
        this.f4243f = true;
        x xVar = this.f4241d;
        if (xVar != null) {
            xVar.e(b.f4152h);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    @Override // ah.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ug.c0 d(boolean r11) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.q.d(boolean):ug.c0");
    }

    @Override // ah.f
    public final long e(ug.d0 d0Var) {
        if (ah.g.a(d0Var)) {
            return wg.g.d(d0Var);
        }
        return 0L;
    }

    @Override // ah.f
    public final void f() {
        this.f4240c.flush();
    }

    @Override // ah.f
    public final g0 g() {
        x xVar = this.f4241d;
        jc.l.b(xVar);
        return xVar;
    }

    @Override // ah.f
    public final void h(b1 b1Var) throws IOException {
        int i10;
        x xVar;
        boolean z10;
        jc.l.e(b1Var, "request");
        if (this.f4241d != null) {
            return;
        }
        boolean z11 = ((ug.b0) b1Var.f1653e) != null;
        ug.r rVar = (ug.r) b1Var.f1652d;
        ArrayList arrayList = new ArrayList(rVar.size() + 4);
        arrayList.add(new d((String) b1Var.f1651c, d.f4161f));
        lh.i iVar = d.f4162g;
        ug.t tVar = (ug.t) b1Var.f1650b;
        jc.l.e(tVar, "url");
        String strB = tVar.b();
        String strD = tVar.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new d(strB, iVar));
        String strA = ((ug.r) b1Var.f1652d).a("Host");
        if (strA != null) {
            arrayList.add(new d(strA, d.f4164i));
        }
        arrayList.add(new d(tVar.f21869a, d.f4163h));
        int size = rVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            String strI = rVar.i(i11);
            Locale locale = Locale.US;
            jc.l.d(locale, "US");
            String lowerCase = strI.toLowerCase(locale);
            jc.l.d(lowerCase, "toLowerCase(...)");
            if (!f4236g.contains(lowerCase) || (lowerCase.equals("te") && rVar.k(i11).equals("trailers"))) {
                arrayList.add(new d(lowerCase, rVar.k(i11)));
            }
        }
        p pVar = this.f4240c;
        pVar.getClass();
        boolean z12 = !z11;
        synchronized (pVar.f4233w) {
            synchronized (pVar) {
                try {
                    if (pVar.f4215e > 1073741823) {
                        pVar.n(b.f4151g);
                    }
                    if (pVar.f4216f) {
                        throw new a();
                    }
                    i10 = pVar.f4215e;
                    pVar.f4215e = i10 + 2;
                    xVar = new x(i10, pVar, z12, false, null);
                    z10 = !z11 || pVar.f4230t >= pVar.f4231u || xVar.f4268d >= xVar.f4269e;
                    if (xVar.h()) {
                        pVar.f4212b.put(Integer.valueOf(i10), xVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            pVar.f4233w.n(z12, i10, arrayList);
        }
        if (z10) {
            pVar.f4233w.flush();
        }
        this.f4241d = xVar;
        if (this.f4243f) {
            x xVar2 = this.f4241d;
            jc.l.b(xVar2);
            xVar2.e(b.f4152h);
            throw new IOException("Canceled");
        }
        x xVar3 = this.f4241d;
        jc.l.b(xVar3);
        w wVar = xVar3.f4274j;
        long j10 = this.f4239b.f383g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        wVar.g(j10);
        x xVar4 = this.f4241d;
        jc.l.b(xVar4);
        xVar4.f4275k.g(this.f4239b.f384h);
    }

    @Override // ah.f
    public final ah.e i() {
        return this.f4238a;
    }

    @Override // ah.f
    public final f0 j(long j10, b1 b1Var) {
        jc.l.e(b1Var, "request");
        x xVar = this.f4241d;
        jc.l.b(xVar);
        return xVar.f4273i;
    }
}
