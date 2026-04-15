package j2;

import android.content.ClipboardManager;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i implements h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClipboardManager f9825a;

    public i(Context context) {
        Object systemService = context.getSystemService("clipboard");
        jc.l.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f9825a = (ClipboardManager) systemService;
    }
}
