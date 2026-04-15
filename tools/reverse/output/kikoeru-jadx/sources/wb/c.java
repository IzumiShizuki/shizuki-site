package wb;

import java.util.Iterator;
import java.util.NoSuchElementException;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends d4.c implements Iterator, kc.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f23469e;

    public c(e eVar, int i10) {
        this.f23469e = i10;
        l.e(eVar, "map");
        this.f5473d = eVar;
        this.f5471b = -1;
        this.f5472c = eVar.f23481h;
        c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f23469e) {
            case 0:
                b();
                int i10 = this.f5470a;
                e eVar = (e) this.f5473d;
                if (i10 >= eVar.f23479f) {
                    throw new NoSuchElementException();
                }
                this.f5470a = i10 + 1;
                this.f5471b = i10;
                d dVar = new d(eVar, i10);
                c();
                return dVar;
            case 1:
                b();
                int i11 = this.f5470a;
                e eVar2 = (e) this.f5473d;
                if (i11 >= eVar2.f23479f) {
                    throw new NoSuchElementException();
                }
                this.f5470a = i11 + 1;
                this.f5471b = i11;
                Object obj = eVar2.f23474a[i11];
                c();
                return obj;
            default:
                b();
                int i12 = this.f5470a;
                e eVar3 = (e) this.f5473d;
                if (i12 >= eVar3.f23479f) {
                    throw new NoSuchElementException();
                }
                this.f5470a = i12 + 1;
                this.f5471b = i12;
                Object[] objArr = eVar3.f23475b;
                l.b(objArr);
                Object obj2 = objArr[this.f5471b];
                c();
                return obj2;
        }
    }
}
