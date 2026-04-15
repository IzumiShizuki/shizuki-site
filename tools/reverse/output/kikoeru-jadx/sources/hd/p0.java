package hd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f8440b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f8441c = new ArrayList(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f8442d = new ArrayList(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f8443e;

    public p0(int i10) {
        this.f8439a = i10;
        jd.k.f10844a.getClass();
        List listA = jd.j.a();
        ArrayList arrayList = new ArrayList(vb.n.K(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((kd.d) ((jd.k) it.next())).getClass();
            arrayList.add(new kd.b());
        }
        this.f8443e = arrayList;
    }
}
