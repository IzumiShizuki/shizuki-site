package p6;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f16774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StringBuilder f16775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16779g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16780h;

    public b(int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f16773a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f16774b = arrayList2;
        StringBuilder sb = new StringBuilder();
        this.f16775c = sb;
        this.f16779g = i10;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.f16776d = 15;
        this.f16777e = 0;
        this.f16778f = 0;
        this.f16780h = i11;
    }

    public final void a(char c3) {
        StringBuilder sb = this.f16775c;
        if (sb.length() < 32) {
            sb.append(c3);
        }
    }

    public final void b() {
        StringBuilder sb = this.f16775c;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            ArrayList arrayList = this.f16773a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) arrayList.get(size);
                int i10 = aVar.f16772c;
                if (i10 != length) {
                    return;
                }
                aVar.f16772c = i10 - 1;
            }
        }
    }

    public final o4.b c(int i10) {
        float f10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f16774b;
            if (i11 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i11));
            spannableStringBuilder.append('\n');
            i11++;
        }
        spannableStringBuilder.append((CharSequence) d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i12 = this.f16777e + this.f16778f;
        int length = (32 - i12) - spannableStringBuilder.length();
        int i13 = i12 - length;
        int i14 = i10 != Integer.MIN_VALUE ? i10 : (this.f16779g != 2 || (Math.abs(i13) >= 3 && length >= 0)) ? (this.f16779g != 2 || i13 <= 0) ? 0 : 2 : 1;
        if (i14 != 1) {
            if (i14 == 2) {
                i12 = 32 - length;
            }
            f10 = ((i12 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f10 = 0.5f;
        }
        int i15 = this.f16776d;
        if (i15 > 7) {
            i15 -= 17;
        } else if (this.f16779g == 1) {
            i15 -= this.f16780h - 1;
        }
        return new o4.b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i15, 1, Integer.MIN_VALUE, f10, i14, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    public final SpannableString d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f16775c);
        int length = spannableStringBuilder.length();
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        int i13 = 0;
        int i14 = -1;
        int i15 = -1;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f16773a;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            boolean z11 = aVar.f16771b;
            int i16 = aVar.f16770a;
            if (i16 != 8) {
                boolean z12 = i16 == 7;
                if (i16 != 7) {
                    i15 = c.B[i16];
                }
                z10 = z12;
            }
            int i17 = aVar.f16772c;
            i10++;
            if (i17 != (i10 < arrayList.size() ? ((a) arrayList.get(i10)).f16772c : length)) {
                if (i11 != -1 && !z11) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i17, 33);
                    i11 = -1;
                } else if (i11 == -1 && z11) {
                    i11 = i17;
                }
                if (i12 != -1 && !z10) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i12, i17, 33);
                    i12 = -1;
                } else if (i12 == -1 && z10) {
                    i12 = i17;
                }
                if (i15 != i14) {
                    if (i14 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i14), i13, i17, 33);
                    }
                    i14 = i15;
                    i13 = i17;
                }
            }
        }
        if (i11 != -1 && i11 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i11, length, 33);
        }
        if (i12 != -1 && i12 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i12, length, 33);
        }
        if (i13 != length && i14 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i14), i13, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        return this.f16773a.isEmpty() && this.f16774b.isEmpty() && this.f16775c.length() == 0;
    }
}
