package t2;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.media3.exoplayer.offline.u f20287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final androidx.media3.exoplayer.offline.u f20288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final androidx.media3.exoplayer.offline.u f20289c;

    static {
        int i10 = 16;
        f20287a = new androidx.media3.exoplayer.offline.u(i10, new x(11), new sf.i(27));
        f20288b = new androidx.media3.exoplayer.offline.u(i10, new x(12), new sf.i(28));
        f20289c = new androidx.media3.exoplayer.offline.u(i10, new x(13), new sf.i(29));
    }

    public static a a(String str, l0 l0Var, long j10, f3.c cVar, x2.d dVar, int i10, int i11) {
        vb.r rVar = vb.r.f22819a;
        return new a(new b3.c(str, l0Var, rVar, rVar, dVar, cVar), i10, 1, j10);
    }

    public static final long b(int i10, int i11) {
        if (i10 < 0 || i11 < 0) {
            z2.a.a("start and end cannot be negative. [start: " + i10 + ", end: " + i11 + ']');
        }
        long j10 = (((long) i11) & 4294967295L) | (((long) i10) << 32);
        int i12 = k0.f20357c;
        return j10;
    }

    public static final long c(int i10, long j10) {
        int i11 = k0.f20357c;
        int i12 = (int) (j10 >> 32);
        int i13 = i12 < 0 ? 0 : i12;
        if (i13 > i10) {
            i13 = i10;
        }
        int i14 = (int) (4294967295L & j10);
        int i15 = i14 >= 0 ? i14 : 0;
        if (i15 <= i10) {
            i10 = i15;
        }
        return (i13 == i12 && i10 == i14) ? j10 : b(i13, i10);
    }

    public static final int d(int i10, List list) {
        int i11;
        int i12 = ((p) vb.m.h0(list)).f20379c;
        if (i10 > ((p) vb.m.h0(list)).f20379c) {
            z2.a.a("Index " + i10 + " should be less or equal than last line's end " + i12);
        }
        int size = list.size() - 1;
        int i13 = 0;
        while (true) {
            if (i13 > size) {
                i11 = -(i13 + 1);
                break;
            }
            i11 = (i13 + size) >>> 1;
            p pVar = (p) list.get(i11);
            byte b10 = pVar.f20378b > i10 ? (byte) 1 : pVar.f20379c <= i10 ? (byte) -1 : (byte) 0;
            if (b10 >= 0) {
                if (b10 <= 0) {
                    break;
                }
                size = i11 - 1;
            } else {
                i13 = i11 + 1;
            }
        }
        if (i11 >= 0 && i11 < list.size()) {
            return i11;
        }
        StringBuilder sbO = j2.h0.o(i11, "Found paragraph index ", " should be in range [0, ");
        sbO.append(list.size());
        sbO.append(").\nDebug info: index=");
        sbO.append(i10);
        sbO.append(", paragraphs=[");
        sbO.append(h3.a.b(list, null, new sf.i(4), 31));
        sbO.append(']');
        z2.a.a(sbO.toString());
        return i11;
    }

    public static final int e(int i10, List list) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            p pVar = (p) list.get(i12);
            byte b10 = pVar.f20380d > i10 ? (byte) 1 : pVar.f20381e <= i10 ? (byte) -1 : (byte) 0;
            if (b10 < 0) {
                i11 = i12 + 1;
            } else {
                if (b10 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final int f(ArrayList arrayList, float f10) {
        if (f10 <= 0.0f) {
            return 0;
        }
        if (f10 >= ((p) vb.m.h0(arrayList)).f20383g) {
            return ud.b.r(arrayList);
        }
        int size = arrayList.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            p pVar = (p) arrayList.get(i11);
            byte b10 = pVar.f20382f > f10 ? (byte) 1 : pVar.f20383g <= f10 ? (byte) -1 : (byte) 0;
            if (b10 < 0) {
                i10 = i11 + 1;
            } else {
                if (b10 <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final void g(ArrayList arrayList, long j10, ic.k kVar) {
        int size = arrayList.size();
        for (int iD = d(k0.e(j10), arrayList); iD < size; iD++) {
            p pVar = (p) arrayList.get(iD);
            if (pVar.f20378b >= k0.d(j10)) {
                return;
            }
            if (pVar.f20378b != pVar.f20379c) {
                kVar.a(pVar);
            }
        }
    }

    public static final l0 h(l0 l0Var, f3.m mVar) {
        int i10;
        d0 d0Var = l0Var.f20362a;
        e3.o oVar = e0.f20316d;
        e3.o oVarC = d0Var.f20293a.c(new q9.j0(9));
        long j10 = d0Var.f20294b;
        f3.p[] pVarArr = f3.o.f6671b;
        if ((j10 & 1095216660480L) == 0) {
            j10 = e0.f20313a;
        }
        long j11 = j10;
        x2.k kVar = d0Var.f20295c;
        if (kVar == null) {
            kVar = x2.k.f24562d;
        }
        x2.k kVar2 = kVar;
        x2.i iVar = d0Var.f20296d;
        x2.i iVar2 = new x2.i(iVar != null ? iVar.f24558a : 0);
        x2.j jVar = d0Var.f20297e;
        x2.j jVar2 = new x2.j(jVar != null ? jVar.f24559a : 65535);
        x2.n nVar = d0Var.f20298f;
        if (nVar == null) {
            nVar = x2.n.f24568a;
        }
        x2.n nVar2 = nVar;
        String str = d0Var.f20299g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j12 = d0Var.f20300h;
        if ((j12 & 1095216660480L) == 0) {
            j12 = e0.f20314b;
        }
        long j13 = j12;
        e3.a aVar = d0Var.f20301i;
        e3.a aVar2 = new e3.a(aVar != null ? aVar.f6063a : 0.0f);
        e3.p pVar = d0Var.f20302j;
        if (pVar == null) {
            pVar = e3.p.f6088c;
        }
        e3.p pVar2 = pVar;
        a3.c cVarR = d0Var.f20303k;
        if (cVarR == null) {
            a3.c cVar = a3.c.f195c;
            cVarR = a3.e.f198a.r();
        }
        a3.c cVar2 = cVarR;
        long j14 = d0Var.f20304l;
        if (j14 == 16) {
            j14 = e0.f20315c;
        }
        long j15 = j14;
        e3.l lVar = d0Var.f20305m;
        if (lVar == null) {
            lVar = e3.l.f6082b;
        }
        e3.l lVar2 = lVar;
        q1.k0 k0Var = d0Var.f20306n;
        if (k0Var == null) {
            k0Var = q1.k0.f17544d;
        }
        q1.k0 k0Var2 = k0Var;
        v vVar = d0Var.f20307o;
        s1.e eVar = d0Var.f20308p;
        if (eVar == null) {
            eVar = s1.g.f19351a;
        }
        d0 d0Var2 = new d0(oVarC, j11, kVar2, iVar2, jVar2, nVar2, str2, j13, aVar2, pVar2, cVar2, j15, lVar2, k0Var2, vVar, eVar);
        s sVar = l0Var.f20363b;
        int i11 = t.f20397b;
        int i12 = sVar.f20387a;
        int i13 = i12 == Integer.MIN_VALUE ? 5 : i12;
        int i14 = sVar.f20388b;
        if (i14 == 3) {
            int iOrdinal = mVar.ordinal();
            if (iOrdinal == 0) {
                i10 = 4;
            } else {
                if (iOrdinal != 1) {
                    throw new ce.j0();
                }
                i10 = 5;
            }
        } else if (i14 == Integer.MIN_VALUE) {
            int iOrdinal2 = mVar.ordinal();
            if (iOrdinal2 == 0) {
                i10 = 1;
            } else {
                if (iOrdinal2 != 1) {
                    throw new ce.j0();
                }
                i10 = 2;
            }
        } else {
            i10 = i14;
        }
        long j16 = sVar.f20389c;
        if ((j16 & 1095216660480L) == 0) {
            j16 = t.f20396a;
        }
        e3.q qVar = sVar.f20390d;
        if (qVar == null) {
            qVar = e3.q.f6091c;
        }
        e3.q qVar2 = qVar;
        u uVar = sVar.f20391e;
        e3.i iVar3 = sVar.f20392f;
        int i15 = sVar.f20393g;
        if (i15 == 0) {
            i15 = e3.e.f6068b;
        }
        int i16 = i15;
        int i17 = sVar.f20394h;
        int i18 = i17 == Integer.MIN_VALUE ? 1 : i17;
        e3.s sVar2 = sVar.f20395i;
        if (sVar2 == null) {
            sVar2 = e3.s.f6095c;
        }
        return new l0(d0Var2, new s(i13, i10, j16, qVar2, uVar, iVar3, i16, i18, sVar2), l0Var.f20364c);
    }
}
