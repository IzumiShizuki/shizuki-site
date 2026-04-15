package v3;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.MediaDrmResetException;
import android.media.PlaybackParams;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ AudioDeviceInfo d(Object obj) {
        return (AudioDeviceInfo) obj;
    }

    public static /* synthetic */ AudioTrack.Builder e() {
        return new AudioTrack.Builder();
    }

    public static /* synthetic */ PlaybackParams k() {
        return new PlaybackParams();
    }

    public static /* bridge */ /* synthetic */ boolean u(Throwable th2) {
        return th2 instanceof MediaDrmResetException;
    }
}
