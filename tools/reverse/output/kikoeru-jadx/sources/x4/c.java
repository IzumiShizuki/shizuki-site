package x4;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends AudioDeviceCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f24594a;

    public c(e eVar) {
        this.f24594a = eVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        e eVar = this.f24594a;
        eVar.a(b.c(eVar.f24598a, eVar.f24606i, eVar.f24605h));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        if (c0.l(this.f24594a.f24605h, audioDeviceInfoArr)) {
            this.f24594a.f24605h = null;
        }
        e eVar = this.f24594a;
        eVar.a(b.c(eVar.f24598a, eVar.f24606i, eVar.f24605h));
    }
}
