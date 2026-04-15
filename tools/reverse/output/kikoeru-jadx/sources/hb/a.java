package hb;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class a implements eb.a0 {
    @Override // eb.a0
    public final eb.z a(eb.m mVar, lb.a aVar) {
        Type type = aVar.f12166b;
        boolean z10 = type instanceof GenericArrayType;
        if (!z10 && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        Type genericComponentType = z10 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
        return new b(mVar, mVar.c(new lb.a(genericComponentType)), gb.d.h(genericComponentType));
    }
}
