package j2;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k3 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kf.f f9856a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(kf.f fVar, Handler handler) {
        super(handler);
        this.f9856a = fVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10, Uri uri) {
        this.f9856a.e(ub.a0.f21526a);
    }
}
