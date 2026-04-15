package xf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements uf.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f24994b = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f24995c = "kotlinx.serialization.json.JsonArray";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wf.c f24996a;

    public f() {
        uf.g gVarA = o.f25013a.a();
        jc.l.e(gVarA, "elementDesc");
        this.f24996a = new wf.c(gVarA, 1);
    }

    @Override // uf.g
    public final List getAnnotations() {
        this.f24996a.getClass();
        return vb.r.f22819a;
    }

    @Override // uf.g
    public final ud.n j() {
        this.f24996a.getClass();
        return uf.k.f21706c;
    }

    @Override // uf.g
    public final boolean l() {
        this.f24996a.getClass();
        return false;
    }

    @Override // uf.g
    public final String m() {
        return f24995c;
    }

    @Override // uf.g
    public final boolean n() {
        this.f24996a.getClass();
        return false;
    }

    @Override // uf.g
    public final int o(String str) {
        jc.l.e(str, "name");
        return this.f24996a.o(str);
    }

    @Override // uf.g
    public final int p() {
        this.f24996a.getClass();
        return 1;
    }

    @Override // uf.g
    public final String q(int i10) {
        this.f24996a.getClass();
        return String.valueOf(i10);
    }

    @Override // uf.g
    public final List r(int i10) {
        this.f24996a.r(i10);
        return vb.r.f22819a;
    }

    @Override // uf.g
    public final uf.g s(int i10) {
        return this.f24996a.s(i10);
    }

    @Override // uf.g
    public final boolean t(int i10) {
        this.f24996a.t(i10);
        return false;
    }
}
