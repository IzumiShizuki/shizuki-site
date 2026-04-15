package se;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class f implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final re.d f19941b;

    public f(re.o oVar) {
        jc.l.e(oVar, "storageManager");
        this.f19941b = new re.d((re.l) oVar, new bd.e(24, this), new bd.a(22, this));
    }

    public abstract Collection b();

    public abstract w c();

    public abstract yc.n0 d();

    @Override // se.k0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final List i() {
        return ((e) this.f19941b.b()).f19938b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k0) && obj.hashCode() == hashCode()) {
            k0 k0Var = (k0) obj;
            if (k0Var.o().size() == o().size()) {
                yc.h hVarH = h();
                yc.h hVarH2 = k0Var.h();
                if (hVarH2 == null || ue.l.f(hVarH) || ee.e.n(hVarH) || ue.l.f(hVarH2) || ee.e.n(hVarH2)) {
                    return false;
                }
                return f(hVarH2);
            }
        }
        return false;
    }

    public abstract boolean f(yc.h hVar);

    public final int hashCode() {
        int i10 = this.f19940a;
        if (i10 != 0) {
            return i10;
        }
        yc.h hVarH = h();
        int iIdentityHashCode = (ue.l.f(hVarH) || ee.e.n(hVarH)) ? System.identityHashCode(this) : ee.e.g(hVarH).f2747a.hashCode();
        this.f19940a = iIdentityHashCode;
        return iIdentityHashCode;
    }

    public List k(List list) {
        return list;
    }
}
