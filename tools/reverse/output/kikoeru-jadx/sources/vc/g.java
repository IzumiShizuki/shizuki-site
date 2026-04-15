package vc;

import bd.c0;
import bd.h0;
import yc.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f22836b;

    public /* synthetic */ g(i iVar, int i10) {
        this.f22835a = i10;
        this.f22836b = iVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f22835a) {
            case 0:
                be.e eVar = (be.e) obj;
                h0 h0VarL = this.f22836b.l();
                be.c cVar = o.f22908k;
                le.k kVar = ((c0) h0VarL.K0(cVar)).f2558g;
                if (kVar == null) {
                    i.a(11);
                    throw null;
                }
                yc.h hVarA = kVar.a(eVar, gd.b.f7514a);
                if (hVarA == null) {
                    throw new AssertionError("Built-in class " + cVar.a(eVar) + " is not found");
                }
                if (hVarA instanceof yc.e) {
                    return (yc.e) hVarA;
                }
                throw new AssertionError("Must be a class descriptor " + eVar + ", but was " + hVarA);
            default:
                y yVar = (y) obj;
                jc.l.e(yVar, "module");
                return yVar.g().h(this.f22836b.u());
        }
    }
}
