package b0;

import android.os.Trace;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v1 implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f1375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g2.o1 f1376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t1 f1380h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1381i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f1382j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f1383k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f1384l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c7.e1 f1385m;

    public v1(c7.e1 e1Var, int i10, long j10, w1 w1Var) {
        this.f1385m = e1Var;
        this.f1373a = i10;
        this.f1374b = j10;
        this.f1375c = w1Var;
        int i11 = ff.i.f7080b;
        this.f1384l = System.nanoTime() - ff.i.f7079a;
    }

    @Override // b0.y0
    public final void a() {
        this.f1381i = true;
    }

    public final boolean b(a aVar) {
        long j10;
        w1 w1Var;
        long j11;
        w1 w1Var2;
        long j12;
        long j13;
        List list;
        long j14 = aVar.f1169a;
        c7.e1 e1Var = this.f1385m;
        n0 n0Var = (n0) ((k0) e1Var.f3618b).f1282b.b();
        if (this.f1378f) {
            return false;
        }
        int iA = n0Var.a();
        int i10 = this.f1373a;
        if (i10 < 0 || i10 >= iA) {
            return false;
        }
        Object objC = n0Var.c(i10);
        this.f1382j = Math.max(0L, j14 - System.nanoTime());
        int i11 = ff.i.f7080b;
        this.f1384l = System.nanoTime() - ff.i.f7079a;
        this.f1383k = 0L;
        g2.o1 o1Var = this.f1376d;
        w1 w1Var3 = this.f1375c;
        if (o1Var != null) {
            j12 = j14;
            j10 = 0;
            w1Var2 = w1Var3;
        } else {
            j10 = 0;
            long j15 = this.f1382j;
            long j16 = w1Var3.J(objC).f1204a;
            if ((!this.f1381i || j15 <= 0) && j16 >= j15) {
                return true;
            }
            Trace.beginSection("compose:lazy:prefetch:compose");
            try {
                if (this.f1376d != null) {
                    x.a.a("Request was already composed!");
                }
                Object objB = n0Var.b(i10);
                this.f1376d = ((g2.q1) e1Var.f3619c).a().f(((k0) e1Var.f3618b).a(i10, objB, objC), objB);
                Trace.endSection();
                e();
                long j17 = this.f1383k;
                c cVar = (c) w1Var3.f1395c;
                long j18 = cVar.f1204a;
                if (j18 == 0) {
                    j11 = j17;
                    w1Var = w1Var3;
                } else {
                    long j19 = 4;
                    w1Var = w1Var3;
                    j11 = (j17 / j19) + ((j18 / j19) * ((long) 3));
                }
                cVar.f1204a = j11;
                w1Var2 = w1Var;
                c cVarJ = w1Var2.J(objC);
                long j20 = cVarJ.f1204a;
                if (j20 == 0) {
                    j12 = j14;
                } else {
                    long j21 = 4;
                    j12 = j14;
                    j17 = (j17 / j21) + ((j20 / j21) * ((long) 3));
                }
                cVarJ.f1204a = j17;
            } finally {
            }
        }
        if (!this.f1381i) {
            if (!this.f1379g) {
                if (this.f1382j <= j10) {
                    return true;
                }
                Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                try {
                    this.f1380h = d();
                    this.f1379g = true;
                } finally {
                }
            }
            t1 t1Var = this.f1380h;
            if (t1Var != null) {
                List[] listArr = (List[]) t1Var.f1352d;
                int i12 = t1Var.f1349a;
                List list2 = (List) t1Var.f1351c;
                if (i12 < list2.size()) {
                    if (((v1) t1Var.f1353e).f1378f) {
                        x.a.c("Should not execute nested prefetch on canceled request");
                    }
                    Trace.beginSection("compose:lazy:prefetch:nested");
                    while (t1Var.f1349a < list2.size()) {
                        try {
                            if (listArr[t1Var.f1349a] == null) {
                                long j22 = j10;
                                if (Math.max(j22, j12 - System.nanoTime()) <= j22) {
                                    return true;
                                }
                                int i13 = t1Var.f1349a;
                                z0 z0Var = (z0) list2.get(i13);
                                ic.k kVar = z0Var.f1415a;
                                if (kVar == null) {
                                    list = vb.r.f22819a;
                                } else {
                                    x0 x0Var = new x0(z0Var);
                                    kVar.a(x0Var);
                                    list = x0Var.f1403a;
                                }
                                listArr[i13] = list;
                            }
                            List list3 = listArr[t1Var.f1349a];
                            jc.l.b(list3);
                            while (t1Var.f1350b < list3.size()) {
                                if (((v1) list3.get(t1Var.f1350b)).b(aVar)) {
                                    return true;
                                }
                                t1Var.f1350b++;
                            }
                            t1Var.f1350b = 0;
                            t1Var.f1349a++;
                            j10 = 0;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            e();
        }
        if (this.f1377e) {
            return false;
        }
        long j23 = this.f1374b;
        if (f3.a.k(j23)) {
            return false;
        }
        long j24 = this.f1382j;
        long j25 = w1Var2.J(objC).f1205b;
        if ((!this.f1381i || j24 <= 0) && j25 >= j24) {
            return true;
        }
        Trace.beginSection("compose:lazy:prefetch:measure");
        try {
            c(j23);
            Trace.endSection();
            e();
            long j26 = this.f1383k;
            c cVar2 = (c) w1Var2.f1395c;
            long j27 = cVar2.f1205b;
            if (j27 == 0) {
                j13 = j26;
            } else {
                long j28 = 4;
                j13 = (j26 / j28) + ((j27 / j28) * ((long) 3));
            }
            cVar2.f1205b = j13;
            c cVarJ2 = w1Var2.J(objC);
            long j29 = cVarJ2.f1205b;
            if (j29 != 0) {
                long j30 = 4;
                j26 = (j26 / j30) + ((j29 / j30) * ((long) 3));
            }
            cVarJ2.f1205b = j26;
            return false;
        } finally {
        }
    }

    public final void c(long j10) {
        if (this.f1378f) {
            x.a.a("Callers should check whether the request is still valid before calling performMeasure()");
        }
        if (this.f1377e) {
            x.a.a("Request was already measured!");
        }
        this.f1377e = true;
        g2.o1 o1Var = this.f1376d;
        if (o1Var == null) {
            x.a.b("performComposition() must be called before performMeasure()");
            throw new ce.j0();
        }
        int iB = o1Var.b();
        for (int i10 = 0; i10 < iB; i10++) {
            o1Var.d(i10, j10);
        }
    }

    @Override // b0.y0
    public final void cancel() {
        if (this.f1378f) {
            return;
        }
        this.f1378f = true;
        g2.o1 o1Var = this.f1376d;
        if (o1Var != null) {
            o1Var.a();
        }
        this.f1376d = null;
    }

    public final t1 d() {
        g2.o1 o1Var = this.f1376d;
        if (o1Var == null) {
            x.a.b("Should precompose before resolving nested prefetch states");
            throw new ce.j0();
        }
        jc.y yVar = new jc.y();
        o1Var.c(new u1(yVar, 0));
        List list = (List) yVar.f10838a;
        if (list == null) {
            return null;
        }
        t1 t1Var = new t1();
        t1Var.f1353e = this;
        t1Var.f1351c = list;
        t1Var.f1352d = new List[list.size()];
        if (list.isEmpty()) {
            x.a.a("NestedPrefetchController shouldn't be created with no states");
        }
        return t1Var;
    }

    public final void e() {
        int i10 = ff.i.f7080b;
        long jNanoTime = System.nanoTime() - ff.i.f7079a;
        long j10 = this.f1384l;
        ff.c cVar = ff.c.NANOSECONDS;
        jc.l.e(cVar, "unit");
        long jN = 0;
        long j11 = Long.MAX_VALUE;
        if (((j10 - 1) | 1) == Long.MAX_VALUE) {
            if (jNanoTime == j10) {
                int i11 = ff.a.f7057d;
            } else {
                jN = ff.a.i(j10 < 0 ? ff.a.f7056c : ff.a.f7055b);
            }
        } else if (((jNanoTime - 1) | 1) == Long.MAX_VALUE) {
            jN = jNanoTime < 0 ? ff.a.f7056c : ff.a.f7055b;
        } else {
            long j12 = jNanoTime - j10;
            if (((~(j12 ^ j10)) & (j12 ^ jNanoTime)) < 0) {
                ff.c cVar2 = ff.c.MILLISECONDS;
                if (cVar.compareTo(cVar2) < 0) {
                    long jC = ff.f.c(1L, cVar2, cVar);
                    long j13 = (jNanoTime / jC) - (j10 / jC);
                    long j14 = (jNanoTime % jC) - (j10 % jC);
                    int i12 = ff.a.f7057d;
                    jN = ff.a.g(ff.f.n(j13, cVar2), ff.f.n(j14, cVar));
                } else {
                    jN = ff.a.i(j12 < 0 ? ff.a.f7056c : ff.a.f7055b);
                }
            } else {
                jN = ff.f.n(j12, cVar);
            }
        }
        long j15 = jN >> 1;
        int i13 = ff.a.f7057d;
        if ((1 & ((int) jN)) == 0) {
            j11 = j15;
        } else if (j15 <= 9223372036854L) {
            j11 = j15 < -9223372036854L ? Long.MIN_VALUE : j15 * ((long) 1000000);
        }
        this.f1383k = j11;
        this.f1382j -= j11;
        this.f1384l = jNanoTime;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.f1373a);
        sb.append(", constraints = ");
        sb.append((Object) f3.a.l(this.f1374b));
        sb.append(", isComposed = ");
        sb.append(this.f1376d != null);
        sb.append(", isMeasured = ");
        sb.append(this.f1377e);
        sb.append(", isCanceled = ");
        sb.append(this.f1378f);
        sb.append(" }");
        return sb.toString();
    }
}
