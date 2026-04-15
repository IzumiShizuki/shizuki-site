package k4;

import androidx.lifecycle.s0;
import androidx.lifecycle.u0;
import i4.e;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f11024a = new b();

    @Override // androidx.lifecycle.u0
    public final s0 a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    @Override // androidx.lifecycle.u0
    public final s0 b(pc.c cVar, e eVar) {
        l.e(cVar, "modelClass");
        return android.support.v4.media.session.b.C(g8.a.D(cVar));
    }

    @Override // androidx.lifecycle.u0
    public final s0 c(Class cls, e eVar) {
        a(cls);
        throw null;
    }
}
