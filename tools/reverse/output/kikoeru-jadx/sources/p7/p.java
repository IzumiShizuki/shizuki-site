package p7;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f16912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Serializable f16913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f16915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r f16916h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16917i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, ac.c cVar) {
        super(cVar);
        this.f16916h = rVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f16915g = obj;
        this.f16917i |= Integer.MIN_VALUE;
        return this.f16916h.g(null, null, this);
    }
}
