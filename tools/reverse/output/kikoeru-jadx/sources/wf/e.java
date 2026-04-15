package wf;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean[] f24107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24108b;

    @Override // wf.c1
    public final Object a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f24107a, this.f24108b);
        jc.l.d(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }

    @Override // wf.c1
    public final void b(int i10) {
        boolean[] zArr = this.f24107a;
        if (zArr.length < i10) {
            int length = zArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, i10);
            jc.l.d(zArrCopyOf, "copyOf(...)");
            this.f24107a = zArrCopyOf;
        }
    }

    @Override // wf.c1
    public final int d() {
        return this.f24108b;
    }
}
