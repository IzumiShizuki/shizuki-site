package ce;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f3941b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f3942a;

    static {
        new i(0);
    }

    public i() {
        this.f3942a = new HashMap();
    }

    public final void a(o oVar) {
        this.f3942a.put(new h(oVar.f3961d.f3955a, oVar.f3958a), oVar);
    }

    public i(int i10) {
        this.f3942a = Collections.EMPTY_MAP;
    }
}
