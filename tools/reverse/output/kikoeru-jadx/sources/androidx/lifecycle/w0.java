package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f821a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f821a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((s0) it.next()).k();
        }
        linkedHashMap.clear();
    }
}
