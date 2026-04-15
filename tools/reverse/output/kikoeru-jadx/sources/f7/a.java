package f7;

import androidx.lifecycle.j0;
import androidx.lifecycle.s0;
import b0.c1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import lf.b1;
import lf.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6756b = "SaveableStateHolder_BackStackEntryKey";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c1 f6758d;

    public a(j0 j0Var) {
        Object value;
        j0Var.getClass();
        ch.l lVar = j0Var.f777b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) lVar.f4201b;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) lVar.f4204e;
        try {
            i0 i0Var = (i0) linkedHashMap2.get("SaveableStateHolder_BackStackEntryKey");
            if (i0Var == null || (value = ((b1) i0Var).getValue()) == null) {
                value = linkedHashMap.get("SaveableStateHolder_BackStackEntryKey");
            }
        } catch (ClassCastException unused) {
            linkedHashMap.remove("SaveableStateHolder_BackStackEntryKey");
            ((LinkedHashMap) lVar.f4203d).remove("SaveableStateHolder_BackStackEntryKey");
            linkedHashMap2.remove("SaveableStateHolder_BackStackEntryKey");
            value = null;
        }
        String string = (String) value;
        if (string == null) {
            string = UUID.randomUUID().toString();
            String str = this.f6756b;
            jc.l.e(str, "key");
            if (string != null) {
                ArrayList arrayList = h4.a.f8115a;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((Class) it.next()).isInstance(string)) {
                        }
                    }
                }
                throw new IllegalArgumentException(("Can't put value with type " + string.getClass() + " into saved state").toString());
            }
            ArrayList arrayList2 = h4.a.f8115a;
            j0Var.f776a.get(str);
            lVar.A(string, str);
        }
        this.f6757c = string;
    }

    @Override // androidx.lifecycle.s0
    public final void v() {
        c1 c1Var = this.f6758d;
        if (c1Var == null) {
            jc.l.k("saveableStateHolderRef");
            throw null;
        }
        g1.c cVar = (g1.c) ((WeakReference) c1Var.f1208b).get();
        if (cVar != null) {
            cVar.e(this.f6757c);
        }
        c1 c1Var2 = this.f6758d;
        if (c1Var2 != null) {
            ((WeakReference) c1Var2.f1208b).clear();
        } else {
            jc.l.k("saveableStateHolderRef");
            throw null;
        }
    }
}
