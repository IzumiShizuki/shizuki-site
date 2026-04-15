package d7;

import androidx.media3.ui.AspectRatioFrameLayout;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5482a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5484c;

    public b(com.tencent.bugly.beta.upgrade.d dVar, boolean z10) {
        this.f5484c = dVar;
        this.f5483b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f5482a;
        Object obj = this.f5484c;
        switch (i10) {
            case 0:
                this.f5483b = false;
                int i11 = AspectRatioFrameLayout.f988d;
                ((AspectRatioFrameLayout) obj).getClass();
                break;
            default:
                ((com.tencent.bugly.beta.upgrade.d) obj).a(this.f5483b);
                break;
        }
    }

    public b(AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.f5484c = aspectRatioFrameLayout;
    }
}
