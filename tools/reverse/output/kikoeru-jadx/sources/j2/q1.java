package j2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q1 extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f9967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v2.e f9968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f9969d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(boolean z10, v2.e eVar, String str) {
        super(0);
        this.f9967b = z10;
        this.f9968c = eVar;
        this.f9969d = str;
    }

    @Override // ic.a
    public final Object b() {
        if (this.f9967b) {
            v2.e eVar = this.f9968c;
            String str = this.f9969d;
            m4.z zVar = (m4.z) eVar.f22364b;
            synchronized (((r5.p) zVar.f14646f)) {
            }
        }
        return ub.a0.f21526a;
    }
}
