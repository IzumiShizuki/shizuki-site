package u4;

import java.nio.ByteBuffer;
import m4.j0;
import m4.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class f extends q4.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f21380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f21381d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ByteBuffer f21382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f21384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ByteBuffer f21385h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f21386i;

    static {
        j0.a("media3.decoder");
    }

    public f(int i10) {
        this.f21386i = i10;
    }

    public void h() {
        this.f17713b = 0;
        ByteBuffer byteBuffer = this.f21382e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f21385h;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f21383f = false;
    }

    public final ByteBuffer i(int i10) {
        int i11 = this.f21386i;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f21382e;
        throw new e("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i10 + ")");
    }

    public final void j(int i10) {
        ByteBuffer byteBuffer = this.f21382e;
        if (byteBuffer == null) {
            this.f21382e = i(i10);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i11 = i10 + iPosition;
        if (iCapacity >= i11) {
            this.f21382e = byteBuffer;
            return;
        }
        ByteBuffer byteBufferI = i(i11);
        byteBufferI.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferI.put(byteBuffer);
        }
        this.f21382e = byteBufferI;
    }

    public final void k() {
        ByteBuffer byteBuffer = this.f21382e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f21385h;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
