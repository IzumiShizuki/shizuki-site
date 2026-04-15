package w2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23336b;

    public k(boolean z10, boolean z11) {
        this.f23335a = z10;
        this.f23336b = z11;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f23335a);
        textPaint.setStrikeThruText(this.f23336b);
    }
}
