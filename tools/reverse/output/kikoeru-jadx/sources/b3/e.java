package b3;

import android.text.style.ClickableSpan;
import android.view.View;
import t2.m;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f1494a;

    public e(m mVar) {
        this.f1494a = mVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.f1494a.getClass();
    }
}
