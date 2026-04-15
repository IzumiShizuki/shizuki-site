package ed;

import java.lang.reflect.Type;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z extends b0 implements sd.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f6518a;

    public z(Class cls) {
        this.f6518a = cls;
    }

    @Override // ed.b0
    public final Type b() {
        return this.f6518a;
    }

    @Override // sd.b
    public final Collection getAnnotations() {
        return vb.r.f22819a;
    }
}
