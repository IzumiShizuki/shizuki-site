package b5;

import android.media.session.MediaSessionManager;
import android.text.PrecomputedText;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class z {
    public static /* synthetic */ void n(int i10, int i11, String str) {
        new MediaSessionManager.RemoteUserInfo(str, i10, i11);
    }

    public static /* bridge */ /* synthetic */ boolean x(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }
}
