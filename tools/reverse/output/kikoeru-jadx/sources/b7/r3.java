package b7;

import android.app.Notification;
import android.media.session.MediaSession;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r3 extends androidx.lifecycle.q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v1 f2060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f2061c;

    public r3(v1 v1Var) {
        this.f2060b = v1Var;
    }

    @Override // androidx.lifecycle.q
    public final void X0(c7.e1 e1Var) {
        Notification.Builder builder = (Notification.Builder) e1Var.f3618b;
        Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
        v1 v1Var = this.f2060b;
        Notification.MediaStyle mediaSession = mediaStyle.setMediaSession((MediaSession.Token) ((c7.w0) v1Var.f2118a.f1681h.f2012k.f3618b).f3741c.f3607b);
        int[] iArr = this.f2061c;
        if (iArr != null) {
            mediaSession.setShowActionsInCompactView(iArr);
        }
        int i10 = p4.c0.f16548a;
        builder.setStyle(mediaSession);
        Bundle bundle = new Bundle();
        bundle.putBundle("androidx.media3.session", v1Var.f2118a.f1683j.b());
        builder.addExtras(bundle);
    }
}
