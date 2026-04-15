package tc;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y extends z {
    @Override // tc.g
    public final Object d(Object[] objArr) {
        jc.l.e(objArr, "args");
        e(objArr);
        Object obj = objArr[0];
        Object[] objArrO0 = objArr.length <= 1 ? new Object[0] : vb.l.o0(1, objArr.length, objArr);
        return this.f20664a.invoke(obj, Arrays.copyOf(objArrO0, objArrO0.length));
    }
}
