package m6;

import ba.x;
import com.tencent.bugly.beta.tinker.TinkerReport;
import h7.k;
import java.util.ArrayList;
import java.util.Arrays;
import m0.w;
import m4.n0;
import m4.o0;
import m4.p;
import m4.p0;
import m4.q;
import p4.r;
import p4.s;
import r5.z;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k f14812n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14813o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f14814p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public z f14815q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public x f14816r;

    @Override // m6.i
    public final void a(long j10) {
        this.f14805g = j10;
        this.f14814p = j10 != 0;
        z zVar = this.f14815q;
        this.f14813o = zVar != null ? zVar.f18901e : 0;
    }

    @Override // m6.i
    public final long b(s sVar) {
        byte b10 = sVar.f16611a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        k kVar = this.f14812n;
        p4.c.j(kVar);
        int i10 = kVar.f8197b;
        z zVar = (z) kVar.f8198c;
        int i11 = !((p4.f[]) kVar.f8201f)[(b10 >> 1) & (TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK >>> (8 - i10))].f16572a ? zVar.f18901e : zVar.f18902f;
        long j10 = this.f14814p ? (this.f14813o + i11) / 4 : 0;
        byte[] bArr = sVar.f16611a;
        int length = bArr.length;
        int i12 = sVar.f16613c + 4;
        if (length < i12) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i12);
            sVar.E(bArrCopyOf, bArrCopyOf.length);
        } else {
            sVar.F(i12);
        }
        byte[] bArr2 = sVar.f16611a;
        int i13 = sVar.f16613c;
        bArr2[i13 - 4] = (byte) (j10 & 255);
        bArr2[i13 - 3] = (byte) ((j10 >>> 8) & 255);
        bArr2[i13 - 2] = (byte) ((j10 >>> 16) & 255);
        bArr2[i13 - 1] = (byte) ((j10 >>> 24) & 255);
        this.f14814p = true;
        this.f14813o = i11;
        return j10;
    }

    /* JADX WARN: Type inference failed for: r1v59, types: [byte[], java.io.Serializable] */
    @Override // m6.i
    public final boolean c(s sVar, long j10, w wVar) throws p0 {
        k kVar;
        if (this.f14812n != null) {
            ((q) wVar.f13782b).getClass();
            return false;
        }
        z zVar = this.f14815q;
        int i10 = 4;
        if (zVar == null) {
            r5.b.w(1, sVar, false);
            sVar.m();
            int iU = sVar.u();
            int iM = sVar.m();
            int i11 = sVar.i();
            if (i11 <= 0) {
                i11 = -1;
            }
            int i12 = sVar.i();
            int i13 = i12 > 0 ? i12 : -1;
            sVar.i();
            int iU2 = sVar.u();
            int iPow = (int) Math.pow(2.0d, iU2 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iU2 & 240) >> 4);
            sVar.u();
            ?? CopyOf = Arrays.copyOf(sVar.f16611a, sVar.f16613c);
            z zVar2 = new z();
            zVar2.f18897a = iU;
            zVar2.f18898b = iM;
            zVar2.f18899c = i11;
            zVar2.f18900d = i13;
            zVar2.f18901e = iPow;
            zVar2.f18902f = iPow2;
            zVar2.f18903g = CopyOf;
            this.f14815q = zVar2;
        } else {
            x xVar = this.f14816r;
            if (xVar == null) {
                this.f14816r = r5.b.u(sVar, true, true);
            } else {
                int i14 = sVar.f16613c;
                byte[] bArr = new byte[i14];
                System.arraycopy(sVar.f16611a, 0, bArr, 0, i14);
                int i15 = zVar.f18897a;
                int i16 = 5;
                r5.b.w(5, sVar, false);
                int iU3 = sVar.u() + 1;
                r rVar = new r(sVar.f16611a);
                rVar.t(sVar.f16612b * 8);
                int i17 = 0;
                while (true) {
                    int i18 = 16;
                    if (i17 >= iU3) {
                        int i19 = 6;
                        int i20 = rVar.i(6) + 1;
                        for (int i21 = 0; i21 < i20; i21++) {
                            if (rVar.i(16) != 0) {
                                throw p0.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i22 = 1;
                        int i23 = rVar.i(6) + 1;
                        int i24 = 0;
                        while (true) {
                            int i25 = 3;
                            if (i24 < i23) {
                                int i26 = rVar.i(i18);
                                if (i26 == 0) {
                                    int i27 = 8;
                                    rVar.t(8);
                                    rVar.t(16);
                                    rVar.t(16);
                                    rVar.t(6);
                                    rVar.t(8);
                                    int i28 = rVar.i(4) + 1;
                                    int i29 = 0;
                                    while (i29 < i28) {
                                        rVar.t(i27);
                                        i29++;
                                        i27 = 8;
                                    }
                                } else {
                                    if (i26 != i22) {
                                        throw p0.a(null, "floor type greater than 1 not decodable: " + i26);
                                    }
                                    int i30 = rVar.i(5);
                                    int[] iArr = new int[i30];
                                    int i31 = -1;
                                    for (int i32 = 0; i32 < i30; i32++) {
                                        int i33 = rVar.i(i10);
                                        iArr[i32] = i33;
                                        if (i33 > i31) {
                                            i31 = i33;
                                        }
                                    }
                                    int i34 = i31 + 1;
                                    int[] iArr2 = new int[i34];
                                    int i35 = 0;
                                    while (i35 < i34) {
                                        iArr2[i35] = rVar.i(i25) + 1;
                                        int i36 = rVar.i(2);
                                        int i37 = 8;
                                        if (i36 > 0) {
                                            rVar.t(8);
                                        }
                                        int[] iArr3 = iArr2;
                                        int i38 = 0;
                                        for (int i39 = 1; i38 < (i39 << i36); i39 = 1) {
                                            rVar.t(i37);
                                            i38++;
                                            i37 = 8;
                                        }
                                        i35++;
                                        iArr2 = iArr3;
                                        i25 = 3;
                                    }
                                    int[] iArr4 = iArr2;
                                    rVar.t(2);
                                    int i40 = rVar.i(4);
                                    int i41 = 0;
                                    int i42 = 0;
                                    for (int i43 = 0; i43 < i30; i43++) {
                                        i41 += iArr4[iArr[i43]];
                                        while (i42 < i41) {
                                            rVar.t(i40);
                                            i42++;
                                        }
                                    }
                                }
                                i24++;
                                i19 = 6;
                                i10 = 4;
                                i18 = 16;
                                i22 = 1;
                            } else {
                                int i44 = rVar.i(i19) + 1;
                                int i45 = 0;
                                while (i45 < i44) {
                                    if (rVar.i(16) > 2) {
                                        throw p0.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    rVar.t(24);
                                    rVar.t(24);
                                    rVar.t(24);
                                    int i46 = rVar.i(i19) + 1;
                                    int i47 = 8;
                                    rVar.t(8);
                                    int[] iArr5 = new int[i46];
                                    for (int i48 = 0; i48 < i46; i48++) {
                                        iArr5[i48] = ((rVar.h() ? rVar.i(5) : 0) * 8) + rVar.i(3);
                                    }
                                    int i49 = 0;
                                    while (i49 < i46) {
                                        int i50 = 0;
                                        while (i50 < i47) {
                                            if ((iArr5[i49] & (1 << i50)) != 0) {
                                                rVar.t(i47);
                                            }
                                            i50++;
                                            i47 = 8;
                                        }
                                        i49++;
                                        i47 = 8;
                                    }
                                    i45++;
                                    i19 = 6;
                                }
                                int i51 = rVar.i(i19) + 1;
                                for (int i52 = 0; i52 < i51; i52++) {
                                    int i53 = rVar.i(16);
                                    if (i53 != 0) {
                                        p4.c.n("VorbisUtil", "mapping type other than 0 not supported: " + i53);
                                    } else {
                                        int i54 = rVar.h() ? rVar.i(4) + 1 : 1;
                                        if (rVar.h()) {
                                            int i55 = rVar.i(8) + 1;
                                            for (int i56 = 0; i56 < i55; i56++) {
                                                int i57 = i15 - 1;
                                                int i58 = 0;
                                                for (int i59 = i57; i59 > 0; i59 >>>= 1) {
                                                    i58++;
                                                }
                                                rVar.t(i58);
                                                int i60 = 0;
                                                while (i57 > 0) {
                                                    i60++;
                                                    i57 >>>= 1;
                                                }
                                                rVar.t(i60);
                                            }
                                        }
                                        if (rVar.i(2) != 0) {
                                            throw p0.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (i54 > 1) {
                                            for (int i61 = 0; i61 < i15; i61++) {
                                                rVar.t(4);
                                            }
                                        }
                                        for (int i62 = 0; i62 < i54; i62++) {
                                            rVar.t(8);
                                            rVar.t(8);
                                            rVar.t(8);
                                        }
                                    }
                                }
                                int i63 = rVar.i(6);
                                int i64 = i63 + 1;
                                p4.f[] fVarArr = new p4.f[i64];
                                for (int i65 = 0; i65 < i64; i65++) {
                                    boolean zH = rVar.h();
                                    rVar.i(16);
                                    rVar.i(16);
                                    rVar.i(8);
                                    fVarArr[i65] = new p4.f(zH);
                                }
                                if (!rVar.h()) {
                                    throw p0.a(null, "framing bit after modes not set as expected");
                                }
                                int i66 = 0;
                                while (i63 > 0) {
                                    i66++;
                                    i63 >>>= 1;
                                }
                                kVar = new k(zVar, xVar, bArr, fVarArr, i66);
                            }
                        }
                    } else {
                        if (rVar.i(24) != 5653314) {
                            throw p0.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((rVar.f16605c * 8) + rVar.f16607e));
                        }
                        int i67 = rVar.i(16);
                        int i68 = rVar.i(24);
                        if (rVar.h()) {
                            rVar.t(i16);
                            int i69 = 0;
                            while (i69 < i68) {
                                int i70 = 0;
                                for (int i71 = i68 - i69; i71 > 0; i71 >>>= 1) {
                                    i70++;
                                }
                                i69 += rVar.i(i70);
                            }
                        } else {
                            boolean zH2 = rVar.h();
                            for (int i72 = 0; i72 < i68; i72++) {
                                if (!zH2) {
                                    rVar.t(i16);
                                } else if (rVar.h()) {
                                    rVar.t(i16);
                                }
                            }
                        }
                        int i73 = rVar.i(4);
                        if (i73 > 2) {
                            throw p0.a(null, "lookup type greater than 2 not decodable: " + i73);
                        }
                        if (i73 == 1 || i73 == 2) {
                            rVar.t(32);
                            rVar.t(32);
                            int i74 = rVar.i(4) + 1;
                            rVar.t(1);
                            rVar.t((int) ((i73 == 1 ? i67 != 0 ? (long) Math.floor(Math.pow(i68, 1.0d / ((double) i67))) : 0L : ((long) i68) * ((long) i67)) * ((long) i74)));
                        }
                        i17++;
                        i16 = 5;
                    }
                }
            }
        }
        kVar = null;
        this.f14812n = kVar;
        if (kVar == null) {
            return true;
        }
        z zVar3 = (z) kVar.f8198c;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte[]) zVar3.f18903g);
        arrayList.add((byte[]) kVar.f8200e);
        n0 n0VarQ = r5.b.q(i0.r(((x) kVar.f8199d).f2503a));
        p pVar = new p();
        pVar.f14487l = o0.p("audio/ogg");
        pVar.f14488m = o0.p("audio/vorbis");
        pVar.f14483h = zVar3.f18900d;
        pVar.f14484i = zVar3.f18899c;
        pVar.C = zVar3.f18897a;
        pVar.D = zVar3.f18898b;
        pVar.f14491p = arrayList;
        pVar.f14486k = n0VarQ;
        wVar.f13782b = new q(pVar);
        return true;
    }

    @Override // m6.i
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f14812n = null;
            this.f14815q = null;
            this.f14816r = null;
        }
        this.f14813o = 0;
        this.f14814p = false;
    }
}
