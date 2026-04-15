package androidx.media3.exoplayer.offline;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import m4.d0;
import m4.i0;
import p4.c0;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s4.m f879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n5.q f880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t4.e f882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t4.b f883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t4.j f884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Executor f885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f886h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f887i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f888j;

    public b0(i0 i0Var, n5.q qVar, t4.e eVar, Executor executor) {
        i0Var.f14286b.getClass();
        d0 d0Var = i0Var.f14286b;
        this.f879a = d(d0Var.f14178a);
        this.f880b = qVar;
        this.f881c = new ArrayList(d0Var.f14182e);
        this.f882d = eVar;
        this.f885g = executor;
        t4.b bVar = eVar.f20418a;
        bVar.getClass();
        this.f883e = bVar;
        this.f884f = t4.j.f20448a;
        this.f887i = new ArrayList();
        this.f886h = c0.N(20000L);
    }

    public static s4.m d(Uri uri) {
        Map map = Collections.EMPTY_MAP;
        p4.c.k(uri, "The uri must be set.");
        return new s4.m(uri, 0L, 1, null, map, 0L, -1L, null, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(java.util.List r21, t4.j r22, long r23) {
        /*
            r0 = r21
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 0
            r3 = 0
        L9:
            int r4 = r0.size()
            if (r2 >= r4) goto Lb2
            java.lang.Object r4 = r0.get(r2)
            androidx.media3.exoplayer.offline.z r4 = (androidx.media3.exoplayer.offline.z) r4
            s4.m r5 = r4.f987b
            r6 = r22
            java.lang.String r7 = r6.a(r5)
            java.lang.Object r8 = r1.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 != 0) goto L27
            r9 = 0
            goto L31
        L27:
            int r9 = r8.intValue()
            java.lang.Object r9 = r0.get(r9)
            androidx.media3.exoplayer.offline.z r9 = (androidx.media3.exoplayer.offline.z) r9
        L31:
            if (r9 == 0) goto La2
            long r10 = r9.f986a
            s4.m r9 = r9.f987b
            long r12 = r4.f986a
            long r14 = r10 + r23
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 > 0) goto La2
            android.net.Uri r12 = r9.f19443a
            long r13 = r9.f19449g
            android.net.Uri r15 = r5.f19443a
            boolean r12 = r12.equals(r15)
            if (r12 == 0) goto La2
            r15 = -1
            int r12 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r12 == 0) goto La2
            r17 = r13
            long r12 = r9.f19448f
            long r12 = r12 + r17
            r19 = r12
            long r12 = r5.f19448f
            int r14 = (r19 > r12 ? 1 : (r19 == r12 ? 0 : -1))
            if (r14 != 0) goto La2
            java.lang.String r12 = r9.f19450h
            java.lang.String r13 = r5.f19450h
            int r14 = p4.c0.f16548a
            boolean r12 = java.util.Objects.equals(r12, r13)
            if (r12 == 0) goto La2
            int r12 = r9.f19451i
            int r13 = r5.f19451i
            if (r12 != r13) goto La2
            int r12 = r9.f19445c
            int r13 = r5.f19445c
            if (r12 != r13) goto La2
            java.util.Map r12 = r9.f19447e
            java.util.Map r13 = r5.f19447e
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto La2
            long r4 = r5.f19449g
            int r7 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r7 != 0) goto L89
        L87:
            r4 = r15
            goto L8c
        L89:
            long r15 = r17 + r4
            goto L87
        L8c:
            r12 = 0
            s4.m r4 = r9.c(r12, r4)
            r8.getClass()
            int r5 = r8.intValue()
            androidx.media3.exoplayer.offline.z r7 = new androidx.media3.exoplayer.offline.z
            r7.<init>(r10, r4)
            r0.set(r5, r7)
            goto Lae
        La2:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r1.put(r7, r5)
            r0.set(r3, r4)
            int r3 = r3 + 1
        Lae:
            int r2 = r2 + 1
            goto L9
        Lb2:
            int r1 = r0.size()
            p4.c0.S(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.offline.b0.f(java.util.List, t4.j, long):void");
    }

    @Override // androidx.media3.exoplayer.offline.s
    public final void a(l lVar) {
        t4.f fVarA;
        byte[] bArr;
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayDeque arrayDeque2 = new ArrayDeque();
        try {
            t4.f fVarA2 = this.f882d.a();
            t tVar = (t) c(new x(this, fVarA2, this.f879a), false);
            if (!this.f881c.isEmpty()) {
                tVar = (t) tVar.a(this.f881c);
            }
            ArrayList arrayListE = e(fVarA2, tVar, false);
            Collections.sort(arrayListE);
            f(arrayListE, this.f884f, this.f886h);
            int size = arrayListE.size();
            long j10 = 0;
            long j11 = 0;
            int i10 = 0;
            for (int size2 = arrayListE.size() - 1; size2 >= 0; size2--) {
                s4.m mVar = ((z) arrayListE.get(size2)).f987b;
                String strA = this.f884f.a(mVar);
                long j12 = mVar.f19449g;
                if (j12 == -1) {
                    long jT = t0.t(((t4.y) this.f883e).j(strA));
                    if (jT != -1) {
                        j12 = jT - mVar.f19448f;
                    }
                }
                long j13 = j12;
                long jG = ((t4.y) this.f883e).g(mVar.f19448f, j13, strA);
                j11 += jG;
                if (j13 != -1) {
                    if (j13 == jG) {
                        i10++;
                        arrayListE.remove(size2);
                    }
                    if (j10 != -1) {
                        j10 += j13;
                    }
                } else {
                    j10 = -1;
                }
            }
            y yVar = new y(lVar, j10, size, j11, i10);
            arrayDeque.addAll(arrayListE);
            while (!this.f888j && !arrayDeque.isEmpty()) {
                if (arrayDeque2.isEmpty()) {
                    fVarA = this.f882d.a();
                    bArr = new byte[131072];
                } else {
                    a0 a0Var = (a0) arrayDeque2.removeFirst();
                    fVarA = a0Var.f870h;
                    bArr = a0Var.f872j;
                }
                a0 a0Var2 = new a0((z) arrayDeque.removeFirst(), fVarA, yVar, bArr);
                b(a0Var2);
                this.f885g.execute(a0Var2);
                for (int size3 = this.f887i.size() - 1; size3 >= 0; size3--) {
                    a0 a0Var3 = (a0) this.f887i.get(size3);
                    if (arrayDeque.isEmpty() || a0Var3.f16615b.e()) {
                        try {
                            a0Var3.get();
                            g(size3);
                            arrayDeque2.addLast(a0Var3);
                        } catch (ExecutionException e10) {
                            Throwable cause = e10.getCause();
                            cause.getClass();
                            if (!(cause instanceof IOException)) {
                                throw cause;
                            }
                            throw ((IOException) cause);
                        }
                    }
                }
                a0Var2.f16614a.d();
            }
            for (int i11 = 0; i11 < this.f887i.size(); i11++) {
                ((p4.t) this.f887i.get(i11)).cancel(true);
            }
            for (int size4 = this.f887i.size() - 1; size4 >= 0; size4--) {
                ((p4.t) this.f887i.get(size4)).b();
                g(size4);
            }
        } catch (Throwable th2) {
            for (int i12 = 0; i12 < this.f887i.size(); i12++) {
                ((p4.t) this.f887i.get(i12)).cancel(true);
            }
            for (int size5 = this.f887i.size() - 1; size5 >= 0; size5--) {
                ((p4.t) this.f887i.get(size5)).b();
                g(size5);
            }
            throw th2;
        }
    }

    public final void b(p4.t tVar) {
        synchronized (this.f887i) {
            try {
                if (this.f888j) {
                    throw new InterruptedException();
                }
                this.f887i.add(tVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Object c(p4.t tVar, boolean z10) throws ExecutionException, InterruptedException, IOException {
        if (z10) {
            tVar.run();
            try {
                return tVar.get();
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                int i10 = c0.f16548a;
                throw e10;
            }
        }
        if (this.f888j) {
            throw new InterruptedException();
        }
        b(tVar);
        this.f885g.execute(tVar);
        try {
            try {
                Object obj = tVar.get();
                tVar.b();
                synchronized (this.f887i) {
                    this.f887i.remove(tVar);
                }
                return obj;
            } catch (ExecutionException e11) {
                Throwable cause2 = e11.getCause();
                cause2.getClass();
                if (cause2 instanceof IOException) {
                    throw ((IOException) cause2);
                }
                int i11 = c0.f16548a;
                throw e11;
            }
        } catch (Throwable th2) {
            tVar.b();
            h(tVar);
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.offline.s
    public final void cancel() {
        synchronized (this.f887i) {
            try {
                this.f888j = true;
                for (int i10 = 0; i10 < this.f887i.size(); i10++) {
                    ((p4.t) this.f887i.get(i10)).cancel(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract ArrayList e(t4.f fVar, t tVar, boolean z10);

    public final void g(int i10) {
        synchronized (this.f887i) {
            this.f887i.remove(i10);
        }
    }

    public final void h(p4.t tVar) {
        synchronized (this.f887i) {
            this.f887i.remove(tVar);
        }
    }

    @Override // androidx.media3.exoplayer.offline.s
    public final void remove() {
        t4.j jVar = this.f884f;
        t4.b bVar = this.f883e;
        s4.m mVar = this.f879a;
        t4.e eVar = this.f882d;
        t4.f fVarB = eVar.b(null, eVar.f20423f | 1);
        try {
            try {
                ArrayList arrayListE = e(fVarB, (t) c(new x(this, fVarB, mVar), true), true);
                for (int i10 = 0; i10 < arrayListE.size(); i10++) {
                    ((t4.y) bVar).m(jVar.a(((z) arrayListE.get(i10)).f987b));
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception unused2) {
            }
        } finally {
            ((t4.y) bVar).m(jVar.a(mVar));
        }
    }
}
