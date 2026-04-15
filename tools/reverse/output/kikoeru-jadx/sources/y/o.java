package y;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o implements g2.v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f25199b = new o(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f25200c = new o(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25201a;

    public /* synthetic */ o(int i10) {
        this.f25201a = i10;
    }

    @Override // g2.v0
    public final /* synthetic */ int c(g2.y yVar, List list, int i10) {
        int i11 = this.f25201a;
        return a0.c.f(this, yVar, list, i10);
    }

    @Override // g2.v0
    public final /* synthetic */ int f(g2.y yVar, List list, int i10) {
        int i11 = this.f25201a;
        return a0.c.m(this, yVar, list, i10);
    }

    @Override // g2.v0
    public final /* synthetic */ int g(g2.y yVar, List list, int i10) {
        int i11 = this.f25201a;
        return a0.c.j(this, yVar, list, i10);
    }

    @Override // g2.v0
    public final g2.w0 h(g2.x0 x0Var, List list, long j10) {
        switch (this.f25201a) {
            case 0:
                return x0Var.b0(f3.a.j(j10), f3.a.i(j10), vb.s.f22820a, n.f25184c);
            default:
                return x0Var.b0(f3.a.f(j10) ? f3.a.h(j10) : 0, f3.a.e(j10) ? f3.a.g(j10) : 0, vb.s.f22820a, n.f25189h);
        }
    }

    @Override // g2.v0
    public final /* synthetic */ int i(g2.y yVar, List list, int i10) {
        int i11 = this.f25201a;
        return a0.c.c(this, yVar, list, i10);
    }
}
