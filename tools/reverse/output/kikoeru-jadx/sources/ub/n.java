package ub;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f21546a;

    public /* synthetic */ n(Object obj) {
        this.f21546a = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof m) {
            return ((m) obj).f21545a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return jc.l.a(this.f21546a, ((n) obj).f21546a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f21546a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f21546a;
        if (obj instanceof m) {
            return ((m) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
