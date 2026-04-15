package xa;

import p5.m;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k implements i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f24893d = new m(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24894a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile i f24895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f24896c;

    public k(i iVar) {
        this.f24895b = iVar;
    }

    @Override // xa.i
    public final Object get() {
        i iVar = this.f24895b;
        m mVar = f24893d;
        if (iVar != mVar) {
            synchronized (this.f24894a) {
                try {
                    if (this.f24895b != mVar) {
                        Object obj = this.f24895b.get();
                        this.f24896c = obj;
                        this.f24895b = mVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f24896c;
    }

    public final String toString() {
        Object obj = this.f24895b;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == f24893d) {
            obj = "<supplier that returned " + this.f24896c + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
