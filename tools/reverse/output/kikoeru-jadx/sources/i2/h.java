package i2;

import j2.z2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h extends jc.m implements ic.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f8712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f8713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f8714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f8715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h f8716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f8717h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h f8718i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8719b;

    static {
        int i10 = 2;
        f8712c = new h(i10, 0);
        f8713d = new h(i10, 1);
        f8714e = new h(i10, 2);
        f8715f = new h(i10, 3);
        f8716g = new h(i10, 4);
        f8717h = new h(i10, 5);
        f8718i = new h(i10, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10, int i11) {
        super(i10);
        this.f8719b = i11;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f8719b) {
            case 0:
                ((Number) obj2).intValue();
                ((k) obj).getClass();
                break;
            case 1:
                ((j0) ((k) obj)).d0((f3.c) obj2);
                break;
            case 2:
                f3.m mVar = (f3.m) obj2;
                j0 j0Var = (j0) ((k) obj);
                if (j0Var.f8767z != mVar) {
                    j0Var.f8767z = mVar;
                    j0Var.E();
                    j0 j0VarV = j0Var.v();
                    if (j0VarV != null) {
                        j0VarV.C();
                    }
                    j0Var.D();
                    for (j1.p pVar = j0Var.F.f8667f; pVar != null; pVar = pVar.f9695f) {
                        pVar.u0();
                    }
                }
                break;
            case 3:
                ((j0) ((k) obj)).g0((g2.v0) obj2);
                break;
            case 4:
                ((j0) ((k) obj)).h0((j1.q) obj2);
                break;
            case 5:
                ((j0) ((k) obj)).c0((x0.x) obj2);
                break;
            default:
                ((j0) ((k) obj)).i0((z2) obj2);
                break;
        }
        return ub.a0.f21526a;
    }
}
