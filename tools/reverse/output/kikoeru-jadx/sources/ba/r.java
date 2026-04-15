package ba;

import java.util.ArrayList;
import java.util.List;
import x0.n2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n2 f2461b;

    public /* synthetic */ r(n2 n2Var, int i10) {
        this.f2460a = i10;
        this.f2461b = n2Var;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f2460a) {
            case 0:
                return ef.n.V0((String) this.f2461b.getValue(), " ", "");
            case 1:
                return ef.n.R0((String) this.f2461b.getValue(), " ");
            case 2:
                List list = (List) this.f2461b.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (jc.l.a(((e7.j) obj).f6334b.f6399a, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            default:
                return new e3.k(((Boolean) this.f2461b.getValue()).booleanValue() ? 3 : 5);
        }
    }
}
