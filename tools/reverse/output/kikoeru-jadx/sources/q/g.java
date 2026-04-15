package q;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g implements g2.v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f17295a;

    public g(m mVar) {
        this.f17295a = mVar;
    }

    @Override // g2.v0
    public final int c(g2.y yVar, List list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((g2.u0) list.get(0)).t(i10));
            int iR = ud.b.r(list);
            int i11 = 1;
            if (1 <= iR) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((g2.u0) list.get(i11)).t(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iR) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // g2.v0
    public final int f(g2.y yVar, List list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((g2.u0) list.get(0)).m(i10));
            int iR = ud.b.r(list);
            int i11 = 1;
            if (1 <= iR) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((g2.u0) list.get(i11)).m(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iR) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // g2.v0
    public final int g(g2.y yVar, List list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((g2.u0) list.get(0)).L(i10));
            int iR = ud.b.r(list);
            int i11 = 1;
            if (1 <= iR) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((g2.u0) list.get(i11)).L(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iR) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // g2.v0
    public final g2.w0 h(g2.x0 x0Var, List list, long j10) {
        g2.g1 g1Var;
        g2.g1 g1Var2;
        int i10;
        int i11;
        int size = list.size();
        g2.g1[] g1VarArr = new g2.g1[size];
        List list2 = list;
        int size2 = list2.size();
        long j11 = 0;
        int i12 = 0;
        while (true) {
            g1Var = null;
            if (i12 >= size2) {
                break;
            }
            g2.u0 u0Var = (g2.u0) list.get(i12);
            Object objA = u0Var.A();
            i iVar = objA instanceof i ? (i) objA : null;
            if (iVar != null && ((Boolean) iVar.f17328a.getValue()).booleanValue()) {
                g2.g1 g1VarV = u0Var.v(j10);
                long j12 = (((long) g1VarV.f7181b) & 4294967295L) | (((long) g1VarV.f7180a) << 32);
                g1VarArr[i12] = g1VarV;
                j11 = j12;
            }
            i12++;
        }
        int size3 = list2.size();
        for (int i13 = 0; i13 < size3; i13++) {
            g2.u0 u0Var2 = (g2.u0) list.get(i13);
            if (g1VarArr[i13] == null) {
                g1VarArr[i13] = u0Var2.v(j10);
            }
        }
        if (x0Var.O()) {
            i10 = (int) (j11 >> 32);
        } else {
            if (size == 0) {
                g1Var2 = null;
            } else {
                g1Var2 = g1VarArr[0];
                int i14 = size - 1;
                if (i14 != 0) {
                    int i15 = g1Var2 != null ? g1Var2.f7180a : 0;
                    oc.c it = new oc.d(1, i14, 1).iterator();
                    while (it.f16312c) {
                        g2.g1 g1Var3 = g1VarArr[it.nextInt()];
                        int i16 = g1Var3 != null ? g1Var3.f7180a : 0;
                        if (i15 < i16) {
                            g1Var2 = g1Var3;
                            i15 = i16;
                        }
                    }
                }
            }
            i10 = g1Var2 != null ? g1Var2.f7180a : 0;
        }
        if (x0Var.O()) {
            i11 = (int) (j11 & 4294967295L);
        } else {
            if (size != 0) {
                g1Var = g1VarArr[0];
                int i17 = size - 1;
                if (i17 != 0) {
                    int i18 = g1Var != null ? g1Var.f7181b : 0;
                    oc.c it2 = new oc.d(1, i17, 1).iterator();
                    while (it2.f16312c) {
                        g2.g1 g1Var4 = g1VarArr[it2.nextInt()];
                        int i19 = g1Var4 != null ? g1Var4.f7181b : 0;
                        if (i18 < i19) {
                            g1Var = g1Var4;
                            i18 = i19;
                        }
                    }
                }
            }
            i11 = g1Var != null ? g1Var.f7181b : 0;
        }
        if (!x0Var.O()) {
            this.f17295a.f17362c.setValue(new f3.l((((long) i10) << 32) | (((long) i11) & 4294967295L)));
        }
        return x0Var.b0(i10, i11, vb.s.f22820a, new f(g1VarArr, this, i10, i11));
    }

    @Override // g2.v0
    public final int i(g2.y yVar, List list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((g2.u0) list.get(0)).b(i10));
            int iR = ud.b.r(list);
            int i11 = 1;
            if (1 <= iR) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((g2.u0) list.get(i11)).b(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iR) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
