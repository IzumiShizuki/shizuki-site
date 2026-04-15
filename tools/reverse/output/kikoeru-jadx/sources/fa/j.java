package fa;

import m4.y0;
import pc.f0;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hg.b f7008b;

    public /* synthetic */ j(hg.b bVar, int i10) {
        this.f7007a = i10;
        this.f7008b = bVar;
    }

    @Override // ic.a
    public final Object b() {
        Object objB;
        Object objB2;
        switch (this.f7007a) {
            case 0:
                hg.b bVar = this.f7008b;
                a0 a0Var = a0.f21526a;
                try {
                    long jM = ((v4.v) h9.d.c()).M() - ((long) (((Number) f0.G(bVar, t.f7038a[0])).intValue() * 1000));
                    y0 y0VarC = h9.d.c();
                    if (jM < 0) {
                        jM = 0;
                    }
                    ((androidx.lifecycle.q) y0VarC).s1(5, jM);
                    objB = a0Var;
                } catch (Throwable th2) {
                    objB = ub.a.b(th2);
                }
                Throwable thA = ub.n.a(objB);
                if (thA != null) {
                    thA.printStackTrace();
                }
                return a0Var;
            case 1:
                hg.b bVar2 = this.f7008b;
                a0 a0Var2 = a0.f21526a;
                try {
                    long jM2 = ((v4.v) h9.d.c()).M() + ((long) (((Number) f0.G(bVar2, t.f7038a[1])).intValue() * 1000));
                    y0 y0VarC2 = h9.d.c();
                    long jM1 = ((v4.v) h9.d.c()).M1();
                    if (jM2 > jM1) {
                        jM2 = jM1;
                    }
                    ((androidx.lifecycle.q) y0VarC2).s1(5, jM2);
                    objB2 = a0Var2;
                } catch (Throwable th3) {
                    objB2 = ub.a.b(th3);
                }
                Throwable thA2 = ub.n.a(objB2);
                if (thA2 != null) {
                    thA2.printStackTrace();
                }
                return a0Var2;
            case 2:
                return (hg.a) this.f7008b.f8626a.b();
            default:
                return this.f7008b.b();
        }
    }
}
