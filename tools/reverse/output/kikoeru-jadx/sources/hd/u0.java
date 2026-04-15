package hd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f8463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f8464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f8465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f8466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f8467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f8468g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f8469h;

    public u0(int i10, String str) {
        jc.l.e(str, "name");
        this.f8462a = i10;
        this.f8463b = new ArrayList(0);
        this.f8464c = new ArrayList(0);
        new ArrayList(0);
        this.f8465d = new ArrayList();
        this.f8466e = new ArrayList();
        this.f8467f = new ArrayList(0);
        this.f8468g = new ArrayList(0);
        jd.k.f10844a.getClass();
        List listA = jd.j.a();
        ArrayList arrayList = new ArrayList(vb.n.K(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((kd.d) ((jd.k) it.next())).getClass();
            arrayList.add(new kd.c());
        }
        this.f8469h = arrayList;
    }
}
