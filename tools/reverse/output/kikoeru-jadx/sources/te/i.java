package te;

import java.util.Collection;
import java.util.List;
import se.n0;
import se.w;
import yc.q0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i implements fe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f20735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ic.a f20736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f20737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q0 f20738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f20739e;

    public i(n0 n0Var, ic.a aVar, i iVar, q0 q0Var) {
        jc.l.e(n0Var, "projection");
        this.f20735a = n0Var;
        this.f20736b = aVar;
        this.f20737c = iVar;
        this.f20738d = q0Var;
        this.f20739e = ub.a.c(ub.i.f21540a, new bd.e(28, this));
    }

    @Override // fe.b
    public final n0 a() {
        return this.f20735a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!i.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        jc.l.c(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        i iVar = (i) obj;
        i iVar2 = this.f20737c;
        if (iVar2 == null) {
            iVar2 = this;
        }
        i iVar3 = iVar.f20737c;
        if (iVar3 != null) {
            obj = iVar3;
        }
        return iVar2 == obj;
    }

    @Override // se.k0
    public final vc.i g() {
        w wVarB = this.f20735a.b();
        jc.l.d(wVarB, "getType(...)");
        return ud.e.w(wVarB);
    }

    @Override // se.k0
    public final yc.h h() {
        return null;
    }

    public final int hashCode() {
        i iVar = this.f20737c;
        return iVar != null ? iVar.hashCode() : super.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ub.h] */
    @Override // se.k0
    public final Collection i() {
        Collection collection = (List) this.f20739e.getValue();
        if (collection == null) {
            collection = vb.r.f22819a;
        }
        return collection;
    }

    @Override // se.k0
    public final boolean j() {
        return false;
    }

    @Override // se.k0
    public final List o() {
        return vb.r.f22819a;
    }

    public final String toString() {
        return "CapturedType(" + this.f20735a + ')';
    }

    public /* synthetic */ i(n0 n0Var, qe.e eVar, q0 q0Var, int i10) {
        this(n0Var, (i10 & 2) != 0 ? null : eVar, (i) null, (i10 & 8) != 0 ? null : q0Var);
    }
}
