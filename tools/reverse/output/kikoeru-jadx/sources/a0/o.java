package a0;

import b0.s1;
import b0.u0;
import i2.g1;
import j2.x2;
import java.util.NoSuchElementException;
import l0.l1;
import u.q2;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f81b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f82c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f83d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f84e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj, Object obj2, Object obj3, int i10) {
        super(0);
        this.f81b = i10;
        this.f82c = obj;
        this.f83d = obj2;
        this.f84e = obj3;
    }

    @Override // ic.a
    public final Object b() {
        ub.a0 a0Var;
        switch (this.f81b) {
            case 0:
                j jVar = (j) ((x0.c0) this.f82c).getValue();
                g0 g0Var = (g0) this.f83d;
                return new l(g0Var, jVar, (d) this.f84e, new ah.j((oc.d) ((u0) g0Var.f45d.f156e).getValue(), jVar));
            case 1:
                return new d0.s((ic.p) ((w0) this.f82c).getValue(), (ic.k) ((w0) this.f83d).getValue(), ((Number) ((ic.a) this.f84e).b()).intValue());
            case 2:
                e0.f fVar = (e0.f) this.f82c;
                p1.c cVarB0 = e0.f.B0(fVar, (g1) this.f83d, (s1) this.f84e);
                if (cVarB0 == null) {
                    return null;
                }
                u.g gVar = fVar.f6058o;
                if (f3.l.b(gVar.f20908w, 0L)) {
                    x.a.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return cVarB0.i(gVar.F0(cVarB0, gVar.f20908w) ^ (-9223372034707292160L));
            case 3:
                hf.a0.y((hf.y) this.f82c, null, hf.z.f8619d, new b0.x((w0) this.f83d, (l1) this.f84e, (yb.c) null, 6), 1);
                return ub.a0.f21526a;
            case 4:
                j2.a aVar = (j2.a) this.f82c;
                aVar.removeOnAttachStateChangeListener((j2.y) this.f83d);
                x2 x2Var = (x2) this.f84e;
                jc.l.e(x2Var, "listener");
                vb.w.o(aVar).f26378a.remove(x2Var);
                return ub.a0.f21526a;
            default:
                u.g gVar2 = (u.g) this.f82c;
                b0.m mVar = gVar2.f20904s;
                while (true) {
                    z0.e eVar = mVar.f1296a;
                    int i10 = eVar.f26374c;
                    a0Var = ub.a0.f21526a;
                    if (i10 != 0) {
                        if (i10 == 0) {
                            throw new NoSuchElementException("MutableVector is empty.");
                        }
                        p1.c cVar = (p1.c) ((u.f) eVar.f26372a[i10 - 1]).f20889a.b();
                        if (cVar == null ? true : gVar2.D0(cVar, gVar2.f20908w)) {
                            z0.e eVar2 = mVar.f1296a;
                            ((u.f) eVar2.k(eVar2.f26374c - 1)).f20890b.h(a0Var);
                        }
                    }
                }
                if (gVar2.f20906u) {
                    p1.c cVarC0 = gVar2.C0();
                    if (cVarC0 != null && gVar2.D0(cVarC0, gVar2.f20908w)) {
                        gVar2.f20906u = false;
                    }
                }
                ((q2) this.f83d).f21056e = u.g.B0(gVar2, (u.c) this.f84e);
                return a0Var;
        }
    }
}
