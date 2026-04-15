package ag;

import bg.d0;
import bg.g0;
import bg.j0;
import bg.n0;
import bg.o0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import jc.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f368b = new y(1);

    @Override // ic.k
    public final Object a(Object obj) {
        Object next;
        pc.c cVar;
        xf.h hVar = (xf.h) obj;
        jc.l.e(hVar, "$this$Json");
        hVar.f25002d = "type";
        ch.l lVar = new ch.l(12);
        a0 a0Var = jc.z.f10839a;
        pc.c cVarB = a0Var.b(o0.class);
        ArrayList<ub.k> arrayList = new ArrayList();
        arrayList.add(new ub.k(a0Var.b(n0.class), n7.e.B(jc.z.a(n0.class))));
        arrayList.add(new ub.k(a0Var.b(bg.z.class), n7.e.B(jc.z.a(bg.z.class))));
        arrayList.add(new ub.k(a0Var.b(j0.class), n7.e.B(jc.z.a(j0.class))));
        arrayList.add(new ub.k(a0Var.b(d0.class), n7.e.B(jc.z.a(d0.class))));
        arrayList.add(new ub.k(a0Var.b(g0.class), n7.e.B(jc.z.a(g0.class))));
        for (ub.k kVar : arrayList) {
            pc.c cVar2 = (pc.c) kVar.f21543a;
            sf.a aVar = (sf.a) kVar.f21544b;
            jc.l.c(cVar2, "null cannot be cast to non-null type kotlin.reflect.KClass<Base of kotlinx.serialization.modules.PolymorphicModuleBuilder>");
            jc.l.c(aVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            jc.l.e(cVarB, "baseClass");
            jc.l.e(cVar2, "concreteClass");
            jc.l.e(aVar, "concreteSerializer");
            String strM = aVar.a().m();
            HashMap map = (HashMap) lVar.f4202c;
            Object map2 = map.get(cVarB);
            if (map2 == null) {
                map2 = new HashMap();
                map.put(cVarB, map2);
            }
            Map map3 = (Map) map2;
            HashMap map4 = (HashMap) lVar.f4204e;
            Object map5 = map4.get(cVarB);
            if (map5 == null) {
                map5 = new HashMap();
                map4.put(cVarB, map5);
            }
            Map map6 = (Map) map5;
            sf.a aVar2 = (sf.a) map3.get(cVar2);
            if (aVar2 != null && !aVar2.equals(aVar)) {
                throw new ff.e(2, "Serializer for " + cVar2 + " already registered in the scope of " + cVarB);
            }
            sf.a aVar3 = (sf.a) map6.get(strM);
            if (aVar3 != null && !aVar3.equals(aVar)) {
                Iterator it = ((Iterable) vb.m.R(map3.entrySet()).f6001b).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((Map.Entry) next).getValue() == aVar3) {
                        break;
                    }
                }
                Map.Entry entry = (Map.Entry) next;
                if (entry == null || (cVar = (pc.c) entry.getKey()) == null) {
                    throw new IllegalStateException(("Name " + strM + " is registered in the module but no Kotlin class is associated with it.").toString());
                }
                throw new IllegalArgumentException("Multiple polymorphic serializers in a scope of '" + cVarB + "' have the same serial name '" + strM + "': " + aVar + " for '" + cVar2 + "' and " + aVar3 + " for '" + cVar + '\'');
            }
            map3.put(cVar2, aVar);
            map6.put(strM, aVar);
        }
        hVar.f25003e = new d0.y((HashMap) lVar.f4201b, (HashMap) lVar.f4202c, (HashMap) lVar.f4203d, (HashMap) lVar.f4204e, (HashMap) lVar.f4205f, false);
        hVar.f25000b = true;
        hVar.f25001c = true;
        return ub.a0.f21526a;
    }
}
