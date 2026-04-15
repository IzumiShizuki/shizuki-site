package g5;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7425b;

    public /* synthetic */ s(int i10, Object obj) {
        this.f7424a = i10;
        this.f7425b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f7424a) {
            case 0:
                x xVar = (x) this.f7425b;
                return xVar.d(obj2) - xVar.d(obj);
            case 1:
                return ((Number) ((cg.d) this.f7425b).q(obj, obj2)).intValue();
            case 2:
                return ((Number) ((ic.n) this.f7425b).q(obj, obj2)).intValue();
            default:
                for (ic.k kVar : (ic.k[]) this.f7425b) {
                    int iJ = ud.b.j((Comparable) kVar.a(obj), (Comparable) kVar.a(obj2));
                    if (iJ != 0) {
                        return iJ;
                    }
                }
                return 0;
        }
    }
}
