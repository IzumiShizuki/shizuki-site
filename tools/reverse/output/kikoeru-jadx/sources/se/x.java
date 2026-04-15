package se;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20001a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f20002b;

    public x(List list, le.o oVar, h0 h0Var, k0 k0Var, boolean z10) {
        this.f20002b = k0Var;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        te.f fVar = (te.f) obj;
        switch (this.f20001a) {
            case 0:
                jc.l.e(fVar, "refiner");
                this.f20002b.h();
                break;
            default:
                jc.l.e(fVar, "kotlinTypeRefiner");
                this.f20002b.h();
                break;
        }
        return null;
    }

    public x(List list, h0 h0Var, k0 k0Var, boolean z10) {
        this.f20002b = k0Var;
    }
}
