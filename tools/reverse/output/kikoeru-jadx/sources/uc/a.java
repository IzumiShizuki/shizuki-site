package uc;

import be.b;
import be.c;
import java.util.LinkedHashSet;
import java.util.List;
import jc.l;
import ld.w;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f21565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f21566b;

    static {
        List<c> listX = ud.b.x(w.f12257a, w.f12264h, w.f12265i, w.f12259c, w.f12260d, w.f12262f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (c cVar : listX) {
            l.e(cVar, "topLevelFqName");
            linkedHashSet.add(new b(cVar.b(), cVar.f2744a.g()));
        }
        f21565a = linkedHashSet;
        c cVar2 = w.f12263g;
        l.d(cVar2, "REPEATABLE_ANNOTATION");
        f21566b = new b(cVar2.b(), cVar2.f2744a.g());
    }
}
