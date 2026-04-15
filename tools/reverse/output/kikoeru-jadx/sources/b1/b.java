package b1;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Collection f1422b;

    public /* synthetic */ b(int i10, Collection collection) {
        this.f1421a = i10;
        this.f1422b = collection;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        boolean zContains;
        switch (this.f1421a) {
            case 0:
                zContains = this.f1422b.contains(obj);
                break;
            case 1:
                zContains = this.f1422b.contains(obj);
                break;
            default:
                zContains = ((List) obj).retainAll(this.f1422b);
                break;
        }
        return Boolean.valueOf(zContains);
    }
}
