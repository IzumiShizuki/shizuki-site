package p6;

import bd.f0;
import java.util.ArrayDeque;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements o6.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f16840a = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f16841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f16842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f16843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f16844e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f16845f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f16846g;

    public h() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f16840a.add(new g(1));
        }
        this.f16841b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            ArrayDeque arrayDeque = this.f16841b;
            androidx.media3.exoplayer.offline.g gVar = new androidx.media3.exoplayer.offline.g(18, this);
            o6.c cVar = new o6.c();
            cVar.f16252h = gVar;
            arrayDeque.add(cVar);
        }
        this.f16842c = new ArrayDeque();
        this.f16846g = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    @Override // u4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(o6.i r8) {
        /*
            r7 = this;
            p6.g r0 = r7.f16843d
            if (r8 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            p4.c.c(r0)
            p6.g r8 = (p6.g) r8
            r0 = 4
            boolean r0 = r8.d(r0)
            if (r0 != 0) goto L33
            long r0 = r8.f21384g
            r2 = -9223372036854775808
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L33
            long r2 = r7.f16846g
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L33
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L33
            r8.h()
            java.util.ArrayDeque r0 = r7.f16840a
            r0.add(r8)
            goto L41
        L33:
            long r0 = r7.f16845f
            r2 = 1
            long r2 = r2 + r0
            r7.f16845f = r2
            r8.f16839k = r0
            java.util.ArrayDeque r0 = r7.f16842c
            r0.add(r8)
        L41:
            r8 = 0
            r7.f16843d = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.h.b(o6.i):void");
    }

    @Override // u4.c
    public final void c(long j10) {
        this.f16846g = j10;
    }

    @Override // o6.e
    public final void d(long j10) {
        this.f16844e = j10;
    }

    @Override // u4.c
    public final Object f() {
        p4.c.i(this.f16843d == null);
        ArrayDeque arrayDeque = this.f16840a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        g gVar = (g) arrayDeque.pollFirst();
        this.f16843d = gVar;
        return gVar;
    }

    @Override // u4.c
    public void flush() {
        ArrayDeque arrayDeque;
        this.f16845f = 0L;
        this.f16844e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.f16842c;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f16840a;
            if (zIsEmpty) {
                break;
            }
            g gVar = (g) arrayDeque2.poll();
            int i10 = c0.f16548a;
            gVar.h();
            arrayDeque.add(gVar);
        }
        g gVar2 = this.f16843d;
        if (gVar2 != null) {
            gVar2.h();
            arrayDeque.add(gVar2);
            this.f16843d = null;
        }
    }

    public abstract f0 g();

    public abstract void h(g gVar);

    @Override // u4.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public o6.c e() {
        ArrayDeque arrayDeque = this.f16841b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.f16842c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            g gVar = (g) arrayDeque2.peek();
            int i10 = c0.f16548a;
            if (gVar.f21384g > this.f16844e) {
                return null;
            }
            g gVar2 = (g) arrayDeque2.poll();
            boolean zD = gVar2.d(4);
            ArrayDeque arrayDeque3 = this.f16840a;
            if (zD) {
                o6.c cVar = (o6.c) arrayDeque.pollFirst();
                cVar.b(4);
                gVar2.h();
                arrayDeque3.add(gVar2);
                return cVar;
            }
            h(gVar2);
            if (j()) {
                f0 f0VarG = g();
                o6.c cVar2 = (o6.c) arrayDeque.pollFirst();
                long j10 = gVar2.f21384g;
                cVar2.f21387c = j10;
                cVar2.f16249e = f0VarG;
                cVar2.f16250f = j10;
                gVar2.h();
                arrayDeque3.add(gVar2);
                return cVar2;
            }
            gVar2.h();
            arrayDeque3.add(gVar2);
        }
    }

    public abstract boolean j();

    @Override // u4.c
    public void a() {
    }
}
