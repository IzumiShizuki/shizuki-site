package mc;

import java.util.Random;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ah.c f15095b = new ah.c(3);

    @Override // mc.a
    public final Random d() {
        Object obj = this.f15095b.get();
        l.d(obj, "get(...)");
        return (Random) obj;
    }
}
