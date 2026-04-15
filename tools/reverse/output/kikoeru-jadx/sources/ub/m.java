package ub;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f21545a;

    public m(Throwable th2) {
        jc.l.e(th2, "exception");
        this.f21545a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return jc.l.a(this.f21545a, ((m) obj).f21545a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21545a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f21545a + ')';
    }
}
