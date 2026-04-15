package p6;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final boolean[] A;
    public static final int[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f16803v = c(2, 2, 2, 0);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f16804w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f16805x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f16806y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f16807z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16808a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f16809b = new SpannableStringBuilder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16814g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16815h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16816i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f16817j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16818k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f16819l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f16820m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f16821n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f16822o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f16823p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16824q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16825r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f16826s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f16827t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16828u;

    static {
        int iC = c(0, 0, 0, 0);
        f16804w = iC;
        int iC2 = c(0, 0, 0, 3);
        f16805x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f16806y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f16807z = new int[]{3, 3, 3, 3, 3, 3, 1};
        A = new boolean[]{false, false, false, true, true, true, false};
        B = new int[]{iC, iC2, iC, iC, iC2, iC, iC};
        C = new int[]{0, 1, 2, 3, 4, 3, 4};
        D = new int[]{0, 0, 0, 0, 0, 3, 3};
        E = new int[]{iC, iC, iC, iC, iC, iC2, iC2};
    }

    public e() {
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(int r4, int r5, int r6, int r7) {
        /*
            r0 = 4
            p4.c.f(r4, r0)
            p4.c.f(r5, r0)
            p4.c.f(r6, r0)
            p4.c.f(r7, r0)
            r0 = 1
            r1 = 255(0xff, float:3.57E-43)
            r2 = 0
            if (r7 == 0) goto L1b
            if (r7 == r0) goto L1b
            r3 = 2
            if (r7 == r3) goto L20
            r3 = 3
            if (r7 == r3) goto L1e
        L1b:
            r7 = 255(0xff, float:3.57E-43)
            goto L22
        L1e:
            r7 = 0
            goto L22
        L20:
            r7 = 127(0x7f, float:1.78E-43)
        L22:
            if (r4 <= r0) goto L27
            r4 = 255(0xff, float:3.57E-43)
            goto L28
        L27:
            r4 = 0
        L28:
            if (r5 <= r0) goto L2d
            r5 = 255(0xff, float:3.57E-43)
            goto L2e
        L2d:
            r5 = 0
        L2e:
            if (r6 <= r0) goto L31
            goto L32
        L31:
            r1 = 0
        L32:
            int r4 = android.graphics.Color.argb(r7, r4, r5, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.e.c(int, int, int, int):int");
    }

    public final void a(char c3) {
        SpannableStringBuilder spannableStringBuilder = this.f16809b;
        if (c3 != '\n') {
            spannableStringBuilder.append(c3);
            return;
        }
        SpannableString spannableStringB = b();
        ArrayList arrayList = this.f16808a;
        arrayList.add(spannableStringB);
        spannableStringBuilder.clear();
        if (this.f16822o != -1) {
            this.f16822o = 0;
        }
        if (this.f16823p != -1) {
            this.f16823p = 0;
        }
        if (this.f16824q != -1) {
            this.f16824q = 0;
        }
        if (this.f16826s != -1) {
            this.f16826s = 0;
        }
        while (true) {
            if (arrayList.size() < this.f16817j && arrayList.size() < 15) {
                this.f16828u = arrayList.size();
                return;
            }
            arrayList.remove(0);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f16809b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f16822o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f16822o, length, 33);
            }
            if (this.f16823p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f16823p, length, 33);
            }
            if (this.f16824q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f16825r), this.f16824q, length, 33);
            }
            if (this.f16826s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f16827t), this.f16826s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f16808a.clear();
        this.f16809b.clear();
        this.f16822o = -1;
        this.f16823p = -1;
        this.f16824q = -1;
        this.f16826s = -1;
        this.f16828u = 0;
        this.f16810c = false;
        this.f16811d = false;
        this.f16812e = 4;
        this.f16813f = false;
        this.f16814g = 0;
        this.f16815h = 0;
        this.f16816i = 0;
        this.f16817j = 15;
        this.f16818k = 0;
        this.f16819l = 0;
        this.f16820m = 0;
        int i10 = f16804w;
        this.f16821n = i10;
        this.f16825r = f16803v;
        this.f16827t = i10;
    }

    public final void e(boolean z10, boolean z11) {
        int i10 = this.f16822o;
        SpannableStringBuilder spannableStringBuilder = this.f16809b;
        if (i10 != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f16822o, spannableStringBuilder.length(), 33);
                this.f16822o = -1;
            }
        } else if (z10) {
            this.f16822o = spannableStringBuilder.length();
        }
        if (this.f16823p == -1) {
            if (z11) {
                this.f16823p = spannableStringBuilder.length();
            }
        } else {
            if (z11) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f16823p, spannableStringBuilder.length(), 33);
            this.f16823p = -1;
        }
    }

    public final void f(int i10, int i11) {
        int i12 = this.f16824q;
        SpannableStringBuilder spannableStringBuilder = this.f16809b;
        if (i12 != -1 && this.f16825r != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f16825r), this.f16824q, spannableStringBuilder.length(), 33);
        }
        if (i10 != f16803v) {
            this.f16824q = spannableStringBuilder.length();
            this.f16825r = i10;
        }
        if (this.f16826s != -1 && this.f16827t != i11) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f16827t), this.f16826s, spannableStringBuilder.length(), 33);
        }
        if (i11 != f16804w) {
            this.f16826s = spannableStringBuilder.length();
            this.f16827t = i11;
        }
    }
}
