package ta;

import ic.k;
import java.util.List;
import jc.l;
import jc.m;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends m implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f20595b = new b(1);

    @Override // ic.k
    public final Object a(Object obj) {
        List list = (List) obj;
        l.e(list, "it");
        return new c(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue(), ((Number) list.get(3)).floatValue());
    }
}
