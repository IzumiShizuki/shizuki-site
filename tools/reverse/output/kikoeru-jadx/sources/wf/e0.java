package wf;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sf.a f24109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sf.a f24110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f24111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0 f24112d;

    public e0(sf.a aVar, sf.a aVar2, byte b10) {
        this.f24109a = aVar;
        this.f24110b = aVar2;
    }

    @Override // sf.a
    public final uf.g a() {
        switch (this.f24111c) {
        }
        return this.f24112d;
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        h(obj);
        uf.g gVarA = a();
        jc.l.e(gVarA, "descriptor");
        yf.t tVarA = tVar.a(gVarA);
        Iterator itG = g(obj);
        int i10 = 0;
        while (itG.hasNext()) {
            Map.Entry entry = (Map.Entry) itG.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i11 = i10 + 1;
            tVarA.r(a(), i10, this.f24109a, key);
            i10 += 2;
            tVarA.r(a(), i11, this.f24110b, value);
        }
        tVarA.w(gVarA);
    }

    @Override // wf.a
    public final Object e() {
        switch (this.f24111c) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // wf.a
    public final int f(Object obj) {
        int size;
        switch (this.f24111c) {
            case 0:
                HashMap map = (HashMap) obj;
                jc.l.e(map, "<this>");
                size = map.size();
                break;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                jc.l.e(linkedHashMap, "<this>");
                size = linkedHashMap.size();
                break;
        }
        return size * 2;
    }

    @Override // wf.a
    public final Iterator g(Object obj) {
        switch (this.f24111c) {
            case 0:
                Map map = (Map) obj;
                jc.l.e(map, "<this>");
                return map.entrySet().iterator();
            default:
                Map map2 = (Map) obj;
                jc.l.e(map2, "<this>");
                return map2.entrySet().iterator();
        }
    }

    @Override // wf.a
    public final int h(Object obj) {
        switch (this.f24111c) {
            case 0:
                Map map = (Map) obj;
                jc.l.e(map, "<this>");
                return map.size();
            default:
                Map map2 = (Map) obj;
                jc.l.e(map2, "<this>");
                return map2.size();
        }
    }

    @Override // wf.a
    public final void j(vf.a aVar, int i10, Object obj) {
        Map map = (Map) obj;
        jc.l.e(map, "builder");
        Object objG = aVar.g(a(), i10, this.f24109a, null);
        int iB = aVar.b(a());
        if (iB != i10 + 1) {
            throw new IllegalArgumentException(a0.c.I("Value must follow key in a map, index for key: ", i10, iB, ", returned index for value: ").toString());
        }
        boolean zContainsKey = map.containsKey(objG);
        sf.a aVar2 = this.f24110b;
        map.put(objG, (!zContainsKey || (aVar2.a().j() instanceof uf.f)) ? aVar.g(a(), iB, aVar2, null) : aVar.g(a(), iB, aVar2, vb.w.r(objG, map)));
    }

    @Override // wf.a
    public final Object k(Object obj) {
        switch (this.f24111c) {
            case 0:
                jc.l.e(null, "<this>");
                return new HashMap((Map) null);
            default:
                jc.l.e(null, "<this>");
                return new LinkedHashMap((Map) null);
        }
    }

    @Override // wf.a
    public final Object l(Object obj) {
        switch (this.f24111c) {
            case 0:
                HashMap map = (HashMap) obj;
                jc.l.e(map, "<this>");
                return map;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                jc.l.e(linkedHashMap, "<this>");
                return linkedHashMap;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e0(sf.a aVar, sf.a aVar2, int i10) {
        this(aVar, aVar2, (byte) 0);
        this.f24111c = i10;
        switch (i10) {
            case 1:
                jc.l.e(aVar, "kSerializer");
                jc.l.e(aVar2, "vSerializer");
                this(aVar, aVar2, (byte) 0);
                uf.g gVarA = aVar.a();
                uf.g gVarA2 = aVar2.a();
                jc.l.e(gVarA, "keyDesc");
                jc.l.e(gVarA2, "valueDesc");
                this.f24112d = new d0("kotlin.collections.LinkedHashMap", gVarA, gVarA2);
                break;
            default:
                jc.l.e(aVar, "kSerializer");
                jc.l.e(aVar2, "vSerializer");
                uf.g gVarA3 = aVar.a();
                uf.g gVarA4 = aVar2.a();
                jc.l.e(gVarA3, "keyDesc");
                jc.l.e(gVarA4, "valueDesc");
                this.f24112d = new d0("kotlin.collections.HashMap", gVarA3, gVarA4);
                break;
        }
    }
}
