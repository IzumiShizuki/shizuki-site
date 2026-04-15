package fg;

import ic.k;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends gg.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f7085b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f7086c = new ConcurrentHashMap();

    public static void c(hg.a aVar, k kVar, Object obj, String str) {
        l.e(obj, "hash");
        l.e(str, "key");
        l.e(aVar, "okkv");
        f7086c.put(obj, new a(aVar, kVar, obj, str));
    }

    @Override // gg.a
    public final Object a(hg.b bVar) {
        gg.a aVar = this.f7542a;
        if (aVar != null) {
            return aVar.a(bVar);
        }
        return null;
    }

    @Override // gg.a
    public final void b(hg.b bVar, Object obj) {
        Iterator it = f7086c.entrySet().iterator();
        while (it.hasNext()) {
            a aVar = (a) ((Map.Entry) it.next()).getValue();
            if (l.a(aVar.f7082b, bVar.f8628c) && l.a(aVar.f7081a, bVar.b())) {
                aVar.f7084d.a(obj);
            }
        }
        gg.a aVar2 = this.f7542a;
        if (aVar2 != null) {
            aVar2.b(bVar, obj);
        }
    }
}
