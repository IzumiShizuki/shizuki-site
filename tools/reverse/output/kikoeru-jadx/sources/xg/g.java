package xg;

import b5.d0;
import ef.l;
import ef.n;
import ef.u;
import ic.k;
import j2.h0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import lh.a0;
import lh.b0;
import lh.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Closeable, Flushable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final l f25049t = new l("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f25050u = "CLEAN";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f25051v = "DIRTY";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f25052w = "REMOVE";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f25053x = "READ";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f25054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f25055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f25056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f25057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y f25058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y f25059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f25060g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a0 f25061h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f25062i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f25063j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f25064k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f25065l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f25066m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f25067n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f25068o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f25069p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f25070q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yg.b f25071r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f25072s;

    public g(lh.l lVar, y yVar, yg.c cVar) {
        jc.l.e(lVar, "fileSystem");
        jc.l.e(cVar, "taskRunner");
        this.f25054a = yVar;
        this.f25055b = new f(lVar);
        this.f25056c = 1073741824L;
        this.f25062i = new LinkedHashMap(0, 0.75f, true);
        this.f25071r = cVar.d();
        this.f25072s = new e(0, this, h0.n(new StringBuilder(), wg.g.f24232b, " Cache"));
        this.f25057d = yVar.d("journal");
        this.f25058e = yVar.d("journal.tmp");
        this.f25059f = yVar.d("journal.bkp");
    }

    public static void L(String str) {
        if (!f25049t.d(str)) {
            throw new IllegalArgumentException(a0.c.G('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    public final synchronized void B() {
        Throwable th2;
        try {
            a0 a0Var = this.f25061h;
            if (a0Var != null) {
                a0Var.close();
            }
            a0 a0VarK = g8.a.k(this.f25055b.G(this.f25058e));
            try {
                a0VarK.E("libcore.io.DiskLruCache");
                a0VarK.writeByte(10);
                a0VarK.E("1");
                a0VarK.writeByte(10);
                a0VarK.b0(201105);
                a0VarK.writeByte(10);
                a0VarK.b0(2);
                a0VarK.writeByte(10);
                a0VarK.writeByte(10);
                for (Object obj : this.f25062i.values()) {
                    jc.l.d(obj, "next(...)");
                    c cVar = (c) obj;
                    if (cVar.f25039g != null) {
                        a0VarK.E(f25051v);
                        a0VarK.writeByte(32);
                        a0VarK.E(cVar.f25033a);
                        a0VarK.writeByte(10);
                    } else {
                        a0VarK.E(f25050u);
                        a0VarK.writeByte(32);
                        a0VarK.E(cVar.f25033a);
                        for (long j10 : cVar.f25034b) {
                            a0VarK.writeByte(32);
                            a0VarK.b0(j10);
                        }
                        a0VarK.writeByte(10);
                    }
                }
                try {
                    a0VarK.close();
                    th2 = null;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                try {
                    a0VarK.close();
                } catch (Throwable th5) {
                    ub.a.a(th4, th5);
                }
                th2 = th4;
            }
            if (th2 != null) {
                throw th2;
            }
            if (this.f25055b.q(this.f25057d)) {
                this.f25055b.g(this.f25057d, this.f25059f);
                this.f25055b.g(this.f25058e, this.f25057d);
                wg.e.d(this.f25055b, this.f25059f);
            } else {
                this.f25055b.g(this.f25058e, this.f25057d);
            }
            a0 a0Var2 = this.f25061h;
            if (a0Var2 != null) {
                wg.e.b(a0Var2);
            }
            f fVar = this.f25055b;
            y yVar = this.f25057d;
            fVar.getClass();
            jc.l.e(yVar, "file");
            this.f25061h = g8.a.k(new k8.e(fVar.b(yVar), (k) new e7.y(26, this)));
            this.f25064k = false;
            this.f25069p = false;
        } catch (Throwable th6) {
            throw th6;
        }
    }

    public final void D(c cVar) {
        a0 a0Var;
        String str = cVar.f25033a;
        if (!this.f25065l) {
            if (cVar.f25040h > 0 && (a0Var = this.f25061h) != null) {
                a0Var.E(f25051v);
                a0Var.writeByte(32);
                a0Var.E(str);
                a0Var.writeByte(10);
                a0Var.flush();
            }
            if (cVar.f25040h > 0 || cVar.f25039g != null) {
                cVar.f25038f = true;
                return;
            }
        }
        d0 d0Var = cVar.f25039g;
        if (d0Var != null) {
            d0Var.h();
        }
        for (int i10 = 0; i10 < 2; i10++) {
            wg.e.d(this.f25055b, (y) cVar.f25035c.get(i10));
            long j10 = this.f25060g;
            long[] jArr = cVar.f25034b;
            this.f25060g = j10 - jArr[i10];
            jArr[i10] = 0;
        }
        this.f25063j++;
        a0 a0Var2 = this.f25061h;
        if (a0Var2 != null) {
            a0Var2.E(f25052w);
            a0Var2.writeByte(32);
            a0Var2.E(str);
            a0Var2.writeByte(10);
        }
        this.f25062i.remove(str);
        if (o()) {
            this.f25071r.d(this.f25072s, 0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        D(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G() {
        /*
            r5 = this;
        L0:
            long r0 = r5.f25060g
            long r2 = r5.f25056c
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L2c
            java.util.LinkedHashMap r0 = r5.f25062i
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            java.lang.String r2 = "next(...)"
            jc.l.d(r1, r2)
            xg.c r1 = (xg.c) r1
            boolean r2 = r1.f25038f
            if (r2 != 0) goto L12
            r5.D(r1)
            goto L0
        L2b:
            return
        L2c:
            r0 = 0
            r5.f25068o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xg.g.G():void");
    }

    public final synchronized void b() {
        if (this.f25067n) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f25066m && !this.f25067n) {
                Collection collectionValues = this.f25062i.values();
                jc.l.d(collectionValues, "<get-values>(...)");
                for (c cVar : (c[]) collectionValues.toArray(new c[0])) {
                    jc.l.b(cVar);
                    d0 d0Var = cVar.f25039g;
                    if (d0Var != null) {
                        d0Var.h();
                    }
                }
                G();
                a0 a0Var = this.f25061h;
                if (a0Var != null) {
                    wg.e.b(a0Var);
                }
                this.f25061h = null;
                this.f25067n = true;
                return;
            }
            this.f25067n = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f25066m) {
            b();
            G();
            a0 a0Var = this.f25061h;
            jc.l.b(a0Var);
            a0Var.flush();
        }
    }

    public final synchronized void g(d0 d0Var, boolean z10) {
        c cVar = (c) d0Var.f1521b;
        if (!jc.l.a(cVar.f25039g, d0Var)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z10 && !cVar.f25037e) {
            for (int i10 = 0; i10 < 2; i10++) {
                boolean[] zArr = (boolean[]) d0Var.f1522c;
                jc.l.b(zArr);
                if (!zArr[i10]) {
                    d0Var.b();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                }
                if (!this.f25055b.q((y) cVar.f25036d.get(i10))) {
                    d0Var.b();
                    return;
                }
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            y yVar = (y) cVar.f25036d.get(i11);
            if (!z10 || cVar.f25038f) {
                wg.e.d(this.f25055b, yVar);
            } else if (this.f25055b.q(yVar)) {
                y yVar2 = (y) cVar.f25035c.get(i11);
                this.f25055b.g(yVar, yVar2);
                long j10 = cVar.f25034b[i11];
                Long l10 = this.f25055b.y(yVar2).f12586d;
                long jLongValue = l10 != null ? l10.longValue() : 0L;
                cVar.f25034b[i11] = jLongValue;
                this.f25060g = (this.f25060g - j10) + jLongValue;
            }
        }
        cVar.f25039g = null;
        if (cVar.f25038f) {
            D(cVar);
            return;
        }
        this.f25063j++;
        a0 a0Var = this.f25061h;
        jc.l.b(a0Var);
        if (cVar.f25037e || z10) {
            cVar.f25037e = true;
            a0Var.E(f25050u);
            a0Var.writeByte(32);
            a0Var.E(cVar.f25033a);
            for (long j11 : cVar.f25034b) {
                a0Var.writeByte(32);
                a0Var.b0(j11);
            }
            a0Var.writeByte(10);
            if (z10) {
                long j12 = this.f25070q;
                this.f25070q = 1 + j12;
                cVar.f25041i = j12;
            }
        } else {
            this.f25062i.remove(cVar.f25033a);
            a0Var.E(f25052w);
            a0Var.writeByte(32);
            a0Var.E(cVar.f25033a);
            a0Var.writeByte(10);
        }
        a0Var.flush();
        if (this.f25060g > this.f25056c || o()) {
            this.f25071r.d(this.f25072s, 0L);
        }
    }

    public final synchronized d0 i(long j10, String str) {
        jc.l.e(str, "key");
        n();
        b();
        L(str);
        c cVar = (c) this.f25062i.get(str);
        if (j10 != -1 && (cVar == null || cVar.f25041i != j10)) {
            return null;
        }
        if ((cVar != null ? cVar.f25039g : null) != null) {
            return null;
        }
        if (cVar != null && cVar.f25040h != 0) {
            return null;
        }
        if (!this.f25068o && !this.f25069p) {
            a0 a0Var = this.f25061h;
            jc.l.b(a0Var);
            a0Var.E(f25051v);
            a0Var.writeByte(32);
            a0Var.E(str);
            a0Var.writeByte(10);
            a0Var.flush();
            if (this.f25064k) {
                return null;
            }
            if (cVar == null) {
                cVar = new c(this, str);
                this.f25062i.put(str, cVar);
            }
            d0 d0Var = new d0(this, cVar);
            cVar.f25039g = d0Var;
            return d0Var;
        }
        this.f25071r.d(this.f25072s, 0L);
        return null;
    }

    public final synchronized d k(String str) {
        jc.l.e(str, "key");
        n();
        b();
        L(str);
        c cVar = (c) this.f25062i.get(str);
        if (cVar == null) {
            return null;
        }
        d dVarA = cVar.a();
        if (dVarA == null) {
            return null;
        }
        this.f25063j++;
        a0 a0Var = this.f25061h;
        jc.l.b(a0Var);
        a0Var.E(f25053x);
        a0Var.writeByte(32);
        a0Var.E(str);
        a0Var.writeByte(10);
        if (o()) {
            this.f25071r.d(this.f25072s, 0L);
        }
        return dVarA;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006c A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #4 {all -> 0x0027, blocks: (B:4:0x0003, B:8:0x000b, B:10:0x0015, B:12:0x001f, B:15:0x002a, B:16:0x0033, B:37:0x0070, B:39:0x007c, B:49:0x00bf, B:43:0x0087, B:45:0x00b8, B:47:0x00bc, B:48:0x00be, B:36:0x006c, B:52:0x00c6, B:27:0x005b, B:24:0x0056, B:44:0x00ae, B:18:0x0049), top: B:62:0x0003, inners: #3, #5, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c6 A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #4 {all -> 0x0027, blocks: (B:4:0x0003, B:8:0x000b, B:10:0x0015, B:12:0x001f, B:15:0x002a, B:16:0x0033, B:37:0x0070, B:39:0x007c, B:49:0x00bf, B:43:0x0087, B:45:0x00b8, B:47:0x00bc, B:48:0x00be, B:36:0x006c, B:52:0x00c6, B:27:0x005b, B:24:0x0056, B:44:0x00ae, B:18:0x0049), top: B:62:0x0003, inners: #3, #5, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void n() {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xg.g.n():void");
    }

    public final boolean o() {
        int i10 = this.f25063j;
        return i10 >= 2000 && i10 >= this.f25062i.size();
    }

    public final void q() {
        y yVar = this.f25058e;
        f fVar = this.f25055b;
        wg.e.d(fVar, yVar);
        Iterator it = this.f25062i.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            jc.l.d(next, "next(...)");
            c cVar = (c) next;
            int i10 = 0;
            if (cVar.f25039g == null) {
                while (i10 < 2) {
                    this.f25060g += cVar.f25034b[i10];
                    i10++;
                }
            } else {
                cVar.f25039g = null;
                while (i10 < 2) {
                    wg.e.d(fVar, (y) cVar.f25035c.get(i10));
                    wg.e.d(fVar, (y) cVar.f25036d.get(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    public final void u() throws Throwable {
        f fVar = this.f25055b;
        y yVar = this.f25057d;
        b0 b0VarL = g8.a.l(fVar.L(yVar));
        try {
            String strX = b0VarL.x(Long.MAX_VALUE);
            String strX2 = b0VarL.x(Long.MAX_VALUE);
            String strX3 = b0VarL.x(Long.MAX_VALUE);
            String strX4 = b0VarL.x(Long.MAX_VALUE);
            String strX5 = b0VarL.x(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strX) || !"1".equals(strX2) || !jc.l.a(String.valueOf(201105), strX3) || !jc.l.a(String.valueOf(2), strX4) || strX5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strX + ", " + strX2 + ", " + strX4 + ", " + strX5 + ']');
            }
            int i10 = 0;
            while (true) {
                try {
                    y(b0VarL.x(Long.MAX_VALUE));
                    i10++;
                } catch (EOFException unused) {
                    this.f25063j = i10 - this.f25062i.size();
                    if (b0VarL.b()) {
                        a0 a0Var = this.f25061h;
                        if (a0Var != null) {
                            wg.e.b(a0Var);
                        }
                        fVar.getClass();
                        jc.l.e(yVar, "file");
                        this.f25061h = g8.a.k(new k8.e(fVar.b(yVar), (k) new e7.y(26, this)));
                    } else {
                        B();
                    }
                    try {
                        b0VarL.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                b0VarL.close();
            } catch (Throwable th4) {
                ub.a.a(th, th4);
            }
        }
        if (th != null) {
            throw th;
        }
    }

    public final void y(String str) throws IOException {
        String strSubstring;
        int iV0 = n.v0(str, ' ', 0, 6);
        if (iV0 == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i10 = iV0 + 1;
        int iV02 = n.v0(str, ' ', i10, 4);
        LinkedHashMap linkedHashMap = this.f25062i;
        if (iV02 == -1) {
            strSubstring = str.substring(i10);
            jc.l.d(strSubstring, "substring(...)");
            String str2 = f25052w;
            if (iV0 == str2.length() && u.k0(str, str2, false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iV02);
            jc.l.d(strSubstring, "substring(...)");
        }
        c cVar = (c) linkedHashMap.get(strSubstring);
        if (cVar == null) {
            cVar = new c(this, strSubstring);
            linkedHashMap.put(strSubstring, cVar);
        }
        if (iV02 != -1) {
            String str3 = f25050u;
            if (iV0 == str3.length() && u.k0(str, str3, false)) {
                String strSubstring2 = str.substring(iV02 + 1);
                jc.l.d(strSubstring2, "substring(...)");
                List listL0 = n.L0(strSubstring2, new char[]{' '});
                cVar.f25037e = true;
                cVar.f25039g = null;
                int size = listL0.size();
                cVar.f25042j.getClass();
                if (size != 2) {
                    throw new IOException("unexpected journal line: " + listL0);
                }
                try {
                    int size2 = listL0.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        cVar.f25034b[i11] = Long.parseLong((String) listL0.get(i11));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    throw new IOException("unexpected journal line: " + listL0);
                }
            }
        }
        if (iV02 == -1) {
            String str4 = f25051v;
            if (iV0 == str4.length() && u.k0(str, str4, false)) {
                cVar.f25039g = new d0(this, cVar);
                return;
            }
        }
        if (iV02 == -1) {
            String str5 = f25053x;
            if (iV0 == str5.length() && u.k0(str, str5, false)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }
}
