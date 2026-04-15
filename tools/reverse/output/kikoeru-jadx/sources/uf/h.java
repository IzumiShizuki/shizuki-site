package uf;

import df.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ub.p;
import ud.n;
import vb.m;
import vb.u;
import vb.w;
import wf.z0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h implements g, wf.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f21692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f21694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f21695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f21696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g[] f21697g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List[] f21698h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean[] f21699i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f21700j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g[] f21701k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p f21702l;

    public h(String str, n nVar, int i10, List list, a aVar) {
        jc.l.e(str, "serialName");
        this.f21691a = str;
        this.f21692b = nVar;
        this.f21693c = i10;
        this.f21694d = aVar.f21671b;
        ArrayList arrayList = aVar.f21672c;
        jc.l.e(arrayList, "<this>");
        HashSet hashSet = new HashSet(w.t(vb.n.K(arrayList, 12)));
        m.E0(arrayList, hashSet);
        this.f21695e = hashSet;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f21696f = strArr;
        this.f21697g = z0.c(aVar.f21674e);
        this.f21698h = (List[]) aVar.f21675f.toArray(new List[0]);
        ArrayList arrayList2 = aVar.f21676g;
        jc.l.e(arrayList2, "<this>");
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            zArr[i11] = ((Boolean) it.next()).booleanValue();
            i11++;
        }
        this.f21699i = zArr;
        o oVarO0 = vb.l.O0(strArr);
        ArrayList arrayList3 = new ArrayList(vb.n.K(oVarO0, 10));
        Iterator it2 = oVarO0.iterator();
        while (true) {
            df.b bVar = (df.b) it2;
            if (!bVar.f5974b.hasNext()) {
                this.f21700j = w.A(arrayList3);
                this.f21701k = z0.c(list);
                this.f21702l = ub.a.d(new t9.f(2, this));
                return;
            }
            u uVar = (u) bVar.next();
            arrayList3.add(new ub.k(uVar.f22823b, Integer.valueOf(uVar.f22822a)));
        }
    }

    @Override // wf.l
    public final Set a() {
        return this.f21695e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            g gVar = (g) obj;
            if (jc.l.a(this.f21691a, gVar.m()) && Arrays.equals(this.f21701k, ((h) obj).f21701k)) {
                int iP = gVar.p();
                int i10 = this.f21693c;
                if (i10 == iP) {
                    for (int i11 = 0; i11 < i10; i11++) {
                        g[] gVarArr = this.f21697g;
                        if (jc.l.a(gVarArr[i11].m(), gVar.s(i11).m()) && jc.l.a(gVarArr[i11].j(), gVar.s(i11).j())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // uf.g
    public final List getAnnotations() {
        return this.f21694d;
    }

    public final int hashCode() {
        return ((Number) this.f21702l.getValue()).intValue();
    }

    @Override // uf.g
    public final n j() {
        return this.f21692b;
    }

    @Override // uf.g
    public final boolean l() {
        return false;
    }

    @Override // uf.g
    public final String m() {
        return this.f21691a;
    }

    @Override // uf.g
    public final boolean n() {
        return false;
    }

    @Override // uf.g
    public final int o(String str) {
        jc.l.e(str, "name");
        Integer num = (Integer) this.f21700j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // uf.g
    public final int p() {
        return this.f21693c;
    }

    @Override // uf.g
    public final String q(int i10) {
        return this.f21696f[i10];
    }

    @Override // uf.g
    public final List r(int i10) {
        return this.f21698h[i10];
    }

    @Override // uf.g
    public final g s(int i10) {
        return this.f21697g[i10];
    }

    @Override // uf.g
    public final boolean t(int i10) {
        return this.f21699i[i10];
    }

    public final String toString() {
        return z0.k(this);
    }
}
