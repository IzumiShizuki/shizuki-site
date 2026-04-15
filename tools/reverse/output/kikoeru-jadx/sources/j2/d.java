package j2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static d f9764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e3.j f9765f = e3.j.f6079b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e3.j f9766g = e3.j.f6078a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t2.i0 f9767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q2.o f9768d;

    @Override // j2.b
    public final int[] a(int i10) {
        int iE;
        if (c().length() <= 0 || i10 >= c().length()) {
            return null;
        }
        try {
            q2.o oVar = this.f9768d;
            if (oVar == null) {
                jc.l.k("node");
                throw null;
            }
            p1.c cVarG = oVar.g();
            int iRound = Math.round(cVarG.f16486d - cVarG.f16484b);
            if (i10 <= 0) {
                i10 = 0;
            }
            t2.i0 i0Var = this.f9767c;
            if (i0Var == null) {
                jc.l.k("layoutResult");
                throw null;
            }
            int iD = i0Var.f20345b.d(i10);
            t2.i0 i0Var2 = this.f9767c;
            if (i0Var2 == null) {
                jc.l.k("layoutResult");
                throw null;
            }
            float f10 = i0Var2.f20345b.f(iD) + iRound;
            t2.i0 i0Var3 = this.f9767c;
            if (i0Var3 == null) {
                jc.l.k("layoutResult");
                throw null;
            }
            if (i0Var3 == null) {
                jc.l.k("layoutResult");
                throw null;
            }
            if (f10 < i0Var3.f20345b.f(r0.f20371f - 1)) {
                t2.i0 i0Var4 = this.f9767c;
                if (i0Var4 == null) {
                    jc.l.k("layoutResult");
                    throw null;
                }
                iE = i0Var4.f20345b.e(f10);
            } else {
                t2.i0 i0Var5 = this.f9767c;
                if (i0Var5 == null) {
                    jc.l.k("layoutResult");
                    throw null;
                }
                iE = i0Var5.f20345b.f20371f;
            }
            return b(i10, f(iE - 1, f9766g) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // j2.b
    public final int[] d(int i10) {
        int iE;
        if (c().length() <= 0 || i10 <= 0) {
            return null;
        }
        try {
            q2.o oVar = this.f9768d;
            if (oVar == null) {
                jc.l.k("node");
                throw null;
            }
            p1.c cVarG = oVar.g();
            int iRound = Math.round(cVarG.f16486d - cVarG.f16484b);
            int length = c().length();
            if (length <= i10) {
                i10 = length;
            }
            t2.i0 i0Var = this.f9767c;
            if (i0Var == null) {
                jc.l.k("layoutResult");
                throw null;
            }
            int iD = i0Var.f20345b.d(i10);
            t2.i0 i0Var2 = this.f9767c;
            if (i0Var2 == null) {
                jc.l.k("layoutResult");
                throw null;
            }
            float f10 = i0Var2.f20345b.f(iD) - iRound;
            if (f10 > 0.0f) {
                t2.i0 i0Var3 = this.f9767c;
                if (i0Var3 == null) {
                    jc.l.k("layoutResult");
                    throw null;
                }
                iE = i0Var3.f20345b.e(f10);
            } else {
                iE = 0;
            }
            if (i10 == c().length() && iE < iD) {
                iE++;
            }
            return b(f(iE, f9765f), i10);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int f(int i10, e3.j jVar) {
        t2.i0 i0Var = this.f9767c;
        if (i0Var == null) {
            jc.l.k("layoutResult");
            throw null;
        }
        int iG = i0Var.g(i10);
        t2.i0 i0Var2 = this.f9767c;
        if (i0Var2 == null) {
            jc.l.k("layoutResult");
            throw null;
        }
        if (jVar != i0Var2.h(iG)) {
            t2.i0 i0Var3 = this.f9767c;
            if (i0Var3 != null) {
                return i0Var3.g(i10);
            }
            jc.l.k("layoutResult");
            throw null;
        }
        if (this.f9767c != null) {
            return r6.f20345b.c(i10, false) - 1;
        }
        jc.l.k("layoutResult");
        throw null;
    }
}
