package q1;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorFilter f17541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17543c;

    public k(long j10, int i10) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            a.f();
            porterDuffColorFilter = a.c(h0.B(j10), h0.x(i10));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(h0.B(j10), h0.F(i10));
        }
        this.f17541a = porterDuffColorFilter;
        this.f17542b = j10;
        this.f17543c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return q.c(this.f17542b, kVar.f17542b) && this.f17543c == kVar.f17543c;
    }

    public final int hashCode() {
        int i10 = q.f17576i;
        return (ub.v.a(this.f17542b) * 31) + this.f17543c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        t0.K(this.f17542b, ", blendMode=", sb);
        sb.append((Object) h0.G(this.f17543c));
        sb.append(')');
        return sb.toString();
    }
}
