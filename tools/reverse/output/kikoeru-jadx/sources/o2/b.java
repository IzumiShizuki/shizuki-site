package o2;

import android.content.res.Resources;
import com.cnl.kikoeru.R;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources.Theme f16145a;

    public b(Resources.Theme theme) {
        this.f16145a = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && l.a(this.f16145a, ((b) obj).f16145a);
    }

    public final int hashCode() {
        return (this.f16145a.hashCode() * 31) + R.mipmap.icon;
    }

    public final String toString() {
        return "Key(theme=" + this.f16145a + ", id=2131361797)";
    }
}
