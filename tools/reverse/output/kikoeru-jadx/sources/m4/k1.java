package m4;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f14344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f14345d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f14346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ya.i0 f14347b;

    static {
        int i10 = p4.c0.f16548a;
        f14344c = Integer.toString(0, 36);
        f14345d = Integer.toString(1, 36);
    }

    public k1(j1 j1Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= j1Var.f14304a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f14346a = j1Var;
        this.f14347b = ya.i0.q(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k1.class == obj.getClass()) {
            k1 k1Var = (k1) obj;
            if (this.f14346a.equals(k1Var.f14346a) && this.f14347b.equals(k1Var.f14347b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f14347b.hashCode() * 31) + this.f14346a.hashCode();
    }
}
