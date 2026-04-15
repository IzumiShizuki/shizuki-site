package ch;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f4158b = new int[10];

    public final int a() {
        if ((this.f4157a & 16) != 0) {
            return this.f4158b[4];
        }
        return 65535;
    }

    public final void b(c0 c0Var) {
        jc.l.e(c0Var, "other");
        for (int i10 = 0; i10 < 10; i10++) {
            if (((1 << i10) & c0Var.f4157a) != 0) {
                c(i10, c0Var.f4158b[i10]);
            }
        }
    }

    public final void c(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f4158b;
            if (i10 >= iArr.length) {
                return;
            }
            this.f4157a = (1 << i10) | this.f4157a;
            iArr[i10] = i11;
        }
    }
}
