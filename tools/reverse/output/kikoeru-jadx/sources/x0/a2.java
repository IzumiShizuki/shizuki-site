package x0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a2 implements Iterable, kc.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24237b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24240e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f24242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f24243h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public HashMap f24245j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public o.y f24246k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f24236a = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f24238c = new Object[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f24241f = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f24244i = new ArrayList();

    public final int a(a aVar) {
        if (this.f24242g) {
            p.c("Use active SlotWriter to determine anchor location instead");
        }
        if (!aVar.a()) {
            k1.a("Anchor refers to a group that was removed");
        }
        return aVar.f24233a;
    }

    public final void i() {
        this.f24245j = new HashMap();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new j0(this, 0, this.f24237b);
    }

    public final z1 j() {
        if (this.f24242g) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f24240e++;
        return new z1(this);
    }

    public final d2 k() {
        if (this.f24242g) {
            p.c("Cannot start a writer when another writer is pending");
        }
        if (this.f24240e > 0) {
            p.c("Cannot start a writer when a reader is pending");
        }
        this.f24242g = true;
        this.f24243h++;
        return new d2(this);
    }

    public final boolean l(a aVar) {
        int iE;
        return aVar.a() && (iE = c2.e(this.f24244i, aVar.f24233a, this.f24237b)) >= 0 && jc.l.a(this.f24244i.get(iE), aVar);
    }

    public final k0 m(int i10) {
        int i11;
        ArrayList arrayList;
        int iE;
        HashMap map = this.f24245j;
        if (map != null) {
            if (this.f24242g) {
                p.c("use active SlotWriter to crate an anchor for location instead");
            }
            a aVar = (i10 < 0 || i10 >= (i11 = this.f24237b) || (iE = c2.e((arrayList = this.f24244i), i10, i11)) < 0) ? null : (a) arrayList.get(iE);
            if (aVar != null) {
                return (k0) map.get(aVar);
            }
        }
        return null;
    }
}
