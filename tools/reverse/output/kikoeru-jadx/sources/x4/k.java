package x4;

import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m4.q f24621c;

    public k(int i10, m4.q qVar, boolean z10) {
        super(t0.B(i10, "AudioTrack write failed: "));
        this.f24620b = z10;
        this.f24619a = i10;
        this.f24621c = qVar;
    }
}
