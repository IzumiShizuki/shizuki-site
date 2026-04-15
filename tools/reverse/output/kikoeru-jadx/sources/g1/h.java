package g1;

import c7.e1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.k0;
import o.s0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.k f7143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f7144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k0 f7145c;

    public h(Map map, ic.k kVar) {
        k0 k0Var;
        this.f7143a = kVar;
        if (map == null || map.isEmpty()) {
            k0Var = null;
        } else {
            k0Var = new k0(map.size());
            for (Map.Entry entry : map.entrySet()) {
                k0Var.m(entry.getKey(), entry.getValue());
            }
        }
        this.f7144b = k0Var;
    }

    @Override // g1.g
    public final boolean b(Object obj) {
        return ((Boolean) this.f7143a.a(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    @Override // g1.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map c() {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.h.c():java.util.Map");
    }

    @Override // g1.g
    public final Object d(String str) {
        k0 k0Var = this.f7144b;
        List list = k0Var != null ? (List) k0Var.k(str) : null;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && k0Var != null) {
            List listSubList = list.subList(1, list.size());
            int iF = k0Var.f(str);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = k0Var.f15997c;
            Object obj = objArr[iF];
            k0Var.f15996b[iF] = str;
            objArr[iF] = listSubList;
        }
        return list.get(0);
    }

    @Override // g1.g
    public final f g(String str, ic.a aVar) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!gh.g.E(str.charAt(i10))) {
                k0 k0Var = this.f7145c;
                if (k0Var == null) {
                    long[] jArr = s0.f16040a;
                    k0Var = new k0();
                    this.f7145c = k0Var;
                }
                Object objG = k0Var.g(str);
                if (objG == null) {
                    objG = new ArrayList();
                    k0Var.m(str, objG);
                }
                ((List) objG).add(aVar);
                return new e1(k0Var, str, aVar, 13);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
