package sf;

import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jc.z;
import vb.r;
import vb.w;
import yf.t;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends wf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pc.c f20018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f20019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f20020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f20021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f20022e;

    public f(String str, pc.c cVar, pc.c[] cVarArr, a[] aVarArr, Annotation[] annotationArr) {
        jc.l.e(cVar, "baseClass");
        this.f20018a = cVar;
        this.f20019b = r.f22819a;
        this.f20020c = ub.a.c(ub.i.f21540a, new a9.d(25, str, this));
        if (cVarArr.length != aVarArr.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + cVar.y() + " should be marked @Serializable");
        }
        Map mapA = w.A(vb.l.P0(cVarArr, aVarArr));
        this.f20021d = mapA;
        Set<Map.Entry> setEntrySet = mapA.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : setEntrySet) {
            String strM = ((a) entry.getValue()).a().m();
            Object obj = linkedHashMap.get(strM);
            if (obj == null) {
                linkedHashMap.containsKey(strM);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + this.f20018a + "' have the same serial name '" + strM + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(strM, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(w.t(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (a) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.f20022e = linkedHashMap2;
        this.f20019b = vb.l.c0(annotationArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ub.h] */
    @Override // sf.a
    public final uf.g a() {
        return (uf.g) this.f20020c.getValue();
    }

    @Override // wf.b
    public final a e(vf.a aVar, String str) {
        a aVar2 = (a) this.f20022e.get(str);
        return aVar2 != null ? aVar2 : super.e(aVar, str);
    }

    @Override // wf.b
    public final a f(t tVar, Object obj) {
        jc.l.e(obj, "value");
        a aVar = (a) this.f20021d.get(z.f10839a.b(obj.getClass()));
        a aVarF = aVar != null ? aVar : super.f(tVar, obj);
        if (aVarF != null) {
            return aVarF;
        }
        return null;
    }

    @Override // wf.b
    public final pc.c g() {
        return this.f20018a;
    }
}
