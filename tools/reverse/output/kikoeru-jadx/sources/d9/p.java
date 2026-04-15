package d9;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f5588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f5590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s f5591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5592h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, ac.c cVar) {
        super(cVar);
        this.f5591g = sVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f5590f = obj;
        this.f5592h |= Integer.MIN_VALUE;
        return a0.c.z(this.f5591g, 0L, this);
    }
}
