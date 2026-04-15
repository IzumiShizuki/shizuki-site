package a0;

import android.view.View;
import b0.a1;
import b0.v1;
import b0.x0;
import b0.z0;
import c7.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i10, int i11) {
        super(1);
        this.f6b = i11;
        this.f7c = i10;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f6b) {
            case 0:
                x0 x0Var = (x0) obj;
                h1.g gVarD = h1.t.d();
                h1.t.k(gVarD, h1.t.g(gVarD), gVarD != null ? gVarD.e() : null);
                for (int i10 = 0; i10 < 2; i10++) {
                    int i11 = this.f7c + i10;
                    x0Var.getClass();
                    long j10 = a1.f1190a;
                    z0 z0Var = x0Var.f1404b;
                    e1 e1Var = z0Var.f1417c;
                    if (e1Var != null) {
                        x0Var.f1403a.add(new v1(e1Var, i11, j10, z0Var.f1416b));
                    }
                }
                return ub.a0.f21526a;
            case 1:
                return Boolean.valueOf(((o1.v) obj).F0(this.f7c));
            case 2:
                return Boolean.valueOf(((View) obj).getId() == this.f7c);
            default:
                return Boolean.valueOf(((o1.v) obj).F0(this.f7c));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(g0 g0Var, int i10) {
        super(1);
        this.f6b = 0;
        this.f7c = i10;
    }
}
