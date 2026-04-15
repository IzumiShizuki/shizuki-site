package j;

import android.graphics.drawable.Animatable;
import gh.g;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Animatable f9529c;

    public /* synthetic */ a(Animatable animatable, int i10) {
        this.f9528b = i10;
        this.f9529c = animatable;
    }

    @Override // gh.g
    public final void O() {
        switch (this.f9528b) {
            case 0:
                this.f9529c.start();
                break;
            default:
                ((f8.e) this.f9529c).start();
                break;
        }
    }

    @Override // gh.g
    public final void P() {
        switch (this.f9528b) {
            case 0:
                this.f9529c.stop();
                break;
            default:
                ((f8.e) this.f9529c).stop();
                break;
        }
    }
}
