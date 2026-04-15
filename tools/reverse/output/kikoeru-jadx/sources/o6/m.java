package o6;

import b7.v2;
import java.io.EOFException;
import m4.o0;
import m4.p;
import m4.q;
import p4.c0;
import p4.s;
import q.t0;
import r5.g0;
import r5.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f16270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f16271b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l f16276g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q f16277h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f16278i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16273d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16274e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f16275f = c0.f16553f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f16272c = new s();

    public m(h0 h0Var, j jVar) {
        this.f16270a = h0Var;
        this.f16271b = jVar;
    }

    @Override // r5.h0
    public final void a(long j10, int i10, int i11, int i12, g0 g0Var) {
        if (this.f16276g == null) {
            this.f16270a.a(j10, i10, i11, i12, g0Var);
            return;
        }
        p4.c.b("DRM on subtitles is not supported", g0Var == null);
        int i13 = (this.f16274e - i12) - i11;
        try {
            this.f16276g.w(this.f16275f, i13, i11, k.f16267c, new v2(this, j10, i10));
        } catch (RuntimeException e10) {
            if (!this.f16278i) {
                throw e10;
            }
            p4.c.C("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e10);
        }
        int i14 = i13 + i11;
        this.f16273d = i14;
        if (i14 == this.f16274e) {
            this.f16273d = 0;
            this.f16274e = 0;
        }
    }

    @Override // r5.h0
    public final void b(q qVar) {
        qVar.f14544n.getClass();
        String str = qVar.f14544n;
        p4.c.c(o0.i(str) == 3);
        boolean zEquals = qVar.equals(this.f16277h);
        j jVar = this.f16271b;
        if (!zEquals) {
            this.f16277h = qVar;
            this.f16276g = jVar.k(qVar) ? jVar.h(qVar) : null;
        }
        l lVar = this.f16276g;
        h0 h0Var = this.f16270a;
        if (lVar == null) {
            h0Var.b(qVar);
            return;
        }
        p pVarA = qVar.a();
        pVarA.f14488m = o0.p("application/x-media3-cues");
        pVarA.f14485j = str;
        pVarA.f14493r = Long.MAX_VALUE;
        pVarA.I = jVar.e(qVar);
        a0.c.O(pVarA, h0Var);
    }

    @Override // r5.h0
    public final int c(m4.i iVar, int i10, boolean z10) throws EOFException {
        if (this.f16276g == null) {
            return this.f16270a.c(iVar, i10, z10);
        }
        g(i10);
        int i11 = iVar.read(this.f16275f, this.f16274e, i10);
        if (i11 != -1) {
            this.f16274e += i11;
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
    public final /* synthetic */ void e(int i10, s sVar) {
        t0.c(this, sVar, i10);
    }

    @Override // r5.h0
    public final void f(s sVar, int i10, int i11) {
        if (this.f16276g == null) {
            this.f16270a.f(sVar, i10, i11);
            return;
        }
        g(i10);
        sVar.e(this.f16275f, this.f16274e, i10);
        this.f16274e += i10;
    }

    public final void g(int i10) {
        int length = this.f16275f.length;
        int i11 = this.f16274e;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.f16273d;
        int iMax = Math.max(i12 * 2, i10 + i12);
        byte[] bArr = this.f16275f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f16273d, bArr2, 0, i12);
        this.f16273d = 0;
        this.f16274e = i12;
        this.f16275f = bArr2;
    }
}
