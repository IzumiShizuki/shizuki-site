package g6;

import m4.k0;
import m4.m0;
import m4.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7441b;

    public d(float f10, int i10) {
        this.f7440a = f10;
        this.f7441b = i10;
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
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f7440a == dVar.f7440a && this.f7441b == dVar.f7441b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f7440a).hashCode() + 527) * 31) + this.f7441b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f7440a + ", svcTemporalLayerCount=" + this.f7441b;
    }

    @Override // m4.m0
    public final /* synthetic */ void b(k0 k0Var) {
    }
}
