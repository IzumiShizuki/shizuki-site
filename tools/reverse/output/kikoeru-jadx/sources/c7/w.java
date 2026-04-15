package c7;

import android.content.Context;
import android.os.Bundle;
import android.service.media.MediaBrowserService;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w extends u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f3738c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, Context context) {
        super(xVar, context);
        this.f3738c = xVar;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
        e1.t(bundle);
        f0 f0Var = this.f3738c.f3753g;
        s sVar = f0Var.f3624c;
        b0.c1 c1Var = new b0.c1(12, result);
        f0Var.f3627f = sVar;
        c1Var.E(null);
        f0Var.f3627f = null;
        f0Var.f3627f = null;
    }
}
