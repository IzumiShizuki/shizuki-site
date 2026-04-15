package hb;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements eb.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g5.w f8309b;

    public /* synthetic */ d(g5.w wVar, int i10) {
        this.f8308a = i10;
        this.f8309b = wVar;
    }

    @Override // eb.a0
    public final eb.z a(eb.m mVar, lb.a aVar) {
        Class cls;
        Type[] actualTypeArguments;
        int i10 = this.f8308a;
        g5.w wVar = this.f8309b;
        cls = Object.class;
        switch (i10) {
            case 0:
                Type type = aVar.f12166b;
                Class cls2 = aVar.f12165a;
                if (!Collection.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                gb.d.b(Collection.class.isAssignableFrom(cls2));
                Type typeJ = gb.d.j(type, cls2, gb.d.g(type, cls2, Collection.class), new HashMap());
                cls = typeJ instanceof ParameterizedType ? ((ParameterizedType) typeJ).getActualTypeArguments()[0] : Object.class;
                return new c(mVar, cls, mVar.c(new lb.a(cls)), wVar.u(aVar));
            default:
                Type type2 = aVar.f12166b;
                Class cls3 = aVar.f12165a;
                if (!Map.class.isAssignableFrom(cls3)) {
                    return null;
                }
                if (type2 == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type2 instanceof WildcardType) {
                        type2 = ((WildcardType) type2).getUpperBounds()[0];
                    }
                    gb.d.b(Map.class.isAssignableFrom(cls3));
                    Type typeJ2 = gb.d.j(type2, cls3, gb.d.g(type2, cls3, Map.class), new HashMap());
                    actualTypeArguments = typeJ2 instanceof ParameterizedType ? ((ParameterizedType) typeJ2).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                eb.z zVarC = (type3 == Boolean.TYPE || type3 == Boolean.class) ? a1.f8278c : mVar.c(new lb.a(type3));
                eb.z zVarC2 = mVar.c(new lb.a(actualTypeArguments[1]));
                gb.o oVarU = wVar.u(aVar);
                Type[] typeArr = actualTypeArguments;
                return new j(this, mVar, typeArr[0], zVarC, typeArr[1], zVarC2, oVarU);
        }
    }
}
