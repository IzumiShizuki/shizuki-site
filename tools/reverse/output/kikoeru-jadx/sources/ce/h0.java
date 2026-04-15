package ce;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3937a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f3939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0 f3940d;

    public h0(c0 c0Var) {
        this.f3940d = c0Var;
    }

    public final Iterator a() {
        if (this.f3939c == null) {
            this.f3939c = this.f3940d.f3906c.entrySet().iterator();
        }
        return this.f3939c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3937a + 1 < this.f3940d.f3905b.size() || a().hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f3938b = true;
        int i10 = this.f3937a + 1;
        this.f3937a = i10;
        c0 c0Var = this.f3940d;
        return i10 < c0Var.f3905b.size() ? (Map.Entry) c0Var.f3905b.get(this.f3937a) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f3938b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f3938b = false;
        int i10 = c0.f3903f;
        c0 c0Var = this.f3940d;
        c0Var.b();
        if (this.f3937a >= c0Var.f3905b.size()) {
            a().remove();
            return;
        }
        int i11 = this.f3937a;
        this.f3937a = i11 - 1;
        c0Var.f(i11);
    }
}
