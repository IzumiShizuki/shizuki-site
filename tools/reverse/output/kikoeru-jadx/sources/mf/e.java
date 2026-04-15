package mf;

import b0.x;
import hf.a0;
import hf.y;
import hf.z;
import java.util.ArrayList;
import lf.w0;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class e implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yb.h f15135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kf.a f15137c;

    public e(yb.h hVar, int i10, kf.a aVar) {
        this.f15135a = hVar;
        this.f15136b = i10;
        this.f15137c = aVar;
    }

    @Override // lf.f
    public Object b(lf.g gVar, yb.c cVar) {
        Object objK = a0.k(new x(gVar, this, (yb.c) null, 26), cVar);
        return objK == zb.a.f26667a ? objK : ub.a0.f21526a;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // mf.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final lf.f c(yb.h r5, int r6, kf.a r7) {
        /*
            r4 = this;
            yb.h r0 = r4.f15135a
            yb.h r5 = r5.G(r0)
            kf.a r1 = kf.a.f11336a
            kf.a r2 = r4.f15137c
            int r3 = r4.f15136b
            if (r7 == r1) goto Lf
            goto L26
        Lf:
            r7 = -3
            if (r3 != r7) goto L13
            goto L25
        L13:
            if (r6 != r7) goto L17
        L15:
            r6 = r3
            goto L25
        L17:
            r7 = -2
            if (r3 != r7) goto L1b
            goto L25
        L1b:
            if (r6 != r7) goto L1e
            goto L15
        L1e:
            int r6 = r6 + r3
            if (r6 < 0) goto L22
            goto L25
        L22:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L25:
            r7 = r2
        L26:
            boolean r0 = jc.l.a(r5, r0)
            if (r0 == 0) goto L31
            if (r6 != r3) goto L31
            if (r7 != r2) goto L31
            return r4
        L31:
            mf.e r5 = r4.f(r5, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mf.e.c(yb.h, int, kf.a):lf.f");
    }

    public String d() {
        return null;
    }

    public abstract Object e(kf.s sVar, w0 w0Var);

    public abstract e f(yb.h hVar, int i10, kf.a aVar);

    public lf.f g() {
        return null;
    }

    public kf.t h(y yVar) {
        int i10 = this.f15136b;
        if (i10 == -3) {
            i10 = -2;
        }
        ic.n w0Var = new w0(6, this, (yb.c) null);
        kf.r rVar = new kf.r(a0.z(yVar, this.f15135a), g8.a.c(i10, 4, this.f15137c));
        rVar.n0(z.f8618c, rVar, w0Var);
        return rVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strD = d();
        if (strD != null) {
            arrayList.add(strD);
        }
        yb.i iVar = yb.i.f26088a;
        yb.h hVar = this.f15135a;
        if (hVar != iVar) {
            arrayList.add("context=" + hVar);
        }
        int i10 = this.f15136b;
        if (i10 != -3) {
            arrayList.add("capacity=" + i10);
        }
        kf.a aVar = kf.a.f11336a;
        kf.a aVar2 = this.f15137c;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return t0.E(sb, vb.m.f0(arrayList, ", ", null, null, null, 62), ']');
    }
}
