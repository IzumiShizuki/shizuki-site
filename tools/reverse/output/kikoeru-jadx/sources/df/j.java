package df;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5993a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ub.e f5995c;

    public j(ic.a aVar, ic.k kVar) {
        this.f5994b = aVar;
        this.f5995c = kVar;
    }

    @Override // df.k
    public final Iterator iterator() {
        switch (this.f5993a) {
            case 0:
                return new d1.c(this);
            default:
                return new ef.b(this);
        }
    }

    public j(CharSequence charSequence, ic.n nVar) {
        jc.l.e(charSequence, "input");
        this.f5994b = charSequence;
        this.f5995c = nVar;
    }
}
