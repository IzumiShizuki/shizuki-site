package y6;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import m4.p0;
import m7.k0;
import ya.a1;
import ya.g0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements r5.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p4.s f25582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p4.r f25583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r5.q f25584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f25585f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f25587h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f25588i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f25580a = new e(null, 0, "audio/mp4a-latm", true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p4.s f25581b = new p4.s(2048);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f25586g = -1;

    public d(int i10) {
        p4.s sVar = new p4.s(10);
        this.f25582c = sVar;
        byte[] bArr = sVar.f16611a;
        this.f25583d = new p4.r(bArr, bArr.length);
    }

    @Override // r5.n
    public final boolean f(r5.o oVar) throws EOFException, InterruptedIOException {
        int i10 = 0;
        while (true) {
            p4.s sVar = this.f25582c;
            oVar.z(sVar.f16611a, 0, 10);
            sVar.G(0);
            if (sVar.x() != 4801587) {
                break;
            }
            sVar.H(3);
            int iT = sVar.t();
            i10 += iT + 10;
            oVar.k(iT);
        }
        oVar.q();
        oVar.k(i10);
        if (this.f25586g == -1) {
            this.f25586g = i10;
        }
        int i11 = i10;
        int i12 = 0;
        int i13 = 0;
        do {
            p4.s sVar2 = this.f25582c;
            r5.k kVar = (r5.k) oVar;
            kVar.i(sVar2.f16611a, 0, 2, false);
            sVar2.G(0);
            if ((sVar2.A() & 65526) == 65520) {
                i12++;
                if (i12 >= 4 && i13 > 188) {
                    return true;
                }
                kVar.i(sVar2.f16611a, 0, 4, false);
                p4.r rVar = this.f25583d;
                rVar.q(14);
                int i14 = rVar.i(13);
                if (i14 <= 6) {
                    i11++;
                    kVar.f18848f = 0;
                    kVar.a(i11, false);
                } else {
                    kVar.a(i14 - 6, false);
                    i13 += i14;
                }
            } else {
                i11++;
                kVar.f18848f = 0;
                kVar.a(i11, false);
            }
            i12 = 0;
            i13 = 0;
        } while (i11 - i10 < 8192);
        return false;
    }

    @Override // r5.n
    public final int g(r5.o oVar, b0.a aVar) throws p0 {
        p4.c.j(this.f25584e);
        oVar.getLength();
        p4.s sVar = this.f25581b;
        int i10 = oVar.read(sVar.f16611a, 0, 2048);
        boolean z10 = i10 == -1;
        if (!this.f25588i) {
            this.f25584e.a(new r5.s(-9223372036854775807L));
            this.f25588i = true;
        }
        if (z10) {
            return -1;
        }
        sVar.G(0);
        sVar.F(i10);
        boolean z11 = this.f25587h;
        e eVar = this.f25580a;
        if (!z11) {
            eVar.f25630u = this.f25585f;
            this.f25587h = true;
        }
        eVar.b(sVar);
        return 0;
    }

    @Override // r5.n
    public final void h(r5.q qVar) {
        this.f25584e = qVar;
        this.f25580a.c(qVar, new k0(0, 1));
        qVar.n();
    }

    @Override // r5.n
    public final void i(long j10, long j11) {
        this.f25587h = false;
        this.f25580a.a();
        this.f25585f = j11;
    }

    @Override // r5.n
    public final List j() {
        g0 g0Var = i0.f25998b;
        return a1.f25946e;
    }

    @Override // r5.n
    public final void a() {
    }

    @Override // r5.n
    public final r5.n c() {
        return this;
    }
}
