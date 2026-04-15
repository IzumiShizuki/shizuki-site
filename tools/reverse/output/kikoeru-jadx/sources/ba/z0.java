package ba;

import bg.e2;
import i7.j1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends androidx.lifecycle.s0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k0 f2528g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0.e1 f2523b = x0.v.v(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0.e1 f2524c = x0.v.v(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ub.p f2525d = ub.a.d(new l0(this, 3));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ub.p f2526e = ub.a.d(new l0(this, 4));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ub.p f2527f = ub.a.d(new l0(this, 5));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lf.j0 f2529h = i7.u.a(new i7.o0(new i7.i1(0, new a9.g(23), null), 0, new j1(25)).f9240f, androidx.lifecycle.m0.h(this));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x0.e1 f2530i = x0.v.v(Boolean.FALSE);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x0.e1 f2531j = x0.v.v(e2.f2876a);

    public final void w() {
        if (b0.a() == e2.f2878c || (b0.a() == e2.f2877b && !g9.a.b())) {
            Boolean bool = Boolean.TRUE;
            if (((Boolean) a0.c.F(Boolean.TYPE, gg.c.a(), "showUnsupportedOrderWarn", bool)).booleanValue()) {
                e2 e2VarA = b0.a();
                jc.l.e(e2VarA, "<set-?>");
                this.f2531j.setValue(e2VarA);
                this.f2530i.setValue(bool);
            }
        }
    }

    public final f1 x(String str) {
        jc.l.e(str, "name");
        int iHashCode = str.hashCode();
        if (iHashCode != -916195790) {
            if (iHashCode != 153797071) {
                if (iHashCode == 2092541239 && str.equals("MAIN_PAGE_DEFAULT")) {
                    return (f1) this.f2525d.getValue();
                }
            } else if (str.equals("MAIN_PAGE_POPULAR")) {
                return (f1) this.f2526e.getValue();
            }
        } else if (str.equals("MAIN_PAGE_RECOMMEND")) {
            return (f1) this.f2527f.getValue();
        }
        throw new IllegalStateException("no such page ".concat(str).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(java.lang.String r12, java.lang.String r13, boolean r14, ac.c r15) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.z0.z(java.lang.String, java.lang.String, boolean, ac.c):java.lang.Object");
    }
}
