package m5;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import m4.j1;
import p4.c0;
import p4.v;
import ya.f0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n5.e f14652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f14653h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f14654i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f14655j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f14656k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f14657l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f14658m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f14659n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i0 f14660o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final v f14661p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f14662q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14663r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14664s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f14665t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public k5.l f14666u;

    public b(j1 j1Var, int[] iArr, n5.e eVar, long j10, long j11, long j12, i0 i0Var) {
        super(j1Var, iArr);
        if (j12 < j10) {
            p4.c.B("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j12 = j10;
        }
        this.f14652g = eVar;
        this.f14653h = j10 * 1000;
        this.f14654i = j11 * 1000;
        this.f14655j = j12 * 1000;
        this.f14656k = 1279;
        this.f14657l = 719;
        this.f14658m = 0.7f;
        this.f14659n = 0.75f;
        this.f14660o = i0.q(i0Var);
        this.f14661p = v.f16624a;
        this.f14662q = 1.0f;
        this.f14664s = 0;
        this.f14665t = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            f0 f0Var = (f0) arrayList.get(i10);
            if (f0Var != null) {
                f0Var.a(new a(j10, jArr[i10]));
            }
        }
    }

    public static long x(List list) {
        if (!list.isEmpty()) {
            k5.l lVar = (k5.l) ya.q.k(list);
            long j10 = lVar.f11061g;
            if (j10 != -9223372036854775807L) {
                long j11 = lVar.f11062h;
                if (j11 != -9223372036854775807L) {
                    return j11 - j10;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // m5.r
    public final int c() {
        return this.f14663r;
    }

    @Override // m5.r
    public final void f(long j10, long j11, long j12, List list, k5.m[] mVarArr) {
        long jX;
        this.f14661p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = this.f14663r;
        if (i10 >= mVarArr.length || !mVarArr[i10].next()) {
            int length = mVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    jX = x(list);
                    break;
                }
                k5.m mVar = mVarArr[i11];
                if (mVar.next()) {
                    jX = mVar.c() - mVar.b();
                    break;
                }
                i11++;
            }
        } else {
            k5.m mVar2 = mVarArr[this.f14663r];
            jX = mVar2.c() - mVar2.b();
        }
        int i12 = this.f14664s;
        if (i12 == 0) {
            this.f14664s = 1;
            this.f14663r = w(jElapsedRealtime);
            return;
        }
        int i13 = this.f14663r;
        int iS = list.isEmpty() ? -1 : s(((k5.l) ya.q.k(list)).f11058d);
        if (iS != -1) {
            i12 = ((k5.l) ya.q.k(list)).f11059e;
            i13 = iS;
        }
        int iW = w(jElapsedRealtime);
        if (iW != i13 && !a(i13, jElapsedRealtime)) {
            m4.q[] qVarArr = this.f14670d;
            m4.q qVar = qVarArr[i13];
            m4.q qVar2 = qVarArr[iW];
            long jMin = this.f14653h;
            if (j12 != -9223372036854775807L) {
                jMin = Math.min((long) ((jX != -9223372036854775807L ? j12 - jX : j12) * this.f14659n), jMin);
            }
            int i14 = qVar2.f14540j;
            int i15 = qVar.f14540j;
            if ((i14 > i15 && j11 < jMin) || (i14 < i15 && j11 >= this.f14654i)) {
                iW = i13;
            }
        }
        if (iW != i13) {
            i12 = 3;
        }
        this.f14664s = i12;
        this.f14663r = iW;
    }

    @Override // m5.c, m5.r
    public final void h() {
        this.f14665t = -9223372036854775807L;
        this.f14666u = null;
    }

    @Override // m5.c, m5.r
    public final int j(long j10, List list) {
        int i10;
        int i11;
        this.f14661p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.f14665t;
        if (j11 != -9223372036854775807L && jElapsedRealtime - j11 < 1000 && (list.isEmpty() || ((k5.l) ya.q.k(list)).equals(this.f14666u))) {
            return list.size();
        }
        this.f14665t = jElapsedRealtime;
        this.f14666u = list.isEmpty() ? null : (k5.l) ya.q.k(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jC = c0.C(this.f14662q, ((k5.l) list.get(size - 1)).f11061g - j10);
        long j12 = this.f14655j;
        if (jC >= j12) {
            x(list);
            m4.q qVar = this.f14670d[w(jElapsedRealtime)];
            for (int i12 = 0; i12 < size; i12++) {
                k5.l lVar = (k5.l) list.get(i12);
                m4.q qVar2 = lVar.f11058d;
                if (c0.C(this.f14662q, lVar.f11061g - j10) >= j12 && qVar2.f14540j < qVar.f14540j && (i10 = qVar2.f14552v) != -1 && i10 <= this.f14657l && (i11 = qVar2.f14551u) != -1 && i11 <= this.f14656k && i10 < qVar.f14552v) {
                    return i12;
                }
            }
        }
        return size;
    }

    @Override // m5.c, m5.r
    public final void k() {
        this.f14666u = null;
    }

    @Override // m5.r
    public final int n() {
        return this.f14664s;
    }

    @Override // m5.c, m5.r
    public final void p(float f10) {
        this.f14662q = f10;
    }

    @Override // m5.r
    public final Object q() {
        return null;
    }

    public final int w(long j10) {
        long j11;
        n5.i iVar = (n5.i) this.f14652g;
        synchronized (iVar) {
            j11 = iVar.f15356k;
        }
        long j12 = (long) (j11 * this.f14658m);
        this.f14652g.getClass();
        long j13 = (long) (j12 / this.f14662q);
        if (!this.f14660o.isEmpty()) {
            int i10 = 1;
            while (i10 < this.f14660o.size() - 1 && ((a) this.f14660o.get(i10)).f14650a < j13) {
                i10++;
            }
            a aVar = (a) this.f14660o.get(i10 - 1);
            a aVar2 = (a) this.f14660o.get(i10);
            long j14 = aVar.f14650a;
            long j15 = aVar.f14651b;
            j13 = j15 + ((long) (((j13 - j14) / (aVar2.f14650a - j14)) * (aVar2.f14651b - j15)));
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f14668b; i12++) {
            if (j10 == Long.MIN_VALUE || !a(i12, j10)) {
                if (this.f14670d[i12].f14540j <= j13) {
                    return i12;
                }
                i11 = i12;
            }
        }
        return i11;
    }
}
