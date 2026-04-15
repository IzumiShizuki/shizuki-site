package n5;

import android.content.Context;
import android.os.Handler;
import b7.b1;
import b7.v2;
import j5.d0;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p4.v;
import s4.f0;
import ya.a1;
import ya.i0;
import ya.k0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i implements e, f0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a1 f15339n = i0.t(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a1 f15340o = i0.t(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a1 f15341p = i0.t(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a1 f15342q = i0.t(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a1 f15343r = i0.t(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a1 f15344s = i0.t(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static i f15345t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f15346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f15347b = new d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f15348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f15350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f15352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f15353h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f15354i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f15355j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f15356k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f15357l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f15358m;

    public i(Context context, Map map, int i10, v vVar, boolean z10) {
        this.f15346a = k0.a(map);
        this.f15350e = new t(i10);
        this.f15348c = vVar;
        this.f15349d = z10;
        if (context == null) {
            this.f15358m = 0;
            this.f15356k = b(0);
            return;
        }
        p4.p pVarB = p4.p.b(context);
        int iC = pVarB.c();
        this.f15358m = iC;
        this.f15356k = b(iC);
        g gVar = new g(this);
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = (CopyOnWriteArrayList) pVarB.f16601c;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference(gVar));
        ((Handler) pVarB.f16600b).post(new b5.h(19, pVarB, gVar));
    }

    public final void a(Handler handler, w4.d dVar) {
        dVar.getClass();
        d dVar2 = this.f15347b;
        dVar2.getClass();
        CopyOnWriteArrayList<c> copyOnWriteArrayList = dVar2.f15326a;
        for (c cVar : copyOnWriteArrayList) {
            if (cVar.f15324b == dVar) {
                cVar.f15325c = true;
                copyOnWriteArrayList.remove(cVar);
            }
        }
        copyOnWriteArrayList.add(new c(handler, dVar));
    }

    public final long b(int i10) {
        Integer numValueOf = Integer.valueOf(i10);
        k0 k0Var = this.f15346a;
        Long l10 = (Long) k0Var.get(numValueOf);
        if (l10 == null) {
            l10 = (Long) k0Var.get(0);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    public final void c(int i10, long j10, long j11) {
        final int i11;
        final long j12;
        final long j13;
        if (i10 == 0 && j10 == 0 && j11 == this.f15357l) {
            return;
        }
        this.f15357l = j11;
        for (final c cVar : this.f15347b.f15326a) {
            if (cVar.f15325c) {
                i11 = i10;
                j12 = j10;
                j13 = j11;
            } else {
                i11 = i10;
                j12 = j10;
                j13 = j11;
                cVar.f15323a.post(new Runnable() { // from class: n5.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        w4.d dVar = cVar.f15324b;
                        b1 b1Var = dVar.f23352d;
                        w4.a aVarW = dVar.W(((i0) b1Var.f1653e).isEmpty() ? null : (d0) ya.q.k((i0) b1Var.f1653e));
                        dVar.a0(aVarW, 1006, new v2(aVarW, i11, j12, j13));
                    }
                });
            }
            i10 = i11;
            j10 = j12;
            j11 = j13;
        }
    }
}
