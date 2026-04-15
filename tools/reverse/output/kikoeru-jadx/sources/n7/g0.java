package n7;

import android.database.SQLException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f15487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m0 f15488h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(m0 m0Var, yb.c cVar, int i10) {
        super(2, cVar);
        this.f15485e = i10;
        this.f15488h = m0Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f15485e) {
            case 0:
                g0 g0Var = new g0(this.f15488h, cVar, 0);
                g0Var.f15487g = obj;
                return g0Var;
            case 1:
                g0 g0Var2 = new g0(this.f15488h, cVar, 1);
                g0Var2.f15487g = obj;
                return g0Var2;
            default:
                g0 g0Var3 = new g0(this.f15488h, cVar, 2);
                g0Var3.f15487g = obj;
                return g0Var3;
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f15485e) {
        }
        return ((g0) o((a0) obj, (yb.c) obj2)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        a0 a0Var;
        Object objB;
        Object objD;
        a0 a0Var2;
        Object objB2;
        n[] nVarArr;
        n nVar;
        switch (this.f15485e) {
            case 0:
                int i10 = this.f15486f;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return obj;
                }
                ub.a.f(obj);
                p7.l lVar = (p7.l) this.f15487g;
                this.f15486f = 1;
                Object objA = m0.a(this.f15488h, lVar, this);
                zb.a aVar = zb.a.f26667a;
                return objA == aVar ? aVar : objA;
            case 1:
                int i11 = this.f15486f;
                zb.a aVar2 = zb.a.f26667a;
                try {
                    if (i11 == 0) {
                        ub.a.f(obj);
                        a0Var = (a0) this.f15487g;
                        this.f15487g = a0Var;
                        this.f15486f = 1;
                        objB = a0Var.b(this);
                        if (objB == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ub.a.f(obj);
                            objD = obj;
                            return (Set) objD;
                        }
                        a0Var = (a0) this.f15487g;
                        ub.a.f(obj);
                        objB = obj;
                    }
                    if (!((Boolean) objB).booleanValue()) {
                        z zVar = z.f15596b;
                        g0 g0Var = new g0(this.f15488h, null, 0);
                        this.f15487g = null;
                        this.f15486f = 2;
                        objD = a0Var.d(zVar, g0Var, this);
                        if (objD == aVar2) {
                            return aVar2;
                        }
                        return (Set) objD;
                    }
                } catch (SQLException unused) {
                }
                return vb.t.f22821a;
            default:
                int i12 = this.f15486f;
                ub.a0 a0Var3 = ub.a0.f21526a;
                boolean z10 = true;
                zb.a aVar3 = zb.a.f26667a;
                if (i12 == 0) {
                    ub.a.f(obj);
                    a0Var2 = (a0) this.f15487g;
                    this.f15487g = a0Var2;
                    this.f15486f = 1;
                    objB2 = a0Var2.b(this);
                    if (objB2 != aVar3) {
                    }
                    return aVar3;
                }
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var3;
                }
                a0Var2 = (a0) this.f15487g;
                ub.a.f(obj);
                objB2 = obj;
                if (((Boolean) objB2).booleanValue()) {
                    return a0Var3;
                }
                m0 m0Var = this.f15488h;
                b5.d0 d0Var = m0Var.f15549h;
                long[] jArr = (long[]) d0Var.f1522c;
                ReentrantLock reentrantLock = (ReentrantLock) d0Var.f1521b;
                reentrantLock.lock();
                try {
                    if (d0Var.f1520a) {
                        d0Var.f1520a = false;
                        int length = jArr.length;
                        nVarArr = new n[length];
                        int i13 = 0;
                        boolean z11 = false;
                        while (i13 < length) {
                            if (jArr[i13] <= 0) {
                                z10 = false;
                            }
                            boolean[] zArr = (boolean[]) d0Var.f1523d;
                            if (z10 != zArr[i13]) {
                                zArr[i13] = z10;
                                nVar = z10 ? n.f15554b : n.f15555c;
                                z11 = true;
                            } else {
                                nVar = n.f15553a;
                            }
                            nVarArr[i13] = nVar;
                            i13++;
                            z10 = true;
                        }
                        if (!z11) {
                            nVarArr = null;
                        }
                        reentrantLock.unlock();
                    } else {
                        reentrantLock.unlock();
                        nVarArr = null;
                    }
                    if (nVarArr == null) {
                        return a0Var3;
                    }
                    l0 l0Var = new l0(nVarArr, m0Var, a0Var2, null);
                    this.f15487g = null;
                    this.f15486f = 2;
                    if (a0Var2.d(z.f15596b, l0Var, this) != aVar3) {
                        return a0Var3;
                    }
                    return aVar3;
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
        }
    }
}
