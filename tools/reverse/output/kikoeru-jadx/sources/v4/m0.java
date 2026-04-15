package v4;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f22576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pair f22577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j5.z f22578d;

    public /* synthetic */ m0(q0 q0Var, Pair pair, j5.z zVar, int i10) {
        this.f22575a = i10;
        this.f22576b = q0Var;
        this.f22577c = pair;
        this.f22578d = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22575a) {
            case 0:
                w4.d dVar = this.f22576b.f22620b.f22643h;
                Pair pair = this.f22577c;
                int iIntValue = ((Integer) pair.first).intValue();
                j5.d0 d0Var = (j5.d0) pair.second;
                d0Var.getClass();
                dVar.T(iIntValue, d0Var, this.f22578d);
                break;
            default:
                w4.d dVar2 = this.f22576b.f22620b.f22643h;
                Pair pair2 = this.f22577c;
                dVar2.z(((Integer) pair2.first).intValue(), (j5.d0) pair2.second, this.f22578d);
                break;
        }
    }
}
