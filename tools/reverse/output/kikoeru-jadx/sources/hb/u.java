package hb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class u extends eb.z {
    @Override // eb.z
    public final Object a(mb.a aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        aVar.b();
        while (aVar.y()) {
            try {
                arrayList.add(Integer.valueOf(aVar.O()));
            } catch (NumberFormatException e10) {
                throw new eb.t(e10);
            }
        }
        aVar.n();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // eb.z
    public final void b(mb.b bVar, Object obj) throws IOException {
        bVar.g();
        int length = ((AtomicIntegerArray) obj).length();
        for (int i10 = 0; i10 < length; i10++) {
            bVar.R(r6.get(i10));
        }
        bVar.n();
    }
}
