package ya;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends o implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Map f26067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient int f26068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient u0 f26069f;

    public v0(Map map) {
        if (!map.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.f26067d = map;
    }

    @Override // ya.o
    public final Map a() {
        Map map = this.f26030c;
        if (map != null) {
            return map;
        }
        Map map2 = this.f26067d;
        Map fVar = map2 instanceof NavigableMap ? new f(this, (NavigableMap) map2) : map2 instanceof SortedMap ? new i(this, (SortedMap) map2) : new d(this, map2);
        this.f26030c = fVar;
        return fVar;
    }

    public final void b() {
        Map map = this.f26067d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f26068e = 0;
    }

    public final Collection c() {
        return (List) this.f26069f.get();
    }
}
