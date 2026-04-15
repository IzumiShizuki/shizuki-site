package i2;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m1 implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m1 f8786b = new m1(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8787a;

    public /* synthetic */ m1(int i10) {
        this.f8787a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f8787a) {
            case 0:
                j0 j0Var = (j0) obj;
                j0 j0Var2 = (j0) obj2;
                int iG = jc.l.g(j0Var2.f8757p, j0Var.f8757p);
                return iG != 0 ? iG : jc.l.g(j0Var.hashCode(), j0Var2.hashCode());
            default:
                j0 j0Var3 = (j0) obj;
                j0 j0Var4 = (j0) obj2;
                int iG2 = jc.l.g(j0Var3.f8757p, j0Var4.f8757p);
                return iG2 != 0 ? iG2 : jc.l.g(j0Var3.hashCode(), j0Var4.hashCode());
        }
    }
}
