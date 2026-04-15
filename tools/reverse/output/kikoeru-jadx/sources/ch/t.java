package ch;

import j2.h0;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t implements Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f4250d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lh.h f4251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f4252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f4253c;

    static {
        Logger logger = Logger.getLogger(h.class.getName());
        jc.l.d(logger, "getLogger(...)");
        f4250d = logger;
    }

    public t(lh.b0 b0Var) {
        jc.l.e(b0Var, "source");
        this.f4251a = b0Var;
        s sVar = new s(b0Var);
        this.f4252b = sVar;
        this.f4253c = new e(sVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x014d, code lost:
    
        throw new java.io.IOException(q.t0.B(r8, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(boolean r13, bd.i r14) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.t.b(boolean, bd.i):boolean");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f4251a.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x011f, code lost:
    
        if (r20 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0121, code lost:
    
        r9.i(ug.r.f21859b, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(bd.i r18, int r19, int r20, final int r21) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.t.g(bd.i, int, int, int):void");
    }

    public final void i(bd.i iVar, int i10, int i11) throws IOException {
        b bVar;
        Object[] array;
        if (i10 < 8) {
            throw new IOException(t0.B(i10, "TYPE_GOAWAY length < 8: "));
        }
        if (i11 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i12 = this.f4251a.readInt();
        int i13 = this.f4251a.readInt();
        int i14 = i10 - 8;
        b.f4146b.getClass();
        b[] bVarArrValues = b.values();
        int length = bVarArrValues.length;
        int i15 = 0;
        while (true) {
            if (i15 >= length) {
                bVar = null;
                break;
            }
            bVar = bVarArrValues[i15];
            if (bVar.f4154a == i13) {
                break;
            } else {
                i15++;
            }
        }
        if (bVar == null) {
            throw new IOException(t0.B(i13, "TYPE_GOAWAY unexpected error code: "));
        }
        lh.i iVarJ = lh.i.f12572d;
        if (i14 > 0) {
            iVarJ = this.f4251a.j(i14);
        }
        jc.l.e(iVarJ, "debugData");
        iVarJ.d();
        p pVar = (p) iVar.f2586c;
        synchronized (pVar) {
            array = pVar.f4212b.values().toArray(new x[0]);
            pVar.f4216f = true;
        }
        for (x xVar : (x[]) array) {
            if (xVar.f4265a > i12 && xVar.g()) {
                xVar.j(b.f4151g);
                ((p) iVar.f2586c).k(xVar.f4265a);
            }
        }
    }

    public final List k(int i10, int i11, int i12, int i13) throws IOException {
        s sVar = this.f4252b;
        sVar.f4248e = i10;
        sVar.f4245b = i10;
        sVar.f4249f = i11;
        sVar.f4246c = i12;
        sVar.f4247d = i13;
        e eVar = this.f4253c;
        lh.b0 b0Var = eVar.f4171c;
        ArrayList arrayList = eVar.f4170b;
        while (!b0Var.b()) {
            byte b10 = b0Var.readByte();
            byte[] bArr = wg.e.f24227a;
            int i14 = b10 & 255;
            if (i14 == 128) {
                throw new IOException("index == 0");
            }
            if ((b10 & 128) == 128) {
                int iE = eVar.e(i14, 127);
                int i15 = iE - 1;
                if (i15 >= 0) {
                    d[] dVarArr = g.f4184a;
                    if (i15 <= dVarArr.length - 1) {
                        arrayList.add(dVarArr[i15]);
                    }
                }
                int length = eVar.f4173e + 1 + (i15 - g.f4184a.length);
                if (length >= 0) {
                    d[] dVarArr2 = eVar.f4172d;
                    if (length < dVarArr2.length) {
                        d dVar = dVarArr2[length];
                        jc.l.b(dVar);
                        arrayList.add(dVar);
                    }
                }
                throw new IOException(t0.B(iE, "Header index too large "));
            }
            if (i14 == 64) {
                d[] dVarArr3 = g.f4184a;
                lh.i iVarD = eVar.d();
                g.a(iVarD);
                eVar.c(new d(iVarD, eVar.d()));
            } else if ((b10 & 64) == 64) {
                eVar.c(new d(eVar.b(eVar.e(i14, 63) - 1), eVar.d()));
            } else if ((b10 & 32) == 32) {
                int iE2 = eVar.e(i14, 31);
                eVar.f4169a = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + eVar.f4169a);
                }
                int i16 = eVar.f4175g;
                if (iE2 < i16) {
                    if (iE2 == 0) {
                        d[] dVarArr4 = eVar.f4172d;
                        vb.l.p0(0, dVarArr4.length, dVarArr4);
                        eVar.f4173e = eVar.f4172d.length - 1;
                        eVar.f4174f = 0;
                        eVar.f4175g = 0;
                    } else {
                        eVar.a(i16 - iE2);
                    }
                }
            } else if (i14 == 16 || i14 == 0) {
                d[] dVarArr5 = g.f4184a;
                lh.i iVarD2 = eVar.d();
                g.a(iVarD2);
                arrayList.add(new d(iVarD2, eVar.d()));
            } else {
                arrayList.add(new d(eVar.b(eVar.e(i14, 15) - 1), eVar.d()));
            }
        }
        List listG0 = vb.m.G0(arrayList);
        arrayList.clear();
        return listG0;
    }

    public final void n(bd.i iVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        int i13 = 0;
        boolean z10 = (i11 & 1) != 0;
        if ((i11 & 8) != 0) {
            byte b10 = this.f4251a.readByte();
            byte[] bArr = wg.e.f24227a;
            i13 = b10 & 255;
        }
        if ((i11 & 32) != 0) {
            lh.h hVar = this.f4251a;
            hVar.readInt();
            hVar.readByte();
            byte[] bArr2 = wg.e.f24227a;
            i10 -= 5;
        }
        List listK = k(r.a(i10, i11, i13), i13, i11, i12);
        p pVar = (p) iVar.f2586c;
        if (i12 != 0 && (i12 & 1) == 0) {
            yg.b.c(pVar.f4219i, pVar.f4213c + '[' + i12 + "] onHeaders", new k(pVar, i12, listK, z10));
            return;
        }
        synchronized (pVar) {
            x xVarG = pVar.g(i12);
            if (xVarG != null) {
                xVarG.i(wg.g.g(listK), z10);
                return;
            }
            if (pVar.f4216f) {
                return;
            }
            if (i12 <= pVar.f4214d) {
                return;
            }
            if (i12 % 2 == pVar.f4215e % 2) {
                return;
            }
            x xVar = new x(i12, pVar, false, z10, wg.g.g(listK));
            pVar.f4214d = i12;
            pVar.f4212b.put(Integer.valueOf(i12), xVar);
            yg.b.c(pVar.f4217g.d(), pVar.f4213c + '[' + i12 + "] onStream", new a9.d(5, pVar, xVar));
        }
    }

    public final void o(bd.i iVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 8) {
            throw new IOException(t0.B(i10, "TYPE_PING length != 8: "));
        }
        if (i12 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        final int i13 = this.f4251a.readInt();
        final int i14 = this.f4251a.readInt();
        if (!((i11 & 1) != 0)) {
            yg.b bVar = ((p) iVar.f2586c).f4218h;
            String strN = h0.n(new StringBuilder(), ((p) iVar.f2586c).f4213c, " ping");
            final p pVar = (p) iVar.f2586c;
            yg.b.c(bVar, strN, new ic.a() { // from class: ch.o
                @Override // ic.a
                public final Object b() {
                    p pVar2 = pVar;
                    try {
                        pVar2.f4233w.o(i13, i14, true);
                    } catch (IOException e10) {
                        b bVar2 = b.f4148d;
                        pVar2.b(bVar2, bVar2, e10);
                    }
                    return ub.a0.f21526a;
                }
            });
            return;
        }
        p pVar2 = (p) iVar.f2586c;
        synchronized (pVar2) {
            try {
                if (i13 == 1) {
                    pVar2.f4222l++;
                } else if (i13 == 2) {
                    pVar2.f4224n++;
                } else if (i13 == 3) {
                    pVar2.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void q(bd.i iVar, int i10, int i11, int i12) throws IOException {
        int i13;
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int i14 = 0;
        if ((i11 & 8) != 0) {
            byte b10 = this.f4251a.readByte();
            byte[] bArr = wg.e.f24227a;
            i13 = b10 & 255;
        } else {
            i13 = 0;
        }
        int i15 = this.f4251a.readInt() & Integer.MAX_VALUE;
        List listK = k(r.a(i10 - 4, i11, i13), i13, i11, i12);
        p pVar = (p) iVar.f2586c;
        synchronized (pVar) {
            if (pVar.f4235y.contains(Integer.valueOf(i15))) {
                pVar.u(i15, b.f4148d);
                return;
            }
            pVar.f4235y.add(Integer.valueOf(i15));
            yg.b.c(pVar.f4219i, pVar.f4213c + '[' + i15 + "] onRequest", new k(pVar, i15, listK, i14));
        }
    }
}
