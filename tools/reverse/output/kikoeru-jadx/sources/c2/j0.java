package c2;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import ba.v0;
import hf.r1;
import i2.b2;
import i2.u1;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends j1.p implements x, f3.c, u1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f3296o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f3297p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object[] f3298q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public PointerInputEventHandler f3299r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public r1 f3300s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public l f3301t = e0.f3261a;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final z0.e f3302u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final z0.e f3303v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final z0.e f3304w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public l f3305x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f3306y;

    public j0(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.f3296o = obj;
        this.f3297p = obj2;
        this.f3298q = objArr;
        this.f3299r = pointerInputEventHandler;
        z0.e eVar = new z0.e(new i0[16]);
        this.f3302u = eVar;
        this.f3303v = eVar;
        this.f3304w = new z0.e(new i0[16]);
        this.f3306y = 0L;
    }

    public final Object B0(ic.n nVar, yb.c cVar) {
        hf.k kVar = new hf.k(1, ud.s.p(cVar));
        kVar.r();
        i0 i0Var = new i0(this, kVar);
        synchronized (this.f3303v) {
            this.f3302u.b(i0Var);
            new yb.j(ud.s.p(ud.s.k(nVar, i0Var, i0Var))).h(ub.a0.f21526a);
        }
        kVar.w(new a0.f0(7, i0Var));
        return kVar.q();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0020, B:17:0x0023, B:20:0x002f, B:22:0x0037, B:24:0x003b, B:25:0x0040, B:26:0x0043, B:28:0x004c, B:30:0x0054, B:32:0x0058), top: B:41:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C0(c2.l r7, c2.m r8) {
        /*
            r6 = this;
            z0.e r0 = r6.f3303v
            monitor-enter(r0)
            z0.e r1 = r6.f3304w     // Catch: java.lang.Throwable -> L6c
            z0.e r2 = r6.f3302u     // Catch: java.lang.Throwable -> L6c
            int r3 = r1.f26374c     // Catch: java.lang.Throwable -> L6c
            r1.d(r3, r2)     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r0)
            int r0 = r8.ordinal()     // Catch: java.lang.Throwable -> L21
            r1 = 0
            if (r0 == 0) goto L43
            r2 = 1
            if (r0 == r2) goto L23
            r2 = 2
            if (r0 != r2) goto L1b
            goto L43
        L1b:
            ce.j0 r7 = new ce.j0     // Catch: java.lang.Throwable -> L21
            r7.<init>()     // Catch: java.lang.Throwable -> L21
            throw r7     // Catch: java.lang.Throwable -> L21
        L21:
            r7 = move-exception
            goto L66
        L23:
            z0.e r0 = r6.f3304w     // Catch: java.lang.Throwable -> L21
            int r3 = r0.f26374c     // Catch: java.lang.Throwable -> L21
            int r3 = r3 - r2
            java.lang.Object[] r0 = r0.f26372a     // Catch: java.lang.Throwable -> L21
            int r2 = r0.length     // Catch: java.lang.Throwable -> L21
            if (r3 >= r2) goto L60
        L2d:
            if (r3 < 0) goto L60
            r2 = r0[r3]     // Catch: java.lang.Throwable -> L21
            c2.i0 r2 = (c2.i0) r2     // Catch: java.lang.Throwable -> L21
            c2.m r4 = r2.f3285d     // Catch: java.lang.Throwable -> L21
            if (r8 != r4) goto L40
            hf.k r4 = r2.f3284c     // Catch: java.lang.Throwable -> L21
            if (r4 == 0) goto L40
            r2.f3284c = r1     // Catch: java.lang.Throwable -> L21
            r4.h(r7)     // Catch: java.lang.Throwable -> L21
        L40:
            int r3 = r3 + (-1)
            goto L2d
        L43:
            z0.e r0 = r6.f3304w     // Catch: java.lang.Throwable -> L21
            java.lang.Object[] r2 = r0.f26372a     // Catch: java.lang.Throwable -> L21
            int r0 = r0.f26374c     // Catch: java.lang.Throwable -> L21
            r3 = 0
        L4a:
            if (r3 >= r0) goto L60
            r4 = r2[r3]     // Catch: java.lang.Throwable -> L21
            c2.i0 r4 = (c2.i0) r4     // Catch: java.lang.Throwable -> L21
            c2.m r5 = r4.f3285d     // Catch: java.lang.Throwable -> L21
            if (r8 != r5) goto L5d
            hf.k r5 = r4.f3284c     // Catch: java.lang.Throwable -> L21
            if (r5 == 0) goto L5d
            r4.f3284c = r1     // Catch: java.lang.Throwable -> L21
            r5.h(r7)     // Catch: java.lang.Throwable -> L21
        L5d:
            int r3 = r3 + 1
            goto L4a
        L60:
            z0.e r7 = r6.f3304w
            r7.g()
            return
        L66:
            z0.e r8 = r6.f3304w
            r8.g()
            throw r7
        L6c:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.j0.C0(c2.l, c2.m):void");
    }

    public final void D0() {
        r1 r1Var = this.f3300s;
        if (r1Var != null) {
            r1Var.x(new w(1, "Pointer input was reset"));
            this.f3300s = null;
        }
    }

    @Override // f3.c
    public final long E(float f10) {
        return a0.c.w(J(f10), this);
    }

    @Override // f3.c
    public final float I(int i10) {
        return i10 / a();
    }

    @Override // f3.c
    public final float J(float f10) {
        return f10 / a();
    }

    @Override // f3.c
    public final float M() {
        return i2.f.y(this).f8766y.M();
    }

    @Override // f3.c
    public final float Q(float f10) {
        return a() * f10;
    }

    @Override // f3.c
    public final int U(long j10) {
        throw null;
    }

    @Override // f3.c
    public final float a() {
        return i2.f.y(this).f8766y.a();
    }

    @Override // f3.c
    public final /* synthetic */ int a0(float f10) {
        return a0.c.q(f10, this);
    }

    @Override // i2.u1
    public final /* synthetic */ boolean d0() {
        return false;
    }

    @Override // f3.c
    public final /* synthetic */ long f0(long j10) {
        return a0.c.v(j10, this);
    }

    @Override // i2.u1
    public final void h0() {
        D0();
    }

    @Override // f3.c
    public final /* synthetic */ float i0(long j10) {
        return a0.c.u(j10, this);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    @Override // i2.u1
    public final void j(l lVar, m mVar, long j10) {
        this.f3306y = j10;
        if (mVar == m.f3314a) {
            this.f3301t = lVar;
        }
        yb.c cVar = null;
        if (this.f3300s == null) {
            this.f3300s = hf.a0.y(n0(), null, hf.z.f8619d, new v0(1, this, cVar), 1);
        }
        C0(lVar, mVar);
        ?? r52 = lVar.f3309a;
        int size = ((Collection) r52).size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                lVar = null;
                break;
            } else if (!s.c((t) r52.get(i10))) {
                break;
            } else {
                i10++;
            }
        }
        this.f3305x = lVar;
    }

    @Override // i2.u1
    public final long l() {
        return b2.f8652a;
    }

    @Override // f3.c
    public final /* synthetic */ long n(long j10) {
        return a0.c.t(j10, this);
    }

    @Override // f3.c
    public final /* synthetic */ float r(long j10) {
        return a0.c.s(j10, this);
    }

    @Override // j1.p
    public final void s0() {
        D0();
    }

    @Override // j1.p
    public final void t0() {
        D0();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // i2.u1
    public final void z() {
        l lVar = this.f3305x;
        if (lVar == null) {
            return;
        }
        ?? r12 = lVar.f3309a;
        int size = ((Collection) r12).size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((t) r12.get(i10)).f3325d) {
                ArrayList arrayList = new ArrayList(r12.size());
                int size2 = ((Collection) r12).size();
                for (int i11 = 0; i11 < size2; i11++) {
                    t tVar = (t) r12.get(i11);
                    long j10 = tVar.f3322a;
                    long j11 = tVar.f3324c;
                    long j12 = tVar.f3323b;
                    float f10 = tVar.f3326e;
                    boolean z10 = tVar.f3325d;
                    arrayList.add(new t(j10, j12, j11, false, f10, j12, j11, z10, z10, tVar.f3330i, 0L));
                }
                l lVar2 = new l(arrayList, null);
                this.f3301t = lVar2;
                C0(lVar2, m.f3314a);
                C0(lVar2, m.f3315b);
                C0(lVar2, m.f3316c);
                this.f3305x = null;
                return;
            }
        }
    }

    @Override // i2.u1
    public final /* synthetic */ void H() {
    }
}
