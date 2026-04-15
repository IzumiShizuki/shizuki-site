package td;

import java.util.LinkedHashMap;
import java.util.Map;
import vb.w;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f20718a;

    public r(LinkedHashMap linkedHashMap) {
        this.f20718a = linkedHashMap;
    }

    public final r a() {
        LinkedHashMap linkedHashMap = this.f20718a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(w.t(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            d dVar = (d) entry.getValue();
            linkedHashMap2.put(key, new d(dVar.f20672a, dVar.f20673b, dVar.f20674c, true));
        }
        return new r(linkedHashMap2);
    }
}
