package se;

/* JADX INFO: loaded from: classes.dex */
public final class u implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f19991b = new u(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19992a;

    public /* synthetic */ u(int i10) {
        this.f19992a = i10;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f19992a) {
            case 0:
                w wVar = (w) obj;
                jc.l.e(wVar, "it");
                return wVar.toString();
            default:
                if (((be.c) obj) != null) {
                    return Boolean.valueOf(!r2.equals(vc.n.f22896y));
                }
                throw new IllegalArgumentException("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
        }
    }
}
