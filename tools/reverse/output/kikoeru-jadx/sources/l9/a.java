package l9;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import jc.l;
import n4.f;
import n4.g;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f11885i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ByteBuffer f11886j;

    public a() {
        ByteBuffer byteBuffer = f.f15271a;
        l.d(byteBuffer, "EMPTY_BUFFER");
        this.f11886j = byteBuffer;
    }

    @Override // n4.f
    public final void c(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        if (iRemaining == 0) {
            return;
        }
        if (this.f11886j.capacity() < byteBuffer.remaining()) {
            ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
            l.d(byteBufferOrder, "order(...)");
            this.f11886j = byteBufferOrder;
        } else {
            this.f11886j.clear();
        }
        if (l(byteBuffer)) {
            k(iRemaining).put(this.f11886j).flip();
        } else {
            k(iRemaining).put(byteBuffer).flip();
        }
    }

    @Override // n4.g
    public final n4.d g(n4.d dVar) {
        boolean z10 = dVar.f15269c == 2 && dVar.f15268b == 2;
        this.f11885i = z10;
        if (z10) {
            return dVar;
        }
        n4.d dVar2 = n4.d.f15266e;
        l.d(dVar2, "onConfigure(...)");
        return dVar2;
    }

    public abstract boolean l(ByteBuffer byteBuffer);
}
