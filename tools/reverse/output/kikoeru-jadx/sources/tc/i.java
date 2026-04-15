package tc;

import hd.q0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20647e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Member member, Type type, Class cls, Type[] typeArr, int i10) {
        super(member, type, cls, typeArr);
        this.f20647e = i10;
    }

    @Override // tc.g
    public final Object d(Object[] objArr) {
        switch (this.f20647e) {
            case 0:
                jc.l.e(objArr, "args");
                e(objArr);
                Constructor constructor = (Constructor) this.f20659a;
                q0 q0Var = new q0(2);
                q0Var.i(objArr);
                q0Var.f(null);
                ArrayList arrayList = q0Var.f8447b;
                return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                jc.l.e(objArr, "args");
                e(objArr);
                return ((Constructor) this.f20659a).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }
}
