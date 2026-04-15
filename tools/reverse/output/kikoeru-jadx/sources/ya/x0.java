package ya;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends y0 implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x0 f26071b = new x0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x0 f26072c = new x0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26073a;

    public /* synthetic */ x0(int i10) {
        this.f26073a = i10;
    }

    @Override // ya.y0
    public final y0 a() {
        switch (this.f26073a) {
            case 0:
                return f26072c;
            default:
                return f26071b;
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f26073a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.f26073a) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
