package rb;

import com.tencent.bugly.crashreport.crash.anr.h;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f18989b;

    public /* synthetic */ b(h hVar, int i10) {
        this.f18988a = i10;
        this.f18989b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18988a) {
            case 0:
                this.f18989b.d();
                break;
            case 1:
                this.f18989b.d();
                break;
            default:
                this.f18989b.d();
                break;
        }
    }
}
