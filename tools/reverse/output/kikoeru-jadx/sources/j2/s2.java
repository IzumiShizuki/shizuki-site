package j2;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s2 implements i2.q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f9985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Float f9986c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Float f9987d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q2.i f9988e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q2.i f9989f = null;

    public s2(int i10, ArrayList arrayList) {
        this.f9984a = i10;
        this.f9985b = arrayList;
    }

    @Override // i2.q1
    public final boolean q() {
        return this.f9985b.contains(this);
    }
}
