package m8;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f14949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j8.f f14951c;

    public d(Drawable drawable, boolean z10, j8.f fVar) {
        this.f14949a = drawable;
        this.f14950b = z10;
        this.f14951c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return jc.l.a(this.f14949a, dVar.f14949a) && this.f14950b == dVar.f14950b && this.f14951c == dVar.f14951c;
    }

    public final int hashCode() {
        return this.f14951c.hashCode() + (((this.f14949a.hashCode() * 31) + (this.f14950b ? 1231 : 1237)) * 31);
    }
}
