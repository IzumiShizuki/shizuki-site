package m0;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o7 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f13403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f13404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f13405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c2 f13406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13407h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(c2 c2Var, ac.c cVar) {
        super(cVar);
        this.f13406g = c2Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f13405f = obj;
        this.f13407h |= Integer.MIN_VALUE;
        return this.f13406g.b(null, null, this);
    }
}
