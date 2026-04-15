package l6;

import android.util.SparseArray;
import androidx.media3.exoplayer.offline.u;
import b5.d0;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;
import m4.o0;
import m4.p0;
import p4.c0;
import p4.y;
import r5.f0;
import r5.h0;
import ya.a1;
import ya.g0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j implements r5.n {
    public static final byte[] L = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final m4.q M;
    public long A;
    public i B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public r5.q H;
    public h0[] I;
    public h0[] J;
    public boolean K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o6.j f11763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f11765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray f11766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p4.s f11767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p4.s f11768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p4.s f11769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f11770h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p4.s f11771i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y f11772j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u f11773k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p4.s f11774l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayDeque f11775m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayDeque f11776n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final h7.i f11777o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h0 f11778p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a1 f11779q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11780r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11781s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f11782t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11783u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p4.s f11784v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f11785w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f11786x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f11787y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f11788z;

    static {
        m4.p pVar = new m4.p();
        pVar.f14488m = o0.p("application/x-emsg");
        M = new m4.q(pVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(o6.j jVar, int i10) {
        this(jVar, i10, null, a1.f25946e, null);
        g0 g0Var = i0.f25998b;
    }

    public static m4.n b(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            q4.c cVar = (q4.c) list.get(i10);
            if (cVar.f17713b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = cVar.f17711c.f16611a;
                ah.j jVarJ = p.j(bArr);
                UUID uuid = jVarJ == null ? null : (UUID) jVarJ.f391c;
                if (uuid == null) {
                    p4.c.B("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new m4.m(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new m4.n(null, false, (m4.m[]) arrayList.toArray(new m4.m[0]));
    }

    public static void d(p4.s sVar, int i10, s sVar2) throws p0 {
        sVar.G(i10 + 8);
        int iG = sVar.g();
        byte[] bArr = e.f11741a;
        if ((iG & 1) != 0) {
            throw p0.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (iG & 2) != 0;
        int iY = sVar.y();
        if (iY == 0) {
            Arrays.fill(sVar2.f11859l, 0, sVar2.f11852e, false);
            return;
        }
        int i11 = sVar2.f11852e;
        p4.s sVar3 = sVar2.f11861n;
        if (iY != i11) {
            StringBuilder sbO = j2.h0.o(iY, "Senc sample count ", " is different from fragment sample count");
            sbO.append(sVar2.f11852e);
            throw p0.a(null, sbO.toString());
        }
        Arrays.fill(sVar2.f11859l, 0, iY, z10);
        sVar3.D(sVar.a());
        sVar2.f11858k = true;
        sVar2.f11862o = true;
        sVar.e(sVar3.f16611a, 0, sVar3.f16613c);
        sVar3.G(0);
        sVar2.f11862o = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:328:0x074b, code lost:
    
        r51.f11780r = 0;
        r51.f11783u = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0750, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:148:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x065c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r52) throws m4.p0 {
        /*
            Method dump skipped, instruction units count: 1873
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.j.e(long):void");
    }

    @Override // r5.n
    public final boolean f(r5.o oVar) {
        a1 a1VarU;
        f0 f0VarM = p.m(oVar, true, false);
        if (f0VarM != null) {
            a1VarU = i0.u(f0VarM);
        } else {
            g0 g0Var = i0.f25998b;
            a1VarU = a1.f25946e;
        }
        this.f11779q = a1VarU;
        return f0VarM == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01d5, code lost:
    
        if (r2 != 0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01da, code lost:
    
        if (r32.J.length > 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01de, code lost:
    
        if (r32.F != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01e0, code lost:
    
        r2 = q4.p.d(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f0, code lost:
    
        if ((r20 + r2) > (r32.C - r32.D)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01f2, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01f5, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01f6, code lost:
    
        r33.readFully(r8, r13, r20 + r2);
        r15.G(0);
        r18 = r15.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0203, code lost:
    
        if (r18 < 0) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0205, code lost:
    
        r32.E = r18 - r2;
        r12 = r32.f11767e;
        r18 = r13;
        r12.G(0);
        r3.e(4, r12);
        r32.D += 4;
        r32.C += r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0223, code lost:
    
        if (r32.J.length <= 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0225, code lost:
    
        if (r2 <= 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0227, code lost:
    
        r12 = r8[4];
        r13 = r11.f14544n;
        r12 = r11.f14541k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0233, code lost:
    
        if (java.util.Objects.equals(r13, r10) != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0239, code lost:
    
        if (m4.o0.c(r12, r10) == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x023c, code lost:
    
        r25 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0240, code lost:
    
        r25 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0245, code lost:
    
        if ((r12 & 31) == 6) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x024d, code lost:
    
        if (java.util.Objects.equals(r11.f14544n, "video/hevc") != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0253, code lost:
    
        if (m4.o0.c(r12, "video/hevc") == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x025d, code lost:
    
        if (((r12 & 126) >> 1) != 39) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x025f, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0261, code lost:
    
        r25 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0264, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0265, code lost:
    
        r32.G = r12;
        r3.e(r2, r15);
        r32.D += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x026f, code lost:
    
        if (r2 <= 0) goto L478;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0273, code lost:
    
        if (r32.F != false) goto L479;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0279, code lost:
    
        if (q4.p.c(r8, r2, r11) == false) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x027b, code lost:
    
        r32.F = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x027e, code lost:
    
        r13 = r18;
        r12 = r20;
        r10 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x028d, code lost:
    
        throw m4.p0.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x028e, code lost:
    
        r25 = r10;
        r18 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0295, code lost:
    
        if (r32.G == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0297, code lost:
    
        r12 = r32.f11769g;
        r12.D(r2);
        r33.readFully(r12.f16611a, 0, r32.E);
        r3.e(r32.E, r12);
        r2 = r32.E;
        r2 = q4.p.l(r12.f16611a, r12.f16613c);
        r12.G(0);
        r12.F(r2);
        r2 = r11.f14546p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02be, code lost:
    
        if (r2 != (-1)) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02c2, code lost:
    
        if (r7.f8187a == 0) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02c4, code lost:
    
        r7.f8187a = 0;
        r7.b(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02cc, code lost:
    
        if (r7.f8187a == r2) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02ce, code lost:
    
        if (r2 < 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02d0, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02d2, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02d3, code lost:
    
        p4.c.i(r10);
        r7.f8187a = r2;
        r7.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02db, code lost:
    
        r7.a(r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02e7, code lost:
    
        if ((r17.a() & 4) == 0) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02e9, code lost:
    
        r7.b(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02ec, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02ef, code lost:
    
        r2 = r3.d(r33, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02f4, code lost:
    
        r32.D += r2;
        r32.E -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0300, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0302, code lost:
    
        r2 = r32.D;
        r7 = r32.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0306, code lost:
    
        if (r2 >= r7) goto L486;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0308, code lost:
    
        r32.D += r3.d(r33, r7 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0314, code lost:
    
        r1 = r17.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x031a, code lost:
    
        if (r32.F != false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x031c, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x031f, code lost:
    
        r27 = r1;
        r1 = r17.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0325, code lost:
    
        if (r1 == null) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0327, code lost:
    
        r30 = r1.f11845c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x032c, code lost:
    
        r30 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x032e, code lost:
    
        r25 = r5;
        r3.a(r25, r27, r32.C, 0, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x033f, code lost:
    
        if (r14.isEmpty() != false) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0341, code lost:
    
        r1 = (l6.h) r14.removeFirst();
        r32.f11786x -= r1.f11749c;
        r2 = r1.f11747a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0352, code lost:
    
        if (r1.f11748b == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0354, code lost:
    
        r2 = r2 + r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0356, code lost:
    
        if (r4 == null) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0358, code lost:
    
        r2 = r4.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x035c, code lost:
    
        r6 = r2;
        r2 = r32.I;
        r3 = r2.length;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0361, code lost:
    
        if (r12 >= r3) goto L485;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0363, code lost:
    
        r2[r12].a(r6, 1, r1.f11749c, r32.f11786x, null);
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0375, code lost:
    
        if (r17.c() != false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0377, code lost:
    
        r32.B = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x037a, code lost:
    
        r32.f11780r = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x037f, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00be, code lost:
    
        r3 = r2.f11750a;
        r5 = r2.f11751b;
        r10 = "video/avc";
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ca, code lost:
    
        if (r32.f11780r != 3) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ce, code lost:
    
        if (r2.f11762m != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d0, code lost:
    
        r6 = r2.f11753d.f11868d[r2.f11755f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d9, code lost:
    
        r6 = r5.f11855h[r2.f11755f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00df, code lost:
    
        r32.C = r6;
        r6 = r2.f11753d.f11865a.f11837g;
        r11 = java.util.Objects.equals(r6.f14544n, "video/avc");
        r12 = r32.f11764b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ef, code lost:
    
        if (r11 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f3, code lost:
    
        if ((r12 & 64) == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f5, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f7, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ff, code lost:
    
        if (java.util.Objects.equals(r6.f14544n, "video/hevc") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0103, code lost:
    
        if ((r12 & 128) == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0106, code lost:
    
        r32.F = !r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010e, code lost:
    
        if (r2.f11755f >= r2.f11758i) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0110, code lost:
    
        r33.r(r32.C);
        r1 = r2.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0119, code lost:
    
        if (r1 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011c, code lost:
    
        r3 = r5.f11861n;
        r1 = r1.f11846d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0120, code lost:
    
        if (r1 == 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0122, code lost:
    
        r3.H(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0125, code lost:
    
        r1 = r2.f11755f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0129, code lost:
    
        if (r5.f11858k == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x012f, code lost:
    
        if (r5.f11859l[r1] == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0131, code lost:
    
        r3.H(r3.A() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x013e, code lost:
    
        if (r2.c() != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0140, code lost:
    
        r32.B = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0143, code lost:
    
        r32.f11780r = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0146, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x014e, code lost:
    
        if (r2.f11753d.f11865a.f11838h != 1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0150, code lost:
    
        r32.C -= 8;
        r33.r(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0169, code lost:
    
        if ("audio/ac4".equals(r2.f11753d.f11865a.f11837g.f14544n) == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x016b, code lost:
    
        r32.D = r2.d(r32.C, 7);
        r6 = r32.C;
        r12 = r32.f11771i;
        r5.b.g(r6, r12);
        r3.e(7, r12);
        r32.D += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0184, code lost:
    
        r32.D = r2.d(r32.C, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x018c, code lost:
    
        r32.C += r32.D;
        r32.f11780r = 4;
        r32.E = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0198, code lost:
    
        r6 = r2.f11753d;
        r11 = r6.f11865a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019e, code lost:
    
        if (r2.f11762m != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a0, code lost:
    
        r15 = r6.f11870f[r2.f11755f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a6, code lost:
    
        r5 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a8, code lost:
    
        r15 = r5.f11856i[r2.f11755f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01af, code lost:
    
        if (r4 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b1, code lost:
    
        r5 = r4.a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b5, code lost:
    
        r12 = r11.f11841k;
        r11 = r11.f11837g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b9, code lost:
    
        if (r12 == 0) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01bb, code lost:
    
        r15 = r32.f11768f;
        r8 = r15.f16611a;
        r8[0] = 0;
        r8[1] = 0;
        r8[r18] = 0;
        r13 = 4 - r12;
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01cb, code lost:
    
        r20 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d1, code lost:
    
        if (r32.D >= r32.C) goto L475;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d3, code lost:
    
        r2 = r32.E;
     */
    @Override // r5.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(r5.o r33, b0.a r34) throws m4.p0 {
        /*
            Method dump skipped, instruction units count: 2050
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.j.g(r5.o, b0.a):int");
    }

    @Override // r5.n
    public final void h(r5.q qVar) {
        int i10;
        int i11 = this.f11764b;
        if ((i11 & 32) == 0) {
            qVar = new d0(qVar, this.f11763a);
        }
        this.H = qVar;
        int i12 = 0;
        this.f11780r = 0;
        this.f11783u = 0;
        h0[] h0VarArr = new h0[2];
        this.I = h0VarArr;
        h0 h0Var = this.f11778p;
        if (h0Var != null) {
            h0VarArr[0] = h0Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i13 = 100;
        if ((i11 & 4) != 0) {
            h0VarArr[i10] = qVar.u(100, 5);
            i13 = TinkerReport.KEY_APPLIED_UPGRADE_FAIL;
            i10++;
        }
        h0[] h0VarArr2 = (h0[]) c0.P(i10, this.I);
        this.I = h0VarArr2;
        for (h0 h0Var2 : h0VarArr2) {
            h0Var2.b(M);
        }
        List list = this.f11765c;
        this.J = new h0[list.size()];
        while (i12 < this.J.length) {
            h0 h0VarU = this.H.u(i13, 3);
            h0VarU.b((m4.q) list.get(i12));
            this.J[i12] = h0VarU;
            i12++;
            i13++;
        }
    }

    @Override // r5.n
    public final void i(long j10, long j11) {
        SparseArray sparseArray = this.f11766d;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((i) sparseArray.valueAt(i10)).f();
        }
        this.f11776n.clear();
        this.f11786x = 0;
        ((PriorityQueue) this.f11777o.f8191e).clear();
        this.f11787y = j11;
        this.f11775m.clear();
        this.f11780r = 0;
        this.f11783u = 0;
    }

    @Override // r5.n
    public final List j() {
        return this.f11779q;
    }

    public j(o6.j jVar, int i10, y yVar, List list, y4.n nVar) {
        this.f11763a = jVar;
        this.f11764b = i10;
        this.f11772j = yVar;
        this.f11765c = Collections.unmodifiableList(list);
        this.f11778p = nVar;
        this.f11773k = new u(9);
        this.f11774l = new p4.s(16);
        this.f11767e = new p4.s(q4.p.f17770a);
        this.f11768f = new p4.s(6);
        this.f11769g = new p4.s();
        byte[] bArr = new byte[16];
        this.f11770h = bArr;
        this.f11771i = new p4.s(bArr);
        this.f11775m = new ArrayDeque();
        this.f11776n = new ArrayDeque();
        this.f11766d = new SparseArray();
        g0 g0Var = i0.f25998b;
        this.f11779q = a1.f25946e;
        this.f11788z = -9223372036854775807L;
        this.f11787y = -9223372036854775807L;
        this.A = -9223372036854775807L;
        this.H = r5.q.n0;
        this.I = new h0[0];
        this.J = new h0[0];
        this.f11777o = new h7.i(new g(this));
    }

    @Override // r5.n
    public final void a() {
    }

    @Override // r5.n
    public final r5.n c() {
        return this;
    }
}
