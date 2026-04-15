package ld;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f12233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f12234b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f12235c;

    static {
        a aVar = a.f12171c;
        List listX = ud.b.x(a.f12172d, a.f12170b, aVar, a.f12174f, a.f12173e);
        List listW = ud.b.w(aVar);
        be.c cVar = x.f12274a;
        td.g gVar = td.g.f20682c;
        List list = listX;
        Map mapV = vb.w.v(new ub.k(cVar, new m(new td.h(gVar), list, false, true)), new ub.k(x.f12275b, new m(new td.h(gVar), list, false, true)), new ub.k(x.f12276c, new m(new td.h(td.g.f20680a), list, 4)));
        f12233a = mapV;
        List list2 = listW;
        f12235c = vb.w.x(mapV, vb.w.v(new ub.k(x.f12281h, new m(new td.h(gVar), list2, 12)), new ub.k(x.f12282i, new m(new td.h(td.g.f20681b), list2, 12))));
    }
}
