package g5;

import android.text.TextUtils;
import j2.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7428c;

    public t(String str, boolean z10, boolean z11) {
        this.f7426a = str;
        this.f7427b = z10;
        this.f7428c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == t.class) {
            t tVar = (t) obj;
            if (TextUtils.equals(this.f7426a, tVar.f7426a) && this.f7427b == tVar.f7427b && this.f7428c == tVar.f7428c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((h0.e(31, 31, this.f7426a) + (this.f7427b ? 1231 : 1237)) * 31) + (this.f7428c ? 1231 : 1237);
    }
}
