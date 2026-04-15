package j5;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ya.a1 f10352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f10353b;

    public m(List list, List list2) {
        ya.f0 f0VarP = ya.i0.p();
        p4.c.c(list.size() == list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            f0VarP.a(new l((e1) list.get(i10), (List) list2.get(i10)));
        }
        this.f10352a = f0VarP.f();
        this.f10353b = -9223372036854775807L;
    }

    @Override // j5.e1
    public final long d() {
        int i10 = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            ya.a1 a1Var = this.f10352a;
            if (i10 >= a1Var.f25948d) {
                break;
            }
            long jD = ((l) a1Var.get(i10)).f10339a.d();
            if (jD != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jD);
            }
            i10++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // j5.e1
    public final boolean e(v4.f0 f0Var) {
        boolean zE;
        boolean z10 = false;
        do {
            long jD = d();
            if (jD == Long.MIN_VALUE) {
                return z10;
            }
            int i10 = 0;
            zE = false;
            while (true) {
                ya.a1 a1Var = this.f10352a;
                if (i10 >= a1Var.f25948d) {
                    break;
                }
                long jD2 = ((l) a1Var.get(i10)).f10339a.d();
                boolean z11 = jD2 != Long.MIN_VALUE && jD2 <= f0Var.f22482a;
                if (jD2 == jD || z11) {
                    zE |= ((l) a1Var.get(i10)).f10339a.e(f0Var);
                }
                i10++;
            }
            z10 |= zE;
        } while (zE);
        return z10;
    }

    @Override // j5.e1
    public final boolean m() {
        int i10 = 0;
        while (true) {
            ya.a1 a1Var = this.f10352a;
            if (i10 >= a1Var.f25948d) {
                return false;
            }
            if (((l) a1Var.get(i10)).f10339a.m()) {
                return true;
            }
            i10++;
        }
    }

    @Override // j5.e1
    public final long t() {
        int i10 = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            ya.a1 a1Var = this.f10352a;
            if (i10 >= a1Var.f25948d) {
                break;
            }
            l lVar = (l) a1Var.get(i10);
            long jT = lVar.f10339a.t();
            ya.i0 i0Var = lVar.f10340b;
            if ((i0Var.contains(1) || i0Var.contains(2) || i0Var.contains(4)) && jT != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jT);
            }
            if (jT != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jT);
            }
            i10++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.f10353b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.f10353b;
        return j10 != -9223372036854775807L ? j10 : jMin2;
    }

    @Override // j5.e1
    public final void w(long j10) {
        int i10 = 0;
        while (true) {
            ya.a1 a1Var = this.f10352a;
            if (i10 >= a1Var.f25948d) {
                return;
            }
            ((l) a1Var.get(i10)).w(j10);
            i10++;
        }
    }
}
