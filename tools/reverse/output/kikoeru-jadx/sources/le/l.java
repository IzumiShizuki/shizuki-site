package le;

import bd.s0;
import yc.k0;

/* JADX INFO: loaded from: classes.dex */
public final class l implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f12329b = new l(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f12330c = new l(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f12331d = new l(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f12332e = new l(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12333a;

    public /* synthetic */ l(int i10) {
        this.f12333a = i10;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f12333a) {
            case 0:
                jc.l.e((be.e) obj, "it");
                return Boolean.TRUE;
            case 1:
                s0 s0Var = (s0) obj;
                jc.l.e(s0Var, "$this$selectMostSpecificInEachOverridableGroup");
                return s0Var;
            case 2:
                k0 k0Var = (k0) obj;
                jc.l.e(k0Var, "$this$selectMostSpecificInEachOverridableGroup");
                return k0Var;
            default:
                yc.b bVar = (yc.b) obj;
                jc.l.e(bVar, "$this$selectMostSpecificInEachOverridableGroup");
                return bVar;
        }
    }
}
