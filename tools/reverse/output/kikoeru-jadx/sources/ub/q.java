package ub;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f21553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f21554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f21555c;

    public q(Object obj, Object obj2, Object obj3) {
        this.f21553a = obj;
        this.f21554b = obj2;
        this.f21555c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return jc.l.a(this.f21553a, qVar.f21553a) && jc.l.a(this.f21554b, qVar.f21554b) && jc.l.a(this.f21555c, qVar.f21555c);
    }

    public final int hashCode() {
        Object obj = this.f21553a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f21554b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f21555c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f21553a + ", " + this.f21554b + ", " + this.f21555c + ')';
    }
}
