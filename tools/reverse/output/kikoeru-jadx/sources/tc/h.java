package tc;

import hd.q0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h extends w implements f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f20646f;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(Constructor constructor, Object obj, int i10) {
        this.f20645e = i10;
        switch (i10) {
            case 1:
                Class declaringClass = constructor.getDeclaringClass();
                jc.l.d(declaringClass, "getDeclaringClass(...)");
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                jc.l.d(genericParameterTypes, "getGenericParameterTypes(...)");
                super(constructor, declaringClass, null, genericParameterTypes);
                this.f20646f = obj;
                break;
            default:
                Class declaringClass2 = constructor.getDeclaringClass();
                jc.l.d(declaringClass2, "getDeclaringClass(...)");
                Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
                jc.l.d(genericParameterTypes2, "getGenericParameterTypes(...)");
                super(constructor, declaringClass2, null, (Type[]) (genericParameterTypes2.length <= 2 ? new Type[0] : vb.l.o0(1, genericParameterTypes2.length - 1, genericParameterTypes2)));
                this.f20646f = obj;
                break;
        }
    }

    @Override // tc.g
    public final Object d(Object[] objArr) {
        switch (this.f20645e) {
            case 0:
                jc.l.e(objArr, "args");
                e(objArr);
                Constructor constructor = (Constructor) this.f20659a;
                q0 q0Var = new q0(3);
                q0Var.f(this.f20646f);
                q0Var.i(objArr);
                q0Var.f(null);
                ArrayList arrayList = q0Var.f8447b;
                return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                jc.l.e(objArr, "args");
                e(objArr);
                Constructor constructor2 = (Constructor) this.f20659a;
                q0 q0Var2 = new q0(2);
                q0Var2.f(this.f20646f);
                q0Var2.i(objArr);
                ArrayList arrayList2 = q0Var2.f8447b;
                return constructor2.newInstance(arrayList2.toArray(new Object[arrayList2.size()]));
        }
    }
}
