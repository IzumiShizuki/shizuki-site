package c7;

import android.media.VolumeProvider;
import b7.w3;
import b7.x3;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r1 extends VolumeProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x3 f3718a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(x3 x3Var, int i10, int i11, int i12, String str) {
        super(i10, i11, i12, str);
        this.f3718a = x3Var;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i10) {
        x3 x3Var = this.f3718a;
        p4.c0.R(x3Var.f2185f, new w3(x3Var, i10, 1));
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i10) {
        x3 x3Var = this.f3718a;
        p4.c0.R(x3Var.f2185f, new w3(x3Var, i10, 0));
    }
}
