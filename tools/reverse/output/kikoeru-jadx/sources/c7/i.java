package c7;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import b7.y1;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends MediaBrowser.ConnectionCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e1 f3636a;

    public i(e1 e1Var) {
        this.f3636a = e1Var;
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        h hVar;
        e1 e1Var = this.f3636a;
        j jVar = (j) e1Var.f3619c;
        int i10 = 0;
        if (jVar != null) {
            y1 y1Var = jVar.f3642d;
            MediaBrowser mediaBrowser = jVar.f3640b;
            try {
                Bundle extras = mediaBrowser.getExtras();
                if (extras != null) {
                    extras.getInt("extra_service_version", 0);
                    IBinder binder = extras.getBinder("extra_messenger");
                    if (binder != null) {
                        Bundle bundle = jVar.f3641c;
                        n nVar = new n();
                        nVar.f3672a = new Messenger(binder);
                        jVar.f3644f = nVar;
                        Messenger messenger = new Messenger(y1Var);
                        jVar.f3645g = messenger;
                        y1Var.getClass();
                        y1Var.f2207c = new WeakReference(messenger);
                        try {
                            Context context = jVar.f3639a;
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("data_package_name", context.getPackageName());
                            bundle2.putInt("data_calling_pid", Process.myPid());
                            bundle2.putBundle("data_root_hints", bundle);
                            nVar.c(6, bundle2, messenger);
                        } catch (RemoteException unused) {
                            Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                        }
                    }
                    IBinder binder2 = extras.getBinder("extra_session_binder");
                    int i11 = v0.f3736f;
                    if (binder2 == null) {
                        hVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = binder2.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof h)) {
                            g gVar = new g();
                            gVar.f3630e = binder2;
                            hVar = gVar;
                        } else {
                            hVar = (h) iInterfaceQueryLocalInterface;
                        }
                    }
                    if (hVar != null) {
                        MediaSession.Token sessionToken = mediaBrowser.getSessionToken();
                        p4.c.i(sessionToken != null);
                        if (!q.t0.M(sessionToken)) {
                            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
                        }
                        jVar.f3646h = new d1(sessionToken, hVar);
                    }
                }
            } catch (IllegalStateException e10) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e10);
            }
        }
        b7.d1 d1Var = (b7.d1) e1Var.f3620d;
        o oVar = d1Var.f1719i;
        if (oVar != null) {
            j jVar2 = oVar.f3674a;
            if (jVar2.f3646h == null) {
                MediaSession.Token sessionToken2 = jVar2.f3640b.getSessionToken();
                p4.c.i(sessionToken2 != null);
                if (!q.t0.M(sessionToken2)) {
                    throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
                }
                jVar2.f3646h = new d1(sessionToken2, null);
            }
            d1 d1Var2 = jVar2.f3646h;
            b7.d0 d0Var = d1Var.f1712b;
            d0Var.e(new b5.h(1, d1Var, d1Var2));
            d0Var.f1707d.post(new b7.x0(d1Var, i10));
        }
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        ((b7.d1) this.f3636a.f3620d).f1712b.d();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        e1 e1Var = this.f3636a;
        j jVar = (j) e1Var.f3619c;
        if (jVar != null) {
            jVar.f3644f = null;
            jVar.f3645g = null;
            jVar.f3646h = null;
            y1 y1Var = jVar.f3642d;
            y1Var.getClass();
            y1Var.f2207c = new WeakReference(null);
        }
        ((b7.d1) e1Var.f3620d).f1712b.d();
    }
}
