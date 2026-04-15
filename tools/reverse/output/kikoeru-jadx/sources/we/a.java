package we;

import ic.k;
import jc.l;
import se.w0;
import yc.h;
import yc.p0;
import yc.q0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f24075b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f24076c = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24077a;

    public /* synthetic */ a(int i10) {
        this.f24077a = i10;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        w0 w0Var = (w0) obj;
        switch (this.f24077a) {
            case 0:
                l.e(w0Var, "it");
                h hVarH = w0Var.t().h();
                return Boolean.valueOf(hVarH != null && (hVarH instanceof q0) && (((q0) hVarH).y() instanceof p0));
            default:
                l.e(w0Var, "it");
                h hVarH2 = w0Var.t().h();
                return Boolean.valueOf(hVarH2 != null && ((hVarH2 instanceof p0) || (hVarH2 instanceof q0)));
        }
    }
}
