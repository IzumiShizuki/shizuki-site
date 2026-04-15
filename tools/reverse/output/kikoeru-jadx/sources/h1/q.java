package h1;

import g2.f1;
import g2.g1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8062a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Collection f8064c;

    public /* synthetic */ q(int i10, ArrayList arrayList) {
        this.f8064c = arrayList;
        this.f8063b = i10;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f8062a) {
            case 0:
                return Boolean.valueOf(((List) obj).addAll(this.f8063b, this.f8064c));
            default:
                ArrayList arrayList = (ArrayList) this.f8064c;
                f1 f1Var = (f1) obj;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    g1 g1Var = (g1) arrayList.get(i10);
                    f1.k(f1Var, g1Var, 0, (this.f8063b - g1Var.f7181b) / 2);
                }
                return ub.a0.f21526a;
        }
    }

    public /* synthetic */ q(int i10, Collection collection) {
        this.f8063b = i10;
        this.f8064c = collection;
    }
}
