package i5;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f9016c;

    public e(f fVar) {
        this.f9016c = fVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        ((Handler) this.f9016c.f9022f).post(new d(this, 0));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z10) {
        if (z10) {
            return;
        }
        ((Handler) this.f9016c.f9022f).post(new d(this, 1));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        boolean zHasCapability = networkCapabilities.hasCapability(16);
        boolean z10 = this.f9014a;
        f fVar = this.f9016c;
        if (z10 && this.f9015b == zHasCapability) {
            if (zHasCapability) {
                ((Handler) fVar.f9022f).post(new d(this, 1));
            }
        } else {
            this.f9014a = true;
            this.f9015b = zHasCapability;
            ((Handler) fVar.f9022f).post(new d(this, 0));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        ((Handler) this.f9016c.f9022f).post(new d(this, 0));
    }
}
