package j9;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f10760a;

    static {
        bc.b bVar = c0.f10666e;
        ArrayList arrayList = new ArrayList(vb.n.K(bVar, 10));
        jc.b bVar2 = new jc.b(7, bVar);
        while (bVar2.hasNext()) {
            arrayList.add(((c0) bVar2.next()).f10667a);
        }
        f10760a = arrayList;
    }
}
