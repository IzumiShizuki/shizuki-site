package ed;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q extends b0 implements sd.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f6510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f6511b;

    public q(Type type) {
        s oVar;
        jc.l.e(type, "reflectType");
        this.f6510a = type;
        if (type instanceof Class) {
            oVar = new o((Class) type);
        } else if (type instanceof TypeVariable) {
            oVar = new c0((TypeVariable) type);
        } else {
            if (!(type instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + type.getClass() + "): " + type);
            }
            Type rawType = ((ParameterizedType) type).getRawType();
            jc.l.c(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            oVar = new o((Class) rawType);
        }
        this.f6511b = oVar;
    }

    @Override // ed.b0, sd.b
    public final e a(be.c cVar) {
        jc.l.e(cVar, "fqName");
        return null;
    }

    @Override // ed.b0
    public final Type b() {
        return this.f6510a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList c() {
        /*
            r6 = this;
            java.lang.reflect.Type r0 = r6.f6510a
            java.util.List r0 = ed.d.c(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = vb.n.K(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L68
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            java.lang.String r3 = "type"
            jc.l.e(r2, r3)
            boolean r3 = r2 instanceof java.lang.Class
            if (r3 == 0) goto L3b
            r4 = r2
            java.lang.Class r4 = (java.lang.Class) r4
            boolean r5 = r4.isPrimitive()
            if (r5 == 0) goto L3b
            ed.z r2 = new ed.z
            r2.<init>(r4)
            goto L64
        L3b:
            boolean r4 = r2 instanceof java.lang.reflect.GenericArrayType
            if (r4 != 0) goto L5e
            if (r3 == 0) goto L4b
            r3 = r2
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r3 = r3.isArray()
            if (r3 == 0) goto L4b
            goto L5e
        L4b:
            boolean r3 = r2 instanceof java.lang.reflect.WildcardType
            if (r3 == 0) goto L58
            ed.e0 r3 = new ed.e0
            java.lang.reflect.WildcardType r2 = (java.lang.reflect.WildcardType) r2
            r3.<init>(r2)
        L56:
            r2 = r3
            goto L64
        L58:
            ed.q r3 = new ed.q
            r3.<init>(r2)
            goto L56
        L5e:
            ed.i r3 = new ed.i
            r3.<init>(r2)
            goto L56
        L64:
            r1.add(r2)
            goto L17
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ed.q.c():java.util.ArrayList");
    }

    public final boolean d() {
        Type type = this.f6510a;
        if (type instanceof Class) {
            TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
            jc.l.d(typeParameters, "getTypeParameters(...)");
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // sd.b
    public final Collection getAnnotations() {
        return vb.r.f22819a;
    }
}
