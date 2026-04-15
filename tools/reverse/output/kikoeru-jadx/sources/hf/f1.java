package hf;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class f1 extends k1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8538c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(d1 d1Var) {
        super(true);
        boolean z10 = true;
        T(d1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k1.f8564b;
        n nVar = (n) atomicReferenceFieldUpdater.get(this);
        o oVar = nVar instanceof o ? (o) nVar : null;
        if (oVar == null) {
            z10 = false;
            break;
        }
        k1 k1VarJ = oVar.j();
        while (!k1VarJ.M()) {
            n nVar2 = (n) atomicReferenceFieldUpdater.get(k1VarJ);
            o oVar2 = nVar2 instanceof o ? (o) nVar2 : null;
            if (oVar2 == null) {
                z10 = false;
                break;
            }
            k1VarJ = oVar2.j();
        }
        this.f8538c = z10;
    }

    @Override // hf.k1
    public final boolean M() {
        return this.f8538c;
    }

    @Override // hf.k1
    public final boolean N() {
        return true;
    }
}
