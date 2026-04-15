package v4;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f22605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pair f22606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j5.u f22607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j5.z f22608e;

    public /* synthetic */ o0(q0 q0Var, Pair pair, j5.u uVar, j5.z zVar, int i10) {
        this.f22604a = i10;
        this.f22605b = q0Var;
        this.f22606c = pair;
        this.f22607d = uVar;
        this.f22608e = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22604a) {
            case 0:
                w4.d dVar = this.f22605b.f22620b.f22643h;
                Pair pair = this.f22606c;
                dVar.H(((Integer) pair.first).intValue(), (j5.d0) pair.second, this.f22607d, this.f22608e);
                break;
            default:
                w4.d dVar2 = this.f22605b.f22620b.f22643h;
                Pair pair2 = this.f22606c;
                dVar2.G(((Integer) pair2.first).intValue(), (j5.d0) pair2.second, this.f22607d, this.f22608e);
                break;
        }
    }
}
