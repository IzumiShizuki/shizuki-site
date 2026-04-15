package l0;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f11437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f11438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e3.j f11439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f11440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f11441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f11442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ SuspendPointerInputElement f11443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11444i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o oVar, boolean z10, e3.j jVar, boolean z11, long j10, float f10, SuspendPointerInputElement suspendPointerInputElement, int i10) {
        super(2);
        this.f11437b = oVar;
        this.f11438c = z10;
        this.f11439d = jVar;
        this.f11440e = z11;
        this.f11441f = j10;
        this.f11442g = f10;
        this.f11443h = suspendPointerInputElement;
        this.f11444i = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        u0.d(this.f11437b, this.f11438c, this.f11439d, this.f11440e, this.f11441f, this.f11442g, this.f11443h, (x0.o) obj, x0.v.D(this.f11444i | 1));
        return ub.a0.f21526a;
    }
}
