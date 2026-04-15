package xa;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j implements i, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient Object f24889a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f24890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile transient boolean f24891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Object f24892d;

    public j(i iVar) {
        this.f24890b = iVar;
    }

    @Override // xa.i
    public final Object get() {
        if (!this.f24891c) {
            synchronized (this.f24889a) {
                try {
                    if (!this.f24891c) {
                        Object obj = this.f24890b.get();
                        this.f24892d = obj;
                        this.f24891c = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f24892d;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.f24891c) {
            obj = "<supplier that returned " + this.f24892d + ">";
        } else {
            obj = this.f24890b;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
