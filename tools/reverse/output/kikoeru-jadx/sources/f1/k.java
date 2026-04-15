package f1;

import x0.j1;
import x0.m1;
import x0.r2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k extends c1.c implements j1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f6633d = new k(c1.m.f3232e, 0);

    @Override // c1.c
    /* JADX INFO: renamed from: a */
    public final c1.e builder() {
        j jVar = new j(this);
        jVar.f6632g = this;
        return jVar;
    }

    @Override // c1.c, a1.d
    public final a1.c builder() {
        j jVar = new j(this);
        jVar.f6632g = this;
        return jVar;
    }

    public final k c(m1 m1Var, r2 r2Var) {
        b7.m mVarU = this.f3209a.u(m1Var, m1Var.hashCode(), r2Var, 0);
        return mVarU == null ? this : new k((c1.m) mVarU.f1959c, this.f3210b + mVarU.f1958b);
    }

    @Override // c1.c, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof m1) {
            return super.containsKey((m1) obj);
        }
        return false;
    }

    @Override // vb.e, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof r2) {
            return super.containsValue((r2) obj);
        }
        return false;
    }

    @Override // c1.c, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof m1) {
            return (r2) super.get((m1) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof m1) ? obj2 : (r2) super.getOrDefault((m1) obj, (r2) obj2);
    }
}
