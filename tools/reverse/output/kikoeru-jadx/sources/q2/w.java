package q2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.n f17700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17701c;

    public w(String str, ic.n nVar) {
        this.f17699a = str;
        this.f17700b = nVar;
    }

    public final void a(k kVar, Object obj) {
        kVar.l(this, obj);
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f17699a;
    }

    public /* synthetic */ w(String str) {
        this(str, s.f17667t);
    }

    public w(int i10, String str) {
        this(str);
        this.f17701c = true;
    }

    public w(ic.n nVar, String str, boolean z10) {
        this(str, nVar);
        this.f17701c = z10;
    }
}
