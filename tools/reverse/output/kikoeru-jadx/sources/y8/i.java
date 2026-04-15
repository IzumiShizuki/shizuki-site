package y8;

import a9.r;
import ic.o;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f25921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f25922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f25923c;

    public final void a(String str, ic.k kVar) {
        ArrayList arrayList = this.f25921a;
        ArrayList arrayList2 = this.f25923c;
        arrayList.add(Integer.valueOf(arrayList2.size()));
        b(new f1.f(new i9.k(3, str), -471764823, true));
        kVar.a(this);
        b(c.f25899a);
        ArrayList arrayList3 = this.f25922b;
        arrayList3.add(Integer.valueOf(arrayList2.size() - 2));
        arrayList3.add(Integer.valueOf(arrayList2.size() - 1));
    }

    public final void b(o oVar) {
        jc.l.e(oVar, "content");
        this.f25923c.add(new f(new r(25, oVar)));
    }
}
