package sc;

import java.lang.reflect.Method;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19806a;

    public /* synthetic */ h(int i10) {
        this.f19806a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f19806a) {
            case 0:
                return ud.b.j(((Method) obj).getName(), ((Method) obj2).getName());
            case 1:
                return ud.b.j(((a1) ((pc.n) obj)).b(), ((a1) ((pc.n) obj2)).b());
            default:
                ef.l lVar = i0.f19810a;
                Integer numB = yc.o.b((ld.o) obj, (ld.o) obj2);
                if (numB != null) {
                    return numB.intValue();
                }
                return 0;
        }
    }
}
