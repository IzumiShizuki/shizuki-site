package w4;

import j5.d0;
import m4.h1;
import m4.i1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f23359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0 f23360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f23362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f23363g;

    public e(f fVar, String str, int i10, d0 d0Var) {
        this.f23363g = fVar;
        this.f23357a = str;
        this.f23358b = i10;
        this.f23359c = d0Var == null ? -1L : d0Var.f10248d;
        if (d0Var == null || !d0Var.b()) {
            return;
        }
        this.f23360d = d0Var;
    }

    public final boolean a(a aVar) {
        d0 d0Var = aVar.f23340d;
        i1 i1Var = aVar.f23338b;
        if (d0Var == null) {
            return this.f23358b != aVar.f23339c;
        }
        long j10 = this.f23359c;
        if (j10 == -1) {
            return false;
        }
        if (d0Var.f10248d > j10) {
            return true;
        }
        d0 d0Var2 = this.f23360d;
        if (d0Var2 == null) {
            return false;
        }
        int i10 = d0Var2.f10246b;
        int iB = i1Var.b(d0Var.f10245a);
        int iB2 = i1Var.b(d0Var2.f10245a);
        if (d0Var.f10248d < d0Var2.f10248d || iB < iB2) {
            return false;
        }
        if (iB > iB2) {
            return true;
        }
        if (!d0Var.b()) {
            int i11 = d0Var.f10249e;
            return i11 == -1 || i11 > i10;
        }
        int i12 = d0Var.f10246b;
        int i13 = d0Var.f10247c;
        if (i12 <= i10) {
            return i12 == i10 && i13 > d0Var2.f10247c;
        }
        return true;
    }

    public final boolean b(i1 i1Var, i1 i1Var2) {
        d0 d0Var;
        int i10 = this.f23358b;
        if (i10 < i1Var.o()) {
            f fVar = this.f23363g;
            h1 h1Var = fVar.f23366a;
            i1Var.n(i10, h1Var);
            for (int i11 = h1Var.f14275n; i11 <= h1Var.f14276o; i11++) {
                int iB = i1Var2.b(i1Var.l(i11));
                if (iB != -1) {
                    i10 = i1Var2.f(iB, fVar.f23367b, false).f14203c;
                    break;
                }
            }
            i10 = -1;
        } else if (i10 >= i1Var2.o()) {
            i10 = -1;
        }
        this.f23358b = i10;
        return i10 != -1 && ((d0Var = this.f23360d) == null || i1Var2.b(d0Var.f10245a) != -1);
    }
}
