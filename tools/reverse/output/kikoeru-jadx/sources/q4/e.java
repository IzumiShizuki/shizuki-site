package q4;

import m4.k0;
import m4.m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f17714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f17715b;

    public e(float f10, float f11) {
        p4.c.b("Invalid latitude or longitude", f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f);
        this.f17714a = f10;
        this.f17715b = f11;
    }

    @Override // m4.m0
    public final /* synthetic */ m4.q a() {
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
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f17714a == eVar.f17714a && this.f17715b == eVar.f17715b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f17715b).hashCode() + ((Float.valueOf(this.f17714a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f17714a + ", longitude=" + this.f17715b;
    }

    @Override // m4.m0
    public final /* synthetic */ void b(k0 k0Var) {
    }
}
