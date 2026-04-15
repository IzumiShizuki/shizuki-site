package ce;

import java.io.Serializable;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class p extends b implements Serializable {
    public static o g(b bVar, b bVar2, int i10, r0 r0Var, Class cls) {
        return new o(bVar, Collections.EMPTY_LIST, bVar2, new n(i10, r0Var, true), cls);
    }

    public static o h(b bVar, Object obj, b bVar2, int i10, r0 r0Var, Class cls) {
        return new o(bVar, obj, bVar2, new n(i10, r0Var, false), cls);
    }
}
