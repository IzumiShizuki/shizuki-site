package m5;

import m4.j1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f14724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m4.q f14726d;

    public n(int i10, j1 j1Var, int i11) {
        this.f14723a = i10;
        this.f14724b = j1Var;
        this.f14725c = i11;
        this.f14726d = j1Var.f14307d[i11];
    }

    public abstract int a();

    public abstract boolean b(n nVar);
}
