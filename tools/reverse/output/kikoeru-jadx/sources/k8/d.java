package k8;

import a9.k;
import b5.d0;
import ef.l;
import ef.n;
import hf.u;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import lh.a0;
import lh.b0;
import lh.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Closeable, Flushable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final l f11203q = new l("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f11204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f11206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f11207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y f11208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f11209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nf.d f11210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f11211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11212i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a0 f11213j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f11214k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f11215l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f11216m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f11217n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f11218o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f11219p;

    public d(long j10, u uVar, lh.l lVar, y yVar) {
        this.f11204a = yVar;
        this.f11205b = j10;
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f11206c = yVar.d("journal");
        this.f11207d = yVar.d("journal.tmp");
        this.f11208e = yVar.d("journal.bkp");
        this.f11209f = new LinkedHashMap(0, 0.75f, true);
        this.f11210g = hf.a0.b(ud.b.C(hf.a0.e(), uVar.h0(1)));
        this.f11219p = new c(lVar);
    }

    public static void D(String str) {
        if (!f11203q.d(str)) {
            throw new IllegalArgumentException(a0.c.G('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0119 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0011, B:11:0x0018, B:13:0x0020, B:15:0x0030, B:23:0x003e, B:25:0x0056, B:29:0x0073, B:31:0x0081, B:33:0x0088, B:26:0x005c, B:28:0x006c, B:37:0x00a8, B:39:0x00af, B:42:0x00b4, B:44:0x00c5, B:47:0x00ca, B:52:0x0105, B:54:0x0110, B:58:0x0119, B:48:0x00e2, B:50:0x00f7, B:51:0x0102, B:36:0x0098, B:61:0x011e, B:62:0x0125), top: B:65:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(k8.d r9, b5.d0 r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.d.b(k8.d, b5.d0, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        y(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B() {
        /*
            r5 = this;
        L0:
            long r0 = r5.f11211h
            long r2 = r5.f11205b
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L27
            java.util.LinkedHashMap r0 = r5.f11209f
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            k8.a r1 = (k8.a) r1
            boolean r2 = r1.f11196f
            if (r2 != 0) goto L12
            r5.y(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r5.f11217n = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.d.B():void");
    }

    public final synchronized void G() {
        Throwable th2;
        try {
            a0 a0Var = this.f11213j;
            if (a0Var != null) {
                a0Var.close();
            }
            a0 a0VarK = g8.a.k(this.f11219p.G(this.f11207d));
            try {
                a0VarK.E("libcore.io.DiskLruCache");
                a0VarK.writeByte(10);
                a0VarK.E("1");
                a0VarK.writeByte(10);
                a0VarK.b0(1);
                a0VarK.writeByte(10);
                a0VarK.b0(2);
                a0VarK.writeByte(10);
                a0VarK.writeByte(10);
                for (a aVar : this.f11209f.values()) {
                    if (aVar.f11197g != null) {
                        a0VarK.E("DIRTY");
                        a0VarK.writeByte(32);
                        a0VarK.E(aVar.f11191a);
                        a0VarK.writeByte(10);
                    } else {
                        a0VarK.E("CLEAN");
                        a0VarK.writeByte(32);
                        a0VarK.E(aVar.f11191a);
                        for (long j10 : aVar.f11192b) {
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
            if (this.f11219p.q(this.f11206c)) {
                this.f11219p.g(this.f11206c, this.f11208e);
                this.f11219p.g(this.f11207d, this.f11206c);
                this.f11219p.o(this.f11208e);
            } else {
                this.f11219p.g(this.f11207d, this.f11206c);
            }
            c cVar = this.f11219p;
            y yVar = this.f11206c;
            cVar.getClass();
            jc.l.e(yVar, "file");
            this.f11213j = g8.a.k(new e(cVar.b(yVar), new e7.y(9, this)));
            this.f11212i = 0;
            this.f11214k = false;
            this.f11218o = false;
        } catch (Throwable th6) {
            throw th6;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f11215l && !this.f11216m) {
                for (a aVar : (a[]) this.f11209f.values().toArray(new a[0])) {
                    d0 d0Var = aVar.f11197g;
                    if (d0Var != null) {
                        a aVar2 = (a) d0Var.f1521b;
                        if (jc.l.a(aVar2.f11197g, d0Var)) {
                            aVar2.f11196f = true;
                        }
                    }
                }
                B();
                hf.a0.h(this.f11210g, null);
                a0 a0Var = this.f11213j;
                jc.l.b(a0Var);
                a0Var.close();
                this.f11213j = null;
                this.f11216m = true;
                return;
            }
            this.f11216m = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f11215l) {
            if (this.f11216m) {
                throw new IllegalStateException("cache is closed");
            }
            B();
            a0 a0Var = this.f11213j;
            jc.l.b(a0Var);
            a0Var.flush();
        }
    }

    public final synchronized d0 g(String str) {
        if (this.f11216m) {
            throw new IllegalStateException("cache is closed");
        }
        D(str);
        k();
        a aVar = (a) this.f11209f.get(str);
        if ((aVar != null ? aVar.f11197g : null) != null) {
            return null;
        }
        if (aVar != null && aVar.f11198h != 0) {
            return null;
        }
        if (!this.f11217n && !this.f11218o) {
            a0 a0Var = this.f11213j;
            jc.l.b(a0Var);
            a0Var.E("DIRTY");
            a0Var.writeByte(32);
            a0Var.E(str);
            a0Var.writeByte(10);
            a0Var.flush();
            if (this.f11214k) {
                return null;
            }
            if (aVar == null) {
                aVar = new a(this, str);
                this.f11209f.put(str, aVar);
            }
            d0 d0Var = new d0(this, aVar);
            aVar.f11197g = d0Var;
            return d0Var;
        }
        n();
        return null;
    }

    public final synchronized b i(String str) {
        b bVarA;
        if (this.f11216m) {
            throw new IllegalStateException("cache is closed");
        }
        D(str);
        k();
        a aVar = (a) this.f11209f.get(str);
        if (aVar != null && (bVarA = aVar.a()) != null) {
            boolean z10 = true;
            this.f11212i++;
            a0 a0Var = this.f11213j;
            jc.l.b(a0Var);
            a0Var.E("READ");
            a0Var.writeByte(32);
            a0Var.E(str);
            a0Var.writeByte(10);
            if (this.f11212i < 2000) {
                z10 = false;
            }
            if (z10) {
                n();
            }
            return bVarA;
        }
        return null;
    }

    public final synchronized void k() {
        try {
            if (this.f11215l) {
                return;
            }
            this.f11219p.o(this.f11207d);
            if (this.f11219p.q(this.f11208e)) {
                if (this.f11219p.q(this.f11206c)) {
                    this.f11219p.o(this.f11208e);
                } else {
                    this.f11219p.g(this.f11208e, this.f11206c);
                }
            }
            if (this.f11219p.q(this.f11206c)) {
                try {
                    q();
                    o();
                    this.f11215l = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        ua.l.O(this.f11219p, this.f11204a);
                        this.f11216m = false;
                        G();
                        this.f11215l = true;
                    } catch (Throwable th2) {
                        this.f11216m = false;
                        throw th2;
                    }
                }
            }
            G();
            this.f11215l = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void n() {
        hf.a0.y(this.f11210g, null, null, new k(9, this, null), 3);
    }

    public final void o() {
        Iterator it = this.f11209f.values().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            a aVar = (a) it.next();
            int i10 = 0;
            if (aVar.f11197g == null) {
                while (i10 < 2) {
                    j10 += aVar.f11192b[i10];
                    i10++;
                }
            } else {
                aVar.f11197g = null;
                while (i10 < 2) {
                    y yVar = (y) aVar.f11193c.get(i10);
                    c cVar = this.f11219p;
                    cVar.o(yVar);
                    cVar.o((y) aVar.f11194d.get(i10));
                    i10++;
                }
                it.remove();
            }
        }
        this.f11211h = j10;
    }

    public final void q() throws Throwable {
        c cVar = this.f11219p;
        y yVar = this.f11206c;
        b0 b0VarL = g8.a.l(cVar.L(yVar));
        try {
            String strX = b0VarL.x(Long.MAX_VALUE);
            String strX2 = b0VarL.x(Long.MAX_VALUE);
            String strX3 = b0VarL.x(Long.MAX_VALUE);
            String strX4 = b0VarL.x(Long.MAX_VALUE);
            String strX5 = b0VarL.x(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strX) || !"1".equals(strX2) || !jc.l.a(String.valueOf(1), strX3) || !jc.l.a(String.valueOf(2), strX4) || strX5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strX + ", " + strX2 + ", " + strX3 + ", " + strX4 + ", " + strX5 + ']');
            }
            int i10 = 0;
            while (true) {
                try {
                    u(b0VarL.x(Long.MAX_VALUE));
                    i10++;
                } catch (EOFException unused) {
                    this.f11212i = i10 - this.f11209f.size();
                    if (b0VarL.b()) {
                        cVar.getClass();
                        jc.l.e(yVar, "file");
                        this.f11213j = g8.a.k(new e(cVar.b(yVar), new e7.y(9, this)));
                    } else {
                        G();
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

    public final void u(String str) throws IOException {
        String strSubstring;
        int iV0 = n.v0(str, ' ', 0, 6);
        if (iV0 == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i10 = iV0 + 1;
        int iV02 = n.v0(str, ' ', i10, 4);
        LinkedHashMap linkedHashMap = this.f11209f;
        if (iV02 == -1) {
            strSubstring = str.substring(i10);
            jc.l.d(strSubstring, "substring(...)");
            if (iV0 == 6 && ef.u.k0(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iV02);
            jc.l.d(strSubstring, "substring(...)");
        }
        Object aVar = linkedHashMap.get(strSubstring);
        if (aVar == null) {
            aVar = new a(this, strSubstring);
            linkedHashMap.put(strSubstring, aVar);
        }
        a aVar2 = (a) aVar;
        if (iV02 == -1 || iV0 != 5 || !ef.u.k0(str, "CLEAN", false)) {
            if (iV02 == -1 && iV0 == 5 && ef.u.k0(str, "DIRTY", false)) {
                aVar2.f11197g = new d0(this, aVar2);
                return;
            } else {
                if (iV02 != -1 || iV0 != 4 || !ef.u.k0(str, "READ", false)) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String strSubstring2 = str.substring(iV02 + 1);
        jc.l.d(strSubstring2, "substring(...)");
        List listL0 = n.L0(strSubstring2, new char[]{' '});
        aVar2.f11195e = true;
        aVar2.f11197g = null;
        if (listL0.size() != 2) {
            throw new IOException("unexpected journal line: " + listL0);
        }
        try {
            int size = listL0.size();
            for (int i11 = 0; i11 < size; i11++) {
                aVar2.f11192b[i11] = Long.parseLong((String) listL0.get(i11));
            }
        } catch (NumberFormatException unused) {
            throw new IOException("unexpected journal line: " + listL0);
        }
    }

    public final void y(a aVar) {
        a0 a0Var;
        int i10 = aVar.f11198h;
        String str = aVar.f11191a;
        if (i10 > 0 && (a0Var = this.f11213j) != null) {
            a0Var.E("DIRTY");
            a0Var.writeByte(32);
            a0Var.E(str);
            a0Var.writeByte(10);
            a0Var.flush();
        }
        if (aVar.f11198h > 0 || aVar.f11197g != null) {
            aVar.f11196f = true;
            return;
        }
        for (int i11 = 0; i11 < 2; i11++) {
            this.f11219p.o((y) aVar.f11193c.get(i11));
            long j10 = this.f11211h;
            long[] jArr = aVar.f11192b;
            this.f11211h = j10 - jArr[i11];
            jArr[i11] = 0;
        }
        this.f11212i++;
        a0 a0Var2 = this.f11213j;
        if (a0Var2 != null) {
            a0Var2.E("REMOVE");
            a0Var2.writeByte(32);
            a0Var2.E(str);
            a0Var2.writeByte(10);
        }
        this.f11209f.remove(str);
        if (this.f11212i >= 2000) {
            n();
        }
    }
}
