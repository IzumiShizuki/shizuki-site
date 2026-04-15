package le;

import bd.s0;
import java.util.Collection;
import java.util.List;
import jc.z;
import n7.b0;
import pc.u;
import yc.k0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ u[] f12321d = {z.f10839a.g(new jc.s(h.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bd.c f12322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final re.i f12323c;

    public h(re.l lVar, bd.c cVar) {
        jc.l.e(lVar, "storageManager");
        this.f12322b = cVar;
        this.f12323c = new re.i(lVar, new bd.e(7, this));
    }

    @Override // le.p, le.o
    public final Collection b(be.e eVar, gd.b bVar) {
        Collection collection;
        jc.l.e(eVar, "name");
        List list = (List) b0.r(this.f12323c, f12321d[0]);
        if (list.isEmpty()) {
            collection = vb.r.f22819a;
        } else {
            bf.g gVar = new bf.g();
            for (Object obj : list) {
                if ((obj instanceof k0) && jc.l.a(((k0) obj).getName(), eVar)) {
                    gVar.add(obj);
                }
            }
            collection = gVar;
        }
        return collection;
    }

    @Override // le.p, le.q
    public final Collection e(f fVar, ic.k kVar) {
        jc.l.e(fVar, "kindFilter");
        if (!fVar.a(f.f12311n.f12318b)) {
            return vb.r.f22819a;
        }
        return (List) b0.r(this.f12323c, f12321d[0]);
    }

    @Override // le.p, le.o
    public final Collection f(be.e eVar, gd.b bVar) {
        Collection collection;
        jc.l.e(eVar, "name");
        List list = (List) b0.r(this.f12323c, f12321d[0]);
        if (list.isEmpty()) {
            collection = vb.r.f22819a;
        } else {
            bf.g gVar = new bf.g();
            for (Object obj : list) {
                if ((obj instanceof s0) && jc.l.a(((s0) obj).getName(), eVar)) {
                    gVar.add(obj);
                }
            }
            collection = gVar;
        }
        return collection;
    }

    public abstract List h();
}
