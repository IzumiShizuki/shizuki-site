package v2;

import android.os.Bundle;
import android.util.SparseArray;
import ce.g;
import com.tencent.bugly.beta.tinker.TinkerReport;
import j2.h0;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lh.f0;
import lh.g0;
import m4.o0;
import m4.p;
import m4.z;
import o.k0;
import o.u;
import o6.l;
import p4.c0;
import p4.r;
import p4.s;
import pc.v;
import r5.i;
import ua.j;
import ud.n;
import vb.m;
import wf.j1;
import wf.k;
import wf.l0;
import wf.q;
import wf.t0;
import wf.y0;
import x0.d2;
import x0.v0;
import y0.j0;
import y2.y;
import y6.a0;
import y6.b0;
import y6.d0;
import zg.f;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class e implements d, j1, l, j0, i, a0, g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f22364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f22365c;

    public /* synthetic */ e(int i10, Object obj) {
        this.f22363a = i10;
        this.f22364b = obj;
    }

    public void A(v0 v0Var) {
        Object objG = ((k0) this.f22365c).g(v0Var);
        if (objG != null) {
            if (!(objG instanceof o.g0)) {
                throw new ClassCastException();
            }
            o.g0 g0Var = (o.g0) objG;
            Object[] objArr = g0Var.f15970a;
            if (g0Var.f15971b <= 0) {
                return;
            }
            jc.l.c(objArr[0], "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
            throw new ClassCastException();
        }
    }

    @Override // wf.j1
    public sf.a a(pc.c cVar) {
        Object obj = ((q) this.f22365c).get(g8.a.D(cVar));
        jc.l.d(obj, "get(...)");
        t0 t0Var = (t0) obj;
        Object kVar = t0Var.f24184a.get();
        if (kVar == null) {
            synchronized (t0Var) {
                kVar = t0Var.f24184a.get();
                if (kVar == null) {
                    kVar = new k((sf.a) ((ic.k) this.f22364b).a(cVar));
                    t0Var.f24184a = new SoftReference(kVar);
                }
            }
        }
        return ((k) kVar).f24137a;
    }

    @Override // y6.a0
    public void b(s sVar) {
        d0 d0Var = (d0) this.f22365c;
        SparseArray sparseArray = d0Var.f25596h;
        r rVar = (r) this.f22364b;
        if (sVar.u() == 0 && (sVar.u() & 128) != 0) {
            sVar.H(6);
            int iA = sVar.a() / 4;
            for (int i10 = 0; i10 < iA; i10++) {
                sVar.e(rVar.f16606d, 0, 4);
                rVar.q(0);
                int i11 = rVar.i(16);
                rVar.t(3);
                if (i11 == 0) {
                    rVar.t(13);
                } else {
                    int i12 = rVar.i(13);
                    if (sparseArray.get(i12) == null) {
                        sparseArray.put(i12, new b0(new h7.k(d0Var, i12)));
                        d0Var.f25602n++;
                    }
                }
            }
            if (d0Var.f25589a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override // v2.d
    public int d(int i10) {
        CharSequence charSequence = (CharSequence) this.f22364b;
        do {
            i10 = ((g) this.f22365c).v(i10);
            if (i10 == -1 || i10 == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i10)));
        return i10;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:39:0x00e7
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // r5.i
    public r5.h e(r5.o r17, long r18) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.e.e(r5.o, long):r5.h");
    }

    @Override // o6.l
    public /* synthetic */ o6.d f(byte[] bArr, int i10, int i11) {
        return h0.a(this, bArr, i11);
    }

    @Override // v2.d
    public int g(int i10) {
        do {
            i10 = ((g) this.f22365c).A(i10);
            if (i10 == -1 || i10 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f22364b).charAt(i10 - 1)));
        return i10;
    }

    @Override // y0.j0
    public List h(Integer num) {
        List listH = ((j0) this.f22364b).h(null);
        d2 d2Var = (d2) this.f22365c;
        int i10 = d2Var.f24286v;
        return i10 < 0 ? listH : m.q0(lc.b.l(d2Var, num, i10, Integer.valueOf(d2Var.D(d2Var.f24266b, i10))), listH);
    }

    @Override // v2.d
    public int i(int i10) {
        do {
            i10 = ((g) this.f22365c).A(i10);
            if (i10 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f22364b).charAt(i10)));
        return i10;
    }

    @Override // v2.d
    public int j(int i10) {
        do {
            i10 = ((g) this.f22365c).v(i10);
            if (i10 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f22364b).charAt(i10 - 1)));
        return i10;
    }

    @Override // r5.i
    public void k() {
        s sVar = (s) this.f22365c;
        byte[] bArr = c0.f16553f;
        sVar.getClass();
        sVar.E(bArr, bArr.length);
    }

    public y l(List list) throws IOException {
        y2.g gVar;
        y2.g gVar2 = null;
        try {
            int size = list.size();
            int i10 = 0;
            y2.g gVar3 = null;
            while (i10 < size) {
                try {
                    gVar = (y2.g) list.get(i10);
                } catch (Exception e10) {
                    e = e10;
                    gVar2 = gVar3;
                }
                try {
                    gVar.a((l6.d) this.f22365c);
                    i10++;
                    gVar3 = gVar;
                } catch (Exception e11) {
                    e = e11;
                    gVar2 = gVar;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb2.append(((g) ((l6.d) this.f22365c).f11740f).n());
                    sb2.append(", composition=");
                    sb2.append(((l6.d) this.f22365c).c());
                    sb2.append(", selection=");
                    l6.d dVar = (l6.d) this.f22365c;
                    sb2.append((Object) t2.k0.g(t2.c0.b(dVar.f11736b, dVar.f11737c)));
                    sb2.append("):");
                    sb.append(sb2.toString());
                    sb.append('\n');
                    m.e0(list, sb, "\n", null, null, new e7.y(27, gVar2, this), 60);
                    String string = sb.toString();
                    jc.l.d(string, "toString(...)");
                    throw new RuntimeException(string, e);
                }
            }
            l6.d dVar2 = (l6.d) this.f22365c;
            dVar2.getClass();
            t2.g gVar4 = new t2.g(((g) dVar2.f11740f).toString());
            l6.d dVar3 = (l6.d) this.f22365c;
            long jB = t2.c0.b(dVar3.f11736b, dVar3.f11737c);
            t2.k0 k0Var = t2.k0.f(((y) this.f22364b).f25435b) ? null : new t2.k0(jB);
            y yVar = new y(gVar4, k0Var != null ? k0Var.f20358a : t2.c0.b(t2.k0.d(jB), t2.k0.e(jB)), ((l6.d) this.f22365c).c());
            this.f22364b = yVar;
            return yVar;
        } catch (Exception e12) {
            e = e12;
        }
    }

    @Override // lh.g0
    public lh.h0 m() {
        return (zg.g) this.f22365c;
    }

    public void n() {
        this.f22364b = null;
        this.f22365c = null;
    }

    public void o(long j10, s sVar) {
        if (sVar.a() < 9) {
            return;
        }
        int iG = sVar.g();
        int iG2 = sVar.g();
        int iU = sVar.u();
        if (iG == 434 && iG2 == 1195456820 && iU == 3) {
            r5.b.e(j10, sVar, (r5.h0[]) this.f22365c);
        }
    }

    public Bundle p(String str) {
        jc.l.e(str, "key");
        z zVar = (z) this.f22364b;
        if (!zVar.f14642b) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = (Bundle) zVar.f14648h;
        if (bundle == null) {
            return null;
        }
        Bundle bundleP = bundle.containsKey(str) ? n.p(str, bundle) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            zVar.f14648h = null;
        }
        return bundleP;
    }

    public void q(r5.q qVar, m7.k0 k0Var) {
        r5.h0[] h0VarArr = (r5.h0[]) this.f22365c;
        for (int i10 = 0; i10 < h0VarArr.length; i10++) {
            k0Var.b();
            k0Var.d();
            r5.h0 h0VarU = qVar.u(k0Var.f14908c, 3);
            m4.q qVar2 = (m4.q) ((List) this.f22364b).get(i10);
            String str = qVar2.f14544n;
            p4.c.b("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            p pVar = new p();
            k0Var.d();
            pVar.f14476a = (String) k0Var.f14910e;
            pVar.f14487l = o0.p("video/mp2t");
            pVar.f14488m = o0.p(str);
            pVar.f14480e = qVar2.f14535e;
            pVar.f14479d = qVar2.f14534d;
            pVar.H = qVar2.I;
            pVar.f14491p = qVar2.f14547q;
            a0.c.O(pVar, h0VarU);
            h0VarArr[i10] = h0VarU;
        }
    }

    public Object r(pc.c cVar, ArrayList arrayList) {
        Object objB;
        Object objB2;
        Object objPutIfAbsent;
        switch (this.f22363a) {
            case 5:
                Object obj = ((q) this.f22365c).get(g8.a.D(cVar));
                jc.l.d(obj, "get(...)");
                t0 t0Var = (t0) obj;
                Object y0Var = t0Var.f24184a.get();
                if (y0Var == null) {
                    synchronized (t0Var) {
                        y0Var = t0Var.f24184a.get();
                        if (y0Var == null) {
                            y0Var = new y0();
                            t0Var.f24184a = new SoftReference(y0Var);
                        }
                    }
                }
                y0 y0Var2 = (y0) y0Var;
                ArrayList arrayList2 = new ArrayList(vb.n.K(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new l0((v) it.next()));
                }
                ConcurrentHashMap concurrentHashMap = y0Var2.f24211a;
                Object obj2 = concurrentHashMap.get(arrayList2);
                if (obj2 == null) {
                    try {
                        objB = (sf.a) ((ic.n) this.f22364b).q(cVar, arrayList);
                    } catch (Throwable th2) {
                        objB = ub.a.b(th2);
                    }
                    ub.n nVar = new ub.n(objB);
                    Object objPutIfAbsent2 = concurrentHashMap.putIfAbsent(arrayList2, nVar);
                    obj2 = objPutIfAbsent2 == null ? nVar : objPutIfAbsent2;
                    break;
                }
                return ((ub.n) obj2).f21546a;
            default:
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.f22365c;
                Class clsD = g8.a.D(cVar);
                Object y0Var3 = concurrentHashMap2.get(clsD);
                if (y0Var3 == null && (objPutIfAbsent = concurrentHashMap2.putIfAbsent(clsD, (y0Var3 = new y0()))) != null) {
                    y0Var3 = objPutIfAbsent;
                }
                y0 y0Var4 = (y0) y0Var3;
                ArrayList arrayList3 = new ArrayList(vb.n.K(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new l0((v) it2.next()));
                }
                ConcurrentHashMap concurrentHashMap3 = y0Var4.f24211a;
                Object obj3 = concurrentHashMap3.get(arrayList3);
                if (obj3 == null) {
                    try {
                        objB2 = (sf.a) ((ic.n) this.f22364b).q(cVar, arrayList);
                    } catch (Throwable th3) {
                        objB2 = ub.a.b(th3);
                    }
                    ub.n nVar2 = new ub.n(objB2);
                    Object objPutIfAbsent3 = concurrentHashMap3.putIfAbsent(arrayList3, nVar2);
                    obj3 = objPutIfAbsent3 == null ? nVar2 : objPutIfAbsent3;
                    break;
                }
                return ((ub.n) obj3).f21546a;
        }
    }

    public w7.d s() {
        w7.d dVar;
        z zVar = (z) this.f22364b;
        synchronized (((r5.p) zVar.f14646f)) {
            Iterator it = ((LinkedHashMap) zVar.f14647g).entrySet().iterator();
            do {
                dVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                w7.d dVar2 = (w7.d) entry.getValue();
                if (jc.l.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    dVar = dVar2;
                }
            } while (dVar == null);
        }
        return dVar;
    }

    public void t(Bundle bundle) {
        z zVar = (z) this.f22364b;
        w7.e eVar = (w7.e) zVar.f14644d;
        if (!zVar.f14641a) {
            zVar.a();
        }
        if (eVar.f().a1().compareTo(androidx.lifecycle.p.f797d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + eVar.f().a1()).toString());
        }
        if (zVar.f14642b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleP = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleP = n.p("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        zVar.f14648h = bundleP;
        zVar.f14642b = true;
    }

    @Override // o6.l
    public int u() {
        return 1;
    }

    @Override // lh.g0
    public f0 v() {
        return (f) this.f22364b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0365 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // o6.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w(byte[] r20, int r21, int r22, o6.k r23, p4.g r24) {
        /*
            Method dump skipped, instruction units count: 1062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.e.w(byte[], int, int, o6.k, p4.g):void");
    }

    public void x(Bundle bundle) {
        z zVar = (z) this.f22364b;
        Bundle bundleC = n7.d.c((ub.k[]) Arrays.copyOf(new ub.k[0], 0));
        Bundle bundle2 = (Bundle) zVar.f14648h;
        if (bundle2 != null) {
            bundleC.putAll(bundle2);
        }
        synchronized (((r5.p) zVar.f14646f)) {
            for (Map.Entry entry : ((LinkedHashMap) zVar.f14647g).entrySet()) {
                j.t(bundleC, (String) entry.getKey(), ((w7.d) entry.getValue()).a());
            }
        }
        if (bundleC.isEmpty()) {
            return;
        }
        j.t(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key", bundleC);
    }

    public void y(String str, w7.d dVar) {
        jc.l.e(dVar, "provider");
        z zVar = (z) this.f22364b;
        synchronized (((r5.p) zVar.f14646f)) {
            if (((LinkedHashMap) zVar.f14647g).containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            ((LinkedHashMap) zVar.f14647g).put(str, dVar);
        }
    }

    public void z() {
        if (!((z) this.f22364b).f14643c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        w7.a aVar = (w7.a) this.f22365c;
        if (aVar == null) {
            aVar = new w7.a(this);
        }
        this.f22365c = aVar;
        try {
            androidx.lifecycle.l.class.getDeclaredConstructor(null);
            w7.a aVar2 = (w7.a) this.f22365c;
            if (aVar2 != null) {
                aVar2.f23431a.add(androidx.lifecycle.l.class.getName());
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + androidx.lifecycle.l.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }

    public /* synthetic */ e(int i10, Object obj, Object obj2) {
        this.f22363a = i10;
        this.f22364b = obj;
        this.f22365c = obj2;
    }

    public /* synthetic */ e(int i10, boolean z10) {
        this.f22363a = i10;
    }

    public e(z zVar) {
        this.f22363a = 3;
        this.f22364b = zVar;
        this.f22365c = new e(2, zVar);
    }

    public e(List list) {
        this.f22363a = 17;
        this.f22364b = list;
        this.f22365c = new r5.h0[list.size()];
    }

    public e(ic.k kVar) {
        this.f22363a = 4;
        this.f22364b = kVar;
        this.f22365c = new q();
    }

    public e(p4.y yVar) {
        this.f22363a = 15;
        this.f22364b = yVar;
        this.f22365c = new s();
    }

    public e(int i10, ic.n nVar) {
        this.f22363a = i10;
        switch (i10) {
            case 6:
                this.f22364b = nVar;
                this.f22365c = new ConcurrentHashMap();
                break;
            default:
                this.f22364b = nVar;
                this.f22365c = new q();
                break;
        }
    }

    public e(b5.d0 d0Var) {
        this.f22363a = 18;
        ah.f fVar = (ah.f) d0Var.f1523d;
        this.f22364b = new f(d0Var, fVar.g().v(), -1L, true);
        this.f22365c = new zg.g(d0Var, fVar.g().m(), -1L, true);
    }

    public e(d0 d0Var) {
        this.f22363a = 16;
        this.f22365c = d0Var;
        this.f22364b = new r(new byte[4], 4);
    }

    @Override // o6.l
    public /* synthetic */ void reset() {
    }

    public e(int i10) {
        this.f22363a = i10;
        switch (i10) {
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                this.f22364b = new pe.d(9);
                this.f22365c = new u(16);
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            default:
                this.f22364b = new k0();
                this.f22365c = new k0();
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                this.f22364b = new s();
                this.f22365c = new x6.a();
                break;
        }
    }

    @Override // y6.a0
    public void c(p4.y yVar, r5.q qVar, m7.k0 k0Var) {
    }
}
