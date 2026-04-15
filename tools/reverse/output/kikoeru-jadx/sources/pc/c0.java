package pc;

import j2.h0;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sc.w1;
import sc.z1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements TypeVariable, Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f16968a;

    public c0(w wVar) {
        this.f16968a = wVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable) || !getName().equals(((TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    @Override // java.lang.reflect.TypeVariable
    public final Type[] getBounds() {
        z1 z1Var = ((w1) this.f16968a).f19907b;
        u uVar = w1.f19905d[0];
        Object objB = z1Var.b();
        jc.l.d(objB, "getValue(...)");
        List list = (List) objB;
        ArrayList arrayList = new ArrayList(vb.n.K(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(f0.q((v) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public final GenericDeclaration getGenericDeclaration() {
        throw new ub.j(h0.x("An operation is not implemented: ", "getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f16968a));
    }

    @Override // java.lang.reflect.TypeVariable
    public final String getName() {
        return ((w1) this.f16968a).c();
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return getName();
    }

    public final int hashCode() {
        getName();
        getGenericDeclaration();
        throw null;
    }

    public final String toString() {
        return getName();
    }
}
