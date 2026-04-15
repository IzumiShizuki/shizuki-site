package j5;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j1 implements b0, n5.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s4.m f10311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s4.g f10312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s4.f0 f10313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m3.l f10314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ah.j f10315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o1 f10316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f10317g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f10318h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n5.o f10319i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m4.q f10320j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f10321k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f10322l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f10323m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10324n;

    public j1(s4.m mVar, s4.g gVar, s4.f0 f0Var, m4.q qVar, long j10, m3.l lVar, ah.j jVar, boolean z10, o5.a aVar) {
        this.f10311a = mVar;
        this.f10312b = gVar;
        this.f10313c = f0Var;
        this.f10320j = qVar;
        this.f10318h = j10;
        this.f10314d = lVar;
        this.f10315e = jVar;
        this.f10321k = z10;
        this.f10316f = new o1(new m4.j1("", qVar));
        this.f10319i = aVar != null ? new n5.o(aVar) : new n5.o("SingleSampleMediaPeriod");
    }

    @Override // j5.e1
    public final long d() {
        return (this.f10322l || this.f10319i.d()) ? Long.MIN_VALUE : 0L;
    }

    @Override // j5.e1
    public final boolean e(v4.f0 f0Var) {
        if (this.f10322l) {
            return false;
        }
        n5.o oVar = this.f10319i;
        if (oVar.d() || oVar.c()) {
            return false;
        }
        s4.h hVarQ = this.f10312b.q();
        s4.f0 f0Var2 = this.f10313c;
        if (f0Var2 != null) {
            hVarQ.t(f0Var2);
        }
        i1 i1Var = new i1(hVarQ, this.f10311a);
        this.f10314d.getClass();
        oVar.f(i1Var, this, 3);
        return true;
    }

    @Override // j5.b0
    public final void g(a0 a0Var, long j10) {
        a0Var.a(this);
    }

    @Override // j5.b0
    public final long h(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f10317g;
            if (i10 >= arrayList.size()) {
                return j10;
            }
            h1 h1Var = (h1) arrayList.get(i10);
            if (h1Var.f10296a == 2) {
                h1Var.f10296a = 1;
            }
            i10++;
        }
    }

    @Override // n5.j
    public final void k(n5.l lVar, long j10, long j11) {
        i1 i1Var = (i1) lVar;
        this.f10324n = (int) i1Var.f10306b.f19398b;
        byte[] bArr = i1Var.f10307c;
        bArr.getClass();
        this.f10323m = bArr;
        this.f10322l = true;
        Uri uri = i1Var.f10306b.f19399c;
        u uVar = new u(j11);
        this.f10314d.getClass();
        this.f10315e.B(uVar, 1, -1, this.f10320j, 0, null, 0L, this.f10318h);
    }

    @Override // j5.b0
    public final long l(m5.r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            c1 c1Var = c1VarArr[i10];
            ArrayList arrayList = this.f10317g;
            if (c1Var != null && (rVarArr[i10] == null || !zArr[i10])) {
                arrayList.remove(c1Var);
                c1VarArr[i10] = null;
            }
            if (c1VarArr[i10] == null && rVarArr[i10] != null) {
                h1 h1Var = new h1(this);
                arrayList.add(h1Var);
                c1VarArr[i10] = h1Var;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // j5.e1
    public final boolean m() {
        return this.f10319i.d();
    }

    @Override // j5.b0
    public final long p() {
        return -9223372036854775807L;
    }

    @Override // j5.b0
    public final o1 q() {
        return this.f10316f;
    }

    @Override // n5.j
    public final void r(n5.l lVar, long j10, long j11, int i10) {
        u uVar;
        i1 i1Var = (i1) lVar;
        s4.d0 d0Var = i1Var.f10306b;
        if (i10 == 0) {
            uVar = new u(i1Var.f10305a);
        } else {
            Uri uri = d0Var.f19399c;
            uVar = new u(j11);
        }
        this.f10315e.E(uVar, 1, -1, this.f10320j, 0, null, 0L, this.f10318h, i10);
    }

    @Override // n5.j
    public final void s(n5.l lVar, long j10, long j11, boolean z10) {
        Uri uri = ((i1) lVar).f10306b.f19399c;
        u uVar = new u(j11);
        this.f10314d.getClass();
        this.f10315e.A(uVar, 1, -1, null, 0, null, 0L, this.f10318h);
    }

    @Override // j5.e1
    public final long t() {
        return this.f10322l ? Long.MIN_VALUE : 0L;
    }

    @Override // n5.j
    public final b7.q0 v(n5.l lVar, long j10, long j11, IOException iOException, int i10) {
        long jMin;
        b7.q0 q0Var;
        Uri uri = ((i1) lVar).f10306b.f19399c;
        u uVar = new u(j11);
        int i11 = p4.c0.f16548a;
        this.f10314d.getClass();
        if ((iOException instanceof m4.p0) || (iOException instanceof FileNotFoundException) || (iOException instanceof s4.v) || (iOException instanceof n5.n)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i12 = s4.j.f19426b;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof s4.j) && ((s4.j) cause).f19427a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i10 - 1) * 1000, 5000);
        boolean z10 = jMin == -9223372036854775807L || i10 >= 3;
        if (this.f10321k && z10) {
            p4.c.C("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f10322l = true;
            q0Var = n5.o.f15370e;
        } else {
            q0Var = jMin != -9223372036854775807L ? new b7.q0(0, false, jMin) : n5.o.f15371f;
        }
        b7.q0 q0Var2 = q0Var;
        this.f10315e.C(uVar, 1, -1, this.f10320j, 0, null, 0L, this.f10318h, iOException, !q0Var2.a());
        return q0Var2;
    }

    @Override // j5.b0
    public final void f() {
    }

    @Override // j5.b0
    public final void i(long j10) {
    }

    @Override // j5.e1
    public final void w(long j10) {
    }

    @Override // j5.b0
    public final long o(long j10, v4.b1 b1Var) {
        return j10;
    }
}
