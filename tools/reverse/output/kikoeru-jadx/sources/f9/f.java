package f9;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6956a;

    public /* synthetic */ f(int i10) {
        this.f6956a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(a8.a r6) {
        /*
            java.lang.String r0 = "rdb"
            jc.l.e(r6, r0)
            r0 = 0
            android.database.Cursor r1 = r6.f()     // Catch: java.lang.Exception -> L78
            java.io.Closeable r1 = (java.io.Closeable) r1     // Catch: java.lang.Exception -> L78
            r2 = r1
            android.database.Cursor r2 = (android.database.Cursor) r2     // Catch: java.lang.Throwable -> L7a
            r2.moveToFirst()     // Catch: java.lang.Throwable -> L7a
            int r2 = r2.getInt(r0)     // Catch: java.lang.Throwable -> L7a
            r3 = 0
            a.a.w(r1, r3)     // Catch: java.lang.Exception -> L78
            r1 = 200(0xc8, float:2.8E-43)
            int r1 = gh.g.x(r0, r2, r1)     // Catch: java.lang.Exception -> L78
            r2 = 1
            if (r1 < 0) goto L6d
            r3 = 1
            r4 = 0
        L25:
            if (r3 == 0) goto L66
            ub.p r3 = na.q.f15736a     // Catch: java.lang.Exception -> L78
            r6.h()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            java.lang.String r5 = "DELETE FROM LyricBean WHERE id < "
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            r3.append(r4)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            r6.l(r3)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            r6.A()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            r6.I()     // Catch: java.lang.Exception -> L44
            goto L48
        L44:
            r3 = move-exception
            r3.printStackTrace()     // Catch: java.lang.Exception -> L78
        L48:
            r3 = 1
            goto L59
        L4a:
            r1 = move-exception
            goto L5d
        L4c:
            r3 = move-exception
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L4a
            r6.I()     // Catch: java.lang.Exception -> L54
            goto L58
        L54:
            r3 = move-exception
            r3.printStackTrace()     // Catch: java.lang.Exception -> L78
        L58:
            r3 = 0
        L59:
            if (r3 == 0) goto L66
            r3 = 1
            goto L67
        L5d:
            r6.I()     // Catch: java.lang.Exception -> L61
            goto L65
        L61:
            r6 = move-exception
            r6.printStackTrace()     // Catch: java.lang.Exception -> L78
        L65:
            throw r1     // Catch: java.lang.Exception -> L78
        L66:
            r3 = 0
        L67:
            if (r4 == r1) goto L6c
            int r4 = r4 + 200
            goto L25
        L6c:
            r2 = r3
        L6d:
            java.lang.String r1 = "DELETE FROM LyricBean"
            r6.l(r1)     // Catch: java.lang.Exception -> L78
            java.lang.String r1 = "UPDATE sqlite_sequence SET seq=0 WHERE name='LyricBean'"
            r6.l(r1)     // Catch: java.lang.Exception -> L78
            return r2
        L78:
            r6 = move-exception
            goto L81
        L7a:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L7c
        L7c:
            r2 = move-exception
            a.a.w(r1, r6)     // Catch: java.lang.Exception -> L78
            throw r2     // Catch: java.lang.Exception -> L78
        L81:
            r6.printStackTrace()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f9.f.a(a8.a):boolean");
    }
}
