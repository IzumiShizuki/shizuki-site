package yc;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final be.c f26106b;

    public /* synthetic */ e0(be.c cVar, int i10) {
        this.f26105a = i10;
        this.f26106b = cVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f26105a) {
            case 0:
                be.c cVar = (be.c) obj;
                jc.l.e(cVar, "it");
                return Boolean.valueOf(!cVar.f2744a.c() && cVar.b().equals(this.f26106b));
            default:
                zc.h hVar = (zc.h) obj;
                jc.l.e(hVar, "it");
                return hVar.e(this.f26106b);
        }
    }
}
