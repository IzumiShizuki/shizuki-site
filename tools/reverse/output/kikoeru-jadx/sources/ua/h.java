package ua;

import c2.j0;
import c2.x;
import ic.n;
import u.w1;
import ub.a0;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h extends ac.i implements n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f21509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f21511g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w0 f21512h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w0 f21513i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w0 f21514j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ w0 f21515k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w0 f21516l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(w0 w0Var, w0 w0Var2, w0 w0Var3, w0 w0Var4, w0 w0Var5, yb.c cVar, int i10) {
        super(2, cVar);
        this.f21509e = i10;
        this.f21512h = w0Var;
        this.f21513i = w0Var2;
        this.f21514j = w0Var3;
        this.f21515k = w0Var4;
        this.f21516l = w0Var5;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f21509e) {
            case 0:
                h hVar = new h(this.f21512h, this.f21513i, this.f21514j, this.f21515k, this.f21516l, cVar, 0);
                hVar.f21511g = obj;
                return hVar;
            default:
                h hVar2 = new h(this.f21512h, this.f21513i, this.f21514j, this.f21515k, this.f21516l, cVar, 1);
                hVar2.f21511g = obj;
                return hVar2;
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        x xVar = (x) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f21509e) {
        }
        return ((h) o(xVar, cVar)).u(a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f21509e) {
            case 0:
                int i10 = this.f21510f;
                if (i10 == 0) {
                    ub.a.f(obj);
                    x xVar = (x) this.f21511g;
                    u.a0 a0Var = new u.a0(this.f21512h, this.f21513i, this.f21514j, this.f21515k, this.f21516l, (yb.c) null);
                    this.f21510f = 1;
                    Object objB0 = ((j0) xVar).B0(a0Var, this);
                    zb.a aVar = zb.a.f26667a;
                    if (objB0 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return a0.f21526a;
            default:
                int i11 = this.f21510f;
                if (i11 == 0) {
                    ub.a.f(obj);
                    x xVar2 = (x) this.f21511g;
                    h hVar = new h(this.f21512h, this.f21513i, this.f21514j, this.f21515k, this.f21516l, null, 0);
                    this.f21510f = 1;
                    Object objH = w1.h(xVar2, hVar, this);
                    zb.a aVar2 = zb.a.f26667a;
                    if (objH == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return a0.f21526a;
        }
    }
}
