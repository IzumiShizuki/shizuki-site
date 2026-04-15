package cg;

import b0.p0;
import u.n2;
import u.w1;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v f4060h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w0 f4061i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(v vVar, w0 w0Var, yb.c cVar, int i10) {
        super(2, cVar);
        this.f4057e = i10;
        this.f4060h = vVar;
        this.f4061i = w0Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f4057e) {
            case 0:
                k0 k0Var = new k0(this.f4060h, this.f4061i, cVar, 0);
                k0Var.f4059g = obj;
                return k0Var;
            default:
                k0 k0Var2 = new k0(this.f4060h, this.f4061i, cVar, 1);
                k0Var2.f4059g = obj;
                return k0Var2;
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        c2.x xVar = (c2.x) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f4057e) {
        }
        return ((k0) o(xVar, cVar)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        int i10 = this.f4057e;
        zb.a aVar = zb.a.f26667a;
        ub.a0 a0Var = ub.a0.f21526a;
        int i11 = 1;
        switch (i10) {
            case 0:
                int i12 = this.f4058f;
                if (i12 == 0) {
                    ub.a.f(obj);
                    c2.x xVar = (c2.x) this.f4059g;
                    w0 w0Var = this.f4061i;
                    v vVar = this.f4060h;
                    b0 b0Var = new b0(vVar, w0Var);
                    b0 b0Var2 = new b0(vVar, 4);
                    this.f4058f = 1;
                    if (n2.f(xVar, b0Var, null, null, b0Var2, this, 6) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return a0Var;
            default:
                int i13 = this.f4058f;
                if (i13 == 0) {
                    ub.a.f(obj);
                    c2.x xVar2 = (c2.x) this.f4059g;
                    jc.v vVar2 = new jc.v();
                    jc.x xVar3 = new jc.x();
                    v vVar3 = this.f4060h;
                    b bVar = new b(xVar3, vVar3, vVar2, i11);
                    y yVar = new y(vVar3, 5);
                    y yVar2 = new y(vVar3, 6);
                    p0 p0Var = new p0(vVar2, vVar3, xVar3, this.f4061i, 1);
                    this.f4058f = 1;
                    float f10 = u.e0.f20881a;
                    Object objE = w1.e(xVar2, new u.a0(bVar, p0Var, yVar, yVar2, (yb.c) null, 0), this);
                    if (objE != aVar) {
                        objE = a0Var;
                    }
                    if (objE == aVar) {
                        return aVar;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return a0Var;
        }
    }
}
