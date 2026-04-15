package w5;

import a0.c;
import ah.j;
import androidx.media3.exoplayer.offline.g;
import java.util.Arrays;
import java.util.List;
import m4.n0;
import m4.o0;
import m4.p;
import m4.p0;
import p4.c0;
import p4.r;
import p4.s;
import r5.b0;
import r5.h0;
import r5.k;
import r5.n;
import r5.o;
import r5.q;
import r5.t;
import ya.a1;
import ya.g0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q f23412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h0 f23413f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n0 f23415h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t f23416i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f23417j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f23418k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f23419l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f23420m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f23421n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f23408a = new byte[42];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f23409b = new s(new byte[32768], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f23410c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0.a f23411d = new b0.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23414g = 0;

    @Override // r5.n
    public final boolean f(o oVar) throws Throwable {
        r5.b.r(oVar, false);
        s sVar = new s(4);
        ((k) oVar).i(sVar.f16611a, 0, 4, false);
        return sVar.w() == 1716281667;
    }

    @Override // r5.n
    public final int g(o oVar, b0.a aVar) throws Throwable {
        t tVar;
        int i10;
        b0 sVar;
        long j10;
        long j11;
        boolean zB;
        int i11 = this.f23414g;
        if (i11 == 0) {
            boolean z10 = !this.f23410c;
            oVar.q();
            long j12 = oVar.j();
            n0 n0VarR = r5.b.r(oVar, z10);
            oVar.r((int) (oVar.j() - j12));
            this.f23415h = n0VarR;
            this.f23414g = 1;
            return 0;
        }
        byte[] bArr = this.f23408a;
        if (i11 == 1) {
            oVar.z(bArr, 0, bArr.length);
            oVar.q();
            this.f23414g = 2;
            return 0;
        }
        int i12 = 4;
        int i13 = 3;
        if (i11 == 2) {
            s sVar2 = new s(4);
            oVar.readFully(sVar2.f16611a, 0, 4);
            if (sVar2.w() != 1716281667) {
                throw p0.a(null, "Failed to read FLAC stream marker.");
            }
            this.f23414g = 3;
            return 0;
        }
        int i14 = 6;
        if (i11 == 3) {
            t tVar2 = this.f23416i;
            boolean z11 = false;
            while (!z11) {
                oVar.q();
                byte[] bArr2 = new byte[i12];
                r rVar = new r(bArr2, i12);
                oVar.z(bArr2, 0, i12);
                boolean zH = rVar.h();
                int i15 = rVar.i(i);
                int i16 = rVar.i(24) + i12;
                if (i15 == 0) {
                    byte[] bArr3 = new byte[38];
                    oVar.readFully(bArr3, 0, 38);
                    tVar2 = new t(bArr3, i12);
                } else {
                    if (tVar2 == null) {
                        throw new IllegalArgumentException();
                    }
                    n0 n0Var = tVar2.f18875l;
                    if (i15 == i13) {
                        s sVar3 = new s(i16);
                        oVar.readFully(sVar3.f16611a, 0, i16);
                        tVar2 = new t(tVar2.f18864a, tVar2.f18865b, tVar2.f18866c, tVar2.f18867d, tVar2.f18868e, tVar2.f18870g, tVar2.f18871h, tVar2.f18873j, r5.b.t(sVar3), tVar2.f18875l);
                    } else {
                        if (i15 == i12) {
                            s sVar4 = new s(i16);
                            oVar.readFully(sVar4.f16611a, 0, i16);
                            sVar4.H(i12);
                            n0 n0VarQ = r5.b.q(Arrays.asList(r5.b.u(sVar4, false, false).f2503a));
                            if (n0Var != null) {
                                n0VarQ = n0Var.b(n0VarQ);
                            }
                            tVar = new t(tVar2.f18864a, tVar2.f18865b, tVar2.f18866c, tVar2.f18867d, tVar2.f18868e, tVar2.f18870g, tVar2.f18871h, tVar2.f18873j, tVar2.f18874k, n0VarQ);
                        } else if (i15 == i14) {
                            s sVar5 = new s(i16);
                            oVar.readFully(sVar5.f16611a, 0, i16);
                            sVar5.H(4);
                            n0 n0Var2 = new n0(i0.u(d6.a.d(sVar5)));
                            if (n0Var != null) {
                                n0Var2 = n0Var.b(n0Var2);
                            }
                            tVar = new t(tVar2.f18864a, tVar2.f18865b, tVar2.f18866c, tVar2.f18867d, tVar2.f18868e, tVar2.f18870g, tVar2.f18871h, tVar2.f18873j, tVar2.f18874k, n0Var2);
                        } else {
                            oVar.r(i16);
                        }
                        tVar2 = tVar;
                    }
                }
                int i17 = c0.f16548a;
                this.f23416i = tVar2;
                z11 = zH;
                i12 = 4;
                i13 = 3;
                i = 7;
                i14 = 6;
            }
            this.f23416i.getClass();
            this.f23417j = Math.max(this.f23416i.f18866c, 6);
            m4.q qVarC = this.f23416i.c(bArr, this.f23415h);
            h0 h0Var = this.f23413f;
            p pVarA = qVarC.a();
            pVarA.f14487l = o0.p("audio/flac");
            c.O(pVarA, h0Var);
            h0 h0Var2 = this.f23413f;
            this.f23416i.b();
            h0Var2.getClass();
            this.f23414g = 4;
            return 0;
        }
        long j13 = 0;
        if (i11 == 4) {
            oVar.q();
            s sVar6 = new s(2);
            oVar.z(sVar6.f16611a, 0, 2);
            int iA = sVar6.A();
            if ((iA >> 2) != 16382) {
                oVar.q();
                throw p0.a(null, "First frame does not start with sync code.");
            }
            oVar.q();
            this.f23418k = iA;
            q qVar = this.f23412e;
            int i18 = c0.f16548a;
            long position = oVar.getPosition();
            long length = oVar.getLength();
            this.f23416i.getClass();
            t tVar3 = this.f23416i;
            if (tVar3.f18874k != null) {
                sVar = new r5.s(tVar3, position, 0);
                i10 = 0;
            } else if (length == -1 || tVar3.f18873j <= 0) {
                i10 = 0;
                sVar = new r5.s(tVar3.b());
            } else {
                int i19 = this.f23418k;
                int i20 = tVar3.f18866c;
                g gVar = new g(28, tVar3);
                j jVar = new j(tVar3, i19);
                long jB = tVar3.b();
                long j14 = tVar3.f18873j;
                int i21 = tVar3.f18867d;
                if (i21 > 0) {
                    i10 = 0;
                    j10 = ((((long) i21) + ((long) i20)) / 2) + 1;
                } else {
                    i10 = 0;
                    int i22 = tVar3.f18864a;
                    j10 = 64 + (((((i22 != tVar3.f18865b || i22 <= 0) ? 4096L : i22) * ((long) tVar3.f18870g)) * ((long) tVar3.f18871h)) / 8);
                }
                a aVar2 = new a(gVar, jVar, jB, j14, position, length, j10, Math.max(6, i20));
                this.f23419l = aVar2;
                sVar = aVar2.f23404a;
            }
            qVar.a(sVar);
            this.f23414g = 5;
            return i10;
        }
        if (i11 != 5) {
            throw new IllegalStateException();
        }
        this.f23413f.getClass();
        this.f23416i.getClass();
        a aVar3 = this.f23419l;
        if (aVar3 != null && aVar3.f23406c != null) {
            return aVar3.b(oVar, aVar);
        }
        if (this.f23421n == -1) {
            t tVar4 = this.f23416i;
            oVar.q();
            oVar.k(1);
            byte[] bArr4 = new byte[1];
            oVar.z(bArr4, 0, 1);
            boolean z12 = (bArr4[0] & 1) == 1;
            oVar.k(2);
            i = z12 ? 7 : 6;
            s sVar7 = new s(i);
            byte[] bArr5 = sVar7.f16611a;
            int i23 = 0;
            while (i23 < i) {
                int iO = oVar.o(bArr5, i23, i - i23);
                if (iO == -1) {
                    break;
                }
                i23 += iO;
            }
            sVar7.F(i23);
            oVar.q();
            try {
                long jB2 = sVar7.B();
                if (!z12) {
                    jB2 *= (long) tVar4.f18865b;
                }
                j13 = jB2;
            } catch (NumberFormatException unused) {
                z = false;
            }
            if (!z) {
                throw p0.a(null, null);
            }
            this.f23421n = j13;
        } else {
            s sVar8 = this.f23409b;
            int i24 = sVar8.f16613c;
            if (i24 < 32768) {
                int i25 = oVar.read(sVar8.f16611a, i24, 32768 - i24);
                z = i25 == -1;
                if (!z) {
                    sVar8.F(i24 + i25);
                } else if (sVar8.a() == 0) {
                    long j15 = this.f23421n * 1000000;
                    t tVar5 = this.f23416i;
                    int i26 = c0.f16548a;
                    this.f23413f.a(j15 / ((long) tVar5.f18868e), 1, this.f23420m, 0, null);
                    return -1;
                }
            } else {
                z = false;
            }
            int i27 = sVar8.f16612b;
            int i28 = this.f23420m;
            int i29 = this.f23417j;
            if (i28 < i29) {
                sVar8.H(Math.min(i29 - i28, sVar8.a()));
            }
            this.f23416i.getClass();
            int i30 = sVar8.f16612b;
            while (true) {
                int i31 = sVar8.f16613c - 16;
                b0.a aVar4 = this.f23411d;
                if (i30 <= i31) {
                    sVar8.G(i30);
                    if (r5.b.b(sVar8, this.f23416i, this.f23418k, aVar4)) {
                        sVar8.G(i30);
                        j11 = aVar4.f1169a;
                        break;
                    }
                    i30++;
                } else {
                    if (z) {
                        while (true) {
                            int i32 = sVar8.f16613c;
                            if (i30 > i32 - this.f23417j) {
                                sVar8.G(i32);
                                break;
                            }
                            sVar8.G(i30);
                            try {
                                zB = r5.b.b(sVar8, this.f23416i, this.f23418k, aVar4);
                            } catch (IndexOutOfBoundsException unused2) {
                                zB = false;
                            }
                            if (sVar8.f16612b > sVar8.f16613c) {
                                zB = false;
                            }
                            if (zB) {
                                sVar8.G(i30);
                                j11 = aVar4.f1169a;
                                break;
                            }
                            i30++;
                        }
                    } else {
                        sVar8.G(i30);
                    }
                    j11 = -1;
                }
            }
            int i33 = sVar8.f16612b - i27;
            sVar8.G(i27);
            this.f23413f.e(i33, sVar8);
            int i34 = this.f23420m + i33;
            this.f23420m = i34;
            if (j11 != -1) {
                long j16 = this.f23421n * 1000000;
                t tVar6 = this.f23416i;
                int i35 = c0.f16548a;
                this.f23413f.a(j16 / ((long) tVar6.f18868e), 1, i34, 0, null);
                this.f23420m = 0;
                this.f23421n = j11;
            }
            if (sVar8.a() < 16) {
                int iA2 = sVar8.a();
                byte[] bArr6 = sVar8.f16611a;
                System.arraycopy(bArr6, sVar8.f16612b, bArr6, 0, iA2);
                sVar8.G(0);
                sVar8.F(iA2);
            }
        }
        return 0;
    }

    @Override // r5.n
    public final void h(q qVar) {
        this.f23412e = qVar;
        this.f23413f = qVar.u(0, 1);
        qVar.n();
    }

    @Override // r5.n
    public final void i(long j10, long j11) {
        if (j10 == 0) {
            this.f23414g = 0;
        } else {
            a aVar = this.f23419l;
            if (aVar != null) {
                aVar.d(j11);
            }
        }
        this.f23421n = j11 != 0 ? -1L : 0L;
        this.f23420m = 0;
        this.f23409b.D(0);
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
    public final n c() {
        return this;
    }
}
