package nc;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends mc.a {
    @Override // mc.d
    public final int c(int i10, int i11) {
        return ThreadLocalRandom.current().nextInt(i10, i11);
    }

    @Override // mc.a
    public final Random d() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        l.d(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
