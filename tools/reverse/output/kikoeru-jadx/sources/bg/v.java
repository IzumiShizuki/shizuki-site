package bg;

import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v extends jc.m implements ic.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f2978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f2979d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2980b;

    static {
        int i10 = 0;
        f2978c = new v(i10, 0);
        f2979d = new v(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i10, int i11) {
        super(i10);
        this.f2980b = i11;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f2980b) {
            case 0:
                jc.a0 a0Var = jc.z.f10839a;
                return new sf.f("loli.ball.asmr.bean.RemoteFile", a0Var.b(o0.class), new pc.c[]{a0Var.b(z.class), a0Var.b(d0.class), a0Var.b(g0.class), a0Var.b(j0.class), a0Var.b(n0.class)}, new sf.a[]{x.f2990a, b0.f2844a, e0.f2865a, h0.f2897a, l0.f2920a}, new Annotation[0]);
            default:
                jc.a0 a0Var2 = jc.z.f10839a;
                return new sf.f("loli.ball.asmr.bean.RemoteFile.File", a0Var2.b(k0.class), new pc.c[]{a0Var2.b(z.class), a0Var2.b(d0.class), a0Var2.b(g0.class), a0Var2.b(j0.class)}, new sf.a[]{x.f2990a, b0.f2844a, e0.f2865a, h0.f2897a}, new Annotation[0]);
        }
    }
}
