package u9;

import ic.k;
import java.util.ArrayList;
import java.util.List;
import ub.a0;
import vb.m;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0 f21456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21457b;

    public b(w0 w0Var, int i10) {
        this.f21456a = w0Var;
        this.f21457b = i10;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        Boolean bool = (Boolean) obj;
        bool.getClass();
        w0 w0Var = this.f21456a;
        ArrayList arrayListH0 = m.H0((List) w0Var.getValue());
        int i10 = this.f21457b;
        arrayListH0.set(i10, new ub.k(((ub.k) arrayListH0.get(i10)).f21543a, bool));
        w0Var.setValue(arrayListH0);
        return a0.f21526a;
    }
}
