package o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i4.d f16046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3.l f16047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16050f;

    public u(int i10) {
        this.f16045a = i10;
        if (i10 <= 0) {
            p.a.c("maxSize <= 0");
            throw null;
        }
        this.f16046b = new i4.d(2);
        this.f16047c = new m3.l(20);
    }

    public void a(Object obj, Object obj2, Object obj3) {
        jc.l.e(obj, "key");
        jc.l.e(obj2, "oldValue");
    }

    public final Object b(Object obj) {
        jc.l.e(obj, "key");
        synchronized (this.f16047c) {
            i4.d dVar = this.f16046b;
            dVar.getClass();
            Object obj2 = dVar.f9004a.get(obj);
            if (obj2 != null) {
                this.f16049e++;
                return obj2;
            }
            this.f16050f++;
            return null;
        }
    }

    public final Object c(Object obj, Object obj2) {
        Object objPut;
        jc.l.e(obj, "key");
        synchronized (this.f16047c) {
            this.f16048d += e(obj, obj2);
            i4.d dVar = this.f16046b;
            dVar.getClass();
            objPut = dVar.f9004a.put(obj, obj2);
            if (objPut != null) {
                this.f16048d -= e(obj, objPut);
            }
        }
        if (objPut != null) {
            a(obj, objPut, obj2);
        }
        g(this.f16045a);
        return objPut;
    }

    public final Object d(Object obj) {
        Object objRemove;
        synchronized (this.f16047c) {
            i4.d dVar = this.f16046b;
            dVar.getClass();
            objRemove = dVar.f9004a.remove(obj);
            if (objRemove != null) {
                this.f16048d -= e(obj, objRemove);
            }
        }
        if (objRemove != null) {
            a(obj, objRemove, null);
        }
        return objRemove;
    }

    public final int e(Object obj, Object obj2) {
        int iF = f(obj, obj2);
        if (iF >= 0) {
            return iF;
        }
        String str = "Negative size: " + obj + '=' + obj2;
        jc.l.e(str, "message");
        throw new IllegalStateException(str);
    }

    public int f(Object obj, Object obj2) {
        jc.l.e(obj, "key");
        jc.l.e(obj2, "value");
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r6) {
        /*
            r5 = this;
        L0:
            m3.l r0 = r5.f16047c
            monitor-enter(r0)
            int r1 = r5.f16048d     // Catch: java.lang.Throwable -> L16
            if (r1 < 0) goto L68
            i4.d r1 = r5.f16046b     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.f9004a     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L18
            int r1 = r5.f16048d     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L68
            goto L18
        L16:
            r6 = move-exception
            goto L70
        L18:
            int r1 = r5.f16048d     // Catch: java.lang.Throwable -> L16
            if (r1 <= r6) goto L66
            i4.d r1 = r5.f16046b     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.f9004a     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L27
            goto L66
        L27:
            i4.d r1 = r5.f16046b     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.f9004a     // Catch: java.lang.Throwable -> L16
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = "<get-entries>(...)"
            jc.l.d(r1, r2)     // Catch: java.lang.Throwable -> L16
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = vb.m.Z(r1)     // Catch: java.lang.Throwable -> L16
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L40
            monitor-exit(r0)
            return
        L40:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L16
            i4.d r3 = r5.f16046b     // Catch: java.lang.Throwable -> L16
            r3.getClass()     // Catch: java.lang.Throwable -> L16
            java.lang.String r4 = "key"
            jc.l.e(r2, r4)     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r3 = r3.f9004a     // Catch: java.lang.Throwable -> L16
            r3.remove(r2)     // Catch: java.lang.Throwable -> L16
            int r3 = r5.f16048d     // Catch: java.lang.Throwable -> L16
            int r4 = r5.e(r2, r1)     // Catch: java.lang.Throwable -> L16
            int r3 = r3 - r4
            r5.f16048d = r3     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            r0 = 0
            r5.a(r2, r1, r0)
            goto L0
        L66:
            monitor-exit(r0)
            return
        L68:
            java.lang.String r6 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L16
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L16
            throw r1     // Catch: java.lang.Throwable -> L16
        L70:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.u.g(int):void");
    }

    public final String toString() {
        String str;
        synchronized (this.f16047c) {
            try {
                int i10 = this.f16049e;
                int i11 = this.f16050f + i10;
                str = "LruCache[maxSize=" + this.f16045a + ",hits=" + this.f16049e + ",misses=" + this.f16050f + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
