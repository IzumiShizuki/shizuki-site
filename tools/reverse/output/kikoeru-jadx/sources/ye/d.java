package ye;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import q.t0;
import se.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class d implements Iterable, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f26214a;

    public static String a(a aVar, int i10, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Race condition happened, the size of ArrayMap is " + i10 + " but it isn't an `" + str + '`');
        sb.append('\n');
        StringBuilder sb2 = new StringBuilder("Type: ");
        sb2.append(aVar.getClass());
        sb.append(sb2.toString());
        sb.append('\n');
        StringBuilder sb3 = new StringBuilder();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) h0.f19950b.f13782b;
        sb3.append("[\n");
        ArrayList arrayList = new ArrayList(vb.n.K(aVar, 10));
        int i11 = 0;
        for (Object obj : aVar) {
            int i12 = i11 + 1;
            Object obj2 = null;
            if (i11 < 0) {
                ud.b.H();
                throw null;
            }
            Iterator it = concurrentHashMap.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (((Number) ((Map.Entry) next).getValue()).intValue() == i11) {
                        obj2 = next;
                        break;
                    }
                }
            }
            sb3.append("  " + ((Map.Entry) obj2) + '[' + i11 + "]: " + obj);
            sb3.append('\n');
            arrayList.add(sb3);
            i11 = i12;
        }
        sb.append("Content: " + t0.E(sb3, "]", '\n'));
        sb.append('\n');
        return sb.toString();
    }

    public final boolean isEmpty() {
        return this.f26214a.a() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f26214a.iterator();
    }
}
