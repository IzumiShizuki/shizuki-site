package uh;

import v0.k0;
import v0.l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22052b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j1.q f22053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f22054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1.f f22055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f22056f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f22057g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f22058h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f22059i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f22060j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(a0.d dVar, y yVar, Object obj, j1.q qVar, boolean z10, j1.q qVar2, f1.f fVar, int i10) {
        super(2);
        this.f22057g = dVar;
        this.f22058h = yVar;
        this.f22059i = obj;
        this.f22053c = qVar;
        this.f22054d = z10;
        this.f22060j = qVar2;
        this.f22055e = fVar;
        this.f22056f = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f22052b) {
            case 0:
                ((Number) obj2).intValue();
                a0.d dVar = (a0.d) this.f22057g;
                y yVar = (y) this.f22058h;
                j1.q qVar = (j1.q) this.f22060j;
                ua.j.b(dVar, yVar, this.f22059i, this.f22053c, this.f22054d, qVar, this.f22055e, (x0.o) obj, x0.v.D(this.f22056f | 1));
                break;
            default:
                ((Number) obj2).intValue();
                l0 l0Var = (l0) this.f22057g;
                v0.a0 a0Var = (v0.a0) this.f22058h;
                w.k kVar = (w.k) this.f22059i;
                f1.f fVar = (f1.f) this.f22060j;
                k0.c(l0Var, this.f22053c, this.f22054d, a0Var, kVar, this.f22055e, fVar, (x0.o) obj, x0.v.D(this.f22056f | 1));
                break;
        }
        return ub.a0.f21526a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(l0 l0Var, j1.q qVar, boolean z10, v0.a0 a0Var, w.k kVar, f1.f fVar, f1.f fVar2, int i10) {
        super(2);
        this.f22057g = l0Var;
        this.f22053c = qVar;
        this.f22054d = z10;
        this.f22058h = a0Var;
        this.f22059i = kVar;
        this.f22055e = fVar;
        this.f22060j = fVar2;
        this.f22056f = i10;
    }
}
