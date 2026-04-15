package i9;

import android.media.AudioManager;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9482a;

    public /* synthetic */ j(int i10) {
        this.f9482a = i10;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        switch (this.f9482a) {
            case 0:
                n.f9487a.a(Integer.valueOf(i10));
                break;
            case 1:
                n.f9487a.a(Integer.valueOf(i10));
                break;
            default:
                n.f9487a.a(Integer.valueOf(i10));
                break;
        }
    }
}
