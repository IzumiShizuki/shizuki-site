package df;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f5987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.k f5989c;

    public h(k kVar, boolean z10, ic.k kVar2) {
        this.f5987a = kVar;
        this.f5988b = z10;
        this.f5989c = kVar2;
    }

    @Override // df.k
    public final Iterator iterator() {
        return new e(this);
    }
}
