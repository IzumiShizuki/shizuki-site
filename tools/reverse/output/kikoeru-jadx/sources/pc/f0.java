package pc;

import android.graphics.Color;
import android.graphics.PointF;
import android.view.View;
import b0.l0;
import b0.s1;
import bg.a2;
import bg.e1;
import bg.o1;
import ce.j0;
import g2.n1;
import h0.r1;
import h0.u0;
import hd.q0;
import i2.d1;
import i2.g1;
import j2.l1;
import j2.z2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import m0.b1;
import m0.c1;
import m0.v1;
import q1.h0;
import q1.n0;
import t2.i0;
import t2.k0;
import x0.j1;
import x0.o2;
import x0.p1;
import x0.y1;
import y.i1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static w1.f f16971a;

    public static final Type B(y yVar) {
        z zVar = yVar.f16982a;
        if (zVar == null) {
            return g0.f16972c;
        }
        v vVar = yVar.f16983b;
        jc.l.b(vVar);
        int iOrdinal = zVar.ordinal();
        if (iOrdinal == 0) {
            return q(vVar, true);
        }
        if (iOrdinal == 1) {
            return new g0(null, q(vVar, true));
        }
        if (iOrdinal == 2) {
            return new g0(q(vVar, true), null);
        }
        throw new j0();
    }

    public static final int C(t2.n nVar, long j10, z2 z2Var) {
        float fG = z2Var != null ? z2Var.g() : 0.0f;
        int i10 = (int) (4294967295L & j10);
        int iE = nVar.e(Float.intBitsToFloat(i10));
        if (Float.intBitsToFloat(i10) < nVar.f(iE) - fG || Float.intBitsToFloat(i10) > nVar.b(iE) + fG) {
            return -1;
        }
        int i11 = (int) (j10 >> 32);
        if (Float.intBitsToFloat(i11) < (-fG) || Float.intBitsToFloat(i11) > nVar.f20369d + fG) {
            return -1;
        }
        return iE;
    }

    public static final w1.f D() {
        w1.f fVar = f16971a;
        if (fVar != null) {
            return fVar;
        }
        w1.e eVar = new w1.e("AutoMirrored.Filled.PlaylistAdd", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i10 = w1.g0.f23208a;
        n0 n0Var = new n0(q1.q.f17569b);
        q0 q0Var = new q0((byte) 0, 6);
        q0Var.u(14.0f, 10.0f);
        q0Var.q(3.0f);
        q0Var.z(2.0f);
        q0Var.r(11.0f);
        q0Var.y(10.0f);
        q0Var.l();
        q0Var.u(14.0f, 6.0f);
        q0Var.q(3.0f);
        q0Var.z(2.0f);
        q0Var.r(11.0f);
        q0Var.y(6.0f);
        q0Var.l();
        q0Var.u(18.0f, 14.0f);
        q0Var.z(-4.0f);
        q0Var.r(-2.0f);
        q0Var.z(4.0f);
        q0Var.r(-4.0f);
        q0Var.z(2.0f);
        q0Var.r(4.0f);
        q0Var.z(4.0f);
        q0Var.r(2.0f);
        q0Var.z(-4.0f);
        q0Var.r(4.0f);
        q0Var.z(-2.0f);
        q0Var.q(18.0f);
        q0Var.l();
        q0Var.u(3.0f, 16.0f);
        q0Var.r(7.0f);
        q0Var.z(-2.0f);
        q0Var.q(3.0f);
        q0Var.y(16.0f);
        q0Var.l();
        w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
        w1.f fVarB = eVar.b();
        f16971a = fVarB;
        return fVarB;
    }

    public static final long E(u0 u0Var, p1.c cVar, int i10) {
        r1 r1VarD = u0Var.d();
        t2.n nVar = r1VarD != null ? r1VarD.f7827a.f20345b : null;
        g2.c0 c0VarC = u0Var.c();
        return (nVar == null || c0VarC == null) ? k0.f20356b : nVar.h(cVar.i(c0VarC.G(0L)), i10, t2.g0.f20324b);
    }

    public static final Object G(hg.b bVar, u uVar) {
        jc.l.e(bVar, "<this>");
        jc.l.e(uVar, "property");
        return bVar.a();
    }

    public static boolean H(yc.c cVar) {
        jc.l.e(cVar, "callableMemberDescriptor");
        if (!ld.f.f12213d.contains(cVar.getName())) {
            return false;
        }
        if (vb.m.S(ld.f.f12212c, ie.d.c(cVar)) && cVar.o0().isEmpty()) {
            return true;
        }
        if (!vc.i.z(cVar)) {
            return false;
        }
        Collection collectionA = cVar.A();
        jc.l.d(collectionA, "getOverriddenDescriptors(...)");
        Collection<yc.c> collection = collectionA;
        if (collection.isEmpty()) {
            return false;
        }
        for (yc.c cVar2 : collection) {
            jc.l.b(cVar2);
            if (H(cVar2)) {
                return true;
            }
        }
        return false;
    }

    public static final int I(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    public static final int J(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    public static final boolean K(int i10) {
        int type = Character.getType(i10);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean M(int i10) {
        return Character.isWhitespace(i10) || i10 == 160;
    }

    public static final boolean N(int i10) {
        int type;
        return (!M(i10) || (type = Character.getType(i10)) == 14 || type == 13 || i10 == 10) ? false : true;
    }

    public static df.l O(ic.n nVar) {
        df.l lVar = new df.l();
        lVar.f5999d = ud.s.k(nVar, lVar, lVar);
        return lVar;
    }

    public static final hg.b P(hg.a aVar, String str, Object obj, v vVar) {
        jc.l.e(aVar, "<this>");
        jc.l.e(str, "key");
        jc.l.e(obj, "def");
        jc.l.e(vVar, "type");
        return new hg.b(new gg.b(aVar, 0), obj, str, vVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:225:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Q(android.view.ViewStructure r39, i2.j0 r40, android.view.autofill.AutofillId r41, java.lang.String r42, r2.b r43) {
        /*
            Method dump skipped, instruction units count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pc.f0.Q(android.view.ViewStructure, i2.j0, android.view.autofill.AutofillId, java.lang.String, r2.b):void");
    }

    public static final byte[] R(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        u(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        jc.l.d(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static String S(int i10) {
        Object[] objArr = {Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10)), Double.valueOf(((double) Color.alpha(i10)) / 255.0d)};
        int i11 = p4.c0.f16548a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public static final c9.c T(a2 a2Var, int i10) {
        jc.l.e(a2Var, "<this>");
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = a2Var.f2823f;
        String str = a2Var.f2835r;
        List list = a2Var.f2838u;
        xf.r rVar = na.w.f15765a;
        rVar.getClass();
        String strB = rVar.b(new wf.d(e1.Companion.serializer(), 0), list);
        String strB2 = rVar.b(new wf.d(o1.Companion.serializer(), 0), a2Var.f2841x);
        String strB3 = rVar.b(bg.c.Companion.serializer(), a2Var.f2818a);
        String str2 = a2Var.I;
        String str3 = a2Var.f2839v;
        boolean z10 = a2Var.f2822e;
        return new c9.c(i10, jCurrentTimeMillis, j10, na.c.l(a2Var), str, strB, strB2, strB3, a2Var.f2828k, z10, str2, str3, rVar.b(a2.Companion.serializer(), a2Var));
    }

    public static be.c U(be.e eVar) {
        jc.l.e(eVar, "shortName");
        String strB = eVar.b();
        jc.l.d(strB, "asString(...)");
        return new be.c(new be.d(strB, be.c.f2743c.f2744a, eVar));
    }

    public static final boolean V(Throwable th2, ic.a aVar) {
        Iterable iterableC0;
        Object objInvoke;
        jc.l.e(th2, "<this>");
        Integer num = dc.a.f5863a;
        i1.e eVar = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th2.getSuppressed();
            jc.l.d(suppressed, "getSuppressed(...)");
            iterableC0 = vb.l.c0(suppressed);
        } else {
            Method method = cc.a.f3888b;
            iterableC0 = (method == null || (objInvoke = method.invoke(th2, null)) == null) ? vb.r.f22819a : vb.l.c0((Throwable[]) objInvoke);
        }
        Iterable iterable = iterableC0;
        boolean z10 = false;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof i1.e) {
                    return false;
                }
            }
        }
        try {
            List list = (List) aVar.b();
            boolean zIsEmpty = list.isEmpty();
            z10 = !zIsEmpty;
            if (!zIsEmpty) {
                eVar = new i1.e(list);
            }
        } catch (Throwable th3) {
            eVar = th3;
        }
        if (eVar != null) {
            ub.a.a(th2, eVar);
        }
        return z10;
    }

    public static final void a(w1.f fVar, String str, int i10, x0.o oVar, int i11) {
        w1.f fVar2;
        String str2;
        x0.o oVar2 = oVar;
        jc.l.e(fVar, "icon");
        jc.l.e(str, "contentDescription");
        oVar2.Y(-653205618);
        int i12 = (oVar2.f(fVar) ? 4 : 2) | i11 | (oVar2.f(str) ? 32 : 16) | (oVar2.d(i10) ? 256 : 128);
        if ((i12 & 731) == 146 && oVar2.z()) {
            oVar2.Q();
            fVar2 = fVar;
            str2 = str;
        } else {
            g0.f fVarA = g0.g.a(8);
            j1.n nVar = j1.n.f9689a;
            float f10 = 16;
            j1.q qVarJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.a.b(gh.g.k(nVar, fVarA), q1.q.b(0.5f, q1.q.f17569b), h0.f17515a), f10);
            j1.h hVar = j1.c.f9666e;
            oVar2.X(733328855);
            y.s sVarE = y.p.e(hVar, oVar2, 6);
            oVar2.X(-1323940314);
            int iQ = x0.v.q(oVar2);
            j1 j1VarL = oVar2.l();
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            f1.f fVarK = n1.k(qVarJ);
            oVar2.a0();
            if (oVar2.S) {
                oVar2.k(iVar);
            } else {
                oVar2.k0();
            }
            i2.h hVar2 = i2.j.f8738g;
            x0.v.A(hVar2, sVarE, oVar2);
            i2.h hVar3 = i2.j.f8737f;
            x0.v.A(hVar3, j1VarL, oVar2);
            i2.h hVar4 = i2.j.f8741j;
            if (oVar2.S || !jc.l.a(oVar2.K(), Integer.valueOf(iQ))) {
                j2.h0.s(iQ, oVar2, iQ, hVar4);
            }
            fVarK.g(new y1(oVar2), oVar2, 0);
            oVar2.X(2058660585);
            j1.g gVar = j1.c.f9672k;
            oVar2.X(693286680);
            y.j1 j1VarA = i1.a(y.k.f25156a, gVar, oVar2, 48);
            oVar2.X(-1323940314);
            int iQ2 = x0.v.q(oVar2);
            j1 j1VarL2 = oVar2.l();
            f1.f fVarK2 = n1.k(nVar);
            oVar2.a0();
            if (oVar2.S) {
                oVar2.k(iVar);
            } else {
                oVar2.k0();
            }
            x0.v.A(hVar2, j1VarA, oVar2);
            x0.v.A(hVar3, j1VarL2, oVar2);
            if (oVar2.S || !jc.l.a(oVar2.K(), Integer.valueOf(iQ2))) {
                j2.h0.s(iQ2, oVar2, iQ2, hVar4);
            }
            fVarK2.g(new y1(oVar2), oVar2, 0);
            oVar2.X(2058660585);
            v0.j.b(fVar, str, androidx.compose.foundation.layout.c.j(nVar, 36), q1.q.f17571d, oVar2, (i12 & 14) | 3456 | (i12 & 112), 0);
            fVar2 = fVar;
            str2 = str;
            y.d.d(androidx.compose.foundation.layout.c.j(nVar, f10), oVar2);
            v0.w.b(i10 / 100.0f, androidx.compose.foundation.layout.c.n(nVar, 100), 0L, 0L, oVar, 48);
            oVar2 = oVar;
            oVar2.p(false);
            oVar2.p(true);
            oVar2.p(false);
            oVar2.p(false);
            oVar2.p(false);
            oVar2.p(true);
            oVar2.p(false);
            oVar2.p(false);
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new l0(fVar2, str2, i10, i11);
        }
    }

    public static final void b(j1.q qVar, long j10, float f10, float f11, x0.o oVar, final int i10, final int i11) {
        j1.q qVar2;
        int i12;
        final long j11;
        final float f12;
        final float f13;
        long jB;
        float f14;
        float f15;
        float fA;
        oVar.Y(-1249392198);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            qVar2 = qVar;
        } else {
            qVar2 = qVar;
            i12 = i10 | (oVar.f(qVar2) ? 4 : 2);
        }
        int i14 = i12 | 3472;
        if (oVar.N(i14 & 1, (i14 & 1171) != 1170)) {
            oVar.S();
            int i15 = i10 & 1;
            j1.q qVarN = j1.n.f9689a;
            if (i15 == 0 || oVar.x()) {
                if (i13 != 0) {
                    qVar2 = qVarN;
                }
                jB = q1.q.b(0.12f, ((b1) oVar.j(c1.f12773a)).e());
                f14 = 1;
                f15 = 0;
            } else {
                oVar.Q();
                jB = j10;
                f14 = f10;
                f15 = f11;
            }
            oVar.q();
            if (f15 != 0.0f) {
                qVarN = androidx.compose.foundation.layout.a.n(qVarN, f15, 0.0f, 0.0f, 0.0f, 14);
            }
            if (f3.f.a(f14, 0.0f)) {
                oVar.W(-455967894);
                fA = 1.0f / ((f3.c) oVar.j(l1.f9866h)).a();
                oVar.p(false);
            } else {
                oVar.W(-455901337);
                oVar.p(false);
                fA = f14;
            }
            y.p.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.d(androidx.compose.foundation.layout.c.c(qVar2.e(qVarN), 1.0f), fA), jB, h0.f17515a), oVar, 0);
            f12 = f14;
            j11 = jB;
            f13 = f15;
        } else {
            oVar.Q();
            j11 = j10;
            f12 = f10;
            f13 = f11;
        }
        final j1.q qVar3 = qVar2;
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ic.n(j11, f12, f13, i10, i11) { // from class: m0.e2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f12908b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ float f12909c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ float f12910d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f12911e;

                {
                    this.f12911e = i11;
                }

                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iD = x0.v.D(1);
                    pc.f0.b(this.f12907a, this.f12908b, this.f12909c, this.f12910d, (x0.o) obj, iD, this.f12911e);
                    return ub.a0.f21526a;
                }
            };
        }
    }

    public static final long c(float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static final boolean d(m1.d dVar, long j10) {
        if (!dVar.f9690a.f9703n) {
            return false;
        }
        i2.u uVar = i2.f.y(dVar).F.f8664c;
        if (!uVar.R.f9703n) {
            return false;
        }
        long jH = uVar.H(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jH >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jH & 4294967295L));
        long j11 = dVar.f14025q;
        float f10 = ((int) (j11 >> 32)) + fIntBitsToFloat;
        float f11 = ((int) (j11 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j10 >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f10) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f11;
    }

    public static final ef.j e(Matcher matcher, int i10, CharSequence charSequence) {
        if (matcher.find(i10)) {
            return new ef.j(matcher, charSequence);
        }
        return null;
    }

    public static final int f(u0 u0Var, long j10, z2 z2Var) {
        long jG;
        int iC;
        r1 r1VarD = u0Var.d();
        if (r1VarD != null) {
            t2.n nVar = r1VarD.f7827a.f20345b;
            g2.c0 c0VarC = u0Var.c();
            if (c0VarC != null && (iC = C(nVar, (jG = c0VarC.G(j10)), z2Var)) != -1) {
                return nVar.g(p1.b.a(jG, (nVar.b(iC) + nVar.f(iC)) / 2.0f, 1));
            }
        }
        return -1;
    }

    public static final long g(u0 u0Var, p1.c cVar, p1.c cVar2, int i10) {
        long jE = E(u0Var, cVar, i10);
        if (k0.b(jE)) {
            return k0.f20356b;
        }
        long jE2 = E(u0Var, cVar2, i10);
        if (k0.b(jE2)) {
            return k0.f20356b;
        }
        int i11 = (int) (jE >> 32);
        int i12 = (int) (jE2 & 4294967295L);
        return t2.c0.b(Math.min(i11, i11), Math.max(i12, i12));
    }

    public static final Object[] h(Object[] objArr, int i10, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        vb.l.m0(0, i10, 6, objArr, objArr2);
        vb.l.i0(i10 + 2, i10, objArr.length, objArr, objArr2);
        objArr2[i10] = obj;
        objArr2[i10 + 1] = obj2;
        return objArr2;
    }

    public static final boolean i(i0 i0Var, int i10) {
        t2.n nVar = i0Var.f20345b;
        int iD = nVar.d(i10);
        return i10 == i0Var.g(iD) || i10 == nVar.c(iD, false) ? i0Var.h(i10) != i0Var.a(i10) : i0Var.a(i10) != i0Var.a(i10 - 1);
    }

    public static final Object[] j(int i10, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        vb.l.m0(0, i10, 6, objArr, objArr2);
        vb.l.i0(i10, i10 + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] k(int i10, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        vb.l.m0(0, i10, 6, objArr, objArr2);
        vb.l.i0(i10, i10 + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final long l(PointF pointF) {
        float f10 = pointF.x;
        float f11 = pointF.y;
        return (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L);
    }

    public static final String m(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        df.k kVarB0 = df.m.b0(type, e0.f16970i);
        return ((Class) df.m.d0(kVarB0)).getName() + ef.u.g0(df.m.X(kVarB0), "[]");
    }

    public static final Object n(i2.m mVar, ic.a aVar, ac.c cVar) {
        Object obj;
        g1 g1VarX;
        Object objT;
        d1 d1Var;
        j1.p pVar = (j1.p) mVar;
        boolean z10 = pVar.f9690a.f9703n;
        if (z10) {
            if (!z10) {
                f2.a.b("visitAncestors called on an unattached node");
            }
            j1.p pVar2 = pVar.f9690a.f9694e;
            i2.j0 j0VarY = i2.f.y(mVar);
            loop0: while (true) {
                obj = null;
                if (j0VarY == null) {
                    break;
                }
                if ((j0VarY.F.f8667f.f9693d & 524288) != 0) {
                    while (pVar2 != null) {
                        if ((pVar2.f9692c & 524288) != 0) {
                            j1.p pVarF = pVar2;
                            z0.e eVar = null;
                            while (pVarF != null) {
                                if (pVarF instanceof n2.a) {
                                    obj = pVarF;
                                    break loop0;
                                }
                                if ((pVarF.f9692c & 524288) != 0 && (pVarF instanceof i2.n)) {
                                    int i10 = 0;
                                    for (j1.p pVar3 = ((i2.n) pVarF).f8789p; pVar3 != null; pVar3 = pVar3.f9695f) {
                                        if ((pVar3.f9692c & 524288) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                pVarF = pVar3;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new z0.e(new j1.p[16]);
                                                }
                                                if (pVarF != null) {
                                                    eVar.b(pVarF);
                                                    pVarF = null;
                                                }
                                                eVar.b(pVar3);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                pVarF = i2.f.f(eVar);
                            }
                        }
                        pVar2 = pVar2.f9694e;
                    }
                }
                j0VarY = j0VarY.v();
                pVar2 = (j0VarY == null || (d1Var = j0VarY.F) == null) ? null : d1Var.f8666e;
            }
            n2.a aVar2 = (n2.a) obj;
            if (aVar2 != null && (objT = aVar2.t((g1VarX = i2.f.x(mVar)), new s1(12, aVar, g1VarX), cVar)) == zb.a.f26667a) {
                return objT;
            }
        }
        return ub.a0.f21526a;
    }

    public static int o(int i10, int i11) {
        long j10 = ((long) i10) + ((long) i11);
        int i12 = (int) j10;
        if (j10 == ((long) i12)) {
            return i12;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + i10 + ", " + i11 + ")");
    }

    public static v1 p(long j10, long j11, x0.o oVar, int i10) {
        long jF = (i10 & 1) != 0 ? ((b1) oVar.j(c1.f12773a)).f() : j10;
        o2 o2Var = c1.f12773a;
        long jE = ((b1) oVar.j(o2Var)).e();
        long j12 = ((q1.q) oVar.j(m0.j1.f13125a)).f17577a;
        if (((b1) oVar.j(o2Var)).j()) {
            h0.r(j12);
        } else {
            h0.r(j12);
        }
        long jL = h0.l(q1.q.b(0.38f, jE), ((b1) oVar.j(o2Var)).i());
        long jF2 = (i10 & 4) != 0 ? ((b1) oVar.j(o2Var)).f() : j11;
        long jB = q1.q.b(0.24f, jF2);
        long jB2 = q1.q.b(0.32f, ((b1) oVar.j(o2Var)).e());
        long jB3 = q1.q.b(0.12f, jB2);
        long jB4 = q1.q.b(0.54f, c1.b(jF2, oVar));
        return new v1(jF, jL, jF2, jB, jB2, jB3, jB4, q1.q.b(0.54f, jF2), q1.q.b(0.12f, jB4), q1.q.b(0.12f, jB3));
    }

    public static final Type q(v vVar, boolean z10) {
        d dVarC = vVar.c();
        if (dVarC instanceof w) {
            return new c0((w) dVarC);
        }
        if (!(dVarC instanceof c)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + vVar);
        }
        c cVar = (c) dVarC;
        Class clsE = z10 ? g8.a.E(cVar) : g8.a.D(cVar);
        List listB = vVar.b();
        if (listB.isEmpty()) {
            return clsE;
        }
        if (!clsE.isArray()) {
            return v(clsE, listB);
        }
        if (clsE.getComponentType().isPrimitive()) {
            return clsE;
        }
        y yVar = (y) vb.m.z0(listB);
        if (yVar == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + vVar);
        }
        z zVar = yVar.f16982a;
        v vVar2 = yVar.f16983b;
        int i10 = zVar == null ? -1 : d0.f16969a[zVar.ordinal()];
        if (i10 == -1 || i10 == 1) {
            return clsE;
        }
        if (i10 != 2 && i10 != 3) {
            throw new j0();
        }
        jc.l.b(vVar2);
        Type typeQ = q(vVar2, false);
        return typeQ instanceof Class ? clsE : new a(typeQ);
    }

    public static int r(m7.b0 b0Var, androidx.lifecycle.q qVar, View view, View view2, m7.s sVar, boolean z10) {
        if (sVar.p() == 0 || b0Var.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z10) {
            return Math.min(qVar.h1(), qVar.c1(view2) - qVar.d1(view));
        }
        ((m7.t) view.getLayoutParams()).getClass();
        throw null;
    }

    public static int s(m7.b0 b0Var, androidx.lifecycle.q qVar, View view, View view2, m7.s sVar, boolean z10) {
        if (sVar.p() == 0 || b0Var.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return b0Var.a();
        }
        qVar.c1(view2);
        qVar.d1(view);
        ((m7.t) view.getLayoutParams()).getClass();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] t(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            jArr[i10] = iArr[i10];
        }
        return jArr;
    }

    public static long u(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i10 = inputStream.read(bArr);
        long j10 = 0;
        while (i10 >= 0) {
            outputStream.write(bArr, 0, i10);
            j10 += (long) i10;
            i10 = inputStream.read(bArr);
        }
        return j10;
    }

    public static final b0 v(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(vb.n.K(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(B((y) it.next()));
            }
            return new b0(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List list3 = list;
            ArrayList arrayList2 = new ArrayList(vb.n.K(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(B((y) it2.next()));
            }
            return new b0(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        b0 b0VarV = v(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(vb.n.K(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(B((y) it3.next()));
        }
        return new b0(cls, b0VarV, arrayList3);
    }

    public static long w(int i10, int i11, int i12, int i13) {
        int i14 = 262142;
        int iMin = Math.min(i12, 262142);
        int iMin2 = i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i13, 262142);
        int i15 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i15 >= 8191) {
            if (i15 < 32767) {
                i14 = 65534;
            } else if (i15 < 65535) {
                i14 = 32766;
            } else {
                if (i15 >= 262143) {
                    f3.b.k(i15);
                    throw new j0();
                }
                i14 = 8190;
            }
        }
        return f3.b.a(Math.min(i14, i10), i11 != Integer.MAX_VALUE ? Math.min(i14, i11) : Integer.MAX_VALUE, iMin, iMin2);
    }

    public static long x(int i10, int i11, int i12, int i13) {
        int i14 = 262142;
        int iMin = Math.min(i10, 262142);
        int iMin2 = i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i11, 262142);
        int i15 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i15 >= 8191) {
            if (i15 < 32767) {
                i14 = 65534;
            } else if (i15 < 65535) {
                i14 = 32766;
            } else {
                if (i15 >= 262143) {
                    f3.b.k(i15);
                    throw new j0();
                }
                i14 = 8190;
            }
        }
        return f3.b.a(iMin, iMin2, Math.min(i14, i12), i13 != Integer.MAX_VALUE ? Math.min(i14, i13) : Integer.MAX_VALUE);
    }

    public static final HashSet y(Iterable iterable) {
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set setD = ((le.o) it.next()).d();
            if (setD == null) {
                return null;
            }
            vb.m.P(hashSet, setD);
        }
        return hashSet;
    }

    public abstract Constructor A(Class cls);

    public abstract String[] F(Class cls);

    public abstract boolean L(Class cls);

    public abstract Method z(Class cls, Field field);
}
