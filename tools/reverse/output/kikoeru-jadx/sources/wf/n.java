package wf;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n extends c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f24148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24149b;

    @Override // wf.c1
    public final Object a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f24148a, this.f24149b);
        jc.l.d(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }

    @Override // wf.c1
    public final void b(int i10) {
        char[] cArr = this.f24148a;
        if (cArr.length < i10) {
            int length = cArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i10);
            jc.l.d(cArrCopyOf, "copyOf(...)");
            this.f24148a = cArrCopyOf;
        }
    }

    @Override // wf.c1
    public final int d() {
        return this.f24149b;
    }
}
