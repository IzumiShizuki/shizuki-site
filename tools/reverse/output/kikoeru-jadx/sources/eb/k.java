package eb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f6455b;

    public /* synthetic */ k(z zVar, int i10) {
        this.f6454a = i10;
        this.f6455b = zVar;
    }

    @Override // eb.z
    public final Object a(mb.a aVar) throws IOException {
        switch (this.f6454a) {
            case 0:
                return new AtomicLong(((Number) this.f6455b.a(aVar)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.b();
                while (aVar.y()) {
                    arrayList.add(Long.valueOf(((Number) this.f6455b.a(aVar)).longValue()));
                }
                aVar.n();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
                }
                return atomicLongArray;
            default:
                if (aVar.h0() != 9) {
                    return this.f6455b.a(aVar);
                }
                aVar.c0();
                return null;
        }
    }

    @Override // eb.z
    public final void b(mb.b bVar, Object obj) throws IOException {
        switch (this.f6454a) {
            case 0:
                this.f6455b.b(bVar, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                bVar.g();
                int length = atomicLongArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    this.f6455b.b(bVar, Long.valueOf(atomicLongArray.get(i10)));
                }
                bVar.n();
                break;
            default:
                if (obj == null) {
                    bVar.y();
                } else {
                    this.f6455b.b(bVar, obj);
                }
                break;
        }
    }
}
