package c5;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends k5.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f3437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f3438e;

    public f(long j10, List list) {
        super(0L, list.size() - 1);
        this.f3438e = j10;
        this.f3437d = list;
    }

    @Override // k5.m
    public final long b() {
        a();
        return this.f3438e + ((e5.i) this.f3437d.get((int) this.f11035c)).f6199e;
    }

    @Override // k5.m
    public final long c() {
        a();
        e5.i iVar = (e5.i) this.f3437d.get((int) this.f11035c);
        return this.f3438e + iVar.f6199e + iVar.f6197c;
    }
}
