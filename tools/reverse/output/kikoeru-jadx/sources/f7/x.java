package f7;

import r.m0;
import r.n1;
import r.q1;
import r.r0;
import r.w0;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6828e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f6829f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6830g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f6831h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6832i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(float f10, w0 w0Var, e7.j jVar, yb.c cVar) {
        super(2, cVar);
        this.f6829f = f10;
        this.f6831h = w0Var;
        this.f6832i = jVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f6828e) {
            case 0:
                return new x(this.f6829f, (w0) this.f6831h, (e7.j) this.f6832i, cVar);
            case 1:
                x xVar = new x((q1) this.f6832i, cVar);
                xVar.f6831h = obj;
                return xVar;
            default:
                return new x((a0.v) this.f6831h, this.f6829f, (r.j) this.f6832i, cVar);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f6828e) {
        }
        return ((x) o(yVar, cVar)).u(a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        Object objA;
        float fN;
        hf.y yVar;
        switch (this.f6828e) {
            case 0:
                w0 w0Var = (w0) this.f6831h;
                float f10 = this.f6829f;
                int i10 = this.f6830g;
                a0 a0Var = a0.f21526a;
                zb.a aVar = zb.a.f26667a;
                if (i10 == 0) {
                    ub.a.f(obj);
                    if (f10 > 0.0f) {
                        this.f6830g = 1;
                        if (w0Var.I1(f10, w0Var.f18604b.getValue(), this) != aVar) {
                        }
                    }
                    return aVar;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return a0Var;
                }
                ub.a.f(obj);
                if (f10 != 0.0f) {
                    return a0Var;
                }
                e7.j jVar = (e7.j) this.f6832i;
                this.f6830g = 2;
                q1 q1Var = w0Var.f18607e;
                if (q1Var == null || ((jc.l.a(w0Var.f18605c.getValue(), jVar) && jc.l.a(w0Var.f18604b.getValue(), jVar)) || (objA = m0.a(w0Var.f18613k, new r0(w0Var, jVar, q1Var, (yb.c) null), this)) != aVar)) {
                    objA = a0Var;
                }
                if (objA != aVar) {
                    return a0Var;
                }
                return aVar;
            case 1:
                int i11 = this.f6830g;
                if (i11 == 0) {
                    ub.a.f(obj);
                    hf.y yVar2 = (hf.y) this.f6831h;
                    fN = r.d.n(yVar2.O());
                    yVar = yVar2;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fN = this.f6829f;
                    yVar = (hf.y) this.f6831h;
                    ub.a.f(obj);
                }
                while (hf.a0.v(yVar)) {
                    n1 n1Var = new n1((q1) this.f6832i, fN);
                    this.f6831h = yVar;
                    this.f6829f = fN;
                    this.f6830g = 1;
                    yb.h hVar = this.f302b;
                    jc.l.b(hVar);
                    Object objK = x0.v.s(hVar).k(n1Var, this);
                    zb.a aVar2 = zb.a.f26667a;
                    if (objK == aVar2) {
                        return aVar2;
                    }
                }
                return a0.f21526a;
            default:
                int i12 = this.f6830g;
                if (i12 == 0) {
                    ub.a.f(obj);
                    r.c cVar = (r.c) ((a0.v) this.f6831h).f154c;
                    Float f11 = new Float(this.f6829f);
                    r.j jVar2 = (r.j) this.f6832i;
                    this.f6830g = 1;
                    Object objD = r.c.d(cVar, f11, jVar2, null, this, 12);
                    zb.a aVar3 = zb.a.f26667a;
                    if (objD == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return a0.f21526a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(a0.v vVar, float f10, r.j jVar, yb.c cVar) {
        super(2, cVar);
        this.f6831h = vVar;
        this.f6829f = f10;
        this.f6832i = jVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(q1 q1Var, yb.c cVar) {
        super(2, cVar);
        this.f6832i = q1Var;
    }
}
