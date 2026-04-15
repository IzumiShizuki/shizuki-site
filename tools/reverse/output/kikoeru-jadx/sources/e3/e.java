package e3;

import com.tencent.bugly.beta.tinker.TinkerReport;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f6068b = 66305;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6069a;

    public static String a(int i10) {
        StringBuilder sb = new StringBuilder("LineBreak(strategy=");
        int i11 = i10 & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK;
        String str = "Invalid";
        sb.append((Object) (i11 == 1 ? "Strategy.Simple" : i11 == 2 ? "Strategy.HighQuality" : i11 == 3 ? "Strategy.Balanced" : i11 == 0 ? "Strategy.Unspecified" : "Invalid"));
        sb.append(", strictness=");
        int i12 = (i10 >> 8) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK;
        sb.append((Object) (i12 == 1 ? "Strictness.None" : i12 == 2 ? "Strictness.Loose" : i12 == 3 ? "Strictness.Normal" : i12 == 4 ? "Strictness.Strict" : i12 == 0 ? "Strictness.Unspecified" : "Invalid"));
        sb.append(", wordBreak=");
        int i13 = (i10 >> 16) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK;
        if (i13 == 1) {
            str = "WordBreak.None";
        } else if (i13 == 2) {
            str = "WordBreak.Phrase";
        } else if (i13 == 0) {
            str = "WordBreak.Unspecified";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f6069a == ((e) obj).f6069a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6069a;
    }

    public final String toString() {
        return a(this.f6069a);
    }
}
