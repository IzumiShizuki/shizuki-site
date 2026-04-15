package sc;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class w implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f19897b = new w(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f19898c = new w(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19899a;

    public /* synthetic */ w(int i10) {
        this.f19899a = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        oe.t tVar = (oe.t) obj;
        wd.j0 j0Var = (wd.j0) obj2;
        switch (this.f19899a) {
            case 0:
                HashSet hashSet = d0.f19785d;
                jc.l.e(tVar, "$this$deserializeToDescriptor");
                jc.l.e(j0Var, "proto");
                break;
            default:
                int i10 = x0.f19911d;
                jc.l.e(tVar, "$this$deserializeToDescriptor");
                jc.l.e(j0Var, "proto");
                break;
        }
        return tVar.g(j0Var, true);
    }
}
