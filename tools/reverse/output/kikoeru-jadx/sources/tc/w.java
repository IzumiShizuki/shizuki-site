package tc;

import hd.q0;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class w implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Member f20659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f20660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f20661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f20662d;

    public w(Member member, Type type, Class cls, Type[] typeArr) {
        List listM0;
        this.f20659a = member;
        this.f20660b = type;
        this.f20661c = cls;
        if (cls != null) {
            q0 q0Var = new q0(2);
            ArrayList arrayList = q0Var.f8447b;
            q0Var.f(cls);
            q0Var.i(typeArr);
            listM0 = ud.b.x(arrayList.toArray(new Type[arrayList.size()]));
        } else {
            listM0 = vb.l.M0(typeArr);
        }
        this.f20662d = listM0;
    }

    @Override // tc.g
    public final List a() {
        return this.f20662d;
    }

    @Override // tc.g
    public final Member b() {
        return this.f20659a;
    }

    @Override // tc.g
    public final /* bridge */ boolean c() {
        return false;
    }

    public void e(Object[] objArr) {
        jc.l.e(objArr, "args");
        if (n7.d.q(this) == objArr.length) {
            return;
        }
        throw new IllegalArgumentException("Callable expects " + n7.d.q(this) + " arguments, but " + objArr.length + " were provided.");
    }

    public final void f(Object obj) {
        if (obj == null || !this.f20659a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // tc.g
    public final Type n() {
        return this.f20660b;
    }
}
