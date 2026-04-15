package t;

import x0.e1;
import x0.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1 f20087a = v.v(i.f20085a);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            return jc.l.a((k) ((l) obj).f20087a.getValue(), (k) this.f20087a.getValue());
        }
        return false;
    }

    public final int hashCode() {
        return ((k) this.f20087a.getValue()).hashCode();
    }

    public final String toString() {
        return "ContextMenuState(status=" + ((k) this.f20087a.getValue()) + ')';
    }
}
