package sf;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20013a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List list, String str, b bVar) {
        super(str, bVar);
        jc.l.e(list, "missingFields");
        this.f20013a = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(String str, ArrayList arrayList) {
        String str2;
        jc.l.e(str, "serialName");
        if (arrayList.size() == 1) {
            str2 = "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + str + "', but it was missing";
        } else {
            str2 = "Fields " + arrayList + " are required for type with serial name '" + str + "', but they were missing";
        }
        this(arrayList, str2, null);
    }
}
