package u3;

import android.os.Build;
import android.view.DisplayCutout;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayCutout f21275a;

    public c(DisplayCutout displayCutout) {
        this.f21275a = displayCutout;
    }

    public final p3.b a() {
        return Build.VERSION.SDK_INT >= 30 ? p3.b.c(m2.c.c(this.f21275a)) : p3.b.f16524e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f21275a, ((c) obj).f21275a);
    }

    public final int hashCode() {
        return this.f21275a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f21275a + "}";
    }
}
