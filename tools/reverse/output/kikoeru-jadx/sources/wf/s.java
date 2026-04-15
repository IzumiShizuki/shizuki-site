package wf;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s extends c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double[] f24175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24176b;

    @Override // wf.c1
    public final Object a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f24175a, this.f24176b);
        jc.l.d(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }

    @Override // wf.c1
    public final void b(int i10) {
        double[] dArr = this.f24175a;
        if (dArr.length < i10) {
            int length = dArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            double[] dArrCopyOf = Arrays.copyOf(dArr, i10);
            jc.l.d(dArrCopyOf, "copyOf(...)");
            this.f24175a = dArrCopyOf;
        }
    }

    @Override // wf.c1
    public final int d() {
        return this.f24176b;
    }
}
