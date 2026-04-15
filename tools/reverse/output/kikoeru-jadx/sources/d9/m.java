package d9;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n7.v f5579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f5580b = new c(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f5581c = new d(3);

    public m(n7.v vVar) {
        this.f5579a = vVar;
    }

    public final List a() {
        return (List) ua.l.W(this.f5579a, true, false, new i(2));
    }

    public final void b(c9.c cVar) {
        ua.l.W(this.f5579a, false, true, new k(this, cVar, 2));
    }
}
