package mc;

import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends d {
    @Override // mc.d
    public final int a(int i10) {
        return ((-i10) >> 31) & (d().nextInt() >>> (32 - i10));
    }

    @Override // mc.d
    public final int b() {
        return d().nextInt();
    }

    public abstract Random d();
}
