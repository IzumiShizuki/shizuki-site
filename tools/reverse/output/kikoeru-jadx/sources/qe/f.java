package qe;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class f implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f18165b;

    public /* synthetic */ f(g gVar, int i10) {
        this.f18164a = i10;
        this.f18165b = gVar;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f18164a) {
            case 0:
                le.f fVar = le.f.f12310m;
                le.o.f12336a.getClass();
                return this.f18165b.i(fVar, le.l.f12329b);
            default:
                g gVar = this.f18165b;
                te.f fVar2 = gVar.f18166g;
                h hVar = gVar.f18169j;
                fVar2.getClass();
                jc.l.e(hVar, "classDescriptor");
                Collection collectionI = ((se.f) hVar.Q()).i();
                jc.l.d(collectionI, "getSupertypes(...)");
                return collectionI;
        }
    }
}
