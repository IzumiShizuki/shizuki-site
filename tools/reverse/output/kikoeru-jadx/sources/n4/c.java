package n4;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f15262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f15263b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f15264c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15265d;

    public c(i0 i0Var) {
        this.f15262a = i0Var;
        d dVar = d.f15266e;
        this.f15265d = false;
    }

    public final void a() {
        ArrayList arrayList = this.f15263b;
        arrayList.clear();
        this.f15265d = false;
        int i10 = 0;
        while (true) {
            i0 i0Var = this.f15262a;
            if (i10 >= i0Var.size()) {
                break;
            }
            f fVar = (f) i0Var.get(i10);
            fVar.flush();
            if (fVar.b()) {
                arrayList.add(fVar);
            }
            i10++;
        }
        this.f15264c = new ByteBuffer[arrayList.size()];
        for (int i11 = 0; i11 <= b(); i11++) {
            this.f15264c[i11] = ((f) arrayList.get(i11)).a();
        }
    }

    public final int b() {
        return this.f15264c.length - 1;
    }

    public final boolean c() {
        return this.f15265d && ((f) this.f15263b.get(b())).f() && !this.f15264c[b()].hasRemaining();
    }

    public final boolean d() {
        return !this.f15263b.isEmpty();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z10;
        for (boolean z11 = true; z11; z11 = z10) {
            z10 = false;
            int i10 = 0;
            while (i10 <= b()) {
                if (!this.f15264c[i10].hasRemaining()) {
                    ArrayList arrayList = this.f15263b;
                    f fVar = (f) arrayList.get(i10);
                    if (!fVar.f()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.f15264c[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : f.f15271a;
                        long jRemaining = byteBuffer2.remaining();
                        fVar.c(byteBuffer2);
                        this.f15264c[i10] = fVar.a();
                        z10 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f15264c[i10].hasRemaining();
                    } else if (!this.f15264c[i10].hasRemaining() && i10 < b()) {
                        ((f) arrayList.get(i10 + 1)).e();
                    }
                }
                i10++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        i0 i0Var = ((c) obj).f15262a;
        i0 i0Var2 = this.f15262a;
        if (i0Var2.size() != i0Var.size()) {
            return false;
        }
        for (int i10 = 0; i10 < i0Var2.size(); i10++) {
            if (i0Var2.get(i10) != i0Var.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f15262a.hashCode();
    }
}
