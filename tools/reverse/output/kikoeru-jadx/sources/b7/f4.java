package b7;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f4 f1776b = new f4(new HashSet());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f1777c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ya.m0 f1778a;

    static {
        int i10 = p4.c0.f16548a;
        f1777c = Integer.toString(0, 36);
    }

    public f4(HashSet hashSet) {
        this.f1778a = ya.m0.q(hashSet);
    }

    public static f4 a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f1777c);
        if (parcelableArrayList == null) {
            p4.c.B("SessionCommands", "Missing commands. Creating an empty SessionCommands");
            return f1776b;
        }
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
            hashSet.add(e4.a((Bundle) parcelableArrayList.get(i10)));
        }
        return new f4(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f4) {
            return this.f1778a.equals(((f4) obj).f1778a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1778a);
    }
}
