package x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u f24418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f24420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ic.n f24421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o.f0 f24423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o.k0 f24424g;

    public p1(u uVar) {
        this.f24418a = uVar;
    }

    public static boolean a(c0 c0Var, o.k0 k0Var) {
        jc.l.c(c0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        i2 i2Var = c0Var.f24258c;
        if (i2Var == null) {
            i2Var = r0.f24439f;
        }
        return !i2Var.a(c0Var.f().f24251f, k0Var.g(c0Var));
    }

    public final boolean b() {
        if (this.f24418a != null) {
            a aVar = this.f24420c;
            if (aVar != null ? aVar.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final void c() {
        u uVar = this.f24418a;
        if (uVar != null) {
            uVar.r(this, null);
        }
    }

    public final m0 d(Object obj) {
        m0 m0VarR;
        u uVar = this.f24418a;
        return (uVar == null || (m0VarR = uVar.r(this, obj)) == null) ? m0.f24351a : m0VarR;
    }

    public final void e() {
        u uVar = this.f24418a;
        if (uVar != null) {
            uVar.f24504o = true;
            uVar.f24507r.Q();
        }
        this.f24418a = null;
        this.f24423f = null;
        this.f24424g = null;
        this.f24421d = null;
    }

    public final void f(boolean z10) {
        int i10 = this.f24419b;
        this.f24419b = z10 ? i10 | 32 : i10 & (-33);
    }
}
