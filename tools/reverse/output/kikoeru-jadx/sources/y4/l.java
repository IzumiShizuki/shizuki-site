package y4;

import androidx.media3.exoplayer.offline.u;
import j5.c1;
import m4.q;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f25528a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f25530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z4.g f25532e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25533f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f25534g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f25529b = new u(9);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f25535h = -9223372036854775807L;

    public l(z4.g gVar, q qVar, boolean z10) {
        this.f25528a = qVar;
        this.f25532e = gVar;
        this.f25530c = gVar.f26418b;
        c(gVar, z10);
    }

    @Override // j5.c1
    public final boolean a() {
        return true;
    }

    public final void c(z4.g gVar, boolean z10) {
        int i10 = this.f25534g;
        long j10 = -9223372036854775807L;
        long j11 = i10 == 0 ? -9223372036854775807L : this.f25530c[i10 - 1];
        this.f25531d = z10;
        this.f25532e = gVar;
        long[] jArr = gVar.f26418b;
        this.f25530c = jArr;
        long j12 = this.f25535h;
        if (j12 == -9223372036854775807L) {
            if (j11 != -9223372036854775807L) {
                this.f25534g = c0.a(jArr, j11, false);
            }
        } else {
            int iA = c0.a(jArr, j12, true);
            this.f25534g = iA;
            if (this.f25531d && iA == this.f25530c.length) {
                j10 = j12;
            }
            this.f25535h = j10;
        }
    }

    @Override // j5.c1
    public final int j(long j10) {
        int iMax = Math.max(this.f25534g, c0.a(this.f25530c, j10, true));
        int i10 = iMax - this.f25534g;
        this.f25534g = iMax;
        return i10;
    }

    @Override // j5.c1
    public final int n(v2.e eVar, u4.f fVar, int i10) {
        int i11 = this.f25534g;
        boolean z10 = i11 == this.f25530c.length;
        if (z10 && !this.f25531d) {
            fVar.f17713b = 4;
            return -4;
        }
        if ((i10 & 2) != 0 || !this.f25533f) {
            eVar.f22365c = this.f25528a;
            this.f25533f = true;
            return -5;
        }
        if (z10) {
            return -3;
        }
        if ((i10 & 1) == 0) {
            this.f25534g = i11 + 1;
        }
        if ((i10 & 4) == 0) {
            byte[] bArrU0 = this.f25529b.U0(this.f25532e.f26417a[i11]);
            fVar.j(bArrU0.length);
            fVar.f21382e.put(bArrU0);
        }
        fVar.f21384g = this.f25530c[i11];
        fVar.f17713b = 1;
        return -4;
    }

    @Override // j5.c1
    public final void b() {
    }
}
