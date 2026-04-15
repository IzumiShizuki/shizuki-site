package b0;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n1 extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f1310b = new n1(2);

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        Map mapC = ((q1) obj2).c();
        if (mapC.isEmpty()) {
            return null;
        }
        return mapC;
    }
}
