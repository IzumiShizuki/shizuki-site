package x4;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o extends n4.g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f24661i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f24662j;

    @Override // n4.f
    public final void c(ByteBuffer byteBuffer) {
        int[] iArr = this.f24662j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferK = k(((iLimit - iPosition) / this.f15272b.f15270d) * this.f15273c.f15270d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                byteBufferK.putShort(byteBuffer.getShort((i10 * 2) + iPosition));
            }
            iPosition += this.f15272b.f15270d;
        }
        byteBuffer.position(iLimit);
        byteBufferK.flip();
    }

    @Override // n4.g
    public final n4.d g(n4.d dVar) throws n4.e {
        int[] iArr = this.f24661i;
        if (iArr == null) {
            return n4.d.f15266e;
        }
        int i10 = dVar.f15269c;
        int i11 = dVar.f15268b;
        if (i10 != 2) {
            throw new n4.e(dVar);
        }
        boolean z10 = i11 != iArr.length;
        int i12 = 0;
        while (i12 < iArr.length) {
            int i13 = iArr[i12];
            if (i13 >= i11) {
                throw new n4.e(dVar);
            }
            z10 |= i13 != i12;
            i12++;
        }
        return z10 ? new n4.d(dVar.f15267a, iArr.length, 2) : n4.d.f15266e;
    }

    @Override // n4.g
    public final void h() {
        this.f24662j = this.f24661i;
    }

    @Override // n4.g
    public final void j() {
        this.f24662j = null;
        this.f24661i = null;
    }
}
