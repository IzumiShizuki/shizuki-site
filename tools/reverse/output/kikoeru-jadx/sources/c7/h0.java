package c7;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends MediaController.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f3635a;

    public h0(b7.a1 a1Var) {
        this.f3635a = new WeakReference(a1Var);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        b7.a1 a1Var = (b7.a1) this.f3635a.get();
        if (a1Var == null || playbackInfo == null) {
            return;
        }
        a1Var.a(new l0(playbackInfo.getPlaybackType(), d.a(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
    }

    @Override // android.media.session.MediaController.Callback
    public final void onExtrasChanged(Bundle bundle) {
        e1.t(bundle);
        b7.a1 a1Var = (b7.a1) this.f3635a.get();
        if (a1Var != null) {
            a1Var.c(bundle);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        r0 r0VarCreateFromParcel;
        b7.a1 a1Var = (b7.a1) this.f3635a.get();
        if (a1Var != null) {
            o.e eVar = r0.f3714c;
            if (mediaMetadata != null) {
                Parcel parcelObtain = Parcel.obtain();
                mediaMetadata.writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                r0VarCreateFromParcel = r0.CREATOR.createFromParcel(parcelObtain);
                parcelObtain.recycle();
                r0VarCreateFromParcel.f3717b = mediaMetadata;
            } else {
                r0VarCreateFromParcel = null;
            }
            a1Var.d(r0VarCreateFromParcel);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        b7.a1 a1Var = (b7.a1) this.f3635a.get();
        if (a1Var == null || a1Var.f1620c != null) {
            return;
        }
        a1Var.e(p1.a(playbackState));
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueChanged(List list) {
        b7.a1 a1Var = (b7.a1) this.f3635a.get();
        if (a1Var != null) {
            a1Var.f(b1.a(list));
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueTitleChanged(CharSequence charSequence) {
        b7.a1 a1Var = (b7.a1) this.f3635a.get();
        if (a1Var != null) {
            a1Var.g(charSequence);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionDestroyed() {
        b7.a1 a1Var = (b7.a1) this.f3635a.get();
        if (a1Var != null) {
            a1Var.f1622e.f1712b.d();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionEvent(String str, Bundle bundle) {
        e1.t(bundle);
        b7.a1 a1Var = (b7.a1) this.f3635a.get();
        if (a1Var != null) {
            if (a1Var.f1620c == null || Build.VERSION.SDK_INT >= 23) {
                a1Var.h(str, bundle);
            }
        }
    }
}
