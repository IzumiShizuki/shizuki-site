package sc;

import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z0 implements Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type[] f19921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19922b;

    public z0(Type[] typeArr) {
        jc.l.e(typeArr, "types");
        this.f19921a = typeArr;
        this.f19922b = Arrays.hashCode(typeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z0) {
            return Arrays.equals(this.f19921a, ((z0) obj).f19921a);
        }
        return false;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return vb.l.D0(this.f19921a, ", ", "[", "]", null, 56);
    }

    public final int hashCode() {
        return this.f19922b;
    }

    public final String toString() {
        return getTypeName();
    }
}
