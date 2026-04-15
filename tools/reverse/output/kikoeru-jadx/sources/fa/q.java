package fa;

import b0.l1;
import hf.a0;
import hf.y;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import sc.v1;
import sc.z1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7029a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f7032d;

    public q(y yVar, int i10, j9.f fVar) {
        j9.u uVar = j9.u.f10753a;
        this.f7031c = yVar;
        this.f7030b = i10;
        this.f7032d = fVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ub.h] */
    @Override // ic.a
    public final Object b() {
        Type type;
        int i10 = this.f7029a;
        ?? r22 = this.f7032d;
        int i11 = this.f7030b;
        Object obj = this.f7031c;
        switch (i10) {
            case 0:
                j9.u uVar = j9.u.f10753a;
                a0.y((y) obj, null, null, new l1(i11, (j9.f) r22, (yb.c) null), 3);
                return ub.a0.f21526a;
            default:
                v1 v1Var = (v1) obj;
                z1 z1Var = v1Var.f19894c;
                Type type2 = z1Var != null ? (Type) z1Var.b() : null;
                if (type2 instanceof Class) {
                    Class cls = (Class) type2;
                    Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                    jc.l.b(componentType);
                    return componentType;
                }
                if (type2 instanceof GenericArrayType) {
                    if (i11 == 0) {
                        Type genericComponentType = ((GenericArrayType) type2).getGenericComponentType();
                        jc.l.b(genericComponentType);
                        return genericComponentType;
                    }
                    throw new hc.a("Array type has been queried for a non-0th argument: " + v1Var);
                }
                if (!(type2 instanceof ParameterizedType)) {
                    throw new hc.a("Non-generic type has been queried for arguments: " + v1Var);
                }
                Type type3 = (Type) ((List) r22.getValue()).get(i11);
                if (!(type3 instanceof WildcardType)) {
                    return type3;
                }
                WildcardType wildcardType = (WildcardType) type3;
                Type[] lowerBounds = wildcardType.getLowerBounds();
                jc.l.d(lowerBounds, "getLowerBounds(...)");
                Type type4 = (Type) vb.l.v0(lowerBounds);
                if (type4 == null) {
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    jc.l.d(upperBounds, "getUpperBounds(...)");
                    type = (Type) vb.l.u0(upperBounds);
                } else {
                    type = type4;
                }
                jc.l.b(type);
                return type;
        }
    }

    public q(v1 v1Var, int i10, ub.h hVar) {
        this.f7031c = v1Var;
        this.f7030b = i10;
        this.f7032d = hVar;
    }
}
