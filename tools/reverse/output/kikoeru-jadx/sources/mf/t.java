package mf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t implements yb.c, ac.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yb.c f15162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yb.h f15163b;

    public t(yb.c cVar, yb.h hVar) {
        this.f15162a = cVar;
        this.f15163b = hVar;
    }

    @Override // ac.d
    public final ac.d f() {
        yb.c cVar = this.f15162a;
        if (cVar instanceof ac.d) {
            return (ac.d) cVar;
        }
        return null;
    }

    @Override // yb.c
    public final void h(Object obj) {
        this.f15162a.h(obj);
    }

    @Override // yb.c
    public final yb.h s() {
        return this.f15163b;
    }
}
