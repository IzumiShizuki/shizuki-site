package n4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class g implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f15272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f15273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f15274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f15275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f15276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f15277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15278h;

    public g() {
        ByteBuffer byteBuffer = f.f15271a;
        this.f15276f = byteBuffer;
        this.f15277g = byteBuffer;
        d dVar = d.f15266e;
        this.f15274d = dVar;
        this.f15275e = dVar;
        this.f15272b = dVar;
        this.f15273c = dVar;
    }

    @Override // n4.f
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f15277g;
        this.f15277g = f.f15271a;
        return byteBuffer;
    }

    @Override // n4.f
    public boolean b() {
        return this.f15275e != d.f15266e;
    }

    @Override // n4.f
    public final d d(d dVar) {
        this.f15274d = dVar;
        this.f15275e = g(dVar);
        return b() ? this.f15275e : d.f15266e;
    }

    @Override // n4.f
    public final void e() {
        this.f15278h = true;
        i();
    }

    @Override // n4.f
    public boolean f() {
        return this.f15278h && this.f15277g == f.f15271a;
    }

    @Override // n4.f
    public final void flush() {
        this.f15277g = f.f15271a;
        this.f15278h = false;
        this.f15272b = this.f15274d;
        this.f15273c = this.f15275e;
        h();
    }

    public abstract d g(d dVar);

    public final ByteBuffer k(int i10) {
        if (this.f15276f.capacity() < i10) {
            this.f15276f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f15276f.clear();
        }
        ByteBuffer byteBuffer = this.f15276f;
        this.f15277g = byteBuffer;
        return byteBuffer;
    }

    @Override // n4.f
    public final void reset() {
        flush();
        this.f15276f = f.f15271a;
        d dVar = d.f15266e;
        this.f15274d = dVar;
        this.f15275e = dVar;
        this.f15272b = dVar;
        this.f15273c = dVar;
        j();
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }
}
