package u0;

import j2.h0;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f21185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f21186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f21187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f21188d;

    public e(float f10, float f11, float f12, float f13) {
        this.f21185a = f10;
        this.f21186b = f11;
        this.f21187c = f12;
        this.f21188d = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f21185a == eVar.f21185a && this.f21186b == eVar.f21186b && this.f21187c == eVar.f21187c && this.f21188d == eVar.f21188d;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f21188d) + t0.x(this.f21187c, t0.x(this.f21186b, Float.floatToIntBits(this.f21185a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.f21185a);
        sb.append(", focusedAlpha=");
        sb.append(this.f21186b);
        sb.append(", hoveredAlpha=");
        sb.append(this.f21187c);
        sb.append(", pressedAlpha=");
        return h0.l(sb, this.f21188d, ')');
    }
}
