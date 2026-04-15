package ed;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r extends w implements sd.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Constructor f6512a;

    public r(Constructor constructor) {
        jc.l.e(constructor, "member");
        this.f6512a = constructor;
    }

    @Override // ed.w
    public final Member b() {
        return this.f6512a;
    }

    @Override // sd.e
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f6512a.getTypeParameters();
        jc.l.d(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new c0(typeVariable));
        }
        return arrayList;
    }
}
