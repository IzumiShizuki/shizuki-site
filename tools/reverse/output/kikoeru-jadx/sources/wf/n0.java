package wf;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f24150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24151b;

    @Override // wf.c1
    public final Object a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f24150a, this.f24151b);
        jc.l.d(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @Override // wf.c1
    public final void b(int i10) {
        long[] jArr = this.f24150a;
        if (jArr.length < i10) {
            int length = jArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
            jc.l.d(jArrCopyOf, "copyOf(...)");
            this.f24150a = jArrCopyOf;
        }
    }

    @Override // wf.c1
    public final int d() {
        return this.f24151b;
    }
}
