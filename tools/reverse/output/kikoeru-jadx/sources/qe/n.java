package qe;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jc.a0;
import jc.z;
import q.t0;
import u3.x0;
import vb.w;
import wd.b0;
import wd.j0;
import wd.v0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ pc.u[] f18196j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f18197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f18198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f18199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final re.e f18200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final re.e f18201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final re.j f18202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final re.i f18203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final re.i f18204h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o f18205i;

    static {
        jc.s sVar = new jc.s(n.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0);
        a0 a0Var = z.f10839a;
        f18196j = new pc.u[]{a0Var.g(sVar), t0.H(n.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0, a0Var)};
    }

    public n(o oVar, List list, List list2, List list3) {
        jc.l.e(list, "functionList");
        jc.l.e(list2, "propertyList");
        jc.l.e(list3, "typeAliasList");
        this.f18205i = oVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            be.e eVarR = x0.r(oVar.f18207b.f16391b, ((b0) ((ce.b) obj)).f23554f);
            Object arrayList = linkedHashMap.get(eVarR);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(eVarR, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f18197a = a(linkedHashMap);
        o oVar2 = this.f18205i;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : list2) {
            be.e eVarR2 = x0.r(oVar2.f18207b.f16391b, ((j0) ((ce.b) obj2)).f23781f);
            Object arrayList2 = linkedHashMap2.get(eVarR2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap2.put(eVarR2, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        this.f18198b = a(linkedHashMap2);
        this.f18205i.f18207b.f16390a.f16366c.getClass();
        o oVar3 = this.f18205i;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj3 : list3) {
            be.e eVarR3 = x0.r(oVar3.f18207b.f16391b, ((v0) ((ce.b) obj3)).f23997e);
            Object arrayList3 = linkedHashMap3.get(eVarR3);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap3.put(eVarR3, arrayList3);
            }
            ((List) arrayList3).add(obj3);
        }
        this.f18199c = a(linkedHashMap3);
        this.f18200d = this.f18205i.f18207b.f16390a.f16364a.b(new l(this, 0));
        this.f18201e = this.f18205i.f18207b.f16390a.f16364a.b(new l(this, 1));
        this.f18202f = this.f18205i.f18207b.f16390a.f16364a.c(new l(this, 2));
        o oVar4 = this.f18205i;
        re.l lVar = oVar4.f18207b.f16390a.f16364a;
        m mVar = new m(this, oVar4, 0);
        lVar.getClass();
        this.f18203g = new re.i(lVar, mVar);
        o oVar5 = this.f18205i;
        re.l lVar2 = oVar5.f18207b.f16390a.f16364a;
        m mVar2 = new m(this, oVar5, 1);
        lVar2.getClass();
        this.f18204h = new re.i(lVar2, mVar2);
    }

    public static LinkedHashMap a(LinkedHashMap linkedHashMap) throws IOException {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(w.t(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable<ce.b> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(vb.n.K(iterable, 10));
            for (ce.b bVar : iterable) {
                int iC = bVar.c();
                int i10 = ce.g.i(iC) + iC;
                if (i10 > 4096) {
                    i10 = 4096;
                }
                ce.g gVarU = ce.g.u(byteArrayOutputStream, i10);
                gVarU.O(iC);
                bVar.f(gVarU);
                gVarU.m();
                arrayList.add(ub.a0.f21526a);
            }
            linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap2;
    }
}
