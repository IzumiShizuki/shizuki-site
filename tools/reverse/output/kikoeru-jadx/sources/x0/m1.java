package x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f24356a;

    public m1(ic.a aVar) {
        this.f24356a = new q0(aVar);
    }

    public abstract n1 a(Object obj);

    public r2 b() {
        return this.f24356a;
    }

    public final r2 c(n1 n1Var, r2 r2Var) {
        r2 r2Var2 = null;
        r2Var2 = null;
        r2Var2 = null;
        r2Var2 = null;
        r2Var2 = null;
        r2Var2 = null;
        if (r2Var instanceof g0) {
            if (n1Var.f24372d) {
                g0 g0Var = (g0) r2Var;
                g0Var.f24307a.setValue(n1Var.a());
                r2Var2 = g0Var;
            }
        } else if (r2Var instanceof p2) {
            if ((n1Var.f24370b || n1Var.f24373e != null) && !n1Var.f24372d) {
                p2 p2Var = (p2) r2Var;
                if (jc.l.a(n1Var.a(), p2Var.f24425a)) {
                    r2Var2 = p2Var;
                }
            }
        } else if (r2Var instanceof a0) {
            n1Var.getClass();
        }
        if (r2Var2 != null) {
            return r2Var2;
        }
        if (!n1Var.f24372d) {
            return new p2(n1Var.a());
        }
        Object obj = n1Var.f24373e;
        i2 i2Var = n1Var.f24371c;
        if (i2Var == null) {
            i2Var = r0.f24439f;
        }
        return new g0(new e1(obj, i2Var));
    }
}
