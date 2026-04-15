package y4;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import zg.p;
import zg.r;
import zg.s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i implements zg.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f25508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f25509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f25510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f25511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f25512f;

    public i(p pVar, yg.c cVar) {
        jc.l.e(cVar, "taskRunner");
        this.f25509c = pVar;
        this.f25510d = cVar;
        this.f25507a = TimeUnit.MILLISECONDS.toNanos(250L);
        this.f25508b = Long.MIN_VALUE;
        this.f25511e = new CopyOnWriteArrayList();
        this.f25512f = new LinkedBlockingDeque();
    }

    @Override // zg.h
    public zg.o a() throws IOException {
        r rVarK;
        long j10;
        r rVar;
        IOException iOException = null;
        while (true) {
            try {
                if (((CopyOnWriteArrayList) this.f25511e).isEmpty() && !((p) this.f25509c).a(null)) {
                    b();
                    jc.l.b(iOException);
                    throw iOException;
                }
                if (((p) this.f25509c).f26912k.f26883p) {
                    throw new IOException("Canceled");
                }
                xa.h hVar = ((yg.c) this.f25510d).f26355a;
                long jNanoTime = System.nanoTime();
                long j11 = this.f25508b - jNanoTime;
                if (((CopyOnWriteArrayList) this.f25511e).isEmpty() || j11 <= 0) {
                    rVarK = k();
                    j10 = this.f25507a;
                    this.f25508b = jNanoTime + j10;
                } else {
                    j10 = j11;
                    rVarK = null;
                }
                if (rVarK == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f25511e;
                    if (copyOnWriteArrayList.isEmpty() || (rVar = (r) ((LinkedBlockingDeque) this.f25512f).poll(j10, timeUnit)) == null) {
                        rVarK = null;
                    } else {
                        copyOnWriteArrayList.remove(rVar.f26919a);
                        rVarK = rVar;
                    }
                    if (rVarK == null) {
                    }
                }
                boolean z10 = false;
                if (rVarK.f26920b == null && rVarK.f26921c == null) {
                    b();
                    if (!rVarK.f26919a.a()) {
                        rVarK = rVarK.f26919a.g();
                    }
                    if (rVarK.f26920b == null && rVarK.f26921c == null) {
                        z10 = true;
                    }
                    if (z10) {
                        return rVarK.f26919a.c();
                    }
                }
                Throwable th2 = rVarK.f26921c;
                if (th2 != null) {
                    if (!(th2 instanceof IOException)) {
                        throw th2;
                    }
                    if (iOException == null) {
                        iOException = (IOException) th2;
                    } else {
                        ub.a.a(iOException, th2);
                    }
                }
                s sVar = rVarK.f26920b;
                if (sVar != null) {
                    ((p) this.f25509c).f26917p.addFirst(sVar);
                }
            } finally {
                b();
            }
        }
    }

    public void b() {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f25511e;
        Iterator it = copyOnWriteArrayList.iterator();
        jc.l.d(it, "iterator(...)");
        while (it.hasNext()) {
            s sVar = (s) it.next();
            sVar.cancel();
            s sVarB = sVar.b();
            if (sVarB != null) {
                ((p) this.f25509c).f26917p.addLast(sVarB);
            }
        }
        copyOnWriteArrayList.clear();
    }

    public i c(long j10, z4.m mVar) throws j5.b {
        long jL;
        long jL2;
        h hVarD = ((z4.m) this.f25510d).d();
        h hVarD2 = mVar.d();
        if (hVarD == null) {
            return new i(j10, mVar, (z4.b) this.f25511e, (k5.e) this.f25509c, this.f25508b, hVarD);
        }
        if (!hVarD.s()) {
            return new i(j10, mVar, (z4.b) this.f25511e, (k5.e) this.f25509c, this.f25508b, hVarD2);
        }
        long jX = hVarD.x(j10);
        if (jX == 0) {
            return new i(j10, mVar, (z4.b) this.f25511e, (k5.e) this.f25509c, this.f25508b, hVarD2);
        }
        p4.c.j(hVarD2);
        long jV = hVarD.v();
        long jB = hVarD.b(jV);
        long j11 = jX + jV;
        long j12 = j11 - 1;
        long jC = hVarD.c(j12, j10) + hVarD.b(j12);
        long jV2 = hVarD2.v();
        long jB2 = hVarD2.b(jV2);
        long j13 = this.f25508b;
        if (jC == jB2) {
            jL = j11 - jV2;
        } else {
            if (jC < jB2) {
                throw new j5.b();
            }
            if (jB2 < jB) {
                jL2 = j13 - (hVarD2.l(jB, j10) - jV);
                return new i(j10, mVar, (z4.b) this.f25511e, (k5.e) this.f25509c, jL2, hVarD2);
            }
            jL = hVarD.l(jB2, j10) - jV2;
        }
        jL2 = jL + j13;
        return new i(j10, mVar, (z4.b) this.f25511e, (k5.e) this.f25509c, jL2, hVarD2);
    }

    public long d(long j10) {
        h hVar = (h) this.f25512f;
        p4.c.j(hVar);
        return hVar.e(this.f25507a, j10) + this.f25508b;
    }

    public long e(long j10) {
        long jD = d(j10);
        h hVar = (h) this.f25512f;
        p4.c.j(hVar);
        return (hVar.y(this.f25507a, j10) + jD) - 1;
    }

    @Override // zg.h
    public p f() {
        return (p) this.f25509c;
    }

    public long g() {
        h hVar = (h) this.f25512f;
        p4.c.j(hVar);
        return hVar.x(this.f25507a);
    }

    public long h(long j10) {
        long jI = i(j10);
        h hVar = (h) this.f25512f;
        p4.c.j(hVar);
        return hVar.c(j10 - this.f25508b, this.f25507a) + jI;
    }

    public long i(long j10) {
        h hVar = (h) this.f25512f;
        p4.c.j(hVar);
        return hVar.b(j10 - this.f25508b);
    }

    public boolean j(long j10, long j11) {
        h hVar = (h) this.f25512f;
        p4.c.j(hVar);
        return hVar.s() || j11 == -9223372036854775807L || h(j10) <= j11;
    }

    public r k() {
        s iVar;
        p pVar = (p) this.f25509c;
        if (pVar.a(null)) {
            try {
                iVar = pVar.b();
            } catch (Throwable th2) {
                iVar = new zg.i(th2);
            }
            if (iVar.a()) {
                return new r(iVar, (Throwable) null, 6);
            }
            if (iVar instanceof zg.i) {
                return ((zg.i) iVar).f26860a;
            }
            ((CopyOnWriteArrayList) this.f25511e).add(iVar);
            ((yg.c) this.f25510d).d().d(new zg.j(wg.g.f24232b + " connect " + pVar.f26910i.f21716h.h(), iVar, this), 0L);
        }
        return null;
    }

    public i(long j10, z4.m mVar, z4.b bVar, k5.e eVar, long j11, h hVar) {
        this.f25507a = j10;
        this.f25510d = mVar;
        this.f25511e = bVar;
        this.f25508b = j11;
        this.f25509c = eVar;
        this.f25512f = hVar;
    }
}
