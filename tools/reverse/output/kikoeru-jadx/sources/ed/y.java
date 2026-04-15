package ed;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y extends s implements sd.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final be.c f6517a;

    public y(be.c cVar) {
        jc.l.e(cVar, "fqName");
        this.f6517a = cVar;
    }

    @Override // sd.b
    public final e a(be.c cVar) {
        jc.l.e(cVar, "fqName");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            return jc.l.a(this.f6517a, ((y) obj).f6517a);
        }
        return false;
    }

    @Override // sd.b
    public final /* bridge */ /* synthetic */ Collection getAnnotations() {
        return vb.r.f22819a;
    }

    public final int hashCode() {
        return this.f6517a.hashCode();
    }

    public final String toString() {
        return y.class.getName() + ": " + this.f6517a;
    }
}
