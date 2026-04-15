package c4;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3393a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f3394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v f3395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v f3396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3398f;

    public s(v vVar) {
        this.f3394b = vVar;
        this.f3395c = vVar;
    }

    public final void a() {
        this.f3393a = 1;
        this.f3395c = this.f3394b;
        this.f3398f = 0;
    }

    public final boolean b() {
        d4.a aVarB = this.f3395c.f3409b.b();
        int iA = aVarB.a(6);
        return !(iA == 0 || ((ByteBuffer) aVarB.f5473d).get(iA + aVarB.f5470a) == 0) || this.f3397e == 65039;
    }
}
