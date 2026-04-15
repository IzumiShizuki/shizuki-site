package x4;

import android.media.AudioTrack;
import r.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u extends AudioTrack.StreamEventCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tc.b0 f24687a;

    public u(tc.b0 b0Var) {
        this.f24687a = b0Var;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        v vVar;
        y1 y1Var;
        v4.w wVar;
        if (audioTrack.equals(((v) this.f24687a.f20620d).f24721v) && (y1Var = (vVar = (v) this.f24687a.f20620d).f24717r) != null && vVar.V && (wVar = ((x) y1Var.f18634b).F) != null) {
            wVar.a();
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(((v) this.f24687a.f20620d).f24721v)) {
            ((v) this.f24687a.f20620d).U = true;
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        v vVar;
        y1 y1Var;
        v4.w wVar;
        if (audioTrack.equals(((v) this.f24687a.f20620d).f24721v) && (y1Var = (vVar = (v) this.f24687a.f20620d).f24717r) != null && vVar.V && (wVar = ((x) y1Var.f18634b).F) != null) {
            wVar.a();
        }
    }
}
