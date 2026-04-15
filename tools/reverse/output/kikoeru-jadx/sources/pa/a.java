package pa;

import android.content.Context;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f16960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16961c;

    public a(Context context, float f10) {
        l.e(context, "context");
        this.f16959a = context;
        this.f16960b = f10;
        double d10 = f10;
        if (0.0d > d10 || d10 > 25.0d) {
            throw new IllegalArgumentException("radius must be in [0, 25].");
        }
        this.f16961c = a.class.getName() + '-' + f10 + "-1.0";
    }
}
