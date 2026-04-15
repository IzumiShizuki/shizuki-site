package o4;

import android.os.Bundle;
import android.text.Spanned;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f16219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f16220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f16221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f16222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f16223e;

    static {
        int i10 = c0.f16548a;
        f16219a = Integer.toString(0, 36);
        f16220b = Integer.toString(1, 36);
        f16221c = Integer.toString(2, 36);
        f16222d = Integer.toString(3, 36);
        f16223e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f16219a, spanned.getSpanStart(obj));
        bundle2.putInt(f16220b, spanned.getSpanEnd(obj));
        bundle2.putInt(f16221c, spanned.getSpanFlags(obj));
        bundle2.putInt(f16222d, i10);
        if (bundle != null) {
            bundle2.putBundle(f16223e, bundle);
        }
        return bundle2;
    }
}
