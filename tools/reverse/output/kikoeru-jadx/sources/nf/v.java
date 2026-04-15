package nf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v implements yb.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal f15860a;

    public v(ThreadLocal threadLocal) {
        this.f15860a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && jc.l.a(this.f15860a, ((v) obj).f15860a);
    }

    public final int hashCode() {
        return this.f15860a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f15860a + ')';
    }
}
