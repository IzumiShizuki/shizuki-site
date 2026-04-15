package d4;

import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import pe.d;
import wb.e;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f5473d;

    public c() {
        if (d.f17110b == null) {
            d.f17110b = new d(21);
        }
    }

    public int a(int i10) {
        if (i10 < this.f5472c) {
            return ((ByteBuffer) this.f5473d).getShort(this.f5471b + i10);
        }
        return 0;
    }

    public void b() {
        if (((e) this.f5473d).f23481h != this.f5472c) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        while (true) {
            int i10 = this.f5470a;
            e eVar = (e) this.f5473d;
            if (i10 >= eVar.f23479f || eVar.f23476c[i10] >= 0) {
                return;
            } else {
                this.f5470a = i10 + 1;
            }
        }
    }

    public boolean hasNext() {
        return this.f5470a < ((e) this.f5473d).f23479f;
    }

    public void remove() {
        e eVar = (e) this.f5473d;
        b();
        if (this.f5471b == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        eVar.c();
        eVar.n(this.f5471b);
        this.f5471b = -1;
        this.f5472c = eVar.f23481h;
    }
}
