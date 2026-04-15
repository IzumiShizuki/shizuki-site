package nh;

import a9.r;
import androidx.compose.foundation.layout.FillElement;
import com.cnl.kikoeru.R;
import eg.d;
import g2.v0;
import hd.q0;
import hf.y;
import i2.h;
import i2.i;
import i2.j;
import ic.n;
import j2.h0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jc.l;
import jc.z;
import la.y0;
import lf.e;
import q1.f0;
import q1.n0;
import q1.o0;
import q1.q;
import sc.a1;
import sc.u;
import ta.c;
import u3.x0;
import vb.m;
import w1.f;
import w1.g0;
import x0.j1;
import x0.k;
import x0.o;
import x0.p1;
import x0.r0;
import x0.v;
import x0.w0;
import y.p;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static f f15878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static f f15879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static f f15880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static f f15881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static f f15882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static f f15883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static f f15884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static f f15885h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static f f15886i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static f f15887j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static f f15888k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static f f15889l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static f f15890m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static f f15891n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static f f15892o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static f f15893p;

    /* JADX WARN: Removed duplicated region for block: B:101:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0242  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A(pc.v r15) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nh.a.A(pc.v):java.lang.String");
    }

    public static void B(StringBuilder sb, List list, boolean z10) throws IOException {
        StringBuilder sb2;
        if (list.isEmpty()) {
            sb2 = sb;
        } else {
            sb2 = sb;
            m.e0(list, sb2, null, "<", ">", null, 114);
        }
        if (z10) {
            sb2.append("?");
        }
    }

    public static final long C(float f10, long j10) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j10 >> 32)) - f10);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j10 & 4294967295L)) - f10);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    public static final void a(c cVar, int i10, o oVar, int i11) {
        char c3;
        boolean z10;
        l.e(cVar, "hsvColor");
        oVar.Y(539960986);
        int i12 = (i11 & 14) == 0 ? (oVar.f(cVar) ? 4 : 2) | i11 : i11;
        if ((i11 & 112) == 0) {
            i12 |= oVar.d(i10) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && oVar.z()) {
            oVar.Q();
        } else {
            float f10 = cVar.f20599c;
            float f11 = i10 / 2.0f;
            Float fValueOf = Float.valueOf(f10);
            Integer numValueOf = Integer.valueOf(i10);
            oVar.X(511388516);
            boolean zF = oVar.f(fValueOf) | oVar.f(numValueOf);
            Object objK = oVar.K();
            r0 r0Var = k.f24334a;
            if (zF || objK == r0Var) {
                c3 = 1;
                c[] cVarArr = {new c(0.0f, 1.0f, f10, 1.0f), new c(60.0f, 1.0f, f10, 1.0f), new c(120.0f, 1.0f, f10, 1.0f), new c(180.0f, 1.0f, f10, 1.0f), new c(240.0f, 1.0f, f10, 1.0f), new c(300.0f, 1.0f, f10, 1.0f), new c(360.0f, 1.0f, f10, 1.0f)};
                ArrayList arrayList = new ArrayList(7);
                for (int i13 = 0; i13 < 7; i13++) {
                    arrayList.add(new q(cVarArr[i13].b()));
                }
                o0 o0Var = new o0(x0.b(f11, f11), arrayList);
                oVar.h0(o0Var);
                objK = o0Var;
            } else {
                c3 = 1;
            }
            oVar.p(false);
            q1.m mVar = (q1.m) objK;
            Integer numValueOf2 = Integer.valueOf(i10);
            oVar.X(1157296644);
            boolean zF2 = oVar.f(numValueOf2);
            Object objK2 = oVar.K();
            if (zF2 || objK2 == r0Var) {
                q qVar = new q(q.f17571d);
                q qVar2 = new q(q.f17574g);
                q[] qVarArr = new q[2];
                z10 = false;
                qVarArr[0] = qVar;
                qVarArr[c3] = qVar2;
                f0 f0Var = new f0(ud.b.x(qVarArr), x0.b(f11, f11), f11);
                oVar.h0(f0Var);
                objK2 = f0Var;
            } else {
                z10 = false;
            }
            oVar.p(z10);
            q1.m mVar2 = (q1.m) objK2;
            FillElement fillElement = androidx.compose.foundation.layout.c.f557c;
            oVar.X(1618982084);
            boolean zF3 = oVar.f(mVar) | oVar.f(mVar2) | oVar.f(cVar);
            Object objK3 = oVar.K();
            if (zF3 || objK3 == r0Var) {
                objK3 = new cg.b(mVar, mVar2, cVar, 20);
                oVar.h0(objK3);
            }
            oVar.p(false);
            b.a(6, (ic.k) objK3, fillElement, oVar);
        }
        p1 p1VarR = oVar.r();
        if (p1VarR == null) {
            return;
        }
        p1VarR.f24421d = new d(cVar, i10, i11, 2);
    }

    public static final void b(r9.c cVar, o oVar, int i10) {
        int i11;
        o oVar2 = oVar;
        l.e(cVar, "page");
        oVar2.Y(-1477666868);
        if ((i10 & 6) == 0) {
            i11 = (oVar2.f(cVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (oVar2.N(i11 & 1, (i11 & 3) != 2)) {
            androidx.lifecycle.x0 x0VarA = j4.a.a(oVar2);
            if (x0VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            o9.b bVar = (o9.b) g8.a.w(x0VarA, z.f10839a.b(o9.b.class), null, x0VarA instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) x0VarA).c() : i4.a.f9001b);
            Object objK = oVar2.K();
            r0 r0Var = k.f24334a;
            if (objK == r0Var) {
                objK = v.v(e.f12389b);
                oVar2.h0(objK);
            }
            w0 w0Var = (w0) objK;
            la.l.g(((Boolean) cVar.f18968e.getValue()).booleanValue(), (String) cVar.f18969f.getValue(), bVar.f16287b, w0Var, oVar, 0);
            j7.b bVarA = j7.d.a((lf.f) w0Var.getValue(), oVar);
            c0.z zVarL = lc.b.L(oVar);
            FillElement fillElement = androidx.compose.foundation.layout.c.f557c;
            v0 v0VarD = p.d(j1.c.f9662a, false);
            int iQ = v.q(oVar);
            j1 j1VarL = oVar.l();
            j1.q qVarC = j1.a.c(fillElement, oVar);
            i2.k.f8771g0.getClass();
            i iVar = j.f8733b;
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            v.A(j.f8738g, v0VarD, oVar);
            v.A(j.f8737f, j1VarL, oVar);
            h hVar = j.f8741j;
            if (oVar.S || !l.a(oVar.K(), Integer.valueOf(iQ))) {
                h0.s(iQ, oVar, iQ, hVar);
            }
            v.A(j.f8735d, qVarC, oVar);
            if (bVarA.c() == 0) {
                oVar.W(1278377049);
                ka.b.k(na.q.g(R.string.no_result), null, fillElement, oVar, 384, 2);
            } else {
                oVar.W(1276223324);
            }
            oVar.p(false);
            Object objK2 = oVar.K();
            if (objK2 == r0Var) {
                objK2 = ud.b.w(new la.x0(b.v(), na.q.g(R.string.delete_history)));
                oVar.h0(objK2);
            }
            List list = (List) objK2;
            boolean zH = oVar.h(bVar);
            Object objK3 = oVar.K();
            if (zH || objK3 == r0Var) {
                objK3 = new r(15, bVar);
                oVar.h0(objK3);
            }
            la.l.d(bVarA, zVarL, null, null, 0.0f, null, null, list, null, (n) objK3, oVar, 8, 0, 892);
            oVar2 = oVar;
            ka.b.e(zVarL, androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.b.f554a.a(j1.n.f9689a, j1.c.f9670i), 25), 5, oVar2, 384, 0);
            oVar2.p(true);
        } else {
            oVar2.Q();
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new y0(cVar, i10, 2);
        }
    }

    public static final void c(r9.c cVar, o oVar, int i10) {
        int i11;
        l.e(cVar, "page");
        oVar.Y(-1390044207);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(cVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (oVar.N(i11 & 1, (i11 & 3) != 2)) {
            Object objK = oVar.K();
            Object obj = k.f24334a;
            if (objK == obj) {
                objK = v.m(oVar);
                oVar.h0(objK);
            }
            y yVar = (y) objK;
            f fVarU = b.u();
            boolean zH = oVar.h(yVar);
            Object objK2 = oVar.K();
            if (zH || objK2 == obj) {
                objK2 = new ba.d(yVar, 5, false);
                oVar.h0(objK2);
            }
            na.c.b(fVarU, (ic.a) objK2, oVar, 0);
            f fVarS = x0.s();
            boolean z10 = (i11 & 14) == 4;
            Object objK3 = oVar.K();
            if (z10 || objK3 == obj) {
                objK3 = new n9.a(cVar, 1);
                oVar.h0(objK3);
            }
            na.c.b(fVarS, (ic.a) objK3, oVar, 0);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new y0(cVar, i10, 3);
        }
    }

    public static final long d(float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r2 - r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int e(int r2, int r3, int r4, boolean r5) {
        /*
            r0 = 0
            if (r3 < r4) goto L8
            if (r5 == 0) goto L6
            return r0
        L6:
            int r4 = r4 - r3
            return r4
        L8:
            if (r5 != 0) goto Ld
            if (r3 > r2) goto L16
            goto L11
        Ld:
            int r1 = r4 - r3
            if (r1 <= r2) goto L16
        L11:
            if (r5 == 0) goto L14
            goto L21
        L14:
            int r2 = r2 - r3
            return r2
        L16:
            if (r5 == 0) goto L1b
            if (r3 > r2) goto L24
            goto L1f
        L1b:
            int r1 = r4 - r3
            if (r1 <= r2) goto L24
        L1f:
            if (r5 != 0) goto L22
        L21:
            return r2
        L22:
            int r2 = r2 - r3
            return r2
        L24:
            if (r5 != 0) goto L27
            return r0
        L27:
            int r4 = r4 - r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: nh.a.e(int, int, int, boolean):int");
    }

    public static void f(StringBuilder sb, pc.b bVar) throws IOException {
        List listO = bVar.o();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listO) {
            if (((a1) ((pc.n) obj)).f19757c == pc.m.f16976b) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        m.e0(arrayList, sb, null, "context(", ") ", sc.c.f19772k, 50);
    }

    public static void g(StringBuilder sb, pc.b bVar) {
        Object objB = ((u) bVar).f19878a.b();
        l.d(objB, "invoke(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : (List) objB) {
            pc.m mVar = ((a1) ((pc.n) obj)).f19757c;
            if (mVar == pc.m.f16975a || mVar == pc.m.f16977c) {
                arrayList.add(obj);
            }
        }
        pc.n nVar = (pc.n) m.b0(0, arrayList);
        if (nVar != null) {
            sb.append(A(((a1) nVar).c()));
            sb.append(".");
        }
        pc.n nVar2 = (pc.n) m.b0(1, arrayList);
        if (nVar2 != null) {
            sb.append("(");
            sb.append(A(((a1) nVar2).c()));
            sb.append(".");
            sb.append(")");
        }
    }

    public static void h(s4.h hVar) {
        if (hVar != null) {
            try {
                hVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final float i(int i10, int i11, float[] fArr) {
        l.e(fArr, "arg0");
        return fArr[(i11 * 3) + i10];
    }

    public static final f j() {
        f fVar = f15878a;
        if (fVar != null) {
            return fVar;
        }
        w1.e eVar = new w1.e("Filled.AccountCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = g0.f23208a;
        n0 n0Var = new n0(q.f17569b);
        q0 q0VarH = h0.h(12.0f, 2.0f);
        q0VarH.m(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        q0VarH.w(4.48f, 10.0f, 10.0f, 10.0f);
        q0VarH.w(10.0f, -4.48f, 10.0f, -10.0f);
        q0VarH.v(17.52f, 2.0f, 12.0f, 2.0f);
        q0VarH.l();
        q0VarH.u(12.0f, 6.0f);
        q0VarH.n(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f);
        q0VarH.v(13.93f, 13.0f, 12.0f, 13.0f);
        q0VarH.w(-3.5f, -1.57f, -3.5f, -3.5f);
        q0VarH.v(10.07f, 6.0f, 12.0f, 6.0f);
        q0VarH.l();
        q0VarH.u(12.0f, 20.0f);
        q0VarH.n(-2.03f, 0.0f, -4.43f, -0.82f, -6.14f, -2.88f);
        q0VarH.m(7.55f, 15.8f, 9.68f, 15.0f, 12.0f, 15.0f);
        q0VarH.w(4.45f, 0.8f, 6.14f, 2.12f);
        q0VarH.m(16.43f, 19.18f, 14.03f, 20.0f, 12.0f, 20.0f);
        q0VarH.l();
        w1.e.a(eVar, q0VarH.f8447b, 0, n0Var);
        f fVarB = eVar.b();
        f15878a = fVarB;
        return fVarB;
    }

    public static File[] k(File file) {
        String name = file.getName();
        int iLastIndexOf = name.lastIndexOf(".");
        if (iLastIndexOf != -1) {
            name = name.substring(0, iLastIndexOf);
        }
        File[] fileArrListFiles = file.getParentFile().listFiles(new tg.a(name));
        if (fileArrListFiles == null) {
            return new File[0];
        }
        Arrays.sort(fileArrListFiles);
        return fileArrListFiles;
    }

    public static final long l(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final float m(int i10, int i11, float[] fArr) {
        return fArr[((i10 - i11) * 2) + 1];
    }

    public static final f n() {
        f fVar = f15880c;
        if (fVar != null) {
            return fVar;
        }
        w1.e eVar = new w1.e("Filled.DeleteForever", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = g0.f23208a;
        n0 n0Var = new n0(q.f17569b);
        q0 q0VarH = h0.h(6.0f, 19.0f);
        q0VarH.n(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        q0VarH.r(8.0f);
        q0VarH.n(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        q0VarH.s(18.0f, 7.0f);
        h0.t(q0VarH, 6.0f, 7.0f, 12.0f);
        q0VarH.u(8.46f, 11.88f);
        q0VarH.t(1.41f, -1.41f);
        q0VarH.s(12.0f, 12.59f);
        q0VarH.t(2.12f, -2.12f);
        q0VarH.t(1.41f, 1.41f);
        q0VarH.s(13.41f, 14.0f);
        q0VarH.t(2.12f, 2.12f);
        q0VarH.t(-1.41f, 1.41f);
        q0VarH.s(12.0f, 15.41f);
        q0VarH.t(-2.12f, 2.12f);
        q0VarH.t(-1.41f, -1.41f);
        q0VarH.s(10.59f, 14.0f);
        q0VarH.t(-2.13f, -2.12f);
        q0VarH.l();
        q0VarH.u(15.5f, 4.0f);
        q0VarH.t(-1.0f, -1.0f);
        q0VarH.r(-5.0f);
        q0VarH.t(-1.0f, 1.0f);
        q0VarH.s(5.0f, 4.0f);
        q0VarH.z(2.0f);
        q0VarH.r(14.0f);
        q0VarH.s(19.0f, 4.0f);
        q0VarH.l();
        w1.e.a(eVar, q0VarH.f8447b, 0, n0Var);
        f fVarB = eVar.b();
        f15880c = fVarB;
        return fVarB;
    }

    public static final f o() {
        f fVar = f15881d;
        if (fVar != null) {
            return fVar;
        }
        w1.e eVar = new w1.e("Filled.Downloading", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = g0.f23208a;
        n0 n0Var = new n0(q.f17569b);
        q0 q0VarH = h0.h(18.32f, 4.26f);
        q0VarH.m(16.84f, 3.05f, 15.01f, 2.25f, 13.0f, 2.05f);
        q0VarH.z(2.02f);
        q0VarH.n(1.46f, 0.18f, 2.79f, 0.76f, 3.9f, 1.62f);
        q0VarH.s(18.32f, 4.26f);
        q0VarH.l();
        q0VarH.u(19.93f, 11.0f);
        q0VarH.r(2.02f);
        q0VarH.n(-0.2f, -2.01f, -1.0f, -3.84f, -2.21f, -5.32f);
        q0VarH.s(18.31f, 7.1f);
        q0VarH.m(19.17f, 8.21f, 19.75f, 9.54f, 19.93f, 11.0f);
        q0VarH.l();
        q0VarH.u(18.31f, 16.9f);
        q0VarH.t(1.43f, 1.43f);
        q0VarH.n(1.21f, -1.48f, 2.01f, -3.32f, 2.21f, -5.32f);
        q0VarH.r(-2.02f);
        q0VarH.m(19.75f, 14.46f, 19.17f, 15.79f, 18.31f, 16.9f);
        q0VarH.l();
        q0VarH.u(13.0f, 19.93f);
        q0VarH.z(2.02f);
        q0VarH.n(2.01f, -0.2f, 3.84f, -1.0f, 5.32f, -2.21f);
        q0VarH.t(-1.43f, -1.43f);
        q0VarH.m(15.79f, 19.17f, 14.46f, 19.75f, 13.0f, 19.93f);
        q0VarH.l();
        q0VarH.u(13.0f, 12.0f);
        q0VarH.y(7.0f);
        q0VarH.r(-2.0f);
        q0VarH.z(5.0f);
        q0VarH.q(7.0f);
        q0VarH.t(5.0f, 5.0f);
        q0VarH.t(5.0f, -5.0f);
        q0VarH.q(13.0f);
        q0VarH.l();
        q0VarH.u(11.0f, 19.93f);
        q0VarH.z(2.02f);
        q0VarH.n(-5.05f, -0.5f, -9.0f, -4.76f, -9.0f, -9.95f);
        q0VarH.w(3.95f, -9.45f, 9.0f, -9.95f);
        q0VarH.z(2.02f);
        q0VarH.m(7.05f, 4.56f, 4.0f, 7.92f, 4.0f, 12.0f);
        q0VarH.v(7.05f, 19.44f, 11.0f, 19.93f);
        q0VarH.l();
        w1.e.a(eVar, q0VarH.f8447b, 0, n0Var);
        f fVarB = eVar.b();
        f15881d = fVarB;
        return fVarB;
    }

    public static final f p() {
        f fVar = f15882e;
        if (fVar != null) {
            return fVar;
        }
        w1.e eVar = new w1.e("Filled.Folder", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = g0.f23208a;
        n0 n0Var = new n0(q.f17569b);
        q0 q0Var = new q0((byte) 0, 6);
        q0Var.u(10.0f, 4.0f);
        q0Var.q(4.0f);
        q0Var.n(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        q0Var.s(2.0f, 18.0f);
        q0Var.n(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        q0Var.r(16.0f);
        q0Var.n(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        q0Var.y(8.0f);
        q0Var.n(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        q0Var.r(-8.0f);
        q0Var.t(-2.0f, -2.0f);
        q0Var.l();
        w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
        f fVarB = eVar.b();
        f15882e = fVarB;
        return fVarB;
    }

    public static final f q() {
        f fVar = f15883f;
        if (fVar != null) {
            return fVar;
        }
        w1.e eVar = new w1.e("Filled.GTranslate", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = g0.f23208a;
        n0 n0Var = new n0(q.f17569b);
        q0 q0Var = new q0((byte) 0, 6);
        q0Var.u(21.0f, 4.0f);
        q0Var.s(11.0f, 4.0f);
        q0Var.t(-1.0f, -3.0f);
        q0Var.s(3.0f, 1.0f);
        q0Var.n(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        q0Var.z(15.0f);
        q0Var.n(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        q0Var.r(8.0f);
        q0Var.t(1.0f, 3.0f);
        q0Var.r(9.0f);
        q0Var.n(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        q0Var.s(23.0f, 6.0f);
        q0Var.n(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        q0Var.l();
        q0Var.u(7.0f, 16.0f);
        q0Var.n(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        q0Var.w(2.24f, -5.0f, 5.0f, -5.0f);
        q0Var.n(1.35f, 0.0f, 2.48f, 0.5f, 3.35f, 1.3f);
        q0Var.s(9.03f, 8.57f);
        q0Var.n(-0.38f, -0.36f, -1.04f, -0.78f, -2.03f, -0.78f);
        q0Var.n(-1.74f, 0.0f, -3.15f, 1.44f, -3.15f, 3.21f);
        q0Var.v(5.26f, 14.21f, 7.0f, 14.21f);
        q0Var.n(2.01f, 0.0f, 2.84f, -1.44f, 2.92f, -2.41f);
        q0Var.s(7.0f, 11.8f);
        q0Var.z(-1.71f);
        q0Var.r(4.68f);
        q0Var.n(0.07f, 0.31f, 0.12f, 0.61f, 0.12f, 1.02f);
        q0Var.m(11.8f, 13.97f, 9.89f, 16.0f, 7.0f, 16.0f);
        q0Var.l();
        q0Var.u(13.17f, 10.58f);
        q0Var.r(3.7f);
        q0Var.n(-0.43f, 1.25f, -1.11f, 2.43f, -2.05f, 3.47f);
        q0Var.n(-0.31f, -0.35f, -0.6f, -0.72f, -0.86f, -1.1f);
        q0Var.t(-0.79f, -2.37f);
        q0Var.l();
        q0Var.u(21.5f, 20.5f);
        q0Var.n(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        q0Var.s(14.0f, 21.5f);
        q0Var.t(2.0f, -2.5f);
        q0Var.t(-1.04f, -3.1f);
        q0Var.t(3.1f, 3.1f);
        q0Var.t(0.92f, -0.92f);
        q0Var.t(-3.3f, -3.25f);
        q0Var.t(0.02f, -0.02f);
        q0Var.n(1.13f, -1.25f, 1.93f, -2.69f, 2.4f, -4.22f);
        q0Var.s(20.0f, 10.59f);
        q0Var.z(-1.3f);
        q0Var.r(-4.53f);
        q0Var.s(15.47f, 8.0f);
        q0Var.r(-1.29f);
        q0Var.z(1.29f);
        q0Var.r(-1.44f);
        q0Var.s(11.46f, 5.5f);
        q0Var.r(9.04f);
        q0Var.n(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        q0Var.z(14.0f);
        q0Var.l();
        w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
        f fVarB = eVar.b();
        f15883f = fVarB;
        return fVarB;
    }

    public static final f r() {
        f fVar = f15886i;
        if (fVar != null) {
            return fVar;
        }
        w1.e eVar = new w1.e("Filled.PlayCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = g0.f23208a;
        n0 n0Var = new n0(q.f17569b);
        q0 q0VarH = h0.h(12.0f, 2.0f);
        q0VarH.m(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        q0VarH.w(4.48f, 10.0f, 10.0f, 10.0f);
        q0VarH.w(10.0f, -4.48f, 10.0f, -10.0f);
        q0VarH.v(17.52f, 2.0f, 12.0f, 2.0f);
        q0VarH.l();
        q0VarH.u(9.5f, 16.5f);
        q0VarH.z(-9.0f);
        q0VarH.t(7.0f, 4.5f);
        q0VarH.s(9.5f, 16.5f);
        q0VarH.l();
        w1.e.a(eVar, q0VarH.f8447b, 0, n0Var);
        f fVarB = eVar.b();
        f15886i = fVarB;
        return fVarB;
    }

    public static final f s() {
        f fVar = f15888k;
        if (fVar != null) {
            return fVar;
        }
        w1.e eVar = new w1.e("Filled.Share", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = g0.f23208a;
        n0 n0Var = new n0(q.f17569b);
        q0 q0VarH = h0.h(18.0f, 16.08f);
        q0VarH.n(-0.76f, 0.0f, -1.44f, 0.3f, -1.96f, 0.77f);
        q0VarH.s(8.91f, 12.7f);
        q0VarH.n(0.05f, -0.23f, 0.09f, -0.46f, 0.09f, -0.7f);
        q0VarH.w(-0.04f, -0.47f, -0.09f, -0.7f);
        q0VarH.t(7.05f, -4.11f);
        q0VarH.n(0.54f, 0.5f, 1.25f, 0.81f, 2.04f, 0.81f);
        q0VarH.n(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        q0VarH.w(-1.34f, -3.0f, -3.0f, -3.0f);
        q0VarH.w(-3.0f, 1.34f, -3.0f, 3.0f);
        q0VarH.n(0.0f, 0.24f, 0.04f, 0.47f, 0.09f, 0.7f);
        q0VarH.s(8.04f, 9.81f);
        q0VarH.m(7.5f, 9.31f, 6.79f, 9.0f, 6.0f, 9.0f);
        q0VarH.n(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        q0VarH.w(1.34f, 3.0f, 3.0f, 3.0f);
        q0VarH.n(0.79f, 0.0f, 1.5f, -0.31f, 2.04f, -0.81f);
        q0VarH.t(7.12f, 4.16f);
        q0VarH.n(-0.05f, 0.21f, -0.08f, 0.43f, -0.08f, 0.65f);
        q0VarH.n(0.0f, 1.61f, 1.31f, 2.92f, 2.92f, 2.92f);
        q0VarH.n(1.61f, 0.0f, 2.92f, -1.31f, 2.92f, -2.92f);
        q0VarH.w(-1.31f, -2.92f, -2.92f, -2.92f);
        q0VarH.l();
        w1.e.a(eVar, q0VarH.f8447b, 0, n0Var);
        f fVarB = eVar.b();
        f15888k = fVarB;
        return fVarB;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0266 A[EDGE_INSN: B:204:0x0266->B:145:0x0266 BREAK  A[LOOP:5: B:155:0x0282->B:207:0x0282], EDGE_INSN: B:205:0x0266->B:145:0x0266 BREAK  A[LOOP:5: B:155:0x0282->B:207:0x0282]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int t(u2.k r19, android.text.Layout r20, ch.l r21, int r22, android.graphics.RectF r23, v2.d r24, a9.r r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nh.a.t(u2.k, android.text.Layout, ch.l, int, android.graphics.RectF, v2.d, a9.r, boolean):int");
    }

    public static String u(long j10, String[] strArr) {
        long j11 = 4294967295L & j10;
        long j12 = (j11 ^ (j11 >>> 33)) * 7109453100751455733L;
        long jB = b.B(((j12 ^ (j12 >>> 28)) * (-3808689974395783757L)) >>> 32);
        long j13 = (jB >>> 32) & 65535;
        long jB2 = b.B(jB);
        int i10 = (int) (((j10 >>> 32) ^ j13) ^ ((jB2 >>> 16) & (-65536)));
        long jB3 = b.B(jB2) ^ (((long) strArr[i10 / 8191].charAt(i10 % 8191)) << 32);
        int i11 = (int) ((jB3 >>> 32) & 65535);
        char[] cArr = new char[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i10 + i12 + 1;
            jB3 = b.B(jB3) ^ (((long) strArr[i13 / 8191].charAt(i13 % 8191)) << 32);
            cArr[i12] = (char) ((jB3 >>> 32) & 65535);
        }
        return new String(cArr);
    }

    public static final f v() {
        f fVar = f15889l;
        if (fVar != null) {
            return fVar;
        }
        w1.e eVar = new w1.e("Filled.ThumbDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = g0.f23208a;
        n0 n0Var = new n0(q.f17569b);
        q0 q0Var = new q0((byte) 0, 6);
        q0Var.u(15.0f, 3.0f);
        q0Var.s(6.0f, 3.0f);
        q0Var.n(-0.83f, 0.0f, -1.54f, 0.5f, -1.84f, 1.22f);
        q0Var.t(-3.02f, 7.05f);
        q0Var.n(-0.09f, 0.23f, -0.14f, 0.47f, -0.14f, 0.73f);
        q0Var.z(2.0f);
        q0Var.n(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        q0Var.r(6.31f);
        q0Var.t(-0.95f, 4.57f);
        q0Var.t(-0.03f, 0.32f);
        q0Var.n(0.0f, 0.41f, 0.17f, 0.79f, 0.44f, 1.06f);
        q0Var.s(9.83f, 23.0f);
        q0Var.t(6.59f, -6.59f);
        q0Var.n(0.36f, -0.36f, 0.58f, -0.86f, 0.58f, -1.41f);
        q0Var.s(17.0f, 5.0f);
        q0Var.n(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        q0Var.l();
        q0Var.u(19.0f, 3.0f);
        q0Var.z(12.0f);
        q0Var.r(4.0f);
        q0Var.s(23.0f, 3.0f);
        q0Var.r(-4.0f);
        q0Var.l();
        w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
        f fVarB = eVar.b();
        f15889l = fVarB;
        return fVarB;
    }

    public static final f w() {
        f fVar = f15890m;
        if (fVar != null) {
            return fVar;
        }
        w1.e eVar = new w1.e("Filled.Upload", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = g0.f23208a;
        n0 n0Var = new n0(q.f17569b);
        q0 q0Var = new q0((byte) 0, 6);
        q0Var.u(5.0f, 20.0f);
        q0Var.r(14.0f);
        q0Var.z(-2.0f);
        q0Var.q(5.0f);
        q0Var.y(20.0f);
        q0Var.l();
        q0Var.u(5.0f, 10.0f);
        q0Var.r(4.0f);
        q0Var.z(6.0f);
        q0Var.r(6.0f);
        q0Var.z(-6.0f);
        q0Var.r(4.0f);
        q0Var.t(-7.0f, -7.0f);
        q0Var.s(5.0f, 10.0f);
        q0Var.l();
        w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
        f fVarB = eVar.b();
        f15890m = fVarB;
        return fVarB;
    }

    public static pc.y x(pc.v vVar) {
        l.e(vVar, "type");
        return new pc.y(pc.z.f16984a, vVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList y(p4.s r30) {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nh.a.y(p4.s):java.util.ArrayList");
    }

    public static void z(StringBuilder sb, pc.c cVar, be.d dVar, List list, boolean z10) throws IOException {
        if (cVar.getTypeParameters().size() >= list.size() || g8.a.D(cVar).getDeclaringClass() == null) {
            sb.append(lc.b.O(be.d.f(dVar)));
        } else {
            Class<?> declaringClass = g8.a.D(cVar).getDeclaringClass();
            l.d(declaringClass, "getDeclaringClass(...)");
            z(sb, g8.a.H(declaringClass), dVar.e(), m.V(list, cVar.getTypeParameters().size()), false);
            sb.append(".");
            sb.append(lc.b.M(dVar.g()));
        }
        B(sb, m.D0(list, cVar.getTypeParameters().size()), z10);
    }
}
