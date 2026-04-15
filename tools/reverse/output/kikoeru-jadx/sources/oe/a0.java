package oe;

import u3.x0;
import wd.t0;
import yc.p0;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final id.h f16348b;

    public /* synthetic */ a0(int i10, id.h hVar) {
        this.f16347a = i10;
        this.f16348b = hVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f16347a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                k kVar = (k) this.f16348b.f9505b;
                yd.f fVar = kVar.f16391b;
                i iVar = kVar.f16390a;
                be.b bVarM = x0.m(fVar, iIntValue);
                return bVarM.f2742c ? iVar.b(bVarM) : yc.v.e(iVar.f16365b, bVarM);
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                k kVar2 = (k) this.f16348b.f9505b;
                be.b bVarM2 = x0.m(kVar2.f16391b, iIntValue2);
                if (!bVarM2.f2742c) {
                    yc.y yVar = kVar2.f16390a.f16365b;
                    jc.l.e(yVar, "<this>");
                    yc.h hVarE = yc.v.e(yVar, bVarM2);
                    if (hVarE instanceof p0) {
                        return (p0) hVarE;
                    }
                }
                return null;
            default:
                t0 t0Var = (t0) obj;
                jc.l.e(t0Var, "it");
                return ud.e.I(t0Var, ((k) this.f16348b.f9505b).f16393d);
        }
    }
}
