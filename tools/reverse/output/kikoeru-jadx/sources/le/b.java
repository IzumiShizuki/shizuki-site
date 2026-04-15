package le;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f12295a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f12296b;

    static {
        m mVar = f.f12300c;
        mVar.getClass();
        int i10 = f.f12308k;
        mVar.getClass();
        int i11 = f.f12306i;
        mVar.getClass();
        f12296b = (~(f.f12307j | i11)) & i10;
    }

    @Override // le.d
    public final int a() {
        return f12296b;
    }
}
