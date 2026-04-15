package nf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u implements yb.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadLocal f15858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f15859c;

    public u(Object obj, ThreadLocal threadLocal) {
        this.f15857a = obj;
        this.f15858b = threadLocal;
        this.f15859c = new v(threadLocal);
    }

    @Override // yb.h
    public final yb.h G(yb.h hVar) {
        return ud.b.C(this, hVar);
    }

    @Override // yb.h
    public final yb.h L(yb.g gVar) {
        return this.f15859c.equals(gVar) ? yb.i.f26088a : this;
    }

    @Override // yb.h
    public final yb.f R(yb.g gVar) {
        if (this.f15859c.equals(gVar)) {
            return this;
        }
        return null;
    }

    public final void a(Object obj) {
        this.f15858b.set(obj);
    }

    public final Object c(yb.h hVar) {
        ThreadLocal threadLocal = this.f15858b;
        Object obj = threadLocal.get();
        threadLocal.set(this.f15857a);
        return obj;
    }

    @Override // yb.f
    public final yb.g getKey() {
        return this.f15859c;
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f15857a + ", threadLocal = " + this.f15858b + ')';
    }

    @Override // yb.h
    public final Object y(ic.n nVar, Object obj) {
        return nVar.q(obj, this);
    }
}
