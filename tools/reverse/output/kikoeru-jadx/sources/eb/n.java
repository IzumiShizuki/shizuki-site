package eb;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n extends o implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f6468a = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof n) && ((n) obj).f6468a.equals(this.f6468a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f6468a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f6468a.iterator();
    }
}
