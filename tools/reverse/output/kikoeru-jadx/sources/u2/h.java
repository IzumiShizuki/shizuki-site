package u2;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f21230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextPaint f21232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextDirectionHeuristic f21234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Layout.Alignment f21235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f21236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextUtils.TruncateAt f21237h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f21238i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f21239j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f21240k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f21241l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f21242m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f21243n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f21244o;

    public h(CharSequence charSequence, int i10, TextPaint textPaint, int i11, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i12, TextUtils.TruncateAt truncateAt, int i13, int i14, boolean z10, int i15, int i16, int i17, int i18) {
        this.f21230a = charSequence;
        this.f21231b = i10;
        this.f21232c = textPaint;
        this.f21233d = i11;
        this.f21234e = textDirectionHeuristic;
        this.f21235f = alignment;
        this.f21236g = i12;
        this.f21237h = truncateAt;
        this.f21238i = i13;
        this.f21239j = i14;
        this.f21240k = z10;
        this.f21241l = i15;
        this.f21242m = i16;
        this.f21243n = i17;
        this.f21244o = i18;
        if (i10 < 0) {
            z2.a.a("invalid start value");
        }
        int length = charSequence.length();
        if (i10 < 0 || i10 > length) {
            z2.a.a("invalid end value");
        }
        if (i12 < 0) {
            z2.a.a("invalid maxLines value");
        }
        if (i11 < 0) {
            z2.a.a("invalid width value");
        }
        if (i13 >= 0) {
            return;
        }
        z2.a.a("invalid ellipsizedWidth value");
    }
}
