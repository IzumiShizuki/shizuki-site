package wf;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y1 extends c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[] f24212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24213b;

    @Override // wf.c1
    public final Object a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f24212a, this.f24213b);
        jc.l.d(sArrCopyOf, "copyOf(...)");
        return new ub.z(sArrCopyOf);
    }

    @Override // wf.c1
    public final void b(int i10) {
        short[] sArr = this.f24212a;
        if (sArr.length < i10) {
            int length = sArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i10);
            jc.l.d(sArrCopyOf, "copyOf(...)");
            this.f24212a = sArrCopyOf;
        }
    }

    @Override // wf.c1
    public final int d() {
        return this.f24213b;
    }
}
