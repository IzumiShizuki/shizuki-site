package c7;

import android.content.Context;
import android.service.media.MediaBrowserService;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class u extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f3729b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, Context context) {
        super(vVar, context);
        this.f3729b = vVar;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadItem(String str, MediaBrowserService.Result result) {
        b0.c1 c1Var = new b0.c1(12, result);
        f0 f0Var = this.f3729b.f3735f;
        f0Var.f3627f = f0Var.f3624c;
        c1Var.E(null);
        f0Var.f3627f = null;
    }
}
