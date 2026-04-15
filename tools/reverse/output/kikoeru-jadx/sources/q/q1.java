package q;

import androidx.compose.animation.RenderInTransitionOverlayNodeElement;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q1 implements m1, g2.s0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f17412k = ub.a.c(ub.i.f21541b, i0.f17333g);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hf.y f17413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g2.s0 f17414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17415c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g2.c0 f17419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g2.c0 f17420h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x0.e1 f17416d = x0.v.v(Boolean.FALSE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b0.d0 f17417e = new b0.d0(27, this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p1 f17418f = new p1(this, 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h1.s f17421i = new h1.s();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o.k0 f17422j = new o.k0();

    public q1(g2.s0 s0Var, hf.y yVar) {
        this.f17413a = yVar;
        this.f17414b = s0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ub.h] */
    public final void a() {
        if (this.f17415c) {
            return;
        }
        ((h1.y) f17412k.getValue()).d(this, this.f17418f, this.f17417e);
    }

    @Override // q.m1
    public final j1.q b(j1.q qVar, b0.d0 d0Var, e eVar) {
        return qVar.e(new RenderInTransitionOverlayNodeElement(this, d0Var, eVar));
    }

    @Override // q.m1
    public final j1.q c(l1 l1Var, u uVar, r1 r1Var, s1 s1Var) {
        return new j1.k(new o1(l1Var, uVar.a(), this, s1Var, r1Var));
    }

    @Override // q.m1
    public final l1 d(int i10, Object obj, x0.o oVar) {
        oVar.W(799702514);
        boolean zF = oVar.f(obj);
        Object objK = oVar.K();
        if (zF || objK == x0.k.f24334a) {
            objK = new l1(obj);
            oVar.h0(objK);
        }
        l1 l1Var = (l1) objK;
        oVar.p(false);
        return l1Var;
    }

    @Override // g2.s0
    public final g2.c0 f(i2.g1 g1Var) {
        return this.f17414b.f(g1Var);
    }

    @Override // q.m1
    public final boolean g() {
        return ((Boolean) this.f17416d.getValue()).booleanValue();
    }
}
