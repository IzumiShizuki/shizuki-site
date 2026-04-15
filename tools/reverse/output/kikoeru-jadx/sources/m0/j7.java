package m0;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j7 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f13142e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f13144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f13145h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f13146i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f13147j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f13148k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f13149l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(Object obj, Object obj2, r.w0 w0Var, r.q1 q1Var, float f10, yb.c cVar) {
        super(2, cVar);
        this.f13146i = obj;
        this.f13147j = obj2;
        this.f13148k = w0Var;
        this.f13149l = q1Var;
        this.f13144g = f10;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f13142e) {
            case 0:
                return new j7((c2) this.f13145h, (LinkedHashMap) this.f13146i, (j5) this.f13147j, (f3.c) this.f13148k, (ic.n) this.f13149l, this.f13144g, cVar);
            default:
                j7 j7Var = new j7(this.f13146i, this.f13147j, (r.w0) this.f13148k, (r.q1) this.f13149l, this.f13144g, cVar);
                j7Var.f13145h = obj;
                return j7Var;
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f13142e) {
        }
        return ((j7) o(yVar, cVar)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) throws Throwable {
        switch (this.f13142e) {
            case 0:
                f3.c cVar = (f3.c) this.f13148k;
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f13146i;
                c2 c2Var = (c2) this.f13145h;
                int i10 = this.f13143f;
                if (i10 == 0) {
                    ub.a.f(obj);
                    Map map = (Map) c2Var.f12782i.getValue();
                    c2Var.f12782i.setValue(linkedHashMap);
                    c2Var.f12788o.setValue((j5) this.f13147j);
                    c2Var.f12786m.setValue(new a9.p(linkedHashMap, (ic.n) this.f13149l, cVar, 9));
                    c2Var.f12787n.f(cVar.Q(this.f13144g));
                    this.f13143f = 1;
                    Object objB = c2Var.b(map, linkedHashMap, this);
                    zb.a aVar = zb.a.f26667a;
                    if (objB == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return ub.a0.f21526a;
            default:
                r.q1 q1Var = (r.q1) this.f13149l;
                r.w0 w0Var = (r.w0) this.f13148k;
                int i11 = this.f13143f;
                ub.a0 a0Var = ub.a0.f21526a;
                if (i11 == 0) {
                    ub.a.f(obj);
                    hf.y yVar = (hf.y) this.f13145h;
                    Object obj2 = this.f13146i;
                    Object obj3 = this.f13147j;
                    yb.c cVar2 = null;
                    if (jc.l.a(obj2, obj3)) {
                        w0Var.f18616n = null;
                        if (jc.l.a(w0Var.f18605c.getValue(), obj2)) {
                            return a0Var;
                        }
                    } else {
                        r.w0.B1(w0Var);
                    }
                    boolean zA = jc.l.a(obj2, obj3);
                    float f10 = this.f13144g;
                    if (!zA) {
                        q1Var.p(obj2);
                        q1Var.n(0L);
                        w0Var.f18604b.setValue(obj2);
                        q1Var.j(f10);
                    }
                    w0Var.K1(f10);
                    if (w0Var.f18615m.h()) {
                        hf.a0.y(yVar, null, null, new ba.v0(13, w0Var, cVar2), 3);
                    } else {
                        w0Var.f18614l = Long.MIN_VALUE;
                    }
                    this.f13143f = 1;
                    Object objF1 = r.w0.F1(w0Var, this);
                    zb.a aVar2 = zb.a.f26667a;
                    if (objF1 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                w0Var.J1();
                return a0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(c2 c2Var, LinkedHashMap linkedHashMap, j5 j5Var, f3.c cVar, ic.n nVar, float f10, yb.c cVar2) {
        super(2, cVar2);
        this.f13145h = c2Var;
        this.f13146i = linkedHashMap;
        this.f13147j = j5Var;
        this.f13148k = cVar;
        this.f13149l = nVar;
        this.f13144g = f10;
    }
}
