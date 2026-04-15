package b7;

import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2021c;

    public /* synthetic */ p0(int i10, int i11, Object obj) {
        this.f2019a = i11;
        this.f2021c = obj;
        this.f2020b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2019a) {
            case 0:
                ((t0) this.f2021c).f2078j.remove(Integer.valueOf(this.f2020b));
                break;
            case 1:
                ((IntConsumer) this.f2021c).accept(this.f2020b);
                break;
            default:
                v4.c0 c0Var = (v4.c0) this.f2021c;
                w4.d dVar = c0Var.f22429v;
                int i10 = c0Var.f22408a[this.f2020b].f22393a.f22451b;
                dVar.a0(dVar.Z(), 1033, new w4.b(1));
                break;
        }
    }

    public /* synthetic */ p0(v4.c0 c0Var, int i10, boolean z10) {
        this.f2019a = 2;
        this.f2021c = c0Var;
        this.f2020b = i10;
    }
}
