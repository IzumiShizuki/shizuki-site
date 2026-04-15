package c7;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.RemoteException;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaController f3647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3648b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f3649c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f3650d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d1 f3651e;

    public j0(Context context, d1 d1Var) {
        this.f3651e = d1Var;
        Object obj = d1Var.f3607b;
        obj.getClass();
        MediaController mediaController = new MediaController(context, (MediaSession.Token) obj);
        this.f3647a = mediaController;
        if (d1Var.a() == null) {
            b7.z0 z0Var = new b7.z0(null);
            z0Var.f2221b = new WeakReference(this);
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, z0Var);
        }
    }

    public final void a() {
        h hVarA = this.f3651e.a();
        if (hVarA == null) {
            return;
        }
        ArrayList<b7.a1> arrayList = this.f3649c;
        for (b7.a1 a1Var : arrayList) {
            i0 i0Var = new i0(a1Var);
            this.f3650d.put(a1Var, i0Var);
            a1Var.f1620c = i0Var;
            try {
                hVarA.J(i0Var);
                a1Var.i(13, null, null);
            } catch (RemoteException e10) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
            }
        }
        arrayList.clear();
    }

    public final void b(b7.a1 a1Var) {
        MediaController mediaController = this.f3647a;
        h0 h0Var = a1Var.f1618a;
        h0Var.getClass();
        mediaController.unregisterCallback(h0Var);
        synchronized (this.f3648b) {
            h hVarA = this.f3651e.a();
            if (hVarA != null) {
                try {
                    i0 i0Var = (i0) this.f3650d.remove(a1Var);
                    if (i0Var != null) {
                        a1Var.f1620c = null;
                        hVarA.g(i0Var);
                    }
                } catch (RemoteException e10) {
                    Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e10);
                }
            }
            this.f3649c.remove(a1Var);
        }
    }
}
