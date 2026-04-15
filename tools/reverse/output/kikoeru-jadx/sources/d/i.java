package d;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f5212a;

    public /* synthetic */ i(n nVar) {
        this.f5212a = nVar;
    }

    public final void a(Context context) {
        jc.l.e(context, "it");
        n nVar = this.f5212a;
        Bundle bundleP = ((v2.e) nVar.f5240d.f22365c).p("android:support:activity-result");
        if (bundleP != null) {
            m mVar = nVar.f5244h;
            LinkedHashMap linkedHashMap = mVar.f5229b;
            LinkedHashMap linkedHashMap2 = mVar.f5228a;
            Bundle bundle = mVar.f5234g;
            ArrayList<Integer> integerArrayList = bundleP.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleP.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleP.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                mVar.f5231d.addAll(stringArrayList2);
            }
            Bundle bundle2 = bundleP.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                String str = stringArrayList.get(i10);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        jc.c0.a(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i10);
                jc.l.d(num2, "get(...)");
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i10);
                jc.l.d(str2, "get(...)");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                mVar.f5229b.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }
}
