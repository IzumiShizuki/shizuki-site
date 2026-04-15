package ya;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends y0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f25995a;

    public h1(y0 y0Var) {
        this.f25995a = y0Var;
    }

    @Override // ya.y0
    public final y0 a() {
        return this.f25995a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f25995a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            return this.f25995a.equals(((h1) obj).f25995a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f25995a.hashCode();
    }

    public final String toString() {
        return this.f25995a + ".reverse()";
    }
}
