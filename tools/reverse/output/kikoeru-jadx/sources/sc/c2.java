package sc;

/* JADX INFO: loaded from: classes.dex */
public final class c2 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19780b;

    public /* synthetic */ c2(int i10, String str) {
        this.f19779a = i10;
        this.f19780b = str;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f19779a) {
            case 0:
                String strE = q.t0.E(new StringBuilder(), vc.o.f22910m.f2744a.f2747a, '.');
                if (!ef.u.k0(this.f19780b, strE, false)) {
                    strE = null;
                }
                return strE == null ? "" : strE;
            default:
                String strE2 = q.t0.E(new StringBuilder(), vc.o.f22908k.f2744a.f2747a, '.');
                if (!ef.u.k0(this.f19780b, strE2, false)) {
                    strE2 = null;
                }
                return strE2 == null ? "" : strE2;
        }
    }
}
