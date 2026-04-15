package h9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import jc.l;
import na.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f8247a = new e();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (l.a(intent != null ? intent.getAction() : null, "android.media.AUDIO_BECOMING_NOISY")) {
            q.c("pause because receive AudioManager.ACTION_AUDIO_BECOMING_NOISY", "NoisyBroadcastReceiver");
            if (((Boolean) a0.c.F(Boolean.TYPE, gg.c.a(), "detectHeadsetUnplug", Boolean.TRUE)).booleanValue()) {
                d.f(false);
            }
        }
    }
}
