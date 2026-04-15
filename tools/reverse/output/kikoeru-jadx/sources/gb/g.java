package gb;

import eb.a0;
import eb.z;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import pc.f0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g implements a0, Cloneable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f7476c = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f7478b;

    public g() {
        List list = Collections.EMPTY_LIST;
        this.f7477a = list;
        this.f7478b = list;
    }

    @Override // eb.a0
    public final z a(eb.m mVar, lb.a aVar) {
        Class cls = aVar.f12165a;
        boolean zB = b(cls, true);
        boolean zB2 = b(cls, false);
        if (zB || zB2) {
            return new f(this, zB2, zB, mVar, aVar);
        }
        return null;
    }

    public final boolean b(Class cls, boolean z10) {
        if (!z10 && !Enum.class.isAssignableFrom(cls)) {
            f0 f0Var = jb.c.f10806a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z10 ? this.f7477a : this.f7478b).iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    public final Object clone() {
        try {
            return (g) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }
}
