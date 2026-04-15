package v4;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f22601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pair f22602c;

    public /* synthetic */ n0(q0 q0Var, Pair pair, int i10) {
        this.f22600a = i10;
        this.f22601b = q0Var;
        this.f22602c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22600a) {
            case 0:
                w4.d dVar = this.f22601b.f22620b.f22643h;
                Pair pair = this.f22602c;
                dVar.a(((Integer) pair.first).intValue(), (j5.d0) pair.second);
                break;
            case 1:
                w4.d dVar2 = this.f22601b.f22620b.f22643h;
                Pair pair2 = this.f22602c;
                dVar2.A(((Integer) pair2.first).intValue(), (j5.d0) pair2.second);
                break;
            default:
                w4.d dVar3 = this.f22601b.f22620b.f22643h;
                Pair pair3 = this.f22602c;
                dVar3.v(((Integer) pair3.first).intValue(), (j5.d0) pair3.second);
                break;
        }
    }
}
