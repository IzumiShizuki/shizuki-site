package wf;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h extends c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f24122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24123b;

    @Override // wf.c1
    public final Object a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f24122a, this.f24123b);
        jc.l.d(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @Override // wf.c1
    public final void b(int i10) {
        byte[] bArr = this.f24122a;
        if (bArr.length < i10) {
            int length = bArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
            jc.l.d(bArrCopyOf, "copyOf(...)");
            this.f24122a = bArrCopyOf;
        }
    }

    @Override // wf.c1
    public final int d() {
        return this.f24123b;
    }
}
