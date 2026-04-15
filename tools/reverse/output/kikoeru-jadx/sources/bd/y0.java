package bd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class y0 extends z0 implements yc.i0, yc.t0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2709f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f2710g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f2711h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f2712i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final se.w f2713j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y0 f2714k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(yc.b bVar, y0 y0Var, int i10, zc.h hVar, be.e eVar, se.w wVar, boolean z10, boolean z11, boolean z12, se.w wVar2, yc.m0 m0Var) {
        super(bVar, hVar, eVar, wVar, m0Var);
        jc.l.e(bVar, "containingDeclaration");
        jc.l.e(hVar, "annotations");
        jc.l.e(eVar, "name");
        jc.l.e(wVar, "outType");
        jc.l.e(m0Var, "source");
        this.f2709f = i10;
        this.f2710g = z10;
        this.f2711h = z11;
        this.f2712i = z12;
        this.f2713j = wVar2;
        this.f2714k = y0Var == null ? this : y0Var;
    }

    @Override // yc.b
    public final Collection A() {
        Collection collectionA = y().A();
        jc.l.d(collectionA, "getOverriddenDescriptors(...)");
        Collection collection = collectionA;
        ArrayList arrayList = new ArrayList(vb.n.K(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((y0) ((yc.b) it.next()).o0().get(this.f2709f));
        }
        return arrayList;
    }

    public y0 D1(wc.f fVar, be.e eVar, int i10) {
        zc.h annotations = getAnnotations();
        jc.l.d(annotations, "<get-annotations>(...)");
        se.w wVarB = b();
        jc.l.d(wVarB, "getType(...)");
        return new y0(fVar, null, i10, annotations, eVar, wVarB, E1(), this.f2711h, this.f2712i, this.f2713j, yc.m0.p0);
    }

    public final boolean E1() {
        return this.f2710g && ((yc.c) y()).j() != 2;
    }

    @Override // bd.q, yc.k
    /* JADX INFO: renamed from: F1, reason: merged with bridge method [inline-methods] */
    public final yc.b y() {
        yc.k kVarY = super.y();
        jc.l.c(kVarY, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (yc.b) kVarY;
    }

    @Override // bd.q, bd.p, yc.k, yc.b
    /* JADX INFO: renamed from: G1, reason: merged with bridge method [inline-methods] */
    public final y0 a() {
        y0 y0Var = this.f2714k;
        return y0Var == this ? this : y0Var.a();
    }

    @Override // yc.k
    public final Object a0(yc.m mVar, Object obj) {
        return mVar.y(this, obj);
    }

    @Override // yc.n
    public final ld.o f() {
        ld.o oVar = yc.o.f26130f;
        jc.l.d(oVar, "LOCAL");
        return oVar;
    }

    @Override // yc.o0
    public final yc.l h(se.r0 r0Var) {
        jc.l.e(r0Var, "substitutor");
        if (r0Var.f19981a.e()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // yc.t0
    public final /* bridge */ /* synthetic */ ge.g m0() {
        return null;
    }

    @Override // yc.t0
    public final boolean u0() {
        return false;
    }
}
