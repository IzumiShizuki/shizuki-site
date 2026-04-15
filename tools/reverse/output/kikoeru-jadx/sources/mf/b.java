package mf;

import java.util.Arrays;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d[] f15128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u f15131d;

    public final d d() {
        d dVarE;
        u uVar;
        synchronized (this) {
            try {
                d[] dVarArrF = this.f15128a;
                if (dVarArrF == null) {
                    dVarArrF = f();
                    this.f15128a = dVarArrF;
                } else if (this.f15129b >= dVarArrF.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(dVarArrF, dVarArrF.length * 2);
                    jc.l.d(objArrCopyOf, "copyOf(...)");
                    this.f15128a = (d[]) objArrCopyOf;
                    dVarArrF = (d[]) objArrCopyOf;
                }
                int i10 = this.f15130c;
                do {
                    dVarE = dVarArrF[i10];
                    if (dVarE == null) {
                        dVarE = e();
                        dVarArrF[i10] = dVarE;
                    }
                    i10++;
                    if (i10 >= dVarArrF.length) {
                        i10 = 0;
                    }
                } while (!dVarE.a(this));
                this.f15130c = i10;
                this.f15129b++;
                uVar = this.f15131d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (uVar != null) {
            uVar.y(1);
        }
        return dVarE;
    }

    public abstract d e();

    public abstract d[] f();

    public final void g(d dVar) {
        u uVar;
        int i10;
        yb.c[] cVarArrB;
        synchronized (this) {
            try {
                int i11 = this.f15129b - 1;
                this.f15129b = i11;
                uVar = this.f15131d;
                if (i11 == 0) {
                    this.f15130c = 0;
                }
                jc.l.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                cVarArrB = dVar.b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (yb.c cVar : cVarArrB) {
            if (cVar != null) {
                cVar.h(a0.f21526a);
            }
        }
        if (uVar != null) {
            uVar.y(-1);
        }
    }

    public final u h() {
        u uVar;
        synchronized (this) {
            uVar = this.f15131d;
            if (uVar == null) {
                int i10 = this.f15129b;
                uVar = new u(1, Integer.MAX_VALUE, kf.a.f11337b);
                uVar.j(Integer.valueOf(i10));
                this.f15131d = uVar;
            }
        }
        return uVar;
    }
}
