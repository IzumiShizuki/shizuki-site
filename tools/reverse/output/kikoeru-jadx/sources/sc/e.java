package sc;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements wf.j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.k f19790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f19791b;

    public e(ic.k kVar, int i10) {
        switch (i10) {
            case 1:
                this.f19790a = kVar;
                this.f19791b = new ConcurrentHashMap();
                break;
            default:
                this.f19790a = kVar;
                this.f19791b = new ConcurrentHashMap();
                break;
        }
    }

    @Override // wf.j1
    public sf.a a(pc.c cVar) {
        Object objPutIfAbsent;
        Class clsD = g8.a.D(cVar);
        ConcurrentHashMap concurrentHashMap = this.f19791b;
        Object kVar = concurrentHashMap.get(clsD);
        if (kVar == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsD, (kVar = new wf.k((sf.a) this.f19790a.a(cVar))))) != null) {
            kVar = objPutIfAbsent;
        }
        return ((wf.k) kVar).f24137a;
    }

    public Object b(Class cls) {
        jc.l.e(cls, "key");
        ConcurrentHashMap concurrentHashMap = this.f19791b;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return obj;
        }
        Object objA = this.f19790a.a(cls);
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, objA);
        return objPutIfAbsent == null ? objA : objPutIfAbsent;
    }
}
