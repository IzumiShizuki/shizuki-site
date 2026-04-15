package q5;

import java.nio.ByteBuffer;
import m4.q;
import p4.c0;
import p4.s;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends v4.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u4.f f17776r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s f17777s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a f17778t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f17779u;

    public b() {
        super(6);
        this.f17776r = new u4.f(1);
        this.f17777s = new s();
    }

    @Override // v4.e, v4.w0
    public final void d(int i10, Object obj) {
        if (i10 == 8) {
            this.f17778t = (a) obj;
        }
    }

    @Override // v4.e
    public final String i() {
        return "CameraMotionRenderer";
    }

    @Override // v4.e
    public final boolean k() {
        return j();
    }

    @Override // v4.e
    public final boolean l() {
        return true;
    }

    @Override // v4.e
    public final void m() {
        a aVar = this.f17778t;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // v4.e
    public final void o(long j10, boolean z10) {
        this.f17779u = Long.MIN_VALUE;
        a aVar = this.f17778t;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // v4.e
    public final void v(long j10, long j11) {
        float[] fArr;
        while (!j() && this.f17779u < 100000 + j10) {
            u4.f fVar = this.f17776r;
            fVar.h();
            v2.e eVar = this.f22452c;
            eVar.n();
            if (u(eVar, fVar, 0) != -4 || fVar.d(4)) {
                return;
            }
            long j12 = fVar.f21384g;
            this.f17779u = j12;
            boolean z10 = j12 < this.f22461l;
            if (this.f17778t != null && !z10) {
                fVar.k();
                ByteBuffer byteBuffer = fVar.f21382e;
                int i10 = c0.f16548a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    s sVar = this.f17777s;
                    sVar.E(bArrArray, iLimit);
                    sVar.G(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i11 = 0; i11 < 3; i11++) {
                        fArr2[i11] = Float.intBitsToFloat(sVar.i());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f17778t.a(this.f17779u - this.f22460k, fArr);
                }
            }
        }
    }

    @Override // v4.e
    public final int y(q qVar) {
        return "application/x-camera-motion".equals(qVar.f14544n) ? t0.g(4, 0, 0, 0) : t0.g(0, 0, 0, 0);
    }
}
