package p7;

import n7.z;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r f16900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z f16901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f f16902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f16903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r f16904h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16905i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r rVar, ac.c cVar) {
        super(cVar);
        this.f16904h = rVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f16903g = obj;
        this.f16905i |= Integer.MIN_VALUE;
        return this.f16904h.e(null, this);
    }
}
