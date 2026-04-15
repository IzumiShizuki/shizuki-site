package d1;

import a1.e;
import java.util.Iterator;
import vb.h;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends h implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f5438d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1.c f5441c;

    static {
        e1.b bVar = e1.b.f6061a;
        f5438d = new b(bVar, bVar, c1.c.f3208c);
    }

    public b(Object obj, Object obj2, c1.c cVar) {
        this.f5439a = obj;
        this.f5440b = obj2;
        this.f5441c = cVar;
    }

    @Override // vb.a
    public final int a() {
        c1.c cVar = this.f5441c;
        cVar.getClass();
        return cVar.f3210b;
    }

    @Override // vb.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f5441c.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new c(this.f5439a, this.f5441c);
    }
}
