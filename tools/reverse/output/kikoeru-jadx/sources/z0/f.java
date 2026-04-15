package z0;

import java.util.List;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final void a(int i10, List list) {
        int size = list.size();
        if (i10 < 0 || i10 >= size) {
            c(i10, size);
        }
    }

    public static final void b(int i10, int i11, List list) {
        if (i10 > i11) {
            f(i10, i11);
        }
        if (i10 < 0) {
            d(i10);
        }
        if (i11 > list.size()) {
            e(i11, list.size());
        }
    }

    private static final void c(int i10, int i11) {
        throw new IndexOutOfBoundsException("Index " + i10 + " is out of bounds. The list has " + i11 + " elements.");
    }

    private static final void d(int i10) {
        throw new IndexOutOfBoundsException(t0.C(i10, "fromIndex (", ") is less than 0."));
    }

    private static final void e(int i10, int i11) {
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is more than than the list size (" + i11 + ')');
    }

    private static final void f(int i10, int i11) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i10 + ") is greater than toIndex (" + i11 + ").");
    }
}
