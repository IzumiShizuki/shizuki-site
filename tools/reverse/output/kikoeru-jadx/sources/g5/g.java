package g5;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends u4.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f7378j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7379k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7380l;

    @Override // u4.f
    public final void h() {
        super.h();
        this.f7379k = 0;
    }

    public final boolean l(u4.f fVar) {
        ByteBuffer byteBuffer;
        p4.c.c(!fVar.d(1073741824));
        p4.c.c(!fVar.d(268435456));
        p4.c.c(!fVar.d(4));
        if (m()) {
            if (this.f7379k >= this.f7380l) {
                return false;
            }
            ByteBuffer byteBuffer2 = fVar.f21382e;
            if (byteBuffer2 != null && (byteBuffer = this.f21382e) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i10 = this.f7379k;
        this.f7379k = i10 + 1;
        if (i10 == 0) {
            this.f21384g = fVar.f21384g;
            if (fVar.d(1)) {
                this.f17713b = 1;
            }
        }
        ByteBuffer byteBuffer3 = fVar.f21382e;
        if (byteBuffer3 != null) {
            j(byteBuffer3.remaining());
            this.f21382e.put(byteBuffer3);
        }
        this.f7378j = fVar.f21384g;
        return true;
    }

    public final boolean m() {
        return this.f7379k > 0;
    }
}
