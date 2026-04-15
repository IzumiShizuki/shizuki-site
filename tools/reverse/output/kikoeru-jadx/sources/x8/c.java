package x8;

import android.graphics.drawable.Drawable;
import ce.j0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s8.c f24837a = new s8.c();

    public static final boolean a(s8.i iVar) {
        int iOrdinal = iVar.f19618e.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1) {
            return true;
        }
        if (iOrdinal == 2) {
            return iVar.E.f19578a == null && (iVar.f19635v instanceof t8.c);
        }
        throw new j0();
    }

    public static final Drawable b(s8.i iVar, Drawable drawable, Integer num) {
        if (drawable == null) {
            drawable = null;
            if (num != null) {
                if (num.intValue() == 0) {
                    return null;
                }
                return ua.j.l(iVar.f19614a, num.intValue());
            }
        }
        return drawable;
    }
}
