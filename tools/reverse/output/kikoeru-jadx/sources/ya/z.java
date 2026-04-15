package ya;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z extends y0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator[] f26077a;

    public z(p pVar, p pVar2) {
        this.f26077a = new Comparator[]{pVar, pVar2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f26077a;
            if (i10 >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i10].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i10++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z) {
            return Arrays.equals(this.f26077a, ((z) obj).f26077a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f26077a);
    }

    public final String toString() {
        return j2.h0.n(new StringBuilder("Ordering.compound("), Arrays.toString(this.f26077a), ")");
    }
}
