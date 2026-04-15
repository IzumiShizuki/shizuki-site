package m6;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.EOFException;
import m4.p0;
import p4.s;
import r5.o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f14790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f14794f = new int[TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s f14795g = new s(TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);

    public final boolean a(o oVar, boolean z10) throws EOFException, p0 {
        boolean zI;
        boolean zI2;
        this.f14789a = 0;
        this.f14790b = 0L;
        this.f14791c = 0;
        this.f14792d = 0;
        this.f14793e = 0;
        s sVar = this.f14795g;
        sVar.D(27);
        try {
            zI = oVar.i(sVar.f16611a, 0, 27, z10);
        } catch (EOFException e10) {
            if (!z10) {
                throw e10;
            }
            zI = false;
        }
        if (zI && sVar.w() == 1332176723) {
            if (sVar.u() == 0) {
                this.f14789a = sVar.u();
                this.f14790b = sVar.j();
                sVar.l();
                sVar.l();
                sVar.l();
                int iU = sVar.u();
                this.f14791c = iU;
                this.f14792d = iU + 27;
                sVar.D(iU);
                try {
                    zI2 = oVar.i(sVar.f16611a, 0, this.f14791c, z10);
                } catch (EOFException e11) {
                    if (!z10) {
                        throw e11;
                    }
                    zI2 = false;
                }
                if (zI2) {
                    for (int i10 = 0; i10 < this.f14791c; i10++) {
                        int iU2 = sVar.u();
                        this.f14794f[i10] = iU2;
                        this.f14793e += iU2;
                    }
                    return true;
                }
            } else if (!z10) {
                throw p0.c("unsupported bit stream revision");
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r11 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r10.getPosition() >= r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (r10.m(1) == (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(r5.o r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.getPosition()
            long r2 = r10.j()
            r4 = 0
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            p4.c.c(r0)
            p4.s r0 = r9.f14795g
            r1 = 4
            r0.D(r1)
        L1a:
            r2 = -1
            int r6 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r6 == 0) goto L2b
            long r2 = r10.getPosition()
            r7 = 4
            long r2 = r2 + r7
            int r7 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r7 >= 0) goto L4c
        L2b:
            byte[] r2 = r0.f16611a
            boolean r2 = r10.i(r2, r4, r1, r5)     // Catch: java.io.EOFException -> L32
            goto L34
        L32:
            r2 = 0
        L34:
            if (r2 == 0) goto L4c
            r0.G(r4)
            long r2 = r0.w()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 != 0) goto L48
            r10.q()
            return r5
        L48:
            r10.r(r5)
            goto L1a
        L4c:
            if (r6 == 0) goto L56
            long r0 = r10.getPosition()
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 >= 0) goto L5e
        L56:
            int r0 = r10.m(r5)
            r1 = -1
            if (r0 == r1) goto L5e
            goto L4c
        L5e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.f.b(r5.o, long):boolean");
    }
}
