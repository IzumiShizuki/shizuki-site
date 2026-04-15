package r5;

import java.io.EOFException;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f18857a = new byte[4096];

    @Override // r5.h0
    public final int c(m4.i iVar, int i10, boolean z10) throws EOFException {
        byte[] bArr = this.f18857a;
        int i11 = iVar.read(bArr, 0, Math.min(bArr.length, i10));
        if (i11 != -1) {
            return i11;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // r5.h0
    public final int d(m4.i iVar, int i10, boolean z10) {
        return c(iVar, i10, z10);
    }

    @Override // r5.h0
    public final /* synthetic */ void e(int i10, p4.s sVar) {
        t0.c(this, sVar, i10);
    }

    @Override // r5.h0
    public final void f(p4.s sVar, int i10, int i11) {
        sVar.H(i10);
    }

    @Override // r5.h0
    public final void b(m4.q qVar) {
    }

    @Override // r5.h0
    public final void a(long j10, int i10, int i11, int i12, g0 g0Var) {
    }
}
