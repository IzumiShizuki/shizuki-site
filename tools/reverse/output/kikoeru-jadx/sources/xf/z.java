package xf;

import java.util.List;
import wf.n1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z implements uf.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f25023b = new z();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f25024c = "kotlinx.serialization.json.JsonObject";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wf.d0 f25025a;

    public z() {
        n1 n1Var = n1.f24152a;
        o oVar = o.f25013a;
        n1 n1Var2 = n1.f24152a;
        o oVar2 = o.f25013a;
        uf.g gVarA = n1Var2.a();
        uf.g gVarA2 = oVar2.a();
        jc.l.e(gVarA, "keyDesc");
        jc.l.e(gVarA2, "valueDesc");
        this.f25025a = new wf.d0("kotlin.collections.LinkedHashMap", gVarA, gVarA2);
    }

    @Override // uf.g
    public final List getAnnotations() {
        this.f25025a.getClass();
        return vb.r.f22819a;
    }

    @Override // uf.g
    public final ud.n j() {
        this.f25025a.getClass();
        return uf.k.f21707d;
    }

    @Override // uf.g
    public final boolean l() {
        this.f25025a.getClass();
        return false;
    }

    @Override // uf.g
    public final String m() {
        return f25024c;
    }

    @Override // uf.g
    public final boolean n() {
        this.f25025a.getClass();
        return false;
    }

    @Override // uf.g
    public final int o(String str) {
        jc.l.e(str, "name");
        return this.f25025a.o(str);
    }

    @Override // uf.g
    public final int p() {
        this.f25025a.getClass();
        return 2;
    }

    @Override // uf.g
    public final String q(int i10) {
        this.f25025a.getClass();
        return String.valueOf(i10);
    }

    @Override // uf.g
    public final List r(int i10) {
        this.f25025a.r(i10);
        return vb.r.f22819a;
    }

    @Override // uf.g
    public final uf.g s(int i10) {
        return this.f25025a.s(i10);
    }

    @Override // uf.g
    public final boolean t(int i10) {
        this.f25025a.t(i10);
        return false;
    }
}
