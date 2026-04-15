package d0;

import u.k1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f5274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f0 f5275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f5277i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r.j f5278j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(f0 f0Var, int i10, float f10, r.j jVar, yb.c cVar) {
        super(2, cVar);
        this.f5275g = f0Var;
        this.f5276h = i10;
        this.f5277i = f10;
        this.f5278j = jVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        b0 b0Var = new b0(this.f5275g, this.f5276h, this.f5277i, this.f5278j, cVar);
        b0Var.f5274f = obj;
        return b0Var;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        return ((b0) o((k1) obj, (yb.c) obj2)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        int i10;
        int i11 = this.f5273e;
        ub.a0 a0Var = ub.a0.f21526a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ub.a.f(obj);
            return a0Var;
        }
        ub.a.f(obj);
        k1 k1Var = (k1) this.f5274f;
        f0 f0Var = this.f5275g;
        a0.w wVar = new a0.w(k1Var, f0Var, 1);
        this.f5273e = 1;
        float f10 = j0.f5359a;
        int i12 = this.f5276h;
        f0Var.f5326s.f(f0Var.i(new Integer(i12).intValue()));
        boolean z10 = i12 > f0Var.f5312e;
        int iE = (wVar.e() - f0Var.f5312e) + 1;
        if (((z10 && i12 > wVar.e()) || (!z10 && i12 < f0Var.f5312e)) && Math.abs(i12 - f0Var.f5312e) >= 3) {
            if (z10) {
                i10 = i12 - iE;
                int i13 = f0Var.f5312e;
                if (i10 < i13) {
                    i10 = i13;
                }
            } else {
                int i14 = iE + i12;
                i10 = f0Var.f5312e;
                if (i14 <= i10) {
                    i10 = i14;
                }
            }
            wVar.f(i10);
        }
        Object objE = r.d.e(0.0f, wVar.b(i12) + this.f5277i, this.f5278j, new b0.i0(7, new jc.v(), wVar), this, 4);
        zb.a aVar = zb.a.f26667a;
        if (objE != aVar) {
            objE = a0Var;
        }
        return objE == aVar ? aVar : a0Var;
    }
}
