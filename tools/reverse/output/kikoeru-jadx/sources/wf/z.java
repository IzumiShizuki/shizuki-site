package wf;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z extends c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f24214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24215b;

    @Override // wf.c1
    public final Object a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f24214a, this.f24215b);
        jc.l.d(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    @Override // wf.c1
    public final void b(int i10) {
        float[] fArr = this.f24214a;
        if (fArr.length < i10) {
            int length = fArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            float[] fArrCopyOf = Arrays.copyOf(fArr, i10);
            jc.l.d(fArrCopyOf, "copyOf(...)");
            this.f24214a = fArrCopyOf;
        }
    }

    @Override // wf.c1
    public final int d() {
        return this.f24215b;
    }
}
