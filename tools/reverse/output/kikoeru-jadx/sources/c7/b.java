package c7;

import android.media.AudioAttributes;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends b0.c1 {
    @Override // b0.c1
    public final b0.c1 F(int i10) {
        ((AudioAttributes.Builder) this.f1208b).setUsage(i10);
        return this;
    }

    @Override // b0.c1
    public final b0.c1 G(int i10) {
        ((AudioAttributes.Builder) this.f1208b).setUsage(i10);
        return this;
    }

    @Override // b0.c1
    public final a f() {
        return new c(((AudioAttributes.Builder) this.f1208b).build(), 0);
    }
}
