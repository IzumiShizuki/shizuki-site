package wf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class b1 implements uf.g, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f24086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24088d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f24089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List[] f24090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f24091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f24092h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f24093i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f24094j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f24095k;

    public b1(String str, c0 c0Var, int i10) {
        this.f24085a = str;
        this.f24086b = c0Var;
        this.f24087c = i10;
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.f24089e = strArr;
        int i12 = this.f24087c;
        this.f24090f = new List[i12];
        this.f24091g = new boolean[i12];
        this.f24092h = vb.s.f22820a;
        final int i13 = 0;
        ic.a aVar = new ic.a(this) { // from class: wf.a1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b1 f24080b;

            {
                this.f24080b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ub.h] */
            @Override // ic.a
            public final Object b() {
                switch (i13) {
                    case 0:
                        c0 c0Var2 = this.f24080b.f24086b;
                        return c0Var2 != null ? c0Var2.c() : z0.f24217b;
                    case 1:
                        return z0.c(this.f24080b.f24086b != null ? new ArrayList(0) : null);
                    default:
                        b1 b1Var = this.f24080b;
                        return Integer.valueOf(z0.e(b1Var, (uf.g[]) b1Var.f24094j.getValue()));
                }
            }
        };
        ub.i iVar = ub.i.f21540a;
        this.f24093i = ub.a.c(iVar, aVar);
        final int i14 = 1;
        this.f24094j = ub.a.c(iVar, new ic.a(this) { // from class: wf.a1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b1 f24080b;

            {
                this.f24080b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ub.h] */
            @Override // ic.a
            public final Object b() {
                switch (i14) {
                    case 0:
                        c0 c0Var2 = this.f24080b.f24086b;
                        return c0Var2 != null ? c0Var2.c() : z0.f24217b;
                    case 1:
                        return z0.c(this.f24080b.f24086b != null ? new ArrayList(0) : null);
                    default:
                        b1 b1Var = this.f24080b;
                        return Integer.valueOf(z0.e(b1Var, (uf.g[]) b1Var.f24094j.getValue()));
                }
            }
        });
        final int i15 = 2;
        this.f24095k = ub.a.c(iVar, new ic.a(this) { // from class: wf.a1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b1 f24080b;

            {
                this.f24080b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ub.h] */
            @Override // ic.a
            public final Object b() {
                switch (i15) {
                    case 0:
                        c0 c0Var2 = this.f24080b.f24086b;
                        return c0Var2 != null ? c0Var2.c() : z0.f24217b;
                    case 1:
                        return z0.c(this.f24080b.f24086b != null ? new ArrayList(0) : null);
                    default:
                        b1 b1Var = this.f24080b;
                        return Integer.valueOf(z0.e(b1Var, (uf.g[]) b1Var.f24094j.getValue()));
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // wf.l
    public final Set a() {
        return this.f24092h.keySet();
    }

    public final void b(String str, boolean z10) {
        jc.l.e(str, "name");
        int i10 = this.f24088d + 1;
        this.f24088d = i10;
        String[] strArr = this.f24089e;
        strArr[i10] = str;
        this.f24091g[i10] = z10;
        this.f24090f[i10] = null;
        if (i10 == this.f24087c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                map.put(strArr[i11], Integer.valueOf(i11));
            }
            this.f24092h = map;
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, ub.h] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, ub.h] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b1) {
            uf.g gVar = (uf.g) obj;
            if (this.f24085a.equals(gVar.m()) && Arrays.equals((uf.g[]) this.f24094j.getValue(), (uf.g[]) ((b1) obj).f24094j.getValue())) {
                int iP = gVar.p();
                int i10 = this.f24087c;
                if (i10 == iP) {
                    for (int i11 = 0; i11 < i10; i11++) {
                        if (jc.l.a(s(i11).m(), gVar.s(i11).m()) && jc.l.a(s(i11).j(), gVar.s(i11).j())) {
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
        return vb.r.f22819a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ub.h] */
    public int hashCode() {
        return ((Number) this.f24095k.getValue()).intValue();
    }

    @Override // uf.g
    public ud.n j() {
        return uf.k.f21705b;
    }

    @Override // uf.g
    public boolean l() {
        return false;
    }

    @Override // uf.g
    public final String m() {
        return this.f24085a;
    }

    @Override // uf.g
    public final boolean n() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // uf.g
    public final int o(String str) {
        jc.l.e(str, "name");
        Integer num = (Integer) this.f24092h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // uf.g
    public final int p() {
        return this.f24087c;
    }

    @Override // uf.g
    public final String q(int i10) {
        return this.f24089e[i10];
    }

    @Override // uf.g
    public final List r(int i10) {
        List list = this.f24090f[i10];
        return list == null ? vb.r.f22819a : list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ub.h] */
    @Override // uf.g
    public uf.g s(int i10) {
        return ((sf.a[]) this.f24093i.getValue())[i10].a();
    }

    @Override // uf.g
    public final boolean t(int i10) {
        return this.f24091g[i10];
    }

    public String toString() {
        return z0.k(this);
    }
}
