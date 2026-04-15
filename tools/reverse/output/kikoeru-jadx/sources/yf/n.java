package yf;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import jc.a0;
import jc.z;
import wf.f0;
import wf.z0;
import xf.c0;
import xf.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class n extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y f26293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final uf.g f26294g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f26295h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f26296i;

    public /* synthetic */ n(xf.c cVar, y yVar, String str, int i10) {
        this(cVar, yVar, (i10 & 4) != 0 ? null : str, (uf.g) null);
    }

    @Override // yf.a
    public xf.m E(String str) {
        jc.l.e(str, "tag");
        return (xf.m) vb.w.r(str, S());
    }

    @Override // yf.a
    public String Q(uf.g gVar, int i10) {
        Object next;
        jc.l.e(gVar, "descriptor");
        xf.c cVar = this.f26277c;
        k.n(gVar, cVar);
        String strQ = gVar.q(i10);
        if (this.f26279e.f25010g && !S().f25022a.keySet().contains(strQ)) {
            jc.l.e(cVar, "<this>");
            xa.h hVar = cVar.f24990c;
            a9.d dVar = new a9.d(29, gVar, cVar);
            hVar.getClass();
            l lVar = k.f26290a;
            Object objJ = hVar.j(gVar, lVar);
            if (objJ == null) {
                objJ = dVar.b();
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) hVar.f24888a;
                Object concurrentHashMap2 = concurrentHashMap.get(gVar);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(gVar, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(lVar, objJ);
            }
            Map map = (Map) objJ;
            Iterator it = S().f25022a.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Integer num = (Integer) map.get((String) next);
                if (num != null && num.intValue() == i10) {
                    break;
                }
            }
            String str = (String) next;
            if (str != null) {
                return str;
            }
        }
        return strQ;
    }

    @Override // yf.a
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public y S() {
        return this.f26293f;
    }

    public final boolean Y(uf.g gVar, int i10) {
        boolean z10 = (this.f26277c.f24988a.f25006c || gVar.t(i10) || !gVar.s(i10).n()) ? false : true;
        this.f26296i = z10;
        return z10;
    }

    @Override // vf.a
    public int b(uf.g gVar) {
        jc.l.e(gVar, "descriptor");
        while (this.f26295h < gVar.p()) {
            int i10 = this.f26295h;
            this.f26295h = i10 + 1;
            String strR = R(gVar, i10);
            int i11 = this.f26295h - 1;
            this.f26296i = false;
            if (S().containsKey(strR) || Y(gVar, i11)) {
                if (this.f26279e.f25008e) {
                    boolean zT = gVar.t(i11);
                    uf.g gVarS = gVar.s(i11);
                    if (!zT || gVarS.n() || !(((xf.m) S().get(strR)) instanceof xf.v)) {
                        if (jc.l.a(gVarS.j(), uf.j.f21704b) && (!gVarS.n() || !(((xf.m) S().get(strR)) instanceof xf.v))) {
                            xf.m mVar = (xf.m) S().get(strR);
                            String strA = null;
                            c0 c0Var = mVar instanceof c0 ? (c0) mVar : null;
                            if (c0Var != null) {
                                f0 f0Var = xf.n.f25012a;
                                if (!(c0Var instanceof xf.v)) {
                                    strA = c0Var.a();
                                }
                            }
                            if (strA != null) {
                                xf.c cVar = this.f26277c;
                                int i12 = k.i(gVarS, cVar, strA);
                                boolean z10 = !cVar.f24988a.f25006c && gVarS.n();
                                if (i12 != -3 || ((!zT && !z10) || Y(gVar, i11))) {
                                }
                            }
                        }
                    }
                }
                return i11;
            }
        }
        return -1;
    }

    @Override // yf.a, vf.b
    public final vf.a i(uf.g gVar) {
        jc.l.e(gVar, "descriptor");
        uf.g gVar2 = this.f26294g;
        if (gVar != gVar2) {
            return super.i(gVar);
        }
        xf.m mVarF = F();
        String strM = gVar2.m();
        if (mVarF instanceof y) {
            String str = this.f26278d;
            return new n(this.f26277c, (y) mVarF, str, gVar2);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        a0 a0Var = z.f10839a;
        sb.append(a0Var.b(y.class).y());
        sb.append(", but had ");
        sb.append(a0Var.b(mVarF.getClass()).y());
        sb.append(" as the serialized body of ");
        sb.append(strM);
        sb.append(" at element: ");
        sb.append(U());
        throw k.e(-1, sb.toString(), mVarF.toString());
    }

    @Override // yf.a, vf.a
    public void j(uf.g gVar) {
        Set setJ;
        jc.l.e(gVar, "descriptor");
        xf.c cVar = this.f26277c;
        if (k.k(gVar, cVar) || (gVar.j() instanceof uf.d)) {
            return;
        }
        k.n(gVar, cVar);
        if (this.f26279e.f25010g) {
            Set setB = z0.b(gVar);
            Map map = (Map) cVar.f24990c.j(gVar, k.f26290a);
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = vb.t.f22821a;
            }
            setJ = ud.e.J(setB, setKeySet);
        } else {
            setJ = z0.b(gVar);
        }
        for (String str : S().f25022a.keySet()) {
            if (!setJ.contains(str) && !jc.l.a(str, this.f26278d)) {
                StringBuilder sbK = a0.c.K("Encountered an unknown key '", str, "' at element: ");
                sbK.append(U());
                sbK.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
                sbK.append((Object) k.m(S().toString(), -1));
                throw k.d(-1, sbK.toString());
            }
        }
    }

    @Override // yf.a, vf.b
    public final boolean v() {
        return !this.f26296i && super.v();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(xf.c cVar, y yVar, String str, uf.g gVar) {
        super(cVar, str);
        jc.l.e(cVar, "json");
        this.f26293f = yVar;
        this.f26294g = gVar;
    }
}
