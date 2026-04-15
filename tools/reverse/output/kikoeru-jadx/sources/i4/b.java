package i4;

import java.util.LinkedHashMap;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f9002a = new LinkedHashMap();

    public abstract Object a(pe.d dVar);

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return l.a(this.f9002a, ((b) obj).f9002a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9002a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f9002a + ')';
    }
}
