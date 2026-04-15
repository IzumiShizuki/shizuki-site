package qe;

import java.util.Iterator;
import java.util.List;
import jc.z;
import n7.b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class a implements zc.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ pc.u[] f18158b = {z.f10839a.g(new jc.s(a.class, "annotations", "getAnnotations()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final re.i f18159a;

    public a(re.o oVar, ic.a aVar) {
        jc.l.e(oVar, "storageManager");
        this.f18159a = new re.i((re.l) oVar, aVar);
    }

    @Override // zc.h
    public final /* bridge */ zc.b e(be.c cVar) {
        return ua.j.k(this, cVar);
    }

    @Override // zc.h
    public final /* bridge */ boolean f(be.c cVar) {
        return ua.j.m(this, cVar);
    }

    @Override // zc.h
    public boolean isEmpty() {
        return ((List) b0.r(this.f18159a, f18158b[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return ((List) b0.r(this.f18159a, f18158b[0])).iterator();
    }
}
