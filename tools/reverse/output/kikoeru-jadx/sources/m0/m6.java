package m0;

import androidx.compose.foundation.gestures.DraggableElement;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m6 implements ic.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oc.a f13286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f13287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f13288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic.a f13289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w.k f13290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f13291f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v1 f13292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f13293h;

    public m6(oc.a aVar, float f10, List list, ic.a aVar2, w.k kVar, boolean z10, v1 v1Var, x0.w0 w0Var) {
        this.f13286a = aVar;
        this.f13287b = f10;
        this.f13288c = list;
        this.f13289d = aVar2;
        this.f13290e = kVar;
        this.f13291f = z10;
        this.f13292g = v1Var;
        this.f13293h = w0Var;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        x0.a1 a1Var;
        float f10;
        a6 a6Var;
        y.t tVar = (y.t) obj;
        x0.o oVar = (x0.o) obj2;
        int iIntValue = ((Number) obj3).intValue();
        oc.a aVar = this.f13286a;
        float f11 = aVar.f16306b;
        float f12 = aVar.f16305a;
        if ((iIntValue & 6) == 0) {
            iIntValue |= oVar.f(tVar) ? 4 : 2;
        }
        if (oVar.N(iIntValue & 1, (iIntValue & 19) != 18)) {
            boolean z10 = oVar.j(j2.l1.f9872n) == f3.m.f6668b;
            float fH = f3.a.h(tVar.f25258b);
            jc.v vVar = new jc.v();
            jc.v vVar2 = new jc.v();
            f3.c cVar = (f3.c) oVar.j(j2.l1.f9866h);
            float f13 = t6.f13667a;
            vVar.f10835a = Math.max(fH - cVar.Q(f13), 0.0f);
            vVar2.f10835a = Math.min(cVar.Q(f13), vVar.f10835a);
            Object objK = oVar.K();
            x0.r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = x0.v.m(oVar);
                oVar.h0(objK);
            }
            hf.y yVar = (hf.y) objK;
            Object objK2 = oVar.K();
            float f14 = this.f13287b;
            if (objK2 == r0Var) {
                float f15 = vVar2.f10835a;
                float f16 = vVar.f10835a;
                float f17 = f11 - f12;
                float f18 = f17 == 0.0f ? 0.0f : (f14 - f12) / f17;
                if (f18 < 0.0f) {
                    f18 = 0.0f;
                }
                if (f18 > 1.0f) {
                    f18 = 1.0f;
                }
                x0.a1 a1Var2 = new x0.a1(android.support.v4.media.session.b.L(f15, f16, f18));
                oVar.h0(a1Var2);
                objK2 = a1Var2;
            }
            x0.a1 a1Var3 = (x0.a1) objK2;
            Object objK3 = oVar.K();
            if (objK3 == r0Var) {
                objK3 = new x0.a1(0.0f);
                oVar.h0(objK3);
            }
            x0.a1 a1Var4 = (x0.a1) objK3;
            boolean zC = oVar.c(vVar2.f10835a) | oVar.c(vVar.f10835a) | oVar.f(aVar);
            Object objK4 = oVar.K();
            if (zC || objK4 == r0Var) {
                a1Var = a1Var4;
                f10 = 0.0f;
                a6 a6Var2 = new a6(new w0(a1Var3, a1Var, vVar2, vVar, this.f13293h, aVar, 1));
                oVar.h0(a6Var2);
                objK4 = a6Var2;
            } else {
                a1Var = a1Var4;
                f10 = 0.0f;
            }
            a6 a6Var3 = (a6) objK4;
            boolean zF = oVar.f(aVar) | oVar.c(vVar2.f10835a) | oVar.c(vVar.f10835a);
            Object objK5 = oVar.K();
            if (zF || objK5 == r0Var) {
                objK5 = new j6(aVar, vVar2, vVar);
                oVar.h0(objK5);
            }
            x0.a1 a1Var5 = a1Var;
            t6.a((ic.k) ((pc.f) objK5), aVar, new oc.a(vVar2.f10835a, vVar.f10835a), a1Var3, this.f13287b, oVar, 3072);
            boolean zH = oVar.h(this.f13288c) | oVar.c(vVar2.f10835a) | oVar.c(vVar.f10835a) | oVar.h(yVar) | oVar.h(a6Var3) | oVar.f(this.f13289d);
            Object objK6 = oVar.K();
            if (zH || objK6 == r0Var) {
                objK6 = new ba.a(a1Var3, this.f13288c, vVar2, vVar, yVar, a6Var3, this.f13289d);
                a6Var = a6Var3;
                oVar.h0(objK6);
            } else {
                a6Var = a6Var3;
            }
            x0.w0 w0VarY = x0.v.y((ic.k) objK6, oVar);
            a6 a6Var4 = a6Var;
            j1.k kVar = new j1.k(new s6(this.f13291f, a6Var4, this.f13290e, fH, z10, a1Var5, a1Var3, w0VarY));
            boolean zBooleanValue = ((Boolean) a6Var4.f12656b.getValue()).booleanValue();
            boolean zF2 = oVar.f(w0VarY);
            Object objK7 = oVar.K();
            if (zF2 || objK7 == r0Var) {
                objK7 = new k6(w0VarY, null);
                oVar.h0(objK7);
            }
            DraggableElement draggableElement = new DraggableElement(a6Var4, u.e1.f20883b, this.f13291f, this.f13290e, zBooleanValue, u.l0.f20995a, (ic.o) objK7, z10);
            float f19 = f11 - f12;
            float fJ = f19 == f10 ? 0.0f : (nh.b.j(f14, f12, f11) - f12) / f19;
            if (fJ < f10) {
                fJ = 0.0f;
            }
            t6.c(this.f13291f, fJ <= 1.0f ? fJ : 1.0f, this.f13288c, this.f13292g, vVar.f10835a - vVar2.f10835a, this.f13290e, kVar.e(draggableElement), oVar, 0);
        } else {
            oVar.Q();
        }
        return ub.a0.f21526a;
    }
}
