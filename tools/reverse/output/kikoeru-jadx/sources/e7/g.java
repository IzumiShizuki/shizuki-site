package e7;

import android.content.Context;
import android.content.res.Resources;
import androidx.lifecycle.w0;
import b0.w1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static String a(c4.n nVar, int i10) {
        jc.l.e(nVar, "context");
        if (i10 <= 16777215) {
            return String.valueOf(i10);
        }
        try {
            Context context = nVar.f3388a;
            jc.l.b(context);
            String resourceName = context.getResources().getResourceName(i10);
            jc.l.b(resourceName);
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i10);
        }
    }

    public static df.k b(u uVar) {
        jc.l.e(uVar, "<this>");
        return df.m.b0(uVar, new d9.i(16));
    }

    public static m c(w0 w0Var) {
        i4.c cVar = n.f6364a;
        i4.a aVar = i4.a.f9001b;
        jc.l.e(cVar, "factory");
        jc.l.e(aVar, "extras");
        w1 w1Var = new w1(w0Var, cVar, aVar);
        pc.c cVarB = jc.z.f10839a.b(m.class);
        String strX = cVarB.x();
        if (strX != null) {
            return (m) w1Var.R("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strX), cVarB);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public static String d(Class cls) {
        LinkedHashMap linkedHashMap = n0.f6365b;
        String strValue = (String) linkedHashMap.get(cls);
        if (strValue == null) {
            l0 l0Var = (l0) cls.getAnnotation(l0.class);
            strValue = l0Var != null ? l0Var.value() : null;
            if (strValue == null || strValue.length() <= 0) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
            }
            linkedHashMap.put(cls, strValue);
        }
        jc.l.b(strValue);
        return strValue;
    }

    public static final ArrayList e(Map map, ic.k kVar) {
        jc.l.e(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            h hVar = (h) entry.getValue();
            Boolean bool = hVar != null ? Boolean.FALSE : null;
            jc.l.b(bool);
            if (!bool.booleanValue() && !hVar.f6328b) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) kVar.a((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final e7.f f(java.lang.String r4, ic.k r5) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.g.f(java.lang.String, ic.k):e7.f");
    }
}
