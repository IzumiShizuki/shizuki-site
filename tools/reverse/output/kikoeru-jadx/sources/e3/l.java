package e3;

import java.util.ArrayList;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f6082b = new l(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f6083c = new l(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f6084d = new l(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6085a;

    public l(int i10) {
        this.f6085a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return this.f6085a == ((l) obj).f6085a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6085a;
    }

    public final String toString() {
        int i10 = this.f6085a;
        if (i10 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i10 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i10 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return t0.E(new StringBuilder("TextDecoration["), h3.a.b(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
