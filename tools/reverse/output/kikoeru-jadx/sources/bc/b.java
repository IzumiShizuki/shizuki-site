package bc;

import a0.c;
import java.io.Serializable;
import vb.d;
import vb.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends d implements a, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Enum[] f2539a;

    public b(Enum[] enumArr) {
        this.f2539a = enumArr;
    }

    @Override // vb.a
    public final int a() {
        return this.f2539a.length;
    }

    @Override // vb.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r42 = (Enum) obj;
        return ((Enum) l.z0(r42.ordinal(), this.f2539a)) == r42;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Enum[] enumArr = this.f2539a;
        int length = enumArr.length;
        if (i10 < 0 || i10 >= length) {
            throw new IndexOutOfBoundsException(c.I("index: ", i10, length, ", size: "));
        }
        return enumArr[i10];
    }

    @Override // vb.d, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r42 = (Enum) obj;
        int iOrdinal = r42.ordinal();
        if (((Enum) l.z0(iOrdinal, this.f2539a)) == r42) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // vb.d, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r42 = (Enum) obj;
        int iOrdinal = r42.ordinal();
        if (((Enum) l.z0(iOrdinal, this.f2539a)) == r42) {
            return iOrdinal;
        }
        return -1;
    }
}
