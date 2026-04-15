package ye;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f26212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26213b;

    @Override // ye.a
    public final int a() {
        return this.f26213b;
    }

    @Override // ye.a
    public final Object get(int i10) {
        return vb.l.z0(i10, this.f26212a);
    }

    @Override // ye.a
    public final void i(int i10, se.g gVar) {
        Object[] objArr = this.f26212a;
        if (objArr.length <= i10) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i10);
            Object[] objArrCopyOf = Arrays.copyOf(this.f26212a, length);
            jc.l.d(objArrCopyOf, "copyOf(...)");
            this.f26212a = objArrCopyOf;
        }
        Object[] objArr2 = this.f26212a;
        if (objArr2[i10] == null) {
            this.f26213b++;
        }
        objArr2[i10] = gVar;
    }

    @Override // ye.a, java.lang.Iterable
    public final Iterator iterator() {
        return new b(this);
    }
}
