package b5;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j5.d0 f1594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f1595c;

    public q(CopyOnWriteArrayList copyOnWriteArrayList, int i10, j5.d0 d0Var) {
        this.f1595c = copyOnWriteArrayList;
        this.f1593a = i10;
        this.f1594b = d0Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [b5.r, java.lang.Object] */
    public final void a() {
        for (p pVar : this.f1595c) {
            p4.c0.R(pVar.f1591a, new o(this, pVar.f1592b, 2));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [b5.r, java.lang.Object] */
    public final void b() {
        for (p pVar : this.f1595c) {
            p4.c0.R(pVar.f1591a, new o(this, pVar.f1592b, 1));
        }
    }

    public final void c(int i10) {
        for (p pVar : this.f1595c) {
            p4.c0.R(pVar.f1591a, new n(this, pVar.f1592b, i10, 0));
        }
    }

    public final void d(Exception exc) {
        for (p pVar : this.f1595c) {
            p4.c0.R(pVar.f1591a, new m(this, pVar.f1592b, exc, 0));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [b5.r, java.lang.Object] */
    public final void e() {
        for (p pVar : this.f1595c) {
            p4.c0.R(pVar.f1591a, new o(this, pVar.f1592b, 0));
        }
    }
}
