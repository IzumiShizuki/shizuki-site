package hf;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class g1 extends nf.j implements n0, a1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k1 f8542d;

    @Override // hf.n0
    public final void a() {
        k1 k1VarJ = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k1.f8563a;
            Object obj = atomicReferenceFieldUpdater.get(k1VarJ);
            if (obj instanceof g1) {
                if (obj != this) {
                    return;
                }
                p0 p0Var = a0.f8517j;
                while (!atomicReferenceFieldUpdater.compareAndSet(k1VarJ, obj, p0Var)) {
                    if (atomicReferenceFieldUpdater.get(k1VarJ) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof a1) || ((a1) obj).d() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = nf.j.f15838a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof nf.o) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                jc.l.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                nf.j jVar = (nf.j) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = nf.j.f15840c;
                nf.o oVar = (nf.o) atomicReferenceFieldUpdater3.get(jVar);
                if (oVar == null) {
                    oVar = new nf.o(jVar);
                    atomicReferenceFieldUpdater3.set(jVar, oVar);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, oVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                jVar.f();
                return;
            }
        }
    }

    @Override // hf.a1
    public final boolean b() {
        return true;
    }

    @Override // hf.a1
    public final m1 d() {
        return null;
    }

    public d1 getParent() {
        return j();
    }

    public final k1 j() {
        k1 k1Var = this.f8542d;
        if (k1Var != null) {
            return k1Var;
        }
        jc.l.k("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th2);

    @Override // nf.j
    public final String toString() {
        return getClass().getSimpleName() + '@' + a0.q(this) + "[job@" + a0.q(j()) + ']';
    }
}
