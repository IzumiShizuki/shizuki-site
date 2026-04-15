package qe;

import bd.f0;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import m0.w;
import u3.x0;
import wd.b0;
import wd.h1;
import wd.j0;
import wd.v0;

/* JADX INFO: loaded from: classes.dex */
public final class l implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f18192b;

    public /* synthetic */ l(n nVar, int i10) {
        this.f18191a = i10;
        this.f18192b = nVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        be.e eVar = (be.e) obj;
        switch (this.f18191a) {
            case 0:
                jc.l.e(eVar, "it");
                n nVar = this.f18192b;
                LinkedHashMap linkedHashMap = nVar.f18197a;
                wd.a aVar = b0.f23549z;
                jc.l.d(aVar, "PARSER");
                o oVar = nVar.f18205i;
                byte[] bArr = (byte[]) linkedHashMap.get(eVar);
                Collection<b0> collectionG0 = bArr != null ? df.m.g0(df.m.a0(new ba.u(aVar, new ByteArrayInputStream(bArr), oVar, 2))) : vb.r.f22819a;
                ArrayList arrayList = new ArrayList(collectionG0.size());
                for (b0 b0Var : collectionG0) {
                    oe.t tVar = oVar.f18207b.f16398i;
                    jc.l.b(b0Var);
                    r rVarF = tVar.f(b0Var);
                    if (!oVar.r(rVarF)) {
                        rVarF = null;
                    }
                    if (rVarF != null) {
                        arrayList.add(rVarF);
                    }
                }
                oVar.j(eVar, arrayList);
                return bf.m.d(arrayList);
            case 1:
                jc.l.e(eVar, "it");
                n nVar2 = this.f18192b;
                LinkedHashMap linkedHashMap2 = nVar2.f18198b;
                wd.a aVar2 = j0.D;
                jc.l.d(aVar2, "PARSER");
                o oVar2 = nVar2.f18205i;
                byte[] bArr2 = (byte[]) linkedHashMap2.get(eVar);
                Collection<j0> collectionG02 = bArr2 != null ? df.m.g0(df.m.a0(new ba.u(aVar2, new ByteArrayInputStream(bArr2), oVar2, 2))) : vb.r.f22819a;
                ArrayList arrayList2 = new ArrayList(collectionG02.size());
                for (j0 j0Var : collectionG02) {
                    oe.t tVar2 = oVar2.f18207b.f16398i;
                    jc.l.b(j0Var);
                    arrayList2.add(tVar2.g(j0Var, false));
                }
                oVar2.k(eVar, arrayList2);
                return bf.m.d(arrayList2);
            default:
                jc.l.e(eVar, "it");
                n nVar3 = this.f18192b;
                oe.k kVar = nVar3.f18205i.f18207b;
                byte[] bArr3 = (byte[]) nVar3.f18199c.get(eVar);
                if (bArr3 != null) {
                    v0 v0Var = (v0) v0.f23993q.c(new ByteArrayInputStream(bArr3), kVar.f16390a.f16379p);
                    if (v0Var != null) {
                        oe.t tVar3 = kVar.f16398i;
                        oe.k kVar2 = tVar3.f16423a;
                        yd.f fVar = kVar2.f16391b;
                        f0 f0Var = kVar2.f16393d;
                        List list = v0Var.f24003k;
                        jc.l.d(list, "getAnnotationList(...)");
                        List<wd.h> list2 = list;
                        ArrayList arrayList3 = new ArrayList(vb.n.K(list2, 10));
                        for (wd.h hVar : list2) {
                            w wVar = tVar3.f16424b;
                            jc.l.b(hVar);
                            arrayList3.add(wVar.v(hVar, fVar));
                        }
                        s sVar = new s(kVar2.f16390a.f16364a, kVar2.f16392c, arrayList3.isEmpty() ? zc.g.f26696a : new zc.i(0, arrayList3), x0.r(fVar, v0Var.f23997e), n7.b0.h((h1) yd.d.f26174d.d(v0Var.f23996d)), v0Var, kVar2.f16391b, f0Var, kVar2.f16394e, kVar2.f16396g);
                        List list3 = v0Var.f23998f;
                        jc.l.d(list3, "getTypeParameterList(...)");
                        id.h hVar2 = kVar2.a(sVar, list3, kVar2.f16391b, kVar2.f16393d, kVar2.f16394e, kVar2.f16395f).f16397h;
                        sVar.G1(hVar2.f(), hVar2.o(ud.e.g0(v0Var, f0Var), false), hVar2.o(ud.e.t(v0Var, f0Var), false));
                        return sVar;
                    }
                }
                return null;
        }
    }
}
