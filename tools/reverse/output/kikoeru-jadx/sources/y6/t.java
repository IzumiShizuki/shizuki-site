package y6;

import m4.o0;
import m7.k0;
import r5.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p4.s f25807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r5.z f25808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f25811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h0 f25812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f25813g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f25814h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f25815i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f25816j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f25817k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f25818l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f25819m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f25820n;

    public t(int i10, String str, String str2) {
        p4.s sVar = new p4.s(4);
        this.f25807a = sVar;
        sVar.f16611a[0] = -1;
        this.f25808b = new r5.z();
        this.f25820n = -9223372036854775807L;
        this.f25809c = str;
        this.f25810d = i10;
        this.f25811e = str2;
    }

    @Override // y6.h
    public final void a() {
        this.f25814h = 0;
        this.f25815i = 0;
        this.f25817k = false;
        this.f25820n = -9223372036854775807L;
    }

    @Override // y6.h
    public final void b(p4.s sVar) {
        p4.c.j(this.f25812f);
        while (sVar.a() > 0) {
            int i10 = this.f25814h;
            p4.s sVar2 = this.f25807a;
            if (i10 == 0) {
                byte[] bArr = sVar.f16611a;
                int i11 = sVar.f16612b;
                int i12 = sVar.f16613c;
                while (true) {
                    if (i11 >= i12) {
                        sVar.G(i12);
                        break;
                    }
                    byte b10 = bArr[i11];
                    boolean z10 = (b10 & 255) == 255;
                    boolean z11 = this.f25817k && (b10 & 224) == 224;
                    this.f25817k = z10;
                    if (z11) {
                        sVar.G(i11 + 1);
                        this.f25817k = false;
                        sVar2.f16611a[1] = bArr[i11];
                        this.f25815i = 2;
                        this.f25814h = 1;
                        break;
                    }
                    i11++;
                }
            } else if (i10 == 1) {
                int iMin = Math.min(sVar.a(), 4 - this.f25815i);
                sVar.e(sVar2.f16611a, this.f25815i, iMin);
                int i13 = this.f25815i + iMin;
                this.f25815i = i13;
                if (i13 >= 4) {
                    sVar2.G(0);
                    int iG = sVar2.g();
                    r5.z zVar = this.f25808b;
                    if (zVar.a(iG)) {
                        this.f25819m = zVar.f18898b;
                        if (!this.f25816j) {
                            this.f25818l = (((long) zVar.f18902f) * 1000000) / ((long) zVar.f18899c);
                            m4.p pVar = new m4.p();
                            pVar.f14476a = this.f25813g;
                            pVar.f14487l = o0.p(this.f25811e);
                            pVar.f14488m = o0.p((String) zVar.f18903g);
                            pVar.f14489n = 4096;
                            pVar.C = zVar.f18900d;
                            pVar.D = zVar.f18899c;
                            pVar.f14479d = this.f25809c;
                            pVar.f14481f = this.f25810d;
                            this.f25812f.b(new m4.q(pVar));
                            this.f25816j = true;
                        }
                        sVar2.G(0);
                        this.f25812f.e(4, sVar2);
                        this.f25814h = 2;
                    } else {
                        this.f25815i = 0;
                        this.f25814h = 1;
                    }
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(sVar.a(), this.f25819m - this.f25815i);
                this.f25812f.e(iMin2, sVar);
                int i14 = this.f25815i + iMin2;
                this.f25815i = i14;
                if (i14 >= this.f25819m) {
                    p4.c.i(this.f25820n != -9223372036854775807L);
                    this.f25812f.a(this.f25820n, 1, this.f25819m, 0, null);
                    this.f25820n += this.f25818l;
                    this.f25815i = 0;
                    this.f25814h = 0;
                }
            }
        }
    }

    @Override // y6.h
    public final void c(r5.q qVar, k0 k0Var) {
        k0Var.b();
        k0Var.d();
        this.f25813g = (String) k0Var.f14910e;
        k0Var.d();
        this.f25812f = qVar.u(k0Var.f14908c, 1);
    }

    @Override // y6.h
    public final void e(int i10, long j10) {
        this.f25820n = j10;
    }

    @Override // y6.h
    public final void d(boolean z10) {
    }
}
