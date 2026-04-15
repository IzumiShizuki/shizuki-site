package ed;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h extends f implements sd.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f6499b;

    public h(be.e eVar, Object[] objArr) {
        super(eVar);
        this.f6499b = objArr;
    }

    public final ArrayList a() {
        Object[] objArr = this.f6499b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            jc.l.b(obj);
            Class<?> cls = obj.getClass();
            List list = d.f6487a;
            arrayList.add(Enum.class.isAssignableFrom(cls) ? new t(null, (Enum) obj) : obj instanceof Annotation ? new g(null, (Annotation) obj) : obj instanceof Object[] ? new h(null, (Object[]) obj) : obj instanceof Class ? new p(null, (Class) obj) : new v(null, obj));
        }
        return arrayList;
    }
}
