package m4;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u0 f14591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f14592c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f14593a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        p4.c.i(!false);
        f14591b = new u0(new o(sparseBooleanArray));
        int i10 = p4.c0.f16548a;
        f14592c = Integer.toString(0, 36);
    }

    public u0(o oVar) {
        this.f14593a = oVar;
    }

    public static u0 b(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f14592c);
        if (integerArrayList == null) {
            return f14591b;
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i10 = 0; i10 < integerArrayList.size(); i10++) {
            int iIntValue = integerArrayList.get(i10).intValue();
            p4.c.i(!false);
            sparseBooleanArray.append(iIntValue, true);
        }
        p4.c.i(!false);
        return new u0(new o(sparseBooleanArray));
    }

    public final boolean a(int i10) {
        return this.f14593a.f14437a.get(i10);
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            o oVar = this.f14593a;
            if (i10 >= oVar.f14437a.size()) {
                bundle.putIntegerArrayList(f14592c, arrayList);
                return bundle;
            }
            arrayList.add(Integer.valueOf(oVar.b(i10)));
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u0) {
            return this.f14593a.equals(((u0) obj).f14593a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14593a.hashCode();
    }
}
