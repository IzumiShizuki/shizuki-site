package h1;

import java.util.Collection;
import o.l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f8067a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f8068b = new Object();

    public static final void a(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException("index (" + i10 + ") is out of bound of [0, " + i11 + ')');
        }
    }

    public static final boolean b(a0 a0Var, int i10, b1.c cVar, boolean z10) {
        boolean z11;
        synchronized (f8067a) {
            try {
                int i11 = a0Var.f7980d;
                if (i11 == i10) {
                    a0Var.f7979c = cVar;
                    z11 = true;
                    if (z10) {
                        a0Var.f7981e++;
                    }
                    a0Var.f7980d = i11 + 1;
                } else {
                    z11 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    public static final int c(long[] jArr, long j10) {
        int length = jArr.length - 1;
        int i10 = 0;
        while (i10 <= length) {
            int i11 = (i10 + length) >>> 1;
            long j11 = jArr[i11];
            if (j10 > j11) {
                i10 = i11 + 1;
            } else {
                if (j10 >= j11) {
                    return i11;
                }
                length = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static g d() {
        return (g) n.f8050b.y();
    }

    public static final a0 e(s sVar) {
        a0 a0Var = sVar.f8066a;
        jc.l.c(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.<get-readable>>");
        return (a0) n.u(a0Var, sVar);
    }

    public static final int f(s sVar) {
        a0 a0Var = sVar.f8066a;
        jc.l.c(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
        return ((a0) n.i(a0Var)).f7981e;
    }

    public static g g(g gVar) {
        if (gVar instanceof j0) {
            j0 j0Var = (j0) gVar;
            if (j0Var.f8033t == f1.g.c()) {
                j0Var.f8031r = null;
                return gVar;
            }
        }
        if (gVar instanceof k0) {
            k0 k0Var = (k0) gVar;
            if (k0Var.f8043i == f1.g.c()) {
                k0Var.f8042h = null;
                return gVar;
            }
        }
        g gVarH = n.h(gVar, null, false);
        gVarH.j();
        return gVarH;
    }

    public static final boolean h(s sVar, ic.k kVar) {
        int i10;
        b1.c cVar;
        Object objA;
        g gVarK;
        boolean zB;
        do {
            synchronized (f8067a) {
                a0 a0Var = sVar.f8066a;
                jc.l.c(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                a0 a0Var2 = (a0) n.i(a0Var);
                i10 = a0Var2.f7980d;
                cVar = a0Var2.f7979c;
            }
            jc.l.b(cVar);
            b1.g gVarL = cVar.l();
            objA = kVar.a(gVarL);
            b1.c cVarJ = gVarL.j();
            if (jc.l.a(cVarJ, cVar)) {
                break;
            }
            a0 a0Var3 = sVar.f8066a;
            jc.l.c(a0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (n.f8051c) {
                gVarK = n.k();
                zB = b((a0) n.x(a0Var3, sVar, gVarK), i10, cVarJ, true);
            }
            n.o(gVarK, sVar);
        } while (!zB);
        return ((Boolean) objA).booleanValue();
    }

    public static Object i(ic.a aVar, ic.k kVar) {
        g j0Var;
        if (kVar == null) {
            return aVar.b();
        }
        g gVar = (g) n.f8050b.y();
        if (gVar instanceof j0) {
            j0 j0Var2 = (j0) gVar;
            if (j0Var2.f8033t == f1.g.c()) {
                ic.k kVar2 = j0Var2.f8031r;
                ic.k kVar3 = j0Var2.f8032s;
                try {
                    ((j0) gVar).f8031r = n.l(kVar, kVar2, true);
                    ((j0) gVar).f8032s = kVar3;
                    return aVar.b();
                } finally {
                    j0Var2.f8031r = kVar2;
                    j0Var2.f8032s = kVar3;
                }
            }
        }
        if (gVar == null || (gVar instanceof c)) {
            j0Var = new j0(gVar instanceof c ? (c) gVar : null, kVar, null, true, false);
        } else {
            if (kVar == null) {
                return aVar.b();
            }
            j0Var = gVar.u(kVar);
        }
        try {
            g gVarJ = j0Var.j();
            try {
                Object objB = aVar.b();
                g.q(gVarJ);
                j0Var.c();
                return objB;
            } catch (Throwable th2) {
                g.q(gVarJ);
                throw th2;
            }
        } catch (Throwable th3) {
            j0Var.c();
            throw th3;
        }
    }

    public static androidx.media3.exoplayer.offline.g j(a9.r rVar) {
        n.f(n.f8049a);
        synchronized (n.f8051c) {
            n.f8056h = vb.m.r0((Collection) n.f8056h, rVar);
        }
        return new androidx.media3.exoplayer.offline.g(13, rVar);
    }

    public static void k(g gVar, g gVar2, ic.k kVar) {
        if (gVar != gVar2) {
            gVar2.getClass();
            g.q(gVar);
            gVar2.c();
        } else if (gVar instanceof j0) {
            ((j0) gVar).f8031r = kVar;
        } else if (gVar instanceof k0) {
            ((k0) gVar).f8042h = kVar;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + gVar).toString());
        }
    }

    public static void l() {
        boolean z10;
        synchronized (n.f8051c) {
            l0 l0Var = n.f8058j.f7989h;
            z10 = false;
            if (l0Var != null) {
                if (l0Var.h()) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            n.a();
        }
    }

    public static final void m() {
        throw new UnsupportedOperationException();
    }
}
