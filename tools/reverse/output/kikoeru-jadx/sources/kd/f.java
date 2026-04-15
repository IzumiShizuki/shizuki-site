package kd;

import java.util.ArrayList;
import jc.l;
import jc.z;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements jd.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final jd.d f11331c = new jd.d(z.f10839a.b(f.class));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f11333b = new ArrayList();

    @Override // jd.c
    public final jd.d b() {
        return f11331c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!f.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        l.c(obj, "null cannot be cast to non-null type kotlin.metadata.jvm.internal.JvmTypeExtension");
        f fVar = (f) obj;
        return this.f11332a == fVar.f11332a && l.a(this.f11333b, fVar.f11333b);
    }

    public final int hashCode() {
        return this.f11333b.hashCode() + ((this.f11332a ? 1231 : 1237) * 31);
    }
}
