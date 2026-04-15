package v2;

import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends ud.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f22360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f22361b;

    public b(CharSequence charSequence, TextPaint textPaint) {
        this.f22360a = charSequence;
        this.f22361b = textPaint;
    }

    @Override // ud.e
    public final int H(int i10) {
        CharSequence charSequence = this.f22360a;
        return this.f22361b.getTextRunCursor(charSequence, 0, charSequence.length(), false, i10, 0);
    }

    @Override // ud.e
    public final int M(int i10) {
        CharSequence charSequence = this.f22360a;
        return this.f22361b.getTextRunCursor(charSequence, 0, charSequence.length(), false, i10, 2);
    }
}
