package j2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f10012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f10013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10014f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, ac.c cVar) {
        super(cVar);
        this.f10013e = vVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f10012d = obj;
        this.f10014f |= Integer.MIN_VALUE;
        this.f10013e.O(null, this);
        return zb.a.f26667a;
    }
}
