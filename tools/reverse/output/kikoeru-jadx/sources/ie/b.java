package ie;

import ic.k;
import jc.l;

/* JADX INFO: loaded from: classes.dex */
public final class b implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f9517b = new b(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9518a;

    public /* synthetic */ b(int i10) {
        this.f9518a = i10;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f9518a) {
            case 0:
                yc.k kVar = (yc.k) obj;
                int i10 = d.f9520a;
                l.e(kVar, "it");
                return kVar.y();
            default:
                yc.c cVar = (yc.c) obj;
                l.b(cVar);
                return d.l(cVar);
        }
    }
}
