package td;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f20697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f20698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f20700d;

    public m(r rVar, ArrayList arrayList, String str) {
        this.f20697a = rVar;
        this.f20698b = arrayList;
        this.f20699c = str;
        m mVar = null;
        if (str != null) {
            r rVarA = rVar != null ? rVar.a() : null;
            ArrayList arrayList2 = new ArrayList(vb.n.K(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r rVar2 = (r) it.next();
                arrayList2.add(rVar2 != null ? rVar2.a() : null);
            }
            mVar = new m(rVarA, arrayList2, null);
        }
        this.f20700d = mVar;
    }
}
