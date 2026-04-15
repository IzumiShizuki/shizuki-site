package e;

import d.m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import pc.f0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h extends f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f6025b;

    public h(a aVar) {
        this.f6025b = aVar;
    }

    public final void W(Object obj) throws Exception {
        g.c cVar = this.f6025b.f6013a;
        if (cVar == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
        m mVar = cVar.f7108b;
        LinkedHashMap linkedHashMap = mVar.f5229b;
        ArrayList arrayList = mVar.f5231d;
        String str = cVar.f7109c;
        Object obj2 = linkedHashMap.get(str);
        a.a aVar = cVar.f7110d;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int iIntValue = ((Number) obj2).intValue();
        arrayList.add(str);
        try {
            mVar.b(iIntValue, aVar, obj);
        } catch (Exception e10) {
            arrayList.remove(str);
            throw e10;
        }
    }
}
