package q8;

import android.graphics.Bitmap;
import java.util.Map;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f17916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f17917b;

    public c(Bitmap bitmap, Map map) {
        this.f17916a = bitmap;
        this.f17917b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f17916a, cVar.f17916a) && l.a(this.f17917b, cVar.f17917b);
    }

    public final int hashCode() {
        return this.f17917b.hashCode() + (this.f17916a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(bitmap=" + this.f17916a + ", extras=" + this.f17917b + ')';
    }
}
