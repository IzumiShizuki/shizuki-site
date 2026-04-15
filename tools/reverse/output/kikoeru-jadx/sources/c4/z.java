package c4;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z implements Spannable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3419a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Spannable f3420b;

    public z(Spannable spannable) {
        this.f3420b = spannable;
    }

    public final void a() {
        Spannable spannable = this.f3420b;
        if (!this.f3419a) {
            if ((Build.VERSION.SDK_INT < 28 ? new pe.d(18) : new y(18)).E(spannable)) {
                this.f3420b = new SpannableString(spannable);
            }
        }
        this.f3419a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f3420b.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f3420b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f3420b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f3420b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f3420b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f3420b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i10, int i11, Class cls) {
        return this.f3420b.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f3420b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f3420b.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f3420b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f3420b.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return this.f3420b.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f3420b.toString();
    }
}
