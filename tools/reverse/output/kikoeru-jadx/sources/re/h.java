package re;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class h implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f18998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a f18999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f19000c;

    public h(l lVar, ic.a aVar) {
        if (lVar == null) {
            f(0);
            throw null;
        }
        this.f19000c = k.f19005a;
        this.f18998a = lVar;
        this.f18999b = aVar;
    }

    public static /* synthetic */ void f(int i10) {
        String str = (i10 == 2 || i10 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "computable";
        } else if (i10 == 2 || i10 == 3) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 2) {
            objArr[1] = "recursionDetected";
        } else if (i10 != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[1] = "renderDebugInformation";
        }
        if (i10 != 2 && i10 != 3) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:7:0x0015, B:9:0x001b, B:15:0x002a, B:17:0x0035, B:22:0x0042, B:24:0x004a, B:25:0x004d, B:29:0x005c, B:31:0x0062, B:33:0x0066, B:34:0x006d, B:35:0x0074, B:36:0x0075, B:37:0x007b, B:26:0x004f), top: B:40:0x0015, inners: #1 }] */
    @Override // ic.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b() throws java.lang.Throwable {
        /*
            r5 = this;
            re.k r0 = re.k.f19007c
            re.k r1 = re.k.f19006b
            java.lang.Object r2 = r5.f19000c
            boolean r3 = r2 instanceof re.k
            if (r3 != 0) goto Le
            bf.m.k(r2)
            return r2
        Le:
            re.l r2 = r5.f18998a
            re.n r2 = r2.f19011a
            r2.lock()
            java.lang.Object r2 = r5.f19000c     // Catch: java.lang.Throwable -> L26
            boolean r3 = r2 instanceof re.k     // Catch: java.lang.Throwable -> L26
            if (r3 != 0) goto L28
            bf.m.k(r2)     // Catch: java.lang.Throwable -> L26
            re.l r0 = r5.f18998a
            re.n r0 = r0.f19011a
            r0.unlock()
            return r2
        L26:
            r0 = move-exception
            goto L7c
        L28:
            if (r2 != r1) goto L3f
            r5.f19000c = r0     // Catch: java.lang.Throwable -> L26
            r3 = 1
            k5.d r3 = r5.i(r3)     // Catch: java.lang.Throwable -> L26
            boolean r4 = r3.f11043b     // Catch: java.lang.Throwable -> L26
            if (r4 != 0) goto L3f
            java.lang.Object r0 = r3.f11044c     // Catch: java.lang.Throwable -> L26
        L37:
            re.l r1 = r5.f18998a
            re.n r1 = r1.f19011a
            r1.unlock()
            return r0
        L3f:
            if (r2 != r0) goto L4d
            r0 = 0
            k5.d r0 = r5.i(r0)     // Catch: java.lang.Throwable -> L26
            boolean r2 = r0.f11043b     // Catch: java.lang.Throwable -> L26
            if (r2 != 0) goto L4d
            java.lang.Object r0 = r0.f11044c     // Catch: java.lang.Throwable -> L26
            goto L37
        L4d:
            r5.f19000c = r1     // Catch: java.lang.Throwable -> L26
            ic.a r0 = r5.f18999b     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r0 = r0.b()     // Catch: java.lang.Throwable -> L5b
            r5.h(r0)     // Catch: java.lang.Throwable -> L5b
            r5.f19000c = r0     // Catch: java.lang.Throwable -> L5b
            goto L37
        L5b:
            r0 = move-exception
            boolean r2 = bf.m.i(r0)     // Catch: java.lang.Throwable -> L26
            if (r2 != 0) goto L75
            java.lang.Object r2 = r5.f19000c     // Catch: java.lang.Throwable -> L26
            if (r2 != r1) goto L6d
            bf.l r1 = new bf.l     // Catch: java.lang.Throwable -> L26
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L26
            r5.f19000c = r1     // Catch: java.lang.Throwable -> L26
        L6d:
            re.l r1 = r5.f18998a     // Catch: java.lang.Throwable -> L26
            re.a r1 = r1.f19012b     // Catch: java.lang.Throwable -> L26
            r1.getClass()     // Catch: java.lang.Throwable -> L26
            throw r0     // Catch: java.lang.Throwable -> L26
        L75:
            re.k r1 = re.k.f19005a     // Catch: java.lang.Throwable -> L26
            r5.f19000c = r1     // Catch: java.lang.Throwable -> L26
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch: java.lang.Throwable -> L26
            throw r0     // Catch: java.lang.Throwable -> L26
        L7c:
            re.l r1 = r5.f18998a
            re.n r1 = r1.f19011a
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: re.h.b():java.lang.Object");
    }

    public k5.d i(boolean z10) {
        k5.d dVarD = this.f18998a.d(null, "in a lazy value");
        if (dVarD != null) {
            return dVarD;
        }
        f(2);
        throw null;
    }

    public void h(Object obj) {
    }
}
