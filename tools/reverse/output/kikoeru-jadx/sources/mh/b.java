package mh;

import ef.n;
import g5.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import jc.u;
import jc.x;
import lh.b0;
import lh.e0;
import lh.y;
import q.t0;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f15166a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c3) {
        if ('0' <= c3 && c3 < ':') {
            return c3 - '0';
        }
        if ('a' <= c3 && c3 < 'g') {
            return c3 - 'W';
        }
        if ('A' <= c3 && c3 < 'G') {
            return c3 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c3);
    }

    public static final LinkedHashMap b(ArrayList arrayList) {
        String str = y.f12619b;
        y yVarV = w.v("/");
        ub.k[] kVarArr = {new ub.k(yVarV, new j(yVarV, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(vb.w.t(1));
        vb.w.y(linkedHashMap, kVarArr);
        for (j jVar : vb.m.C0(arrayList, new gb.j(2))) {
            if (((j) linkedHashMap.put(jVar.f15188a, jVar)) == null) {
                while (true) {
                    y yVar = jVar.f15188a;
                    y yVarB = yVar.b();
                    if (yVarB != null) {
                        j jVar2 = (j) linkedHashMap.get(yVarB);
                        if (jVar2 != null) {
                            jVar2.f15204q.add(yVar);
                            break;
                        }
                        j jVar3 = new j(yVarB, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        linkedHashMap.put(yVarB, jVar3);
                        jVar3.f15204q.add(yVar);
                        jVar = jVar3;
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static final String c(int i10) {
        gh.g.j(16);
        String string = Integer.toString(i10, 16);
        jc.l.d(string, "toString(...)");
        return "0x".concat(string);
    }

    public static final j d(final b0 b0Var) throws IOException {
        int i10 = b0Var.i();
        if (i10 != 33639248) {
            throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(i10));
        }
        b0Var.skip(4L);
        short sN = b0Var.n();
        int i11 = sN & 65535;
        if ((sN & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i11));
        }
        int iN = b0Var.n() & 65535;
        int iN2 = b0Var.n() & 65535;
        int iN3 = b0Var.n() & 65535;
        long jI = ((long) b0Var.i()) & 4294967295L;
        final x xVar = new x();
        xVar.f10837a = ((long) b0Var.i()) & 4294967295L;
        final x xVar2 = new x();
        xVar2.f10837a = ((long) b0Var.i()) & 4294967295L;
        int iN4 = b0Var.n() & 65535;
        int iN5 = b0Var.n() & 65535;
        int iN6 = 65535 & b0Var.n();
        b0Var.skip(8L);
        final x xVar3 = new x();
        xVar3.f10837a = ((long) b0Var.i()) & 4294967295L;
        String strO = b0Var.o(iN4);
        if (n.o0(strO, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j10 = xVar2.f10837a == 4294967295L ? 8 : 0L;
        long j11 = xVar.f10837a == 4294967295L ? j10 + ((long) 8) : j10;
        if (xVar3.f10837a == 4294967295L) {
            j11 += (long) 8;
        }
        final long j12 = j11;
        final jc.y yVar = new jc.y();
        final jc.y yVar2 = new jc.y();
        final jc.y yVar3 = new jc.y();
        final u uVar = new u();
        e(b0Var, iN5, new ic.n() { // from class: mh.l
            @Override // ic.n
            public final Object q(Object obj, Object obj2) throws IOException {
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                b0 b0Var2 = b0Var;
                if (iIntValue == 1) {
                    u uVar2 = uVar;
                    if (uVar2.f10834a) {
                        throw new IOException("bad zip: zip64 extra repeated");
                    }
                    uVar2.f10834a = true;
                    if (jLongValue < j12) {
                        throw new IOException("bad zip: zip64 extra too short");
                    }
                    x xVar4 = xVar2;
                    long jK = xVar4.f10837a;
                    if (jK == 4294967295L) {
                        jK = b0Var2.k();
                    }
                    xVar4.f10837a = jK;
                    x xVar5 = xVar;
                    xVar5.f10837a = xVar5.f10837a == 4294967295L ? b0Var2.k() : 0L;
                    x xVar6 = xVar3;
                    xVar6.f10837a = xVar6.f10837a == 4294967295L ? b0Var2.k() : 0L;
                } else if (iIntValue == 10) {
                    if (jLongValue < 4) {
                        throw new IOException("bad zip: NTFS extra too short");
                    }
                    b0Var2.skip(4L);
                    b.e(b0Var2, (int) (jLongValue - 4), new k(yVar, b0Var2, yVar2, yVar3));
                }
                return a0.f21526a;
            }
        });
        if (j12 > 0 && !uVar.f10834a) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String strO2 = b0Var.o(iN6);
        String str = y.f12619b;
        return new j(w.v("/").d(strO), ef.u.c0(strO, "/", false), strO2, jI, xVar.f10837a, xVar2.f10837a, iN, xVar3.f10837a, iN3, iN2, (Long) yVar.f10838a, (Long) yVar2.f10838a, (Long) yVar3.f10838a, 57344);
    }

    public static final void e(b0 b0Var, int i10, ic.n nVar) throws IOException {
        lh.f fVar = b0Var.f12545b;
        long j10 = i10;
        while (j10 != 0) {
            if (j10 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iN = b0Var.n() & 65535;
            long jN = ((long) b0Var.n()) & 65535;
            long j11 = j10 - ((long) 4);
            if (j11 < jN) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            b0Var.a0(jN);
            long j12 = fVar.f12571b;
            nVar.q(Integer.valueOf(iN), Long.valueOf(jN));
            long j13 = (fVar.f12571b + jN) - j12;
            if (j13 < 0) {
                throw new IOException(t0.B(iN, "unsupported zip: too many bytes processed for "));
            }
            if (j13 > 0) {
                fVar.skip(j13);
            }
            j10 = j11 - jN;
        }
    }

    public static final j f(b0 b0Var, j jVar) throws IOException {
        int i10 = b0Var.i();
        if (i10 != 67324752) {
            throw new IOException("bad zip: expected " + c(67324752) + " but was " + c(i10));
        }
        b0Var.skip(2L);
        short sN = b0Var.n();
        int i11 = sN & 65535;
        if ((sN & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i11));
        }
        b0Var.skip(18L);
        long jN = ((long) b0Var.n()) & 65535;
        int iN = b0Var.n() & 65535;
        b0Var.skip(jN);
        if (jVar == null) {
            b0Var.skip(iN);
            return null;
        }
        jc.y yVar = new jc.y();
        jc.y yVar2 = new jc.y();
        jc.y yVar3 = new jc.y();
        e(b0Var, iN, new k(b0Var, yVar, yVar2, yVar3));
        return new j(jVar.f15188a, jVar.f15189b, jVar.f15190c, jVar.f15191d, jVar.f15192e, jVar.f15193f, jVar.f15194g, jVar.f15195h, jVar.f15196i, jVar.f15197j, jVar.f15198k, jVar.f15199l, jVar.f15200m, (Integer) yVar.f10838a, (Integer) yVar2.f10838a, (Integer) yVar3.f10838a);
    }

    public static final int g(e0 e0Var, int i10) {
        int i11;
        int[] iArr = e0Var.f12569f;
        int i12 = i10 + 1;
        int length = e0Var.f12568e.length;
        jc.l.e(iArr, "<this>");
        int i13 = length - 1;
        int i14 = 0;
        while (true) {
            if (i14 <= i13) {
                i11 = (i14 + i13) >>> 1;
                int i15 = iArr[i11];
                if (i15 >= i12) {
                    if (i15 <= i12) {
                        break;
                    }
                    i13 = i11 - 1;
                } else {
                    i14 = i11 + 1;
                }
            } else {
                i11 = (-i14) - 1;
                break;
            }
        }
        return i11 >= 0 ? i11 : ~i11;
    }
}
