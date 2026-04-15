package sc;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f19804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19805b;

    public g2(ClassLoader classLoader) {
        this.f19804a = new WeakReference(classLoader);
        this.f19805b = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof g2) && this.f19804a.get() == ((g2) obj).f19804a.get();
    }

    public final int hashCode() {
        return this.f19805b;
    }

    public final String toString() {
        String string;
        ClassLoader classLoader = (ClassLoader) this.f19804a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
