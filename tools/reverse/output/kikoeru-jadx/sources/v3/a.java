package v3;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f22367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22368c;

    public a(int i10, d dVar, int i11) {
        this.f22366a = i10;
        this.f22367b = dVar;
        this.f22368c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f22366a);
        this.f22367b.f22380a.performAction(this.f22368c, bundle);
    }
}
