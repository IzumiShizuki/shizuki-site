package m5;

import m4.j1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f14753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f14754b;

    public q(int i10, j1 j1Var, int[] iArr) {
        if (iArr.length == 0) {
            p4.c.o("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f14753a = j1Var;
        this.f14754b = iArr;
    }
}
