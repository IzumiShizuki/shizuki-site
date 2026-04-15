package uh;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h extends jc.m implements ic.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f22003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f22004d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22005b;

    static {
        int i10 = 1;
        f22003c = new h(i10, 0);
        f22004d = new h(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10, int i11) {
        super(i10);
        this.f22005b = i11;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f22005b) {
            case 0:
                long j10 = ((p1.b) obj).f16481a;
                return ub.a0.f21526a;
            default:
                jc.l.e((x) obj, "it");
                return Boolean.TRUE;
        }
    }
}
