package i4;

import java.util.LinkedHashMap;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends b {
    public e(b bVar) {
        l.e(bVar, "initialExtras");
        LinkedHashMap linkedHashMap = bVar.f9002a;
        l.e(linkedHashMap, "initialExtras");
        this.f9002a.putAll(linkedHashMap);
    }

    @Override // i4.b
    public final Object a(pe.d dVar) {
        return this.f9002a.get(dVar);
    }

    public /* synthetic */ e() {
        this(a.f9001b);
    }
}
