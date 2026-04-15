package vc;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import se.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f22834b;

    public /* synthetic */ f(i iVar, int i10) {
        this.f22833a = i10;
        this.f22834b = iVar;
    }

    @Override // ic.a
    public final Object b() {
        int i10 = this.f22833a;
        i iVar = this.f22834b;
        switch (i10) {
            case 0:
                return Arrays.asList(iVar.l().K0(o.f22908k), iVar.l().K0(o.f22910m), iVar.l().K0(o.f22911n), iVar.l().K0(o.f22909l));
            default:
                EnumMap enumMap = new EnumMap(k.class);
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                for (k kVar : k.values()) {
                    String strB = kVar.f22856a.b();
                    if (strB == null) {
                        i.a(47);
                        throw null;
                    }
                    a0 a0VarE = iVar.k(strB).E();
                    if (a0VarE == null) {
                        i.a(48);
                        throw null;
                    }
                    String strB2 = kVar.f22857b.b();
                    if (strB2 == null) {
                        i.a(47);
                        throw null;
                    }
                    a0 a0VarE2 = iVar.k(strB2).E();
                    if (a0VarE2 == null) {
                        i.a(48);
                        throw null;
                    }
                    enumMap.put(kVar, a0VarE2);
                    map.put(a0VarE, a0VarE2);
                    map2.put(a0VarE2, a0VarE);
                }
                return new h(enumMap, map, map2);
        }
    }
}
