package ba;

import java.util.List;
import m0.a6;
import m0.l6;
import m0.t6;
import q.v1;
import x0.n2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2285a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2291g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2292h;

    public /* synthetic */ a(j7.b bVar, n2 n2Var, ic.k kVar, x0.w0 w0Var, hf.y yVar, n2 n2Var2, n2 n2Var3) {
        this.f2289e = bVar;
        this.f2287c = n2Var;
        this.f2286b = kVar;
        this.f2288d = w0Var;
        this.f2292h = yVar;
        this.f2290f = n2Var2;
        this.f2291g = n2Var3;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        Object obj2;
        int i10 = this.f2285a;
        ub.a0 a0Var = ub.a0.f21526a;
        int i11 = 1;
        Object obj3 = this.f2288d;
        Object obj4 = this.f2286b;
        Object obj5 = this.f2292h;
        Object obj6 = this.f2291g;
        Object obj7 = this.f2290f;
        Object obj8 = this.f2287c;
        Object obj9 = this.f2289e;
        int i12 = 0;
        switch (i10) {
            case 0:
                j7.b bVar = (j7.b) obj9;
                ic.k kVar = (ic.k) obj4;
                x0.w0 w0Var = (x0.w0) obj3;
                hf.y yVar = (hf.y) obj5;
                n2 n2Var = (n2) obj7;
                n2 n2Var2 = (n2) obj6;
                a0.j jVar = (a0.j) obj;
                jc.l.e(jVar, "$this$LazyColumn");
                if (((String) ((n2) obj8).getValue()).length() == 0) {
                    na.c.h(jVar, bVar, new f1.f(new na.j(kVar, w0Var, 2), 1093874106, true));
                } else if (((ka.q) b9.f.f2284d.getValue()) != ka.q.f11306d) {
                    jVar.l(new f1.f(new l(i12, yVar), -760221337, true));
                } else {
                    List list = (List) n2Var.getValue();
                    jVar.m(list.size(), null, new v(0, list), new f1.f(new w(list, w0Var, n2Var2, i12), -632812321, true));
                }
                return a0Var;
            case 1:
                o.e0 e0Var = (o.e0) obj9;
                f7.i iVar = (f7.i) obj7;
                ic.k kVar2 = (ic.k) obj4;
                ic.k kVar3 = (ic.k) obj6;
                ic.k kVar4 = (ic.k) obj5;
                x0.w0 w0Var2 = (x0.w0) obj3;
                q.m mVar = (q.m) obj;
                float f10 = 0.0f;
                if (!((List) ((n2) obj8).getValue()).contains(mVar.a())) {
                    q.q0 q0Var = q.q0.f17410b;
                    q.r0 r0Var = q.r0.f17434b;
                    int i13 = androidx.compose.animation.a.f454b;
                    return new q.b0(q0Var, r0Var, 0.0f, new v1(q.e.f17272c));
                }
                String str = ((e7.j) mVar.a()).f6338f;
                int iB = e0Var.b(str);
                if (iB >= 0) {
                    f10 = e0Var.f15946c[iB];
                } else {
                    e0Var.d(str, 0.0f);
                }
                if (!jc.l.a(((e7.j) mVar.c()).f6338f, ((e7.j) mVar.a()).f6338f)) {
                    f10 = (((Boolean) iVar.f6764c.getValue()).booleanValue() || ((Boolean) w0Var2.getValue()).booleanValue()) ? f10 - 1.0f : f10 + 1.0f;
                }
                e0Var.d(((e7.j) mVar.c()).f6338f, f10);
                return new q.b0((q.q0) kVar2.a(mVar), (q.r0) kVar3.a(mVar), f10, (v1) kVar4.a(mVar));
            default:
                List list2 = (List) obj8;
                hf.y yVar2 = (hf.y) obj5;
                a6 a6Var = (a6) obj4;
                ic.a aVar = (ic.a) obj3;
                float fFloatValue = ((Float) obj).floatValue();
                float fE = ((x0.a1) obj9).e();
                float f11 = ((jc.v) obj7).f10835a;
                float f12 = ((jc.v) obj6).f10835a;
                float f13 = t6.f13667a;
                if (list2.isEmpty()) {
                    obj2 = null;
                } else {
                    obj2 = list2.get(0);
                    float fAbs = Math.abs(android.support.v4.media.session.b.L(f11, f12, ((Number) obj2).floatValue()) - fE);
                    int iR = ud.b.r(list2);
                    if (1 <= iR) {
                        while (true) {
                            Object obj10 = list2.get(i11);
                            float fAbs2 = Math.abs(android.support.v4.media.session.b.L(f11, f12, ((Number) obj10).floatValue()) - fE);
                            if (Float.compare(fAbs, fAbs2) > 0) {
                                obj2 = obj10;
                                fAbs = fAbs2;
                            }
                            if (i11 != iR) {
                                i11++;
                            }
                        }
                    }
                }
                Float f14 = (Float) obj2;
                float fL = f14 != null ? android.support.v4.media.session.b.L(f11, f12, f14.floatValue()) : fE;
                if (fE != fL) {
                    hf.a0.y(yVar2, null, null, new l6(a6Var, fE, fL, fFloatValue, aVar, null), 3);
                } else if (!((Boolean) a6Var.f12656b.getValue()).booleanValue() && aVar != null) {
                    aVar.b();
                }
                return a0Var;
        }
    }

    public /* synthetic */ a(o.e0 e0Var, f7.i iVar, ic.k kVar, ic.k kVar2, ic.k kVar3, n2 n2Var, x0.w0 w0Var) {
        this.f2289e = e0Var;
        this.f2290f = iVar;
        this.f2286b = kVar;
        this.f2291g = kVar2;
        this.f2292h = kVar3;
        this.f2287c = n2Var;
        this.f2288d = w0Var;
    }

    public /* synthetic */ a(x0.a1 a1Var, List list, jc.v vVar, jc.v vVar2, hf.y yVar, a6 a6Var, ic.a aVar) {
        this.f2289e = a1Var;
        this.f2287c = list;
        this.f2290f = vVar;
        this.f2291g = vVar2;
        this.f2292h = yVar;
        this.f2286b = a6Var;
        this.f2288d = aVar;
    }
}
