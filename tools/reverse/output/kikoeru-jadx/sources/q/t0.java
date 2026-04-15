package q;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.cnl.kikoeru.R;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class t0 {
    public static ClassCastException A(int i10, ArrayList arrayList) {
        arrayList.get(i10).getClass();
        return new ClassCastException();
    }

    public static String B(int i10, String str) {
        return str + i10;
    }

    public static String C(int i10, String str, String str2) {
        return str + i10 + str2;
    }

    public static String D(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String E(StringBuilder sb, String str, char c3) {
        sb.append(str);
        sb.append(c3);
        return sb.toString();
    }

    public static String F(jc.a0 a0Var, Class cls, StringBuilder sb) {
        sb.append(a0Var.b(cls));
        return sb.toString();
    }

    public static pc.k G(Class cls, String str, String str2, int i10, jc.a0 a0Var) {
        return a0Var.e(new jc.o(cls, str, str2, i10));
    }

    public static pc.t H(Class cls, String str, String str2, int i10, jc.a0 a0Var) {
        return a0Var.g(new jc.s(cls, str, str2, i10));
    }

    public static w.k I(x0.o oVar) {
        w.k kVar = new w.k();
        oVar.h0(kVar);
        return kVar;
    }

    public static void J(int i10, String str, String str2) {
        p4.c.B(str2, str + i10);
    }

    public static void K(long j10, String str, StringBuilder sb) {
        sb.append((Object) q1.q.i(j10));
        sb.append(str);
    }

    public static void L(c7.e1 e1Var, long j10) {
        e1Var.z().r();
        e1Var.e0(j10);
    }

    public static /* synthetic */ boolean M(Object obj) {
        return obj != null;
    }

    public static void N(i2.l0 l0Var, t1.b bVar, ic.k kVar) {
        long jE = l0Var.e();
        bVar.e(l0Var, l0Var.getLayoutDirection(), (((long) ((int) Float.intBitsToFloat((int) (jE >> 32)))) << 32) | (4294967295L & ((long) ((int) Float.intBitsToFloat((int) (jE & 4294967295L))))), new cg.b(l0Var, l0Var.f8783b, kVar));
    }

    public static /* synthetic */ j1.q P(m1 m1Var, l1 l1Var, u uVar) {
        r1 r1Var = t1.f17457d;
        k1.f17349a.getClass();
        return m1Var.c(l1Var, uVar, r1Var, t1.f17455b);
    }

    public static boolean a(r.f fVar, long j10) {
        return j10 >= fVar.b();
    }

    public static void b(f9.f fVar, z7.a aVar) {
        jc.l.e(aVar, "connection");
        if (aVar instanceof q7.a) {
            a8.a aVar2 = ((q7.a) aVar).f17892a;
            int i10 = fVar.f6956a;
            yb.c cVar = null;
            int i11 = 2;
            jc.l.e(aVar2, "db");
            switch (i10) {
                case 1:
                    j9.b0 b0Var = j9.b0.f10659a;
                    j9.b0.a(aVar2);
                    break;
                case 2:
                    pf.e eVar = hf.l0.f8566a;
                    hf.a0.y(hf.a0.b(pf.d.f17138c), null, null, new f9.c(2, null), 3);
                    break;
                case 3:
                    String str = (String) g9.a.a().getValue();
                    String str2 = (String) pc.f0.P(gg.c.a(), "username", "", jc.z.a(String.class)).a();
                    String str3 = (String) pc.f0.P(gg.c.a(), "password", "", jc.z.a(String.class)).a();
                    if (a9.i.f().length() > 0) {
                        pf.e eVar2 = hf.l0.f8566a;
                        hf.a0.y(hf.a0.b(pf.d.f17138c), null, null, new f7.o(str, str2, str3, null, 3), 3);
                    }
                    break;
                case 4:
                    i9.o.f9489a.getClass();
                    hg.b bVar = i9.o.f9491c;
                    pc.u[] uVarArr = i9.o.f9490b;
                    bVar.e("", uVarArr[0]);
                    i9.o.f9492d.e(0, uVarArr[1]);
                    i9.o.f9493e.e("", uVarArr[2]);
                    if (((CharSequence) pc.f0.P(gg.c.a(), "subtitleDocumentUri", "", jc.z.a(String.class)).a()).length() > 0) {
                        ka.n.c(na.q.g(R.string.local_subtitle_upgrade), -1L, null, null, 510);
                    }
                    break;
                case 5:
                    if (((CharSequence) pc.f0.P(gg.c.a(), "subtitleDocumentUri", "", jc.z.a(String.class)).a()).length() > 0) {
                        ka.n.c(na.q.g(R.string.local_subtitle_auto_detect_encode), -1L, null, null, 510);
                    }
                    break;
                default:
                    pf.e eVar3 = hf.l0.f8566a;
                    hf.a0.y(hf.a0.b(pf.d.f17138c), null, null, new ba.v0(i11, cVar), 3);
                    if (!f9.f.a(aVar2)) {
                        ka.n.c("trash all lyric failed! ", 0L, null, null, 511);
                    } else {
                        ka.n.c(na.q.g(R.string.all_local_subtitle_deleted), -1L, null, null, 510);
                    }
                    break;
            }
        }
    }

    public static void c(r5.h0 h0Var, p4.s sVar, int i10) {
        h0Var.f(sVar, i10, 0);
    }

    public static long d(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - Float.intBitsToFloat((int) (j11 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static int e(int i10) throws og.a {
        int i11;
        for (int i12 : w0.c.c(3)) {
            if (i12 == 1) {
                i11 = 0;
            } else if (i12 == 2) {
                i11 = 8;
            } else {
                if (i12 != 3) {
                    throw null;
                }
                i11 = 99;
            }
            if (i11 == i10) {
                return i12;
            }
        }
        throw new og.a("Unknown compression method");
    }

    public static void f(q1.e0 e0Var, p1.d dVar) {
        q1.h hVar = (q1.h) e0Var;
        if (hVar.f17512b == null) {
            hVar.f17512b = new RectF();
        }
        RectF rectF = hVar.f17512b;
        jc.l.b(rectF);
        float f10 = dVar.f16487a;
        long j10 = dVar.f16494h;
        long j11 = dVar.f16493g;
        long j12 = dVar.f16492f;
        long j13 = dVar.f16491e;
        rectF.set(f10, dVar.f16488b, dVar.f16489c, dVar.f16490d);
        if (hVar.f17513c == null) {
            hVar.f17513c = new float[8];
        }
        float[] fArr = hVar.f17513c;
        jc.l.b(fArr);
        fArr[0] = Float.intBitsToFloat((int) (j13 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j13 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j12 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j12 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j11 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j11 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j10 >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j10 & 4294967295L));
        Path path = hVar.f17511a;
        RectF rectF2 = hVar.f17512b;
        jc.l.b(rectF2);
        float[] fArr2 = hVar.f17513c;
        jc.l.b(fArr2);
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public static int g(int i10, int i11, int i12, int i13) {
        return i10 | i11 | i12 | 128 | i13;
    }

    public static /* synthetic */ void j(s1.d dVar, long j10, float f10, long j11, s1.e eVar, int i10) {
        if ((i10 & 2) != 0) {
            f10 = p1.e.c(dVar.e()) / 2.0f;
        }
        float f11 = f10;
        if ((i10 & 4) != 0) {
            j11 = dVar.c0();
        }
        long j12 = j11;
        if ((i10 & 16) != 0) {
            eVar = s1.g.f19351a;
        }
        dVar.g0(j10, f11, j12, eVar, (i10 & 64) != 0 ? 3 : 13);
    }

    public static void k(s1.d dVar, q1.f fVar, long j10, long j11, float f10, q1.k kVar, int i10, int i11) {
        dVar.x(fVar, 0L, j10, (i11 & 16) != 0 ? j10 : j11, (i11 & 32) != 0 ? 1.0f : f10, kVar, (i11 & 512) != 0 ? 1 : i10);
    }

    public static void l(i2.l0 l0Var, q1.n0 n0Var, long j10, long j11, float f10, float f11, int i10) {
        if ((i10 & 64) != 0) {
            f11 = 1.0f;
        }
        s1.b bVar = l0Var.f8782a;
        q1.o oVar = bVar.f19345a.f19343c;
        p4.p pVarH = bVar.f19348d;
        if (pVarH == null) {
            pVarH = q1.h0.h();
            pVarH.p(1);
            bVar.f19348d = pVarH;
        }
        Paint paint = (Paint) pVarH.f16600b;
        n0Var.a(f11, bVar.f19346b.D(), pVarH);
        if (!jc.l.a((q1.k) pVarH.f16602d, null)) {
            pVarH.j(null);
        }
        if (pVarH.f16599a != 3) {
            pVarH.h(3);
        }
        if (paint.getStrokeWidth() != f10) {
            pVarH.o(f10);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (pVarH.e() != 0) {
            pVarH.m(0);
        }
        if (pVarH.f() != 0) {
            pVarH.n(0);
        }
        if (!paint.isFilterBitmap()) {
            pVarH.k(1);
        }
        oVar.i(j10, j11, pVarH);
    }

    public static /* synthetic */ void n(s1.d dVar, q1.e0 e0Var, q1.m mVar, float f10, s1.h hVar, int i10) {
        float f11 = (i10 & 4) != 0 ? 1.0f : f10;
        s1.e eVar = hVar;
        if ((i10 & 8) != 0) {
            eVar = s1.g.f19351a;
        }
        dVar.N(e0Var, mVar, f11, eVar, (i10 & 32) != 0 ? 3 : 0);
    }

    public static /* synthetic */ void o(s1.d dVar, q1.e0 e0Var, long j10, float f10, s1.h hVar, int i10) {
        float f11 = (i10 & 4) != 0 ? 1.0f : f10;
        s1.e eVar = hVar;
        if ((i10 & 8) != 0) {
            eVar = s1.g.f19351a;
        }
        dVar.p(e0Var, j10, f11, eVar);
    }

    public static /* synthetic */ void p(i2.l0 l0Var, q1.m mVar, long j10, long j11, float f10, s1.e eVar, int i10) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        long j12 = j10;
        l0Var.d(mVar, j12, (i10 & 4) != 0 ? d(l0Var.e(), j12) : j11, (i10 & 8) != 0 ? 1.0f : f10, (i10 & 16) != 0 ? s1.g.f19351a : eVar, (i10 & 64) != 0 ? 3 : 6);
    }

    public static /* synthetic */ void q(s1.d dVar, long j10, long j11, float f10, int i10) {
        if ((i10 & 4) != 0) {
            j11 = d(dVar.e(), 0L);
        }
        dVar.j0(j10, 0L, j11, (i10 & 8) != 0 ? 1.0f : f10, s1.g.f19351a, (i10 & 64) != 0 ? 3 : 0);
    }

    public static /* synthetic */ void r(i2.l0 l0Var, q1.m mVar, long j10, long j11, long j12, s1.e eVar, int i10) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        long j13 = j10;
        l0Var.f(mVar, j13, (i10 & 4) != 0 ? d(l0Var.e(), j13) : j11, j12, 1.0f, (i10 & 32) != 0 ? s1.g.f19351a : eVar);
    }

    public static long t(t4.r rVar) {
        byte[] bArr = (byte[]) ((t4.s) rVar).f20479b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }

    public static /* synthetic */ int u(int i10) {
        if (i10 == 1) {
            return 8;
        }
        if (i10 == 2) {
            return 12;
        }
        if (i10 == 3) {
            return 16;
        }
        throw null;
    }

    public static boolean v(int i10, boolean z10) {
        int i11 = i10 & 7;
        if (i11 != 4) {
            return z10 && i11 == 3;
        }
        return true;
    }

    public static float w(float[] fArr, int i10, int i11, float f10, float f11) {
        return (nh.a.i(i10, i11, fArr) * f10) + f11;
    }

    public static int x(float f10, int i10, int i11) {
        return (Float.floatToIntBits(f10) + i10) * i11;
    }

    public static int y(int i10, int i11, long j10) {
        return (ub.v.a(j10) + i10) * i11;
    }

    public static int z(int i10, int i11, List list) {
        return (list.hashCode() + i10) * i11;
    }
}
