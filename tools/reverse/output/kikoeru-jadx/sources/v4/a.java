package v4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends BroadcastReceiver implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f22384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f22385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b7.n f22386c;

    public a(b7.n nVar, Handler handler, s sVar) {
        this.f22386c = nVar;
        this.f22385b = handler;
        this.f22384a = sVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f22385b.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f22386c.f1984b) {
            this.f22384a.f22626a.j2(-1, 3, false);
        }
    }
}
