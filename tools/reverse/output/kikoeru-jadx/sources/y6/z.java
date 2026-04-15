package y6;

import android.util.SparseArray;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import m7.k0;
import ya.a1;
import ya.g0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z implements r5.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f25879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f25880h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public w5.a f25881i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public r5.q f25882j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f25883k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p4.y f25873a = new p4.y(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p4.s f25875c = new p4.s(4096);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f25874b = new SparseArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f25876d = new x(0);

    @Override // r5.n
    public final boolean f(r5.o oVar) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        r5.k kVar = (r5.k) oVar;
        kVar.i(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            kVar.a(bArr[13] & 7, false);
            kVar.i(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // r5.n
    public final int g(r5.o oVar, b0.a aVar) {
        int i10;
        long j10;
        h jVar;
        long j11;
        long j12;
        p4.c.j(this.f25882j);
        long length = oVar.getLength();
        x xVar = this.f25876d;
        if (length != -1 && !xVar.f25860d) {
            p4.y yVar = xVar.f25858b;
            p4.s sVar = xVar.f25859c;
            if (!xVar.f25862f) {
                long length2 = oVar.getLength();
                int iMin = (int) Math.min(20000L, length2);
                long j13 = length2 - ((long) iMin);
                if (oVar.getPosition() != j13) {
                    aVar.f1169a = j13;
                    return 1;
                }
                sVar.D(iMin);
                oVar.q();
                oVar.z(sVar.f16611a, 0, iMin);
                int i11 = sVar.f16612b;
                int i12 = sVar.f16613c - 4;
                while (true) {
                    if (i12 < i11) {
                        j12 = -9223372036854775807L;
                        break;
                    }
                    if (x.b(sVar.f16611a, i12) == 442) {
                        sVar.G(i12 + 4);
                        long jC = x.c(sVar);
                        if (jC != -9223372036854775807L) {
                            j12 = jC;
                            break;
                        }
                    }
                    i12--;
                }
                xVar.f25864h = j12;
                xVar.f25862f = true;
                return 0;
            }
            if (xVar.f25864h == -9223372036854775807L) {
                xVar.a(oVar);
                return 0;
            }
            if (xVar.f25861e) {
                long j14 = xVar.f25863g;
                if (j14 == -9223372036854775807L) {
                    xVar.a(oVar);
                    return 0;
                }
                xVar.f25865i = yVar.c(xVar.f25864h) - yVar.b(j14);
                xVar.a(oVar);
                return 0;
            }
            int iMin2 = (int) Math.min(20000L, oVar.getLength());
            long j15 = 0;
            if (oVar.getPosition() != j15) {
                aVar.f1169a = j15;
                return 1;
            }
            sVar.D(iMin2);
            oVar.q();
            oVar.z(sVar.f16611a, 0, iMin2);
            int i13 = sVar.f16612b;
            int i14 = sVar.f16613c;
            while (true) {
                if (i13 >= i14 - 3) {
                    j11 = -9223372036854775807L;
                    break;
                }
                if (x.b(sVar.f16611a, i13) == 442) {
                    sVar.G(i13 + 4);
                    long jC2 = x.c(sVar);
                    if (jC2 != -9223372036854775807L) {
                        j11 = jC2;
                        break;
                    }
                }
                i13++;
            }
            xVar.f25863g = j11;
            xVar.f25861e = true;
            return 0;
        }
        if (this.f25883k) {
            i10 = 4;
        } else {
            this.f25883k = true;
            long j16 = xVar.f25865i;
            if (j16 != -9223372036854775807L) {
                p4.y yVar2 = xVar.f25858b;
                m3.l lVar = new m3.l(29);
                v2.e eVar = new v2.e(yVar2);
                long j17 = 1 + j16;
                i10 = 4;
                w5.a aVar2 = new w5.a(lVar, eVar, j16, j17, 0L, length, 188L, 1000);
                this.f25881i = aVar2;
                this.f25882j.a(aVar2.f23404a);
            } else {
                i10 = 4;
                this.f25882j.a(new r5.s(j16));
            }
        }
        w5.a aVar3 = this.f25881i;
        if (aVar3 != null && aVar3.f23406c != null) {
            return aVar3.b(oVar, aVar);
        }
        oVar.q();
        long j18 = length != -1 ? length - oVar.j() : -1L;
        if (j18 != -1 && j18 < 4) {
            return -1;
        }
        p4.s sVar2 = this.f25875c;
        if (!oVar.i(sVar2.f16611a, 0, i10, true)) {
            return -1;
        }
        sVar2.G(0);
        int iG = sVar2.g();
        if (iG == 441) {
            return -1;
        }
        if (iG == 442) {
            oVar.z(sVar2.f16611a, 0, 10);
            sVar2.G(9);
            oVar.r((sVar2.u() & 7) + 14);
            return 0;
        }
        if (iG == 443) {
            oVar.z(sVar2.f16611a, 0, 2);
            sVar2.G(0);
            oVar.r(sVar2.A() + 6);
            return 0;
        }
        if (((iG & (-256)) >> 8) != 1) {
            oVar.r(1);
            return 0;
        }
        int i15 = iG & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK;
        SparseArray sparseArray = this.f25874b;
        y yVar3 = (y) sparseArray.get(i15);
        if (!this.f25877e) {
            if (yVar3 == null) {
                if (i15 == 189) {
                    jVar = new b("video/mp2p");
                    this.f25878f = true;
                    this.f25880h = oVar.getPosition();
                } else if ((iG & 224) == 192) {
                    jVar = new t(0, null, "video/mp2p");
                    this.f25878f = true;
                    this.f25880h = oVar.getPosition();
                } else if ((iG & 240) == 224) {
                    jVar = new j(null, "video/mp2p");
                    this.f25879g = true;
                    this.f25880h = oVar.getPosition();
                } else {
                    jVar = null;
                }
                if (jVar != null) {
                    jVar.c(this.f25882j, new k0(i15, 256));
                    yVar3 = new y(jVar, this.f25873a);
                    sparseArray.put(i15, yVar3);
                }
            }
            if (oVar.getPosition() > ((this.f25878f && this.f25879g) ? this.f25880h + 8192 : 1048576L)) {
                this.f25877e = true;
                this.f25882j.n();
            }
        }
        oVar.z(sVar2.f16611a, 0, 2);
        sVar2.G(0);
        int iA = sVar2.A() + 6;
        if (yVar3 == null) {
            oVar.r(iA);
            return 0;
        }
        sVar2.D(iA);
        oVar.readFully(sVar2.f16611a, 0, iA);
        sVar2.G(6);
        h hVar = yVar3.f25866a;
        p4.r rVar = yVar3.f25868c;
        sVar2.e(rVar.f16606d, 0, 3);
        rVar.q(0);
        rVar.t(8);
        yVar3.f25869d = rVar.h();
        yVar3.f25870e = rVar.h();
        rVar.t(6);
        sVar2.e(rVar.f16606d, 0, rVar.i(8));
        rVar.q(0);
        p4.y yVar4 = yVar3.f25867b;
        yVar3.f25872g = 0L;
        if (yVar3.f25869d) {
            rVar.t(4);
            long jI = ((long) rVar.i(3)) << 30;
            rVar.t(1);
            long jI2 = jI | ((long) (rVar.i(15) << 15));
            rVar.t(1);
            long jI3 = jI2 | ((long) rVar.i(15));
            rVar.t(1);
            if (yVar3.f25871f || !yVar3.f25870e) {
                j10 = jI3;
            } else {
                rVar.t(4);
                long jI4 = ((long) rVar.i(3)) << 30;
                rVar.t(1);
                long jI5 = ((long) (rVar.i(15) << 15)) | jI4;
                rVar.t(1);
                long jI6 = jI5 | ((long) rVar.i(15));
                rVar.t(1);
                yVar4.b(jI6);
                yVar3.f25871f = true;
                j10 = jI3;
            }
            yVar3.f25872g = yVar4.b(j10);
        }
        hVar.e(4, yVar3.f25872g);
        hVar.b(sVar2);
        hVar.d(false);
        sVar2.F(sVar2.f16611a.length);
        return 0;
    }

    @Override // r5.n
    public final void h(r5.q qVar) {
        this.f25882j = qVar;
    }

    @Override // r5.n
    public final void i(long j10, long j11) {
        p4.y yVar = this.f25873a;
        boolean z10 = yVar.e() == -9223372036854775807L;
        if (!z10) {
            long jD = yVar.d();
            z10 = (jD == -9223372036854775807L || jD == 0 || jD == j11) ? false : true;
        }
        if (z10) {
            yVar.g(j11);
        }
        w5.a aVar = this.f25881i;
        if (aVar != null) {
            aVar.d(j11);
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f25874b;
            if (i10 >= sparseArray.size()) {
                return;
            }
            y yVar2 = (y) sparseArray.valueAt(i10);
            yVar2.f25871f = false;
            yVar2.f25866a.a();
            i10++;
        }
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
