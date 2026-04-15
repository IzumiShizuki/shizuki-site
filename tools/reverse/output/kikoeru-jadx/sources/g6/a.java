package g6;

import gh.g;
import m4.k0;
import m4.m0;
import m4.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f7434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f7435e;

    public a(long j10, long j11, long j12, long j13, long j14) {
        this.f7431a = j10;
        this.f7432b = j11;
        this.f7433c = j12;
        this.f7434d = j13;
        this.f7435e = j14;
    }

    @Override // m4.m0
    public final /* synthetic */ q a() {
        return null;
    }

    @Override // m4.m0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f7431a == aVar.f7431a && this.f7432b == aVar.f7432b && this.f7433c == aVar.f7433c && this.f7434d == aVar.f7434d && this.f7435e == aVar.f7435e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return g.y(this.f7435e) + ((g.y(this.f7434d) + ((g.y(this.f7433c) + ((g.y(this.f7432b) + ((g.y(this.f7431a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f7431a + ", photoSize=" + this.f7432b + ", photoPresentationTimestampUs=" + this.f7433c + ", videoStartPosition=" + this.f7434d + ", videoSize=" + this.f7435e;
    }

    @Override // m4.m0
    public final /* synthetic */ void b(k0 k0Var) {
    }
}
