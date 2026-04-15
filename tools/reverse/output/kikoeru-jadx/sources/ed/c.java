package ed;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f6481b = new c(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f6482c = new c(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f6483d = new c(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f6484e = new c(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6485a;

    public /* synthetic */ c(int i10) {
        this.f6485a = i10;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f6485a) {
            case 0:
                ParameterizedType parameterizedType = (ParameterizedType) obj;
                List list = d.f6487a;
                jc.l.e(parameterizedType, "it");
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
            case 1:
                ParameterizedType parameterizedType2 = (ParameterizedType) obj;
                List list2 = d.f6487a;
                jc.l.e(parameterizedType2, "it");
                Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                jc.l.d(actualTypeArguments, "getActualTypeArguments(...)");
                return vb.l.d0(actualTypeArguments);
            case 2:
                return Boolean.valueOf(((Class) obj).getSimpleName().length() == 0);
            default:
                String simpleName = ((Class) obj).getSimpleName();
                if (!be.e.f(simpleName)) {
                    simpleName = null;
                }
                if (simpleName != null) {
                    return be.e.e(simpleName);
                }
                return null;
        }
    }
}
