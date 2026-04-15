package c1;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import jc.c0;
import pc.f0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class f extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f3220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f3221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3223g;

    public f(e eVar, n[] nVarArr) {
        super(eVar.f3216c, nVarArr);
        this.f3220d = eVar;
        this.f3223g = eVar.f3218e;
    }

    public final void c(int i10, m mVar, Object obj, int i11) {
        int i12 = i11 * 5;
        n[] nVarArr = this.f3211a;
        if (i12 <= 30) {
            int iJ = 1 << f0.J(i10, i12);
            if (mVar.h(iJ)) {
                nVarArr[i11].a(Integer.bitCount(mVar.f3233a) * 2, mVar.f(iJ), mVar.f3236d);
                this.f3212b = i11;
                return;
            }
            int iT = mVar.t(iJ);
            m mVarS = mVar.s(iT);
            nVarArr[i11].a(Integer.bitCount(mVar.f3233a) * 2, iT, mVar.f3236d);
            c(i10, mVarS, obj, i11 + 1);
            return;
        }
        n nVar = nVarArr[i11];
        Object[] objArr = mVar.f3236d;
        nVar.a(objArr.length, 0, objArr);
        while (true) {
            n nVar2 = nVarArr[i11];
            if (jc.l.a(nVar2.f3237a[nVar2.f3239c], obj)) {
                this.f3212b = i11;
                return;
            } else {
                nVarArr[i11].f3239c += 2;
            }
        }
    }

    @Override // c1.d, java.util.Iterator
    public final Object next() {
        if (this.f3220d.f3218e != this.f3223g) {
            throw new ConcurrentModificationException();
        }
        if (!this.f3213c) {
            throw new NoSuchElementException();
        }
        n nVar = this.f3211a[this.f3212b];
        this.f3221e = nVar.f3237a[nVar.f3239c];
        this.f3222f = true;
        return super.next();
    }

    @Override // c1.d, java.util.Iterator
    public final void remove() {
        if (!this.f3222f) {
            throw new IllegalStateException();
        }
        boolean z10 = this.f3213c;
        e eVar = this.f3220d;
        if (!z10) {
            c0.a(eVar).remove(this.f3221e);
        } else {
            if (!z10) {
                throw new NoSuchElementException();
            }
            n nVar = this.f3211a[this.f3212b];
            Object obj = nVar.f3237a[nVar.f3239c];
            c0.a(eVar).remove(this.f3221e);
            c(obj != null ? obj.hashCode() : 0, eVar.f3216c, obj, 0);
        }
        this.f3221e = null;
        this.f3222f = false;
        this.f3223g = eVar.f3218e;
    }
}
