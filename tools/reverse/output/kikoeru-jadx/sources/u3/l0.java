package u3;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f21306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p3.b[] f21307b;

    public l0() {
        this(new w0((w0) null));
    }

    public final void a() {
        p3.b[] bVarArr = this.f21307b;
        if (bVarArr != null) {
            p3.b bVarG = bVarArr[0];
            p3.b bVarG2 = bVarArr[1];
            w0 w0Var = this.f21306a;
            if (bVarG2 == null) {
                bVarG2 = w0Var.f21343a.g(2);
            }
            if (bVarG == null) {
                bVarG = w0Var.f21343a.g(1);
            }
            g(p3.b.a(bVarG, bVarG2));
            p3.b bVar = this.f21307b[n7.e.v(16)];
            if (bVar != null) {
                f(bVar);
            }
            p3.b bVar2 = this.f21307b[n7.e.v(32)];
            if (bVar2 != null) {
                d(bVar2);
            }
            p3.b bVar3 = this.f21307b[n7.e.v(64)];
            if (bVar3 != null) {
                h(bVar3);
            }
        }
    }

    public abstract w0 b();

    public void c(int i10, p3.b bVar) {
        if (this.f21307b == null) {
            this.f21307b = new p3.b[10];
        }
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                this.f21307b[n7.e.v(i11)] = bVar;
            }
        }
    }

    public abstract void e(p3.b bVar);

    public abstract void g(p3.b bVar);

    public l0(w0 w0Var) {
        this.f21306a = w0Var;
    }

    public void d(p3.b bVar) {
    }

    public void f(p3.b bVar) {
    }

    public void h(p3.b bVar) {
    }
}
