package z6;

import java.math.RoundingMode;
import m4.o0;
import m4.p;
import m4.p0;
import p4.c0;
import r5.h0;
import r5.o;
import r5.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f26491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f26492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l6.d f26493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m4.q f26494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f26496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f26497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f26498h;

    public c(q qVar, h0 h0Var, l6.d dVar, String str, int i10) throws p0 {
        this.f26491a = qVar;
        this.f26492b = h0Var;
        this.f26493c = dVar;
        int i11 = dVar.f11736b;
        int i12 = dVar.f11737c;
        int i13 = (dVar.f11739e * i11) / 8;
        int i14 = dVar.f11738d;
        if (i14 != i13) {
            throw p0.a(null, "Expected block size: " + i13 + "; got: " + i14);
        }
        int i15 = i12 * i13;
        int i16 = i15 * 8;
        int iMax = Math.max(i13, i15 / 10);
        this.f26495e = iMax;
        p pVar = new p();
        pVar.f14487l = o0.p("audio/wav");
        pVar.f14488m = o0.p(str);
        pVar.f14483h = i16;
        pVar.f14484i = i16;
        pVar.f14489n = iMax;
        pVar.C = i11;
        pVar.D = i12;
        pVar.E = i10;
        this.f26494d = new m4.q(pVar);
    }

    @Override // z6.b
    public final void a(long j10) {
        this.f26496f = j10;
        this.f26497g = 0;
        this.f26498h = 0L;
    }

    @Override // z6.b
    public final boolean b(o oVar, long j10) {
        int i10;
        int i11;
        long j11 = j10;
        while (j11 > 0 && (i10 = this.f26497g) < (i11 = this.f26495e)) {
            int iD = this.f26492b.d(oVar, (int) Math.min(i11 - i10, j11), true);
            if (iD == -1) {
                j11 = 0;
            } else {
                this.f26497g += iD;
                j11 -= (long) iD;
            }
        }
        l6.d dVar = this.f26493c;
        int i12 = dVar.f11738d;
        int i13 = this.f26497g / i12;
        if (i13 > 0) {
            long j12 = this.f26496f;
            long j13 = this.f26498h;
            long j14 = dVar.f11737c;
            int i14 = c0.f16548a;
            long jV = j12 + c0.V(j13, 1000000L, j14, RoundingMode.DOWN);
            int i15 = i13 * i12;
            int i16 = this.f26497g - i15;
            this.f26492b.a(jV, 1, i15, i16, null);
            this.f26498h += (long) i13;
            this.f26497g = i16;
        }
        return j11 <= 0;
    }

    @Override // z6.b
    public final void c(int i10, long j10) {
        this.f26491a.a(new e(this.f26493c, 1, i10, j10));
        this.f26492b.b(this.f26494d);
    }
}
