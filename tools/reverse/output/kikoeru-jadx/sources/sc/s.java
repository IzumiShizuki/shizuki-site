package sc;

/* JADX INFO: loaded from: classes.dex */
public final class s implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f19870c;

    public /* synthetic */ s(int i10, int i11, Object obj) {
        this.f19868a = i11;
        this.f19870c = obj;
        this.f19869b = i10;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    @Override // ic.a
    public final Object b() {
        switch (this.f19868a) {
            case 0:
                yc.c cVar = (yc.c) this.f19870c;
                Object obj = cVar.o0().get(this.f19869b);
                jc.l.d(obj, "get(...)");
                return (yc.i0) obj;
            default:
                return (yc.i0) this.f19870c.get(this.f19869b);
        }
    }
}
