package m4;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q1 f14559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f14560c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ya.i0 f14561a;

    static {
        ya.g0 g0Var = ya.i0.f25998b;
        f14559b = new q1(ya.a1.f25946e);
        int i10 = p4.c0.f16548a;
        f14560c = Integer.toString(0, 36);
    }

    public q1(ya.a1 a1Var) {
        this.f14561a = ya.i0.q(a1Var);
    }

    public final boolean a(int i10) {
        int i11 = 0;
        while (true) {
            ya.i0 i0Var = this.f14561a;
            if (i11 >= i0Var.size()) {
                return false;
            }
            p1 p1Var = (p1) i0Var.get(i11);
            boolean[] zArr = p1Var.f14512e;
            int length = zArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                if (!zArr[i12]) {
                    i12++;
                } else if (p1Var.f14509b.f14306c == i10) {
                    return true;
                }
            }
            i11++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q1.class != obj.getClass()) {
            return false;
        }
        return this.f14561a.equals(((q1) obj).f14561a);
    }

    public final int hashCode() {
        return this.f14561a.hashCode();
    }
}
