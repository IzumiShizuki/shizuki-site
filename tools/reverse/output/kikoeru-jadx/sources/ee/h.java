package ee;

import java.util.Comparator;
import yc.k0;
import yc.p0;
import yc.t;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f6526b = new h(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6527a;

    public /* synthetic */ h(int i10) {
        this.f6527a = i10;
    }

    public static int a(yc.k kVar) {
        if (kVar == null) {
            e.a(36);
            throw null;
        }
        if (e.m(kVar, yc.f.f26112d)) {
            return 8;
        }
        if (kVar instanceof yc.j) {
            return 7;
        }
        if (kVar instanceof k0) {
            return ((k0) kVar).v0() == null ? 6 : 5;
        }
        if (kVar instanceof t) {
            return ((t) kVar).v0() == null ? 4 : 3;
        }
        if (kVar instanceof yc.e) {
            return 2;
        }
        return kVar instanceof p0 ? 1 : 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer numValueOf;
        switch (this.f6527a) {
            case 0:
                yc.k kVar = (yc.k) obj;
                yc.k kVar2 = (yc.k) obj2;
                int iA = a(kVar2) - a(kVar);
                if (iA != 0) {
                    numValueOf = Integer.valueOf(iA);
                } else {
                    yc.f fVar = yc.f.f26112d;
                    if (e.m(kVar, fVar) && e.m(kVar2, fVar)) {
                        numValueOf = 0;
                    } else {
                        int iCompareTo = kVar.getName().f2751a.compareTo(kVar2.getName().f2751a);
                        numValueOf = iCompareTo != 0 ? Integer.valueOf(iCompareTo) : null;
                    }
                }
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
                return 0;
            default:
                return ud.b.j(ie.d.g((yc.e) obj).f2744a.f2747a, ie.d.g((yc.e) obj2).f2744a.f2747a);
        }
    }
}
