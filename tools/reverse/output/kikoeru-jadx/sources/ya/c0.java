package ya;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f25955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25957c;

    public c0(int i10) {
        q.d(i10, "initialCapacity");
        this.f25955a = new Object[i10];
        this.f25956b = 0;
    }

    public static int e(int i10, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i11 <= i10) {
            return i10;
        }
        int iHighestOneBit = i10 + (i10 >> 1) + 1;
        if (iHighestOneBit < i11) {
            iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    public final void a(Object obj) {
        obj.getClass();
        d(1);
        Object[] objArr = this.f25955a;
        int i10 = this.f25956b;
        this.f25956b = i10 + 1;
        objArr[i10] = obj;
    }

    public abstract c0 b(Object obj);

    public final void c(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            d(collection.size());
            if (collection instanceof d0) {
                this.f25956b = ((d0) collection).i(this.f25956b, this.f25955a);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }

    public final void d(int i10) {
        Object[] objArr = this.f25955a;
        int iE = e(objArr.length, this.f25956b + i10);
        if (iE > objArr.length || this.f25957c) {
            this.f25955a = Arrays.copyOf(this.f25955a, iE);
            this.f25957c = false;
        }
    }
}
