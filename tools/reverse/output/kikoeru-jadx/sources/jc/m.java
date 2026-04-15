package jc;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class m implements i, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10831a;

    public m(int i10) {
        this.f10831a = i10;
    }

    @Override // jc.i
    public final int c() {
        return this.f10831a;
    }

    public final String toString() {
        String strI = z.f10839a.i(this);
        l.d(strI, "renderLambdaToString(...)");
        return strI;
    }
}
