package hb;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends eb.z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f8302c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f8303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f8304b;

    public b(eb.m mVar, eb.z zVar, Class cls) {
        this.f8304b = new j(mVar, zVar, cls);
        this.f8303a = cls;
    }

    @Override // eb.z
    public final Object a(mb.a aVar) throws IOException {
        if (aVar.h0() == 9) {
            aVar.c0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.b();
        while (aVar.y()) {
            arrayList.add(((eb.z) this.f8304b.f8319c).a(aVar));
        }
        aVar.n();
        int size = arrayList.size();
        Class cls = this.f8303a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(objNewInstance, i10, arrayList.get(i10));
        }
        return objNewInstance;
    }

    @Override // eb.z
    public final void b(mb.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.y();
            return;
        }
        bVar.g();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f8304b.b(bVar, Array.get(obj, i10));
        }
        bVar.n();
    }
}
