package oe;

import java.util.List;
import wd.j0;

/* JADX INFO: loaded from: classes.dex */
public final class r implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f16413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f16415c;

    public r(t tVar, boolean z10, j0 j0Var) {
        this.f16413a = tVar;
        this.f16414b = z10;
        this.f16415c = j0Var;
    }

    @Override // ic.a
    public final Object b() {
        List listG0;
        t tVar = this.f16413a;
        k kVar = tVar.f16423a;
        yc.k kVar2 = kVar.f16392c;
        i iVar = kVar.f16390a;
        w wVarA = tVar.a(kVar2);
        if (wVarA != null) {
            boolean z10 = this.f16414b;
            j0 j0Var = this.f16415c;
            listG0 = z10 ? vb.m.G0(iVar.f16368e.j(wVarA, j0Var)) : vb.m.G0(iVar.f16368e.m(wVarA, j0Var));
        } else {
            listG0 = null;
        }
        return listG0 == null ? vb.r.f22819a : listG0;
    }
}
