package ya;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements xa.i, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26065a;

    public u0() {
        q.d(2, "expectedValuesPerKey");
        this.f26065a = 2;
    }

    @Override // xa.i
    public final Object get() {
        return new ArrayList(this.f26065a);
    }
}
