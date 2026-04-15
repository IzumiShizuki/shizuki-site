package c7;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import b0.w1;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class t extends MediaBrowserService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w1 f3727a;

    public t(w1 w1Var, Context context) {
        this.f3727a = w1Var;
        attachBaseContext(context);
    }

    @Override // android.service.media.MediaBrowserService
    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i10, Bundle bundle) {
        Bundle bundle2;
        int i11;
        q qVar;
        e1.t(bundle);
        w1 w1Var = this.f3727a;
        f0 f0Var = (f0) w1Var.f1394b;
        Bundle bundle3 = bundle == null ? null : new Bundle(bundle);
        if (bundle3 == null || bundle3.getInt("extra_client_version", 0) == 0) {
            bundle2 = null;
            i11 = -1;
        } else {
            bundle3.remove("extra_client_version");
            w1Var.f1397e = new Messenger(f0Var.f3628g);
            Bundle bundle4 = new Bundle();
            bundle4.putInt("extra_service_version", 2);
            bundle4.putBinder("extra_messenger", ((Messenger) w1Var.f1397e).getBinder());
            d1 d1Var = f0Var.f3629h;
            if (d1Var != null) {
                h hVarA = d1Var.a();
                bundle4.putBinder("extra_session_binder", hVarA == null ? null : hVarA.asBinder());
            } else {
                ((ArrayList) w1Var.f1395c).add(bundle4);
            }
            int i12 = bundle3.getInt("extra_calling_pid", -1);
            bundle3.remove("extra_calling_pid");
            i11 = i12;
            bundle2 = bundle4;
        }
        s sVar = new s(f0Var, str, i11, i10, null);
        f0Var.f3627f = sVar;
        q qVarA = f0Var.a(bundle3);
        f0Var.f3627f = null;
        if (qVarA == null) {
            qVar = null;
        } else {
            if (((Messenger) w1Var.f1397e) != null) {
                f0Var.f3625d.add(sVar);
            }
            Bundle bundle5 = qVarA.f3699a;
            if (bundle2 == null) {
                bundle2 = bundle5;
            } else if (bundle5 != null) {
                bundle2.putAll(bundle5);
            }
            qVar = new q(bundle2);
        }
        if (qVar == null) {
            return null;
        }
        return new MediaBrowserService.BrowserRoot("androidx.media3.session.MediaLibraryService", qVar.f3699a);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result) {
        b0.c1 c1Var = new b0.c1(12, result);
        f0 f0Var = (f0) this.f3727a.f1394b;
        f0Var.f3627f = f0Var.f3624c;
        c1Var.E(Build.VERSION.SDK_INT >= 24 ? null : Collections.EMPTY_LIST);
        f0Var.f3627f = null;
    }
}
