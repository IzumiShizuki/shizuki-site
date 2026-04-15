package b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public hf.k f1209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f1211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1212g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ac.c cVar) {
        super(cVar);
        this.f1211f = eVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f1210e = obj;
        this.f1212g |= Integer.MIN_VALUE;
        return this.f1211f.h(this);
    }
}
