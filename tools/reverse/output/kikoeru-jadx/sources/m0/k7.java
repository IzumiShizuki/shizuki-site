package m0;

import androidx.compose.foundation.gestures.DraggableElement;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k7 implements ic.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f13196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c2 f13197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j5 f13198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic.n f13199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f13200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f13201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f13202g;

    public k7(LinkedHashMap linkedHashMap, c2 c2Var, j5 j5Var, ic.n nVar, float f10, boolean z10, boolean z11) {
        this.f13196a = linkedHashMap;
        this.f13197b = c2Var;
        this.f13198c = j5Var;
        this.f13199d = nVar;
        this.f13200e = f10;
        this.f13201f = z10;
        this.f13202g = z11;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        x0.o oVar = (x0.o) obj2;
        ((Number) obj3).intValue();
        oVar.W(43594985);
        LinkedHashMap linkedHashMap = this.f13196a;
        if (linkedHashMap.isEmpty()) {
            throw new IllegalArgumentException("You must have at least one anchor.");
        }
        if (vb.m.U(linkedHashMap.values()).size() != linkedHashMap.size()) {
            throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.");
        }
        f3.c cVar = (f3.c) oVar.j(j2.l1.f9866h);
        c2 c2Var = this.f13197b;
        if (((Map) c2Var.f12782i.getValue()).isEmpty()) {
            Float fH = g8.a.h(c2Var.f12776c.getValue(), linkedHashMap);
            if (fH == null) {
                throw new IllegalArgumentException("The initial value must have an associated anchor.");
            }
            c2Var.f12778e.f(fH.floatValue());
            c2Var.f12780g.f(fH.floatValue());
        }
        boolean zF = oVar.f(c2Var) | oVar.h(linkedHashMap);
        j5 j5Var = this.f13198c;
        boolean zF2 = zF | oVar.f(j5Var) | oVar.f(this.f13199d) | oVar.f(cVar) | oVar.c(this.f13200e);
        Object objK = oVar.K();
        x0.r0 r0Var = x0.k.f24334a;
        if (zF2 || objK == r0Var) {
            j7 j7Var = new j7(this.f13197b, linkedHashMap, j5Var, cVar, this.f13199d, this.f13200e, null);
            oVar.h0(j7Var);
            objK = j7Var;
        }
        x0.v.f(linkedHashMap, c2Var, (ic.n) objK, oVar);
        boolean zBooleanValue = ((Boolean) c2Var.f12777d.getValue()).booleanValue();
        tc.b0 b0Var = c2Var.f12789p;
        boolean zF3 = oVar.f(c2Var);
        Object objK2 = oVar.K();
        if (zF3 || objK2 == r0Var) {
            objK2 = new n(1, c2Var, null);
            oVar.h0(objK2);
        }
        i7.k kVar = u.l0.f20995a;
        DraggableElement draggableElement = new DraggableElement(b0Var, u.e1.f20883b, this.f13201f, null, zBooleanValue, kVar, (ic.o) objK2, this.f13202g);
        oVar.p(false);
        return draggableElement;
    }
}
