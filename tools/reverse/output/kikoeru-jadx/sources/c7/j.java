package c7;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;
import b7.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaBrowser f3640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f3641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y1 f3642d = new y1(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o.e f3643e = new o.e(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n f3644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Messenger f3645g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d1 f3646h;

    public j(Context context, ComponentName componentName, e1 e1Var, Bundle bundle) {
        this.f3639a = context;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        this.f3641c = bundle2;
        bundle2.putInt("extra_client_version", 1);
        bundle2.putInt("extra_calling_pid", Process.myPid());
        e1Var.f3619c = this;
        i iVar = (i) e1Var.f3618b;
        iVar.getClass();
        this.f3640b = new MediaBrowser(context, componentName, iVar, bundle2);
    }
}
