package s8;

import java.util.Map;
import vb.s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f19665b = new p(s.f22820a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f19666a;

    public p(Map map) {
        this.f19666a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return jc.l.a(this.f19666a, ((p) obj).f19666a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19666a.hashCode();
    }

    public final String toString() {
        return "Tags(tags=" + this.f19666a + ')';
    }
}
