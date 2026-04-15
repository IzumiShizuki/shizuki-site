package l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f11630b = new t(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f11631c = new t(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f11632d = new s(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s f11633e = new s(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s f11634f = new s(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final s f11635g = new s(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11636a;

    public /* synthetic */ t(int i10) {
        this.f11636a = i10;
    }

    @Override // l0.h
    public long a(p pVar, int i10) {
        switch (this.f11636a) {
            case 0:
                String str = pVar.f11590f.f20344a.f20326a.f20320b;
                return t2.c0.b(h0.q0.q(str, i10), h0.q0.p(str, i10));
            default:
                return pVar.f11590f.j(i10);
        }
    }
}
