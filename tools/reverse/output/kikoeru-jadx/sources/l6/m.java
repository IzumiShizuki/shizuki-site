package l6;

import b5.d0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import p4.c0;
import r5.b0;
import r5.f0;
import ya.a1;
import ya.g0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m implements r5.n, b0 {
    public l[] A;
    public long[][] B;
    public int C;
    public long D;
    public int E;
    public g6.a F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o6.j f11797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p4.s f11799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p4.s f11800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p4.s f11801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p4.s f11802f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f11803g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f11804h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f11805i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a1 f11806j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f11807k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11808l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f11809m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11810n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p4.s f11811o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f11812p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f11813q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11814r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11815s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f11816t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f11817u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f11818v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f11819w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f11820x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f11821y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public r5.q f11822z;

    public m(o6.j jVar, int i10) {
        this.f11797a = jVar;
        this.f11798b = i10;
        g0 g0Var = i0.f25998b;
        this.f11806j = a1.f25946e;
        this.f11807k = (i10 & 4) != 0 ? 3 : 0;
        this.f11804h = new o();
        this.f11805i = new ArrayList();
        this.f11802f = new p4.s(16);
        this.f11803g = new ArrayDeque();
        this.f11799c = new p4.s(q4.p.f17770a);
        this.f11800d = new p4.s(6);
        this.f11801e = new p4.s();
        this.f11812p = -1;
        this.f11822z = r5.q.n0;
        this.A = new l[0];
    }

    @Override // r5.b0
    public final boolean e() {
        return true;
    }

    @Override // r5.n
    public final boolean f(r5.o oVar) {
        a1 a1VarU;
        f0 f0VarM = p.m(oVar, false, (this.f11798b & 2) != 0);
        if (f0VarM != null) {
            a1VarU = i0.u(f0VarM);
        } else {
            g0 g0Var = i0.f25998b;
            a1VarU = a1.f25946e;
        }
        this.f11806j = a1VarU;
        return f0VarM == null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0242 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:390:0x070c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x02ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0006 A[SYNTHETIC] */
    @Override // r5.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(r5.o r44, b0.a r45) throws m4.p0 {
        /*
            Method dump skipped, instruction units count: 1848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.m.g(r5.o, b0.a):int");
    }

    @Override // r5.n
    public final void h(r5.q qVar) {
        if ((this.f11798b & 16) == 0) {
            qVar = new d0(qVar, this.f11797a);
        }
        this.f11822z = qVar;
    }

    @Override // r5.n
    public final void i(long j10, long j11) {
        this.f11803g.clear();
        this.f11810n = 0;
        this.f11812p = -1;
        this.f11813q = 0;
        this.f11814r = 0;
        this.f11815s = 0;
        this.f11816t = false;
        if (j10 == 0) {
            if (this.f11807k != 3) {
                this.f11807k = 0;
                this.f11810n = 0;
                return;
            } else {
                o oVar = this.f11804h;
                oVar.f11827a.clear();
                oVar.f11828b = 0;
                this.f11805i.clear();
                return;
            }
        }
        for (l lVar : this.A) {
            t tVar = lVar.f11793b;
            int iE = c0.e(tVar.f11870f, j11, false);
            while (true) {
                if (iE < 0) {
                    iE = -1;
                    break;
                } else if ((tVar.f11871g[iE] & 1) != 0) {
                    break;
                } else {
                    iE--;
                }
            }
            if (iE == -1) {
                iE = tVar.a(j11);
            }
            lVar.f11796e = iE;
            r5.i0 i0Var = lVar.f11795d;
            if (i0Var != null) {
                i0Var.f18828b = false;
                i0Var.f18829c = 0;
            }
        }
    }

    @Override // r5.n
    public final List j() {
        return this.f11806j;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e4 A[EDGE_INSN: B:73:0x00e4->B:65:0x00e4 BREAK  A[LOOP:1: B:32:0x006b->B:64:0x00e0], SYNTHETIC] */
    @Override // r5.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r5.a0 k(long r21) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.m.k(long):r5.a0");
    }

    @Override // r5.b0
    public final long m() {
        return this.D;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x021d, code lost:
    
        r14 = r7.g() + r14;
        r0 = r7.g();
        r33 = r3;
        r3 = (r0 >> 24) & com.tencent.bugly.beta.tinker.TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK;
        r34 = r11;
        r35 = r12;
        r36 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x023b, code lost:
    
        if (r3 == 169) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x023f, code lost:
    
        if (r3 != 253) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0249, code lost:
    
        if (r0 != 1735291493) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x024b, code lost:
    
        r0 = f6.j.a(l6.p.h(r7) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0255, code lost:
    
        if (r0 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0257, code lost:
    
        r3 = new f6.n("TCON", null, ya.i0.u(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0262, code lost:
    
        p4.c.B("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0268, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0269, code lost:
    
        r7.G(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0272, code lost:
    
        if (r0 != 1684632427) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0274, code lost:
    
        r3 = l6.p.g(r0, "TPOS", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x027b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0281, code lost:
    
        if (r0 != 1953655662) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0283, code lost:
    
        r3 = l6.p.g(r0, "TRCK", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x028d, code lost:
    
        if (r0 != 1953329263) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x028f, code lost:
    
        r3 = l6.p.i(r0, "TBPM", r7, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x029b, code lost:
    
        if (r0 != 1668311404) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x029d, code lost:
    
        r3 = l6.p.i(r0, "TCMP", r7, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02a8, code lost:
    
        if (r0 != 1668249202) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02aa, code lost:
    
        r3 = l6.p.f(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02b2, code lost:
    
        if (r0 != 1631670868) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02b4, code lost:
    
        r3 = l6.p.l(r0, "TPE2", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02be, code lost:
    
        if (r0 != 1936682605) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02c0, code lost:
    
        r3 = l6.p.l(r0, "TSOT", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02ca, code lost:
    
        if (r0 != 1936679276) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02cc, code lost:
    
        r3 = l6.p.l(r0, "TSOA", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02d6, code lost:
    
        if (r0 != 1936679282) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02d8, code lost:
    
        r3 = l6.p.l(r0, "TSOP", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02e2, code lost:
    
        if (r0 != 1936679265) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02e4, code lost:
    
        r3 = l6.p.l(r0, "TSO2", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02ef, code lost:
    
        if (r0 != 1936679791) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02f1, code lost:
    
        r3 = l6.p.l(r0, "TSOC", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02fc, code lost:
    
        if (r0 != 1920233063) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02fe, code lost:
    
        r3 = l6.p.i(r0, "ITUNESADVISORY", r7, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x030a, code lost:
    
        if (r0 != 1885823344) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x030c, code lost:
    
        r3 = l6.p.i(r0, "ITUNESGAPLESS", r7, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0319, code lost:
    
        if (r0 != 1936683886) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x031b, code lost:
    
        r3 = l6.p.l(r0, "TVSHOWSORT", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0326, code lost:
    
        if (r0 != 1953919848) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0328, code lost:
    
        r3 = l6.p.l(r0, "TVSHOW", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0333, code lost:
    
        if (r0 != 757935405) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0335, code lost:
    
        r12 = null;
        r13 = null;
        r0 = -1;
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0339, code lost:
    
        r15 = r7.f16612b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x033b, code lost:
    
        if (r15 >= r14) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x033d, code lost:
    
        r21 = r7.g();
        r11 = r7.g();
        r37 = r3;
        r7.H(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x034e, code lost:
    
        if (r11 != 1835360622) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0350, code lost:
    
        r12 = r7.q(r21 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x035d, code lost:
    
        if (r11 != 1851878757) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x035f, code lost:
    
        r13 = r7.q(r21 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0369, code lost:
    
        if (r11 != 1684108385) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x036b, code lost:
    
        r0 = r15;
        r37 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x036e, code lost:
    
        r7.H(r21 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0373, code lost:
    
        r3 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0377, code lost:
    
        r37 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x037c, code lost:
    
        if (r12 == null) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x037e, code lost:
    
        if (r13 == null) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0381, code lost:
    
        if (r0 != (-1)) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0384, code lost:
    
        r7.G(r0);
        r7.H(16);
        r11 = new f6.k(r12, r13, r7.q(r37 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0398, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0399, code lost:
    
        r7.G(r14);
        r3 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x039f, code lost:
    
        r11 = 16777215 & r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03a6, code lost:
    
        if (r11 != 6516084) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03a8, code lost:
    
        r3 = l6.p.e(r0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03b1, code lost:
    
        if (r11 == 7233901) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x03b6, code lost:
    
        if (r11 != 7631467) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x03bd, code lost:
    
        if (r11 == 6516589) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x03c2, code lost:
    
        if (r11 != 7828084) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03c9, code lost:
    
        if (r11 != 6578553) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03cb, code lost:
    
        r3 = l6.p.l(r0, "TDRC", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03d6, code lost:
    
        if (r11 != 4280916) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03d8, code lost:
    
        r3 = l6.p.l(r0, "TPE1", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03e3, code lost:
    
        if (r11 != 7630703) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03e5, code lost:
    
        r3 = l6.p.l(r0, "TSSE", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x03f0, code lost:
    
        if (r11 != 6384738) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x03f2, code lost:
    
        r3 = l6.p.l(r0, "TALB", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x03fd, code lost:
    
        if (r11 != 7108978) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03ff, code lost:
    
        r3 = l6.p.l(r0, "USLT", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x040a, code lost:
    
        if (r11 != 6776174) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x040c, code lost:
    
        r3 = l6.p.l(r0, "TCON", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0415, code lost:
    
        if (r11 != 6779504) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0417, code lost:
    
        r3 = l6.p.l(r0, "TIT1", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x041f, code lost:
    
        p4.c.l("MetadataUtil", "Skipped unknown metadata entry: " + q4.d.c(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0432, code lost:
    
        r7.G(r14);
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0437, code lost:
    
        r3 = l6.p.l(r0, "TCOM", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x043f, code lost:
    
        r3 = l6.p.l(r0, "TIT2", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0447, code lost:
    
        if (r3 == null) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0449, code lost:
    
        r8.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x044c, code lost:
    
        r3 = r33;
        r11 = r34;
        r12 = r35;
        r13 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x045b, code lost:
    
        r7.G(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x045e, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x045f, code lost:
    
        r34 = r11;
        r35 = r12;
        r36 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0469, code lost:
    
        if (r8.isEmpty() == false) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x046b, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0470, code lost:
    
        r0 = new m4.n0(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x020b, code lost:
    
        r7.G(r3);
        r3 = r3 + r8;
        r7.H(8);
        r8 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0219, code lost:
    
        r14 = r7.f16612b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x021b, code lost:
    
        if (r14 >= r3) goto L453;
     */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0860 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(long r39) throws m4.p0 {
        /*
            Method dump skipped, instruction units count: 2181
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.m.n(long):void");
    }

    @Override // r5.n
    public final void a() {
    }

    @Override // r5.n
    public final r5.n c() {
        return this;
    }
}
