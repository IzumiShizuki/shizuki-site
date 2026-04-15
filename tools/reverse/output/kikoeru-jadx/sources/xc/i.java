package xc;

import bd.g0;
import bd.h0;
import jc.s;
import jc.z;
import n7.b0;
import pc.u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends vc.i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ u[] f24931h = {z.f10839a.g(new s(i.class, "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g0 f24932f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final re.i f24933g;

    public i(re.l lVar) {
        super(lVar);
        this.f24933g = new re.i(lVar, new bd.i(20, this, lVar, false));
    }

    public final l J() {
        return (l) b0.r(this.f24933g, f24931h[0]);
    }

    @Override // vc.i
    public final ad.b d() {
        return J();
    }

    @Override // vc.i
    public final Iterable m() {
        Iterable iterableM = super.m();
        h0 h0VarL = l();
        jc.l.d(h0VarL, "getBuiltInsModule(...)");
        return vb.m.p0(iterableM, new g(this.f22843d, h0VarL));
    }

    @Override // vc.i
    public final ad.d p() {
        return J();
    }
}
