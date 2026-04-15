package td;

import java.util.Map;
import se.w;
import yc.m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements zc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f20670a = new b();

    @Override // zc.b
    public final be.c a() {
        yc.e eVarD = ie.d.d(this);
        if (eVarD != null) {
            if (ue.l.f(eVarD)) {
                eVarD = null;
            }
            if (eVarD != null) {
                return ie.d.c(eVarD);
            }
        }
        return null;
    }

    @Override // zc.b
    public final w b() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // zc.b
    public final Map c() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // zc.b
    public final m0 m() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    public final String toString() {
        return "[EnhancedType]";
    }
}
