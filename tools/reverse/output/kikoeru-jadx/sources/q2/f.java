package q2;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f17593b = new f(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f17594c = new f(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f17595d = new f(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17596a;

    public /* synthetic */ f(int i10) {
        this.f17596a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f17596a) {
            case 0:
                p1.c cVarH = ((o) obj).h();
                p1.c cVarH2 = ((o) obj2).h();
                int iCompare = Float.compare(cVarH.f16483a, cVarH2.f16483a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(cVarH.f16484b, cVarH2.f16484b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(cVarH.f16486d, cVarH2.f16486d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(cVarH.f16485c, cVarH2.f16485c);
            case 1:
                p1.c cVarH3 = ((o) obj).h();
                p1.c cVarH4 = ((o) obj2).h();
                int iCompare4 = Float.compare(cVarH4.f16485c, cVarH3.f16485c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(cVarH3.f16484b, cVarH4.f16484b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(cVarH3.f16486d, cVarH4.f16486d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(cVarH4.f16483a, cVarH3.f16483a);
            default:
                ub.k kVar = (ub.k) obj;
                ub.k kVar2 = (ub.k) obj2;
                int iCompare7 = Float.compare(((p1.c) kVar.f21543a).f16484b, ((p1.c) kVar2.f21543a).f16484b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((p1.c) kVar.f21543a).f16486d, ((p1.c) kVar2.f21543a).f16486d);
        }
    }
}
