package o4;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f16188r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f16189s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f16190t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f16191u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f16192v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f16193w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f16194x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f16195y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f16196z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f16197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f16198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f16199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bitmap f16200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f16201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f16203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f16204h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f16205i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f16206j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f16207k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f16208l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f16209m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f16210n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f16211o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f16212p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f16213q;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
        int i10 = c0.f16548a;
        f16188r = Integer.toString(0, 36);
        f16189s = Integer.toString(17, 36);
        f16190t = Integer.toString(1, 36);
        f16191u = Integer.toString(2, 36);
        f16192v = Integer.toString(3, 36);
        f16193w = Integer.toString(18, 36);
        f16194x = Integer.toString(4, 36);
        f16195y = Integer.toString(5, 36);
        f16196z = Integer.toString(6, 36);
        A = Integer.toString(7, 36);
        B = Integer.toString(8, 36);
        C = Integer.toString(9, 36);
        D = Integer.toString(10, 36);
        E = Integer.toString(11, 36);
        F = Integer.toString(12, 36);
        G = Integer.toString(13, 36);
        H = Integer.toString(14, 36);
        I = Integer.toString(15, 36);
        J = Integer.toString(16, 36);
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            p4.c.c(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f16197a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f16197a = charSequence.toString();
        } else {
            this.f16197a = null;
        }
        this.f16198b = alignment;
        this.f16199c = alignment2;
        this.f16200d = bitmap;
        this.f16201e = f10;
        this.f16202f = i10;
        this.f16203g = i11;
        this.f16204h = f11;
        this.f16205i = i12;
        this.f16206j = f13;
        this.f16207k = f14;
        this.f16208l = z10;
        this.f16209m = i14;
        this.f16210n = i13;
        this.f16211o = f12;
        this.f16212p = i15;
        this.f16213q = f15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015b  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34, types: [android.text.Spannable, android.text.SpannableString] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static o4.b b(android.os.Bundle r29) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.b.b(android.os.Bundle):o4.b");
    }

    public final a a() {
        a aVar = new a();
        aVar.f16171a = this.f16197a;
        aVar.f16172b = this.f16200d;
        aVar.f16173c = this.f16198b;
        aVar.f16174d = this.f16199c;
        aVar.f16175e = this.f16201e;
        aVar.f16176f = this.f16202f;
        aVar.f16177g = this.f16203g;
        aVar.f16178h = this.f16204h;
        aVar.f16179i = this.f16205i;
        aVar.f16180j = this.f16210n;
        aVar.f16181k = this.f16211o;
        aVar.f16182l = this.f16206j;
        aVar.f16183m = this.f16207k;
        aVar.f16184n = this.f16208l;
        aVar.f16185o = this.f16209m;
        aVar.f16186p = this.f16212p;
        aVar.f16187q = this.f16213q;
        return aVar;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f16197a;
        if (charSequence != null) {
            bundle.putCharSequence(f16188r, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = d.f16219a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(g.f16224c, gVar.f16226a);
                    bundle2.putInt(g.f16225d, gVar.f16227b);
                    arrayList.add(d.a(spanned, gVar, 1, bundle2));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(h.f16228d, hVar.f16231a);
                    bundle3.putInt(h.f16229e, hVar.f16232b);
                    bundle3.putInt(h.f16230f, hVar.f16233c);
                    arrayList.add(d.a(spanned, hVar, 2, bundle3));
                }
                for (e eVar : (e[]) spanned.getSpans(0, spanned.length(), e.class)) {
                    arrayList.add(d.a(spanned, eVar, 3, null));
                }
                for (i iVar : (i[]) spanned.getSpans(0, spanned.length(), i.class)) {
                    iVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(i.f16234b, iVar.f16235a);
                    arrayList.add(d.a(spanned, iVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f16189s, arrayList);
                }
            }
        }
        bundle.putSerializable(f16190t, this.f16198b);
        bundle.putSerializable(f16191u, this.f16199c);
        bundle.putFloat(f16194x, this.f16201e);
        bundle.putInt(f16195y, this.f16202f);
        bundle.putInt(f16196z, this.f16203g);
        bundle.putFloat(A, this.f16204h);
        bundle.putInt(B, this.f16205i);
        bundle.putInt(C, this.f16210n);
        bundle.putFloat(D, this.f16211o);
        bundle.putFloat(E, this.f16206j);
        bundle.putFloat(F, this.f16207k);
        bundle.putBoolean(H, this.f16208l);
        bundle.putInt(G, this.f16209m);
        bundle.putInt(I, this.f16212p);
        bundle.putFloat(J, this.f16213q);
        return bundle;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            Bitmap bitmap2 = bVar.f16200d;
            if (TextUtils.equals(this.f16197a, bVar.f16197a) && this.f16198b == bVar.f16198b && this.f16199c == bVar.f16199c && ((bitmap = this.f16200d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.f16201e == bVar.f16201e && this.f16202f == bVar.f16202f && this.f16203g == bVar.f16203g && this.f16204h == bVar.f16204h && this.f16205i == bVar.f16205i && this.f16206j == bVar.f16206j && this.f16207k == bVar.f16207k && this.f16208l == bVar.f16208l && this.f16209m == bVar.f16209m && this.f16210n == bVar.f16210n && this.f16211o == bVar.f16211o && this.f16212p == bVar.f16212p && this.f16213q == bVar.f16213q) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16197a, this.f16198b, this.f16199c, this.f16200d, Float.valueOf(this.f16201e), Integer.valueOf(this.f16202f), Integer.valueOf(this.f16203g), Float.valueOf(this.f16204h), Integer.valueOf(this.f16205i), Float.valueOf(this.f16206j), Float.valueOf(this.f16207k), Boolean.valueOf(this.f16208l), Integer.valueOf(this.f16209m), Integer.valueOf(this.f16210n), Float.valueOf(this.f16211o), Integer.valueOf(this.f16212p), Float.valueOf(this.f16213q)});
    }
}
