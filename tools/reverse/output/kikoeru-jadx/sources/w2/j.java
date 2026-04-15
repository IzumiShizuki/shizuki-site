package w2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f23332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f23333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f23334d;

    public j(int i10, float f10, float f11, float f12) {
        this.f23331a = i10;
        this.f23332b = f10;
        this.f23333c = f11;
        this.f23334d = f12;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f23334d, this.f23332b, this.f23333c, this.f23331a);
    }
}
