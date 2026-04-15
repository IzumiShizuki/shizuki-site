package d;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lf.b1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements w7.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5209b;

    public /* synthetic */ h(int i10, Object obj) {
        this.f5208a = i10;
        this.f5209b = obj;
    }

    @Override // w7.d
    public final Bundle a() {
        ub.k[] kVarArr;
        switch (this.f5208a) {
            case 0:
                n nVar = (n) this.f5209b;
                Bundle bundle = new Bundle();
                m mVar = nVar.f5244h;
                mVar.getClass();
                LinkedHashMap linkedHashMap = mVar.f5229b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(mVar.f5231d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(mVar.f5234g));
                return bundle;
            case 1:
                ch.l lVar = (ch.l) this.f5209b;
                for (Map.Entry entry : vb.w.B((LinkedHashMap) lVar.f4204e).entrySet()) {
                    lVar.A(((b1) ((lf.i0) entry.getValue())).getValue(), (String) entry.getKey());
                }
                for (Map.Entry entry2 : vb.w.B((LinkedHashMap) lVar.f4202c).entrySet()) {
                    lVar.A(((w7.d) entry2.getValue()).a(), (String) entry2.getKey());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) lVar.f4201b;
                if (linkedHashMap2.isEmpty()) {
                    kVarArr = new ub.k[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                        arrayList.add(new ub.k((String) entry3.getKey(), entry3.getValue()));
                    }
                    kVarArr = (ub.k[]) arrayList.toArray(new ub.k[0]);
                }
                return n7.d.c((ub.k[]) Arrays.copyOf(kVarArr, kVarArr.length));
            default:
                Map mapC = ((g1.h) this.f5209b).c();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry4 : mapC.entrySet()) {
                    String str = (String) entry4.getKey();
                    List list = (List) entry4.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
        }
    }
}
