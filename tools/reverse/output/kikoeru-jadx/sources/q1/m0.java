package q1;

import b0.o1;
import g2.g1;
import g2.u0;
import g2.w0;
import g2.x0;
import i2.q0;
import i2.y1;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends j1.p implements i2.z, y1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f17549o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f17550p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f17551q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f17552r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f17553s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f17554t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public l0 f17555u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f17556v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f17557w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f17558x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f17559y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public q.a0 f17560z;

    @Override // i2.y1
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // i2.z
    public final /* synthetic */ int b(q0 q0Var, u0 u0Var, int i10) {
        return a0.c.k(this, q0Var, u0Var, i10);
    }

    @Override // i2.z
    public final /* synthetic */ int c(q0 q0Var, u0 u0Var, int i10) {
        return a0.c.d(this, q0Var, u0Var, i10);
    }

    @Override // i2.z
    public final /* synthetic */ int d(q0 q0Var, u0 u0Var, int i10) {
        return a0.c.g(this, q0Var, u0Var, i10);
    }

    @Override // i2.z
    public final /* synthetic */ int f(q0 q0Var, u0 u0Var, int i10) {
        return a0.c.n(this, q0Var, u0Var, i10);
    }

    @Override // i2.z
    public final w0 g(x0 x0Var, u0 u0Var, long j10) {
        g1 g1VarV = u0Var.v(j10);
        return x0Var.b0(g1VarV.f7180a, g1VarV.f7181b, vb.s.f22820a, new o1(28, g1VarV, this));
    }

    @Override // i2.y1
    public final boolean h() {
        return false;
    }

    @Override // i2.y1
    public final /* synthetic */ boolean k0() {
        return false;
    }

    @Override // j1.p
    public final boolean o0() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.f17549o);
        sb.append(", scaleY=");
        sb.append(this.f17550p);
        sb.append(", alpha = ");
        sb.append(this.f17551q);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=0.0, rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.f17552r);
        sb.append(", cameraDistance=");
        sb.append(this.f17553s);
        sb.append(", transformOrigin=");
        sb.append((Object) p0.d(this.f17554t));
        sb.append(", shape=");
        sb.append(this.f17555u);
        sb.append(", clip=");
        sb.append(this.f17556v);
        sb.append(", renderEffect=null, ambientShadowColor=");
        t0.K(this.f17557w, ", spotShadowColor=", sb);
        t0.K(this.f17558x, ", compositingStrategy=CompositingStrategy(value=0), blendMode=", sb);
        sb.append((Object) h0.G(this.f17559y));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }

    @Override // i2.y1
    public final void L(q2.k kVar) {
    }
}
