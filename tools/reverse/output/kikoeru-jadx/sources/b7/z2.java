package b7;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z2 implements p3, p4.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f2226b;

    public /* synthetic */ z2(int i10, List list) {
        this.f2225a = i10;
        this.f2226b = list;
    }

    @Override // p4.k
    public void a(Object obj) {
        ((m4.w0) obj).K(this.f2226b);
    }

    @Override // b7.p3
    public Object h(c2 c2Var, t1 t1Var, int i10) {
        switch (this.f2225a) {
        }
        return c2Var.j(t1Var, this.f2226b);
    }
}
