package m4;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f14649a;

    static {
        int i10 = p4.c0.f16548a;
        f14649a = Integer.toString(0, 36);
    }

    public static z0 a(Bundle bundle) {
        String str = f14649a;
        int i10 = bundle.getInt(str, -1);
        if (i10 == 0) {
            String str2 = s.f14574d;
            p4.c.c(bundle.getInt(str, -1) == 0);
            return bundle.getBoolean(s.f14574d, false) ? new s(bundle.getBoolean(s.f14575e, false)) : new s();
        }
        if (i10 == 1) {
            String str3 = q0.f14557c;
            p4.c.c(bundle.getInt(str, -1) == 1);
            float f10 = bundle.getFloat(q0.f14557c, -1.0f);
            return f10 == -1.0f ? new q0() : new q0(f10);
        }
        if (i10 != 2) {
            if (i10 != 3) {
                throw new IllegalArgumentException(q.t0.B(i10, "Unknown RatingType: "));
            }
            String str4 = c1.f14154d;
            p4.c.c(bundle.getInt(str, -1) == 3);
            return bundle.getBoolean(c1.f14154d, false) ? new c1(bundle.getBoolean(c1.f14155e, false)) : new c1();
        }
        String str5 = a1.f14117d;
        p4.c.c(bundle.getInt(str, -1) == 2);
        int i11 = bundle.getInt(a1.f14117d, 5);
        float f11 = bundle.getFloat(a1.f14118e, -1.0f);
        return f11 == -1.0f ? new a1(i11) : new a1(f11, i11);
    }

    public abstract boolean b();

    public abstract Bundle c();
}
