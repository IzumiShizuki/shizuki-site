package f5;

import b7.c3;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import o6.i;
import o6.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements o6.e, u4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.tencent.bugly.crashreport.crash.c f6681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f6683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f6684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u4.f[] f6685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u4.g[] f6686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6688h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public u4.f f6689i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u4.d f6690j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6691k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6692l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f6693m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f6694n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f6695o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(l lVar) {
        this(new i[2], new o6.c[2]);
        this.f6694n = 1;
        int i10 = this.f6687g;
        u4.f[] fVarArr = this.f6685e;
        p4.c.i(i10 == fVarArr.length);
        for (u4.f fVar : fVarArr) {
            fVar.j(1024);
        }
        this.f6695o = lVar;
    }

    @Override // u4.c
    public final void a() {
        synchronized (this.f6682b) {
            this.f6692l = true;
            this.f6682b.notify();
        }
        try {
            this.f6681a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // u4.c
    public final void c(long j10) {
        synchronized (this.f6682b) {
            try {
                p4.c.i(this.f6687g == this.f6685e.length || this.f6691k);
                this.f6693m = j10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // u4.c
    public final Object f() {
        u4.f fVar;
        synchronized (this.f6682b) {
            try {
                u4.d dVar = this.f6690j;
                if (dVar != null) {
                    throw dVar;
                }
                p4.c.i(this.f6689i == null);
                int i10 = this.f6687g;
                if (i10 == 0) {
                    fVar = null;
                } else {
                    u4.f[] fVarArr = this.f6685e;
                    int i11 = i10 - 1;
                    this.f6687g = i11;
                    fVar = fVarArr[i11];
                }
                this.f6689i = fVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    @Override // u4.c
    public final void flush() {
        synchronized (this.f6682b) {
            try {
                this.f6691k = true;
                u4.f fVar = this.f6689i;
                if (fVar != null) {
                    fVar.h();
                    u4.f[] fVarArr = this.f6685e;
                    int i10 = this.f6687g;
                    this.f6687g = i10 + 1;
                    fVarArr[i10] = fVar;
                    this.f6689i = null;
                }
                while (!this.f6683c.isEmpty()) {
                    u4.f fVar2 = (u4.f) this.f6683c.removeFirst();
                    fVar2.h();
                    u4.f[] fVarArr2 = this.f6685e;
                    int i11 = this.f6687g;
                    this.f6687g = i11 + 1;
                    fVarArr2[i11] = fVar2;
                }
                while (!this.f6684d.isEmpty()) {
                    ((u4.g) this.f6684d.removeFirst()).i();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final u4.d g(Throwable th2) {
        switch (this.f6694n) {
            case 0:
                return new d("Unexpected decode error", th2);
            default:
                return new o6.f("Unexpected decode error", th2);
        }
    }

    public final u4.d h(u4.f fVar, u4.g gVar, boolean z10) {
        switch (this.f6694n) {
            case 0:
                a aVar = (a) gVar;
                try {
                    ByteBuffer byteBuffer = fVar.f21382e;
                    byteBuffer.getClass();
                    p4.c.i(byteBuffer.hasArray());
                    p4.c.c(byteBuffer.arrayOffset() == 0);
                    c3 c3Var = (c3) this.f6695o;
                    byte[] bArrArray = byteBuffer.array();
                    int iRemaining = byteBuffer.remaining();
                    c3Var.getClass();
                    aVar.f6679e = c3.a(bArrArray, iRemaining);
                    aVar.f21387c = fVar.f21384g;
                    return null;
                } catch (d e10) {
                    return e10;
                }
            default:
                i iVar = (i) fVar;
                o6.c cVar = (o6.c) gVar;
                try {
                    ByteBuffer byteBuffer2 = iVar.f21382e;
                    byteBuffer2.getClass();
                    byte[] bArrArray2 = byteBuffer2.array();
                    int iLimit = byteBuffer2.limit();
                    l lVar = (l) this.f6695o;
                    if (z10) {
                        lVar.reset();
                    }
                    o6.d dVarF = lVar.f(bArrArray2, 0, iLimit);
                    long j10 = iVar.f21384g;
                    long j11 = iVar.f16265j;
                    cVar.f21387c = j10;
                    cVar.f16249e = dVarF;
                    if (j11 != Long.MAX_VALUE) {
                        j10 = j11;
                    }
                    cVar.f16250f = j10;
                    cVar.f21388d = false;
                    return null;
                } catch (o6.f e11) {
                    return e11;
                }
        }
    }

    public final boolean i() {
        u4.d dVarG;
        synchronized (this.f6682b) {
            while (!this.f6692l) {
                try {
                    if (!this.f6683c.isEmpty() && this.f6688h > 0) {
                        break;
                    }
                    this.f6682b.wait();
                } finally {
                }
            }
            if (this.f6692l) {
                return false;
            }
            u4.f fVar = (u4.f) this.f6683c.removeFirst();
            u4.g[] gVarArr = this.f6686f;
            int i10 = this.f6688h - 1;
            this.f6688h = i10;
            u4.g gVar = gVarArr[i10];
            boolean z10 = this.f6691k;
            this.f6691k = false;
            if (fVar.d(4)) {
                gVar.b(4);
            } else {
                gVar.f21387c = fVar.f21384g;
                if (fVar.d(134217728)) {
                    gVar.b(134217728);
                }
                if (!k(fVar.f21384g)) {
                    gVar.f21388d = true;
                }
                try {
                    dVarG = h(fVar, gVar, z10);
                } catch (OutOfMemoryError e10) {
                    dVarG = g(e10);
                } catch (RuntimeException e11) {
                    dVarG = g(e11);
                }
                if (dVarG != null) {
                    synchronized (this.f6682b) {
                        this.f6690j = dVarG;
                    }
                    return false;
                }
            }
            synchronized (this.f6682b) {
                try {
                    if (this.f6691k || gVar.f21388d) {
                        gVar.i();
                    } else {
                        this.f6684d.addLast(gVar);
                    }
                    fVar.h();
                    u4.f[] fVarArr = this.f6685e;
                    int i11 = this.f6687g;
                    this.f6687g = i11 + 1;
                    fVarArr[i11] = fVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // u4.c
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final u4.g e() {
        synchronized (this.f6682b) {
            try {
                u4.d dVar = this.f6690j;
                if (dVar != null) {
                    throw dVar;
                }
                if (this.f6684d.isEmpty()) {
                    return null;
                }
                return (u4.g) this.f6684d.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean k(long j10) {
        boolean z10;
        synchronized (this.f6682b) {
            long j11 = this.f6693m;
            z10 = j11 == -9223372036854775807L || j10 >= j11;
        }
        return z10;
    }

    @Override // u4.c
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void b(u4.f fVar) {
        synchronized (this.f6682b) {
            try {
                u4.d dVar = this.f6690j;
                if (dVar != null) {
                    throw dVar;
                }
                p4.c.c(fVar == this.f6689i);
                this.f6683c.addLast(fVar);
                if (!this.f6683c.isEmpty() && this.f6688h > 0) {
                    this.f6682b.notify();
                }
                this.f6689i = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m(u4.g gVar) {
        synchronized (this.f6682b) {
            gVar.h();
            u4.g[] gVarArr = this.f6686f;
            int i10 = this.f6688h;
            this.f6688h = i10 + 1;
            gVarArr[i10] = gVar;
            if (!this.f6683c.isEmpty() && this.f6688h > 0) {
                this.f6682b.notify();
            }
        }
    }

    public b(u4.f[] fVarArr, u4.g[] gVarArr) {
        u4.g aVar;
        u4.f fVar;
        this.f6682b = new Object();
        this.f6693m = -9223372036854775807L;
        this.f6683c = new ArrayDeque();
        this.f6684d = new ArrayDeque();
        this.f6685e = fVarArr;
        this.f6687g = fVarArr.length;
        for (int i10 = 0; i10 < this.f6687g; i10++) {
            u4.f[] fVarArr2 = this.f6685e;
            switch (this.f6694n) {
                case 0:
                    fVar = new u4.f(1);
                    break;
                default:
                    fVar = new i(1);
                    break;
            }
            fVarArr2[i10] = fVar;
        }
        this.f6686f = gVarArr;
        this.f6688h = gVarArr.length;
        for (int i11 = 0; i11 < this.f6688h; i11++) {
            u4.g[] gVarArr2 = this.f6686f;
            switch (this.f6694n) {
                case 0:
                    aVar = new a(this);
                    break;
                default:
                    aVar = new o6.c(this);
                    break;
            }
            gVarArr2[i11] = aVar;
        }
        com.tencent.bugly.crashreport.crash.c cVar = new com.tencent.bugly.crashreport.crash.c(this);
        this.f6681a = cVar;
        cVar.start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(c3 c3Var) {
        this(new u4.f[1], new a[1]);
        this.f6694n = 0;
        this.f6695o = c3Var;
    }

    @Override // o6.e
    public void d(long j10) {
    }
}
