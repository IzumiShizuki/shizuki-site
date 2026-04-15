package ba;

import i7.f2;
import i7.h2;
import i7.i2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends h2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bg.t f2388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ub.p f2391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ub.p f2392g;

    public i1(String str, bg.t tVar, boolean z10, String str2) {
        jc.l.e(str, "search");
        jc.l.e(str2, "pageName");
        this.f2387b = str;
        this.f2388c = tVar;
        this.f2389d = z10;
        this.f2390e = str2;
        this.f2391f = ub.a.d(new a9.g(24));
        this.f2392g = ub.a.d(new androidx.lifecycle.n0(3, this));
    }

    @Override // i7.h2
    public final Integer a(i2 i2Var) {
        Integer numValueOf;
        Integer num;
        Integer num2;
        Integer num3 = i2Var.f9167b;
        if (num3 != null) {
            int iIntValue = num3.intValue();
            f2 f2VarA = i2Var.a(iIntValue);
            if (f2VarA == null || (num2 = (Integer) f2VarA.f9098b) == null) {
                f2 f2VarA2 = i2Var.a(iIntValue);
                numValueOf = (f2VarA2 == null || (num = (Integer) f2VarA2.f9099c) == null) ? null : Integer.valueOf(num.intValue() - 1);
            } else {
                numValueOf = Integer.valueOf(num2.intValue() + 1);
            }
            if (numValueOf != null) {
                int iIntValue2 = numValueOf.intValue();
                return Integer.valueOf(iIntValue2 >= 1 ? iIntValue2 : 1);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // i7.h2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(i7.c2 r13, ac.c r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.i1.c(i7.c2, ac.c):java.lang.Object");
    }
}
