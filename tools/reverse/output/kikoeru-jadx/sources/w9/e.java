package w9;

import f1.f;
import f1.g;
import ic.k;
import j1.n;
import j1.q;
import jc.l;
import jc.z;
import m0.b1;
import m0.c1;
import q1.h0;
import t9.h;
import ua.j;
import ub.a0;
import x0.o;
import x0.p1;
import x0.r0;
import x0.v;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f23455a = new f(new h(11), -500031495, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f23456b = new f(new h(12), -1381919902, false);

    public static final void a(w0 w0Var, long j10, k kVar, o oVar, int i10) {
        w0 w0Var2;
        k kVar2;
        p1 p1VarR;
        b bVar;
        l.e(w0Var, "show");
        l.e(kVar, "onConfirm");
        oVar.Y(1316229496);
        int i11 = i10 | (oVar.e(j10) ? 32 : 16);
        if (!oVar.N(i11 & 1, (i11 & 147) != 146)) {
            w0Var2 = w0Var;
            kVar2 = kVar;
            oVar.Q();
        } else {
            if (!((Boolean) w0Var.getValue()).booleanValue()) {
                p1VarR = oVar.r();
                if (p1VarR != null) {
                    bVar = new b(w0Var, j10, kVar, i10, 0);
                    p1VarR.f24421d = bVar;
                }
                return;
            }
            w0Var2 = w0Var;
            kVar2 = kVar;
            Object objK = oVar.K();
            if (objK == x0.k.f24334a) {
                objK = new ma.c(w0Var2, 29);
                oVar.h0(objK);
            }
            a2.c.c((ic.a) objK, g.f(-1459693520, new b(j10, w0Var2, kVar2), oVar), null, null, null, null, 0L, 0L, null, oVar, 48, 508);
        }
        p1VarR = oVar.r();
        if (p1VarR != null) {
            bVar = new b(w0Var2, j10, kVar2, i10, 2);
            p1VarR.f24421d = bVar;
        }
    }

    public static final void b(final String str, final String str2, q qVar, final long j10, long j11, boolean z10, o oVar, final int i10) {
        final q qVar2;
        final long j12;
        final boolean z11;
        int i11;
        q qVar3;
        long j13;
        boolean z12;
        char c3;
        r0 r0Var;
        long j14;
        String str3;
        oVar.Y(2037194417);
        int i12 = i10 | (oVar.f(str2) ? 32 : 16) | 1778048;
        if (oVar.N(i12 & 1, (599187 & i12) != 599186)) {
            oVar.S();
            if ((i10 & 1) == 0 || oVar.x()) {
                long jC = ((b1) oVar.j(c1.f12773a)).c();
                i11 = i12 & (-57345);
                qVar3 = n.f9689a;
                j13 = jC;
                z12 = true;
            } else {
                oVar.Q();
                i11 = i12 & (-57345);
                qVar3 = qVar;
                j13 = j11;
                z12 = z10;
            }
            int i13 = i11;
            oVar.q();
            hg.a aVar = (hg.a) oVar.j(y8.c.e());
            Object objK = oVar.K();
            r0 r0Var2 = x0.k.f24334a;
            if (objK == r0Var2) {
                objK = lc.b.G(str, Long.valueOf(j10), aVar, false, z.a(Long.TYPE));
                oVar.h0(objK);
            }
            fg.f fVar = (fg.f) objK;
            Object objK2 = oVar.K();
            if (objK2 == r0Var2) {
                objK2 = v.v(Boolean.FALSE);
                oVar.h0(objK2);
            }
            w0 w0Var = (w0) objK2;
            long jE = h0.e(((Number) fVar.getValue()).longValue());
            Object objK3 = oVar.K();
            if (objK3 == r0Var2) {
                c3 = 1;
                objK3 = new bd.a(29, fVar);
                oVar.h0(objK3);
            } else {
                c3 = 1;
            }
            a(w0Var, jE, (k) objK3, oVar, 390);
            int iB = h0.B(h0.e(((Number) fVar.getValue()).longValue()));
            ef.f fVar2 = ef.f.f6558e;
            int[] iArr = ef.c.f6551a;
            l.e(fVar2, "format");
            String str4 = fVar2.f6559a ? "0123456789ABCDEF" : "0123456789abcdef";
            if (fVar2.f6561c.f6556b) {
                char cCharAt = str4.charAt((iB >> 28) & 15);
                char cCharAt2 = str4.charAt((iB >> 24) & 15);
                char cCharAt3 = str4.charAt((iB >> 20) & 15);
                char cCharAt4 = str4.charAt((iB >> 16) & 15);
                char cCharAt5 = str4.charAt((iB >> 12) & 15);
                char cCharAt6 = str4.charAt((iB >> 8) & 15);
                char cCharAt7 = str4.charAt((iB >> 4) & 15);
                char cCharAt8 = str4.charAt(iB & 15);
                char[] cArr = new char[8];
                cArr[0] = cCharAt;
                cArr[c3] = cCharAt2;
                cArr[2] = cCharAt3;
                cArr[3] = cCharAt4;
                cArr[4] = cCharAt5;
                cArr[5] = cCharAt6;
                cArr[6] = cCharAt7;
                cArr[7] = cCharAt8;
                str3 = new String(cArr);
                j14 = j13;
                r0Var = r0Var2;
            } else {
                long j15 = iB;
                r0Var = r0Var2;
                long j16 = 0;
                j14 = j13;
                long j17 = j16 + j16 + ((long) 8) + j16;
                if (0 > j17 || j17 > 2147483647L) {
                    throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) ub.a.h(10, j17)));
                }
                int i14 = (int) j17;
                char[] cArr2 = new char[i14];
                int i15 = 0;
                int i16 = 0;
                int i17 = 32;
                while (i15 < 8) {
                    i17 -= 4;
                    cArr2[i16] = str4.charAt((int) ((j15 >> i17) & 15));
                    i15++;
                    i16++;
                    j15 = j15;
                }
                if (i16 == i14) {
                    str3 = new String(cArr2);
                } else {
                    j.f(0, i16, i14);
                    str3 = new String(cArr2, 0, i16);
                }
            }
            String strConcat = "#".concat(str3);
            Object objK4 = oVar.K();
            if (objK4 == r0Var) {
                objK4 = new ma.c(w0Var, 28);
                oVar.h0(objK4);
            }
            boolean z13 = z12;
            long j18 = j14;
            q qVar4 = qVar3;
            z8.a.a(str2, qVar4, strConcat, false, true, (ic.a) objK4, j18, z13, null, g.f(-189661653, new s9.c(fVar, 2), oVar), oVar, ((i13 >> 3) & 14) | 918773808, 8);
            qVar2 = qVar4;
            z11 = z13;
            j12 = j18;
        } else {
            oVar.Q();
            qVar2 = qVar;
            j12 = j11;
            z11 = z10;
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ic.n(str, str2, qVar2, j10, j12, z11, i10) { // from class: w9.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f23441a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f23442b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ q f23443c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f23444d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f23445e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f23446f;

                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iD = v.D(3079);
                    e.b(this.f23441a, this.f23442b, this.f23443c, this.f23444d, this.f23445e, this.f23446f, (o) obj, iD);
                    return a0.f21526a;
                }
            };
        }
    }
}
