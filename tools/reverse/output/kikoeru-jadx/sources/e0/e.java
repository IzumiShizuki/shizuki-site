package e0;

import a0.o;
import ac.i;
import b0.s1;
import b0.x;
import ba.u0;
import hf.y;
import i2.g1;
import ic.n;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends i implements n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f6053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f6054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g1 f6055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s1 f6056h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o f6057i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, g1 g1Var, s1 s1Var, o oVar, yb.c cVar) {
        super(2, cVar);
        this.f6054f = fVar;
        this.f6055g = g1Var;
        this.f6056h = s1Var;
        this.f6057i = oVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        e eVar = new e(this.f6054f, this.f6055g, this.f6056h, this.f6057i, cVar);
        eVar.f6053e = obj;
        return eVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        return ((e) o((y) obj, (yb.c) obj2)).u(a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        ub.a.f(obj);
        y yVar = (y) this.f6053e;
        s1 s1Var = this.f6056h;
        int i10 = 4;
        f fVar = this.f6054f;
        yb.c cVar = null;
        hf.a0.y(yVar, null, null, new x(fVar, this.f6055g, s1Var, cVar, i10), 3);
        return hf.a0.y(yVar, null, null, new u0(fVar, this.f6057i, cVar, i10), 3);
    }
}
