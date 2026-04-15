package h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7721f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(g2.x0 x0Var, g2.f0 f0Var, g2.g1 g1Var, int i10, int i11) {
        super(1);
        this.f7717b = i11;
        this.f7718c = x0Var;
        this.f7721f = f0Var;
        this.f7719d = g1Var;
        this.f7720e = i10;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f7717b) {
            case 0:
                g2.f1 f1Var = (g2.f1) obj;
                g2.g1 g1Var = (g2.g1) this.f7719d;
                g2.x0 x0Var = (g2.x0) this.f7718c;
                l0 l0Var = (l0) this.f7721f;
                int i10 = l0Var.f7740b;
                p1 p1Var = l0Var.f7739a;
                y2.d0 d0Var = l0Var.f7741c;
                r1 r1Var = (r1) l0Var.f7742d.b();
                p1Var.a(u.e1.f20883b, q0.j(x0Var, i10, d0Var, r1Var != null ? r1Var.f7827a : null, x0Var.getLayoutDirection() == f3.m.f6668b, g1Var.f7180a), this.f7720e, g1Var.f7180a);
                g2.f1.k(f1Var, g1Var, Math.round(-p1Var.f7802a.e()), 0);
                break;
            case 1:
                g2.f1 f1Var2 = (g2.f1) obj;
                g2.g1 g1Var2 = (g2.g1) this.f7719d;
                g2.x0 x0Var2 = (g2.x0) this.f7718c;
                u1 u1Var = (u1) this.f7721f;
                int i11 = u1Var.f7884b;
                p1 p1Var2 = u1Var.f7883a;
                y2.d0 d0Var2 = u1Var.f7885c;
                r1 r1Var2 = (r1) u1Var.f7886d.b();
                p1Var2.a(u.e1.f20882a, q0.j(x0Var2, i11, d0Var2, r1Var2 != null ? r1Var2.f7827a : null, false, g1Var2.f7180a), this.f7720e, g1Var2.f7181b);
                g2.f1.k(f1Var2, g1Var2, 0, Math.round(-p1Var2.f7802a.e()));
                break;
            default:
                g2.f1 f1Var3 = (g2.f1) obj;
                g2.g1[] g1VarArr = (g2.g1[]) this.f7718c;
                y.j1 j1Var = (y.j1) this.f7721f;
                int[] iArr = (int[]) this.f7719d;
                int length = g1VarArr.length;
                int i12 = 0;
                int i13 = 0;
                while (i12 < length) {
                    g2.g1 g1Var3 = g1VarArr[i12];
                    int i14 = i13 + 1;
                    jc.l.b(g1Var3);
                    Object objA = g1Var3.A();
                    y.h1 h1Var = objA instanceof y.h1 ? (y.h1) objA : null;
                    y.d dVar = h1Var != null ? h1Var.f25137c : null;
                    int i15 = this.f7720e;
                    f1Var3.h(g1Var3, iArr[i13], dVar != null ? dVar.f(i15 - g1Var3.f7181b, f3.m.f6667a) : j1Var.f25155b.a(0, i15 - g1Var3.f7181b), 0.0f);
                    i12++;
                    i13 = i14;
                }
                break;
        }
        return ub.a0.f21526a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(g2.g1[] g1VarArr, y.j1 j1Var, int i10, int[] iArr) {
        super(1);
        this.f7717b = 2;
        this.f7718c = g1VarArr;
        this.f7721f = j1Var;
        this.f7720e = i10;
        this.f7719d = iArr;
    }
}
