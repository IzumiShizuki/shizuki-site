package t0;

import android.graphics.Matrix;
import android.graphics.Path;
import ba.s;
import c7.e1;
import com.tencent.bugly.beta.tinker.TinkerReport;
import e7.y;
import g2.v0;
import ic.n;
import j1.q;
import j2.h0;
import jc.l;
import m0.b1;
import m0.c1;
import m0.r1;
import m0.x2;
import n7.b0;
import q.t0;
import q1.e0;
import q2.m;
import r.u1;
import r.w;
import r.y1;
import ub.a0;
import x0.j1;
import x0.n2;
import x0.o;
import x0.p1;
import x0.v;
import y.p;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f20107a = 40;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0.f f20108b = g0.g.f7122a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f20109c = (float) 7.5d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f20110d = (float) 2.5d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f20111e = 10;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f20112f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f20113g = 6;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final u1 f20114h = r.d.r(TinkerReport.KEY_LOADED_MISMATCH_DEX, 0, w.f18601d, 2);

    public static final void a(j jVar, long j10, q qVar, o oVar, int i10) {
        q qVar2;
        oVar.Y(-486016981);
        int i11 = i10 | (oVar.h(jVar) ? 4 : 2) | (oVar.e(j10) ? 32 : 16);
        if (oVar.N(i11 & 1, (i11 & 147) != 146)) {
            Object objK = oVar.K();
            Object obj = x0.k.f24334a;
            Object obj2 = objK;
            if (objK == obj) {
                q1.h hVarA = q1.j.a();
                hVarA.e(1);
                oVar.h0(hVarA);
                obj2 = hVarA;
            }
            e0 e0Var = (e0) obj2;
            boolean zF = oVar.f(jVar);
            Object objK2 = oVar.K();
            if (zF || objK2 == obj) {
                objK2 = v.o(new b(jVar, 0));
                oVar.h0(objK2);
            }
            n2 n2VarB = r.e.b(((Number) ((n2) objK2).getValue()).floatValue(), f20114h, oVar);
            Object objK3 = oVar.K();
            if (objK3 == obj) {
                objK3 = new sf.i(1);
                oVar.h0(objK3);
            }
            qVar2 = qVar;
            q qVarA = m.a(qVar2, false, (ic.k) objK3);
            boolean zH = oVar.h(jVar) | oVar.f(n2VarB) | ((i11 & 112) == 32) | oVar.h(e0Var);
            Object objK4 = oVar.K();
            if (zH || objK4 == obj) {
                Object cVar = new c(jVar, n2VarB, j10, e0Var);
                oVar.h0(cVar);
                objK4 = cVar;
            }
            nh.b.a(0, (ic.k) objK4, qVarA, oVar);
        } else {
            qVar2 = qVar;
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new da.v(jVar, j10, qVar2, i10);
        }
    }

    public static final void b(final boolean z10, final j jVar, final q qVar, long j10, long j11, o oVar, final int i10) {
        final long j12;
        final long j13;
        int i11;
        long j14;
        long jB;
        long j15;
        long j16;
        q1.q qVar2;
        o oVar2 = oVar;
        oVar2.Y(308716636);
        int i12 = i10 | (oVar2.g(z10) ? 4 : 2) | (oVar2.h(jVar) ? 32 : 16) | (oVar2.f(qVar) ? 256 : 128) | 205824;
        if (oVar2.N(i12 & 1, (74899 & i12) != 74898)) {
            oVar2.S();
            if ((i10 & 1) == 0 || oVar2.x()) {
                long jI = ((b1) oVar2.j(c1.f12773a)).i();
                i11 = i12 & (-64513);
                j14 = jI;
                jB = c1.b(jI, oVar2);
            } else {
                oVar2.Q();
                i11 = i12 & (-64513);
                j14 = j10;
                jB = j11;
            }
            oVar2.q();
            int i13 = i11 & 14;
            boolean zF = (i13 == 4) | oVar2.f(jVar);
            Object objK = oVar2.K();
            if (zF || objK == x0.k.f24334a) {
                objK = v.o(new s(z10, jVar, 4));
                oVar2.h0(objK);
            }
            n2 n2Var = (n2) objK;
            r1 r1Var = (r1) oVar2.j(x2.f13883a);
            if (r1Var == null) {
                oVar2.W(1453247536);
                oVar2.p(false);
                j16 = j14;
                j15 = jB;
                qVar2 = null;
            } else {
                oVar2.W(323973617);
                j15 = jB;
                long jA = r1Var.a(j14, f20113g, oVar2, 48);
                j16 = j14;
                oVar2.p(false);
                qVar2 = new q1.q(jA);
            }
            long j17 = qVar2 != null ? qVar2.f17577a : j16;
            q qVarA = androidx.compose.ui.graphics.a.a(androidx.compose.ui.draw.a.c(androidx.compose.foundation.layout.c.j(qVar, f20107a), new sf.i(2)), new y(15, jVar));
            float f10 = ((Boolean) n2Var.getValue()).booleanValue() ? f20113g : 0;
            g0.f fVar = f20108b;
            q qVarB = androidx.compose.foundation.a.b(lc.b.U(qVarA, f10, fVar, true, 24), j17, fVar);
            v0 v0VarD = p.d(j1.c.f9662a, false);
            int iQ = v.q(oVar2);
            j1 j1VarL = oVar2.l();
            q qVarC = j1.a.c(qVarB, oVar2);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            oVar2.a0();
            if (oVar2.S) {
                oVar2.k(iVar);
            } else {
                oVar2.k0();
            }
            v.A(i2.j.f8738g, v0VarD, oVar2);
            v.A(i2.j.f8737f, j1VarL, oVar2);
            i2.h hVar = i2.j.f8741j;
            if (oVar2.S || !l.a(oVar2.K(), Integer.valueOf(iQ))) {
                h0.s(iQ, oVar2, iQ, hVar);
            }
            v.A(i2.j.f8735d, qVarC, oVar2);
            long j18 = j15;
            b0.c(Boolean.valueOf(z10), null, r.d.r(100, 0, null, 6), null, f1.g.f(1853731063, new e(j18, jVar, 0), oVar2), oVar, i13 | 24960, 10);
            oVar2 = oVar;
            oVar2.p(true);
            j13 = j18;
            j12 = j16;
        } else {
            oVar2.Q();
            j12 = j10;
            j13 = j11;
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new n(z10, jVar, qVar, j12, j13, i10) { // from class: t0.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f20099a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ j f20100b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ q f20101c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f20102d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f20103e;

                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iD = v.D(65);
                    f.b(this.f20099a, this.f20100b, this.f20101c, this.f20102d, this.f20103e, (o) obj, iD);
                    return a0.f21526a;
                }
            };
        }
    }

    public static final void c(s1.d dVar, e0 e0Var, p1.c cVar, long j10, float f10, q.v0 v0Var) {
        q1.h hVar = (q1.h) e0Var;
        hVar.d();
        Path path = hVar.f17511a;
        path.moveTo(0.0f, 0.0f);
        float f11 = f20111e;
        float fQ = dVar.Q(f11);
        float f12 = v0Var.f17465b;
        hVar.b(fQ * f12, 0.0f);
        hVar.b((dVar.Q(f11) * f12) / 2, dVar.Q(f20112f) * f12);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (cVar.b() >> 32)) + (Math.min(cVar.f16485c - cVar.f16483a, cVar.f16486d - cVar.f16484b) / 2.0f)) - ((dVar.Q(f11) * f12) / 2.0f))) << 32) | (((long) Float.floatToRawIntBits((dVar.Q(f20110d) / 2.0f) + Float.intBitsToFloat((int) (cVar.b() & 4294967295L)))) & 4294967295L);
        Matrix matrix = hVar.f17514d;
        if (matrix == null) {
            hVar.f17514d = new Matrix();
        } else {
            matrix.reset();
        }
        Matrix matrix2 = hVar.f17514d;
        l.b(matrix2);
        matrix2.setTranslate(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
        Matrix matrix3 = hVar.f17514d;
        l.b(matrix3);
        path.transform(matrix3);
        path.close();
        float f13 = v0Var.f17464a;
        long jC0 = dVar.c0();
        e1 e1VarS = dVar.S();
        long jD = e1VarS.D();
        e1VarS.z().f();
        try {
            ((y1) e1VarS.f3618b).f0(f13, jC0);
            t0.o(dVar, hVar, j10, f10, null, 56);
        } finally {
            t0.L(e1VarS, jD);
        }
    }
}
