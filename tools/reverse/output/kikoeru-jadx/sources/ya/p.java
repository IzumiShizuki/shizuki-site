package ya;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p extends y0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa.d f26033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f26034b;

    public p(xa.d dVar, y0 y0Var) {
        this.f26033a = dVar;
        this.f26034b = y0Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        xa.d dVar = this.f26033a;
        return this.f26034b.compare(dVar.apply(obj), dVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f26033a.equals(pVar.f26033a) && this.f26034b.equals(pVar.f26034b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f26033a, this.f26034b});
    }

    public final String toString() {
        return this.f26034b + ".onResultOf(" + this.f26033a + ")";
    }
}
