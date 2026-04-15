package j0;

import h0.u0;
import j2.n1;
import j2.u2;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f9591c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(f fVar, int i10) {
        super(0);
        this.f9590b = i10;
        this.f9591c = fVar;
    }

    @Override // ic.a
    public final Object b() {
        u2 u2Var;
        switch (this.f9590b) {
            case 0:
                i2.f.u(this.f9591c);
                return a0.f21526a;
            case 1:
                this.f9591c.f9601x.d();
                return Boolean.TRUE;
            case 2:
                this.f9591c.f9601x.m();
                return Boolean.TRUE;
            case 3:
                f fVar = this.f9591c;
                fVar.f9596s.f7879w.a(new y2.i(fVar.f9602y.f25414e));
                return Boolean.TRUE;
            case 4:
                f fVar2 = this.f9591c;
                u0 u0Var = fVar2.f9596s;
                o1.r rVar = fVar2.f9603z;
                boolean z10 = fVar2.f9597t;
                if (!u0Var.b()) {
                    o1.r.b(rVar);
                } else if (!z10 && (u2Var = u0Var.f7859c) != null) {
                    ((n1) u2Var).b();
                }
                return Boolean.TRUE;
            case 5:
                this.f9591c.f9601x.f(true);
                return Boolean.TRUE;
            case 6:
                this.f9591c.f9601x.b(true);
                return Boolean.TRUE;
            default:
                i2.f.u(this.f9591c);
                return a0.f21526a;
        }
    }
}
