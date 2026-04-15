package c7;

import android.media.session.MediaController;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class m0 extends b0.c1 {
    @Override // b0.c1
    public final void s(Uri uri, Bundle bundle) {
        ((MediaController.TransportControls) this.f1208b).playFromUri(uri, bundle);
    }
}
