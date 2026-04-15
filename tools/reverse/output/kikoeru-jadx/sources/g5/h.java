package g5;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.os.Bundle;
import c7.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h implements LoudnessCodecController.OnLoudnessCodecUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e1 f7381a;

    public h(e1 e1Var) {
        this.f7381a = e1Var;
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        ((i) this.f7381a.f3619c).getClass();
        return bundle;
    }
}
