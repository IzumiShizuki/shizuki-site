package j2;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f9835a = new j0();

    public final void a(View view, c2.q qVar) {
        Context context = view.getContext();
        PointerIcon systemIcon = qVar instanceof c2.a ? PointerIcon.getSystemIcon(context, ((c2.a) qVar).f3242b) : PointerIcon.getSystemIcon(context, 1000);
        if (jc.l.a(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
