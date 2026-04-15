package mc;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f15096a;

    static {
        Integer num = ec.a.f6475a;
        f15096a = (num == null || num.intValue() >= 34) ? new nc.a() : new b();
    }

    public abstract int a(int i10);

    public abstract int b();

    public int c(int i10, int i11) {
        int iB;
        int i12;
        int iA;
        if (i11 <= i10) {
            throw new IllegalArgumentException(("Random range is empty: [" + Integer.valueOf(i10) + ", " + Integer.valueOf(i11) + ").").toString());
        }
        int i13 = i11 - i10;
        if (i13 > 0 || i13 == Integer.MIN_VALUE) {
            if (((-i13) & i13) == i13) {
                iA = a(31 - Integer.numberOfLeadingZeros(i13));
            } else {
                do {
                    iB = b() >>> 1;
                    i12 = iB % i13;
                } while ((i13 - 1) + (iB - i12) < 0);
                iA = i12;
            }
            return i10 + iA;
        }
        while (true) {
            int iB2 = b();
            if (i10 <= iB2 && iB2 < i11) {
                return iB2;
            }
        }
    }
}
