package ua;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import c2.d0;
import com.tencent.bugly.beta.tinker.TinkerReport;
import g2.e0;
import ic.n;
import ic.o;
import j1.q;
import j2.l1;
import j2.z2;
import jc.m;
import ub.a0;
import x0.r0;
import x0.v;
import x0.w0;
import x0.y1;
import y.p;
import y.s;
import y.t;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends m implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ic.k f21517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w0 f21519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ta.c f21520e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ic.k kVar, int i10, w0 w0Var, ta.c cVar) {
        super(3);
        this.f21517b = kVar;
        this.f21518c = i10;
        this.f21519d = w0Var;
        this.f21520e = cVar;
    }

    public static final void f(w0 w0Var, w0 w0Var2, w0 w0Var3, w0 w0Var4, long j10, boolean z10) {
        long jC = gh.g.c(((Number) w0Var.getValue()).intValue(), ((Number) w0Var.getValue()).intValue());
        float f10 = ((ta.c) w0Var2.getValue()).f20599c;
        double d10 = ((double) ((int) (jC >> 32))) / 2.0d;
        double d11 = ((double) ((int) (jC & 4294967295L))) / 2.0d;
        double dMin = Math.min(d10, d11);
        double dE = ((double) p1.b.e(j10)) - d10;
        double dF = ((double) p1.b.f(j10)) - d11;
        double dHypot = Math.hypot(dE, dF);
        ta.c cVar = dHypot <= dMin ? new ta.c((float) ((((Math.atan2(dF, dE) * ((double) TinkerReport.KEY_APPLIED_VERSION_CHECK)) / 3.141592653589793d) + 360.0d) % 360.0d), (float) (dHypot / dMin), f10, 1.0f) : null;
        if (cVar != null) {
            w0Var3.setValue(Boolean.valueOf(z10));
            ((ic.k) w0Var4.getValue()).a(cVar);
        }
    }

    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean, int] */
    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        ?? r32;
        Object hVar;
        t tVar = (t) obj;
        x0.o oVar = (x0.o) obj2;
        int iIntValue = ((Number) obj3).intValue();
        jc.l.e(tVar, "$this$BoxWithConstraints");
        long j10 = tVar.f25258b;
        if ((iIntValue & 14) == 0) {
            iIntValue |= oVar.f(tVar) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && oVar.z()) {
            oVar.Q();
        } else {
            w0 w0VarY = v.y(this.f21517b, oVar);
            Integer numValueOf = Integer.valueOf(f3.a.h(j10));
            oVar.X(1157296644);
            boolean zF = oVar.f(numValueOf);
            Object objK = oVar.K();
            r0 r0Var = x0.k.f24334a;
            if (zF || objK == r0Var) {
                objK = v.v(Integer.valueOf(f3.a.h(j10)));
                oVar.h0(objK);
            }
            oVar.p(false);
            w0 w0Var = (w0) objK;
            oVar.X(-492369756);
            Object objK2 = oVar.K();
            if (objK2 == r0Var) {
                objK2 = v.v(Boolean.FALSE);
                oVar.h0(objK2);
            }
            oVar.p(false);
            w0 w0Var2 = (w0) objK2;
            oVar.X(-492369756);
            Object objK3 = oVar.K();
            if (objK3 == r0Var) {
                objK3 = v.v(Boolean.FALSE);
                oVar.h0(objK3);
            }
            oVar.p(false);
            w0 w0Var3 = (w0) objK3;
            Integer numValueOf2 = Integer.valueOf(((Number) w0Var.getValue()).intValue());
            w0 w0Var4 = this.f21519d;
            Object[] objArr = {w0Var3, w0Var, w0Var4, w0Var2, w0VarY};
            oVar.X(-568225417);
            int i10 = 0;
            boolean zF2 = false;
            for (int i11 = 5; i10 < i11; i11 = 5) {
                zF2 |= oVar.f(objArr[i10]);
                i10++;
            }
            Object objK4 = oVar.K();
            if (zF2 || objK4 == r0Var) {
                r32 = 1;
                hVar = new h(w0Var3, w0Var, w0Var4, w0Var2, w0VarY, null, 1);
                oVar.h0(hVar);
            } else {
                hVar = objK4;
                r32 = 1;
            }
            oVar.p(false);
            q qVarE = new SuspendPointerInputElement(numValueOf2, null, null, new d0((n) hVar), 6).e(androidx.compose.foundation.layout.c.f557c);
            oVar.X(733328855);
            s sVarE = p.e(j1.c.f9662a, oVar, 0);
            oVar.X(-1323940314);
            f3.c cVar = (f3.c) oVar.j(l1.f9866h);
            f3.m mVar = (f3.m) oVar.j(l1.f9872n);
            z2 z2Var = (z2) oVar.j(l1.f9877s);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            f1.f fVar = new f1.f(new e0(qVarE, r32), -2123382363, r32);
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            oVar.f24399y = false;
            v.A(i2.j.f8738g, sVarE, oVar);
            v.A(i2.j.f8736e, cVar, oVar);
            v.A(i2.j.f8739h, mVar, oVar);
            v.A(i2.j.f8740i, z2Var, oVar);
            oVar.f24399y = oVar.f24400z >= 0;
            fVar.g(new y1(oVar), oVar, 0);
            oVar.X(2058660585);
            oVar.X(-2137368960);
            int iIntValue2 = ((Number) w0Var.getValue()).intValue();
            int i12 = this.f21518c;
            ta.c cVar2 = this.f21520e;
            nh.a.a(cVar2, iIntValue2, oVar, (i12 >> 3) & 14);
            nh.b.b(((Number) w0Var.getValue()).intValue(), cVar2, ((Boolean) w0Var2.getValue()).booleanValue(), ((Boolean) w0Var3.getValue()).booleanValue(), oVar, ((i12 << 3) & 57344) | (i12 & 112));
            oVar.p(false);
            oVar.p(false);
            oVar.p(true);
            oVar.p(false);
            oVar.p(false);
        }
        return a0.f21526a;
    }
}
