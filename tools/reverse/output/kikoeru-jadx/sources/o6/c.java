package o6;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends u4.g implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f16249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f16250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16251g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f16252h;

    public /* synthetic */ c() {
    }

    @Override // o6.d
    public final int a(long j10) {
        d dVar = this.f16249e;
        dVar.getClass();
        return dVar.a(j10 - this.f16250f);
    }

    @Override // o6.d
    public final long e(int i10) {
        d dVar = this.f16249e;
        dVar.getClass();
        return dVar.e(i10) + this.f16250f;
    }

    @Override // o6.d
    public final List f(long j10) {
        d dVar = this.f16249e;
        dVar.getClass();
        return dVar.f(j10 - this.f16250f);
    }

    @Override // o6.d
    public final int g() {
        d dVar = this.f16249e;
        dVar.getClass();
        return dVar.g();
    }

    @Override // u4.g
    public final void h() {
        this.f17713b = 0;
        this.f21387c = 0L;
        this.f21388d = false;
        this.f16249e = null;
    }

    @Override // u4.g
    public final void i() {
        switch (this.f16251g) {
            case 0:
                ((f5.b) this.f16252h).m(this);
                break;
            default:
                p6.h hVar = (p6.h) ((androidx.media3.exoplayer.offline.g) this.f16252h).f903b;
                hVar.getClass();
                h();
                hVar.f16841b.add(this);
                break;
        }
    }

    public c(f5.b bVar) {
        this.f16252h = bVar;
    }
}
