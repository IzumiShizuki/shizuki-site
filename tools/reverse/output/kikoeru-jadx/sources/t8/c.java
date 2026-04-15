package t8;

import android.content.Context;
import android.util.DisplayMetrics;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20554a;

    public c(Context context) {
        this.f20554a = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return l.a(this.f20554a, ((c) obj).f20554a);
        }
        return false;
    }

    @Override // t8.i
    public final Object h(h8.f fVar) {
        DisplayMetrics displayMetrics = this.f20554a.getResources().getDisplayMetrics();
        a aVar = new a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new h(aVar, aVar);
    }

    public final int hashCode() {
        return this.f20554a.hashCode();
    }
}
