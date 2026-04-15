package wf;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s1 extends c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f24181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24182b;

    @Override // wf.c1
    public final Object a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f24181a, this.f24182b);
        jc.l.d(iArrCopyOf, "copyOf(...)");
        return new ub.u(iArrCopyOf);
    }

    @Override // wf.c1
    public final void b(int i10) {
        int[] iArr = this.f24181a;
        if (iArr.length < i10) {
            int length = iArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            jc.l.d(iArrCopyOf, "copyOf(...)");
            this.f24181a = iArrCopyOf;
        }
    }

    @Override // wf.c1
    public final int d() {
        return this.f24182b;
    }
}
