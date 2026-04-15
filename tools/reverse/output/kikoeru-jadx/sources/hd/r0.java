package hd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f8449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f8450b;

    public r0() {
        this.f8449a = new ArrayList(0);
        this.f8450b = new ArrayList(0);
    }

    public r0(int i10, String str, b1 b1Var) {
        jc.l.e(str, "name");
        this.f8449a = new ArrayList(1);
        jd.k.f10844a.getClass();
        List listA = jd.j.a();
        ArrayList arrayList = new ArrayList(vb.n.K(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((kd.d) ((jd.k) it.next())).getClass();
            arrayList.add(new kd.g());
        }
        this.f8450b = arrayList;
    }
}
