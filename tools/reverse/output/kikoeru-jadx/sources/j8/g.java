package j8;

import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitmapDrawable f10618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10619b;

    public g(BitmapDrawable bitmapDrawable, boolean z10) {
        this.f10618a = bitmapDrawable;
        this.f10619b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f10618a.equals(gVar.f10618a) && this.f10619b == gVar.f10619b;
    }

    public final int hashCode() {
        return (this.f10618a.hashCode() * 31) + (this.f10619b ? 1231 : 1237);
    }
}
