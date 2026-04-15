package t4;

import j2.h0;
import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TreeSet f20469c = new TreeSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f20470d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s f20471e;

    public o(int i10, String str, s sVar) {
        this.f20467a = i10;
        this.f20468b = str;
        this.f20471e = sVar;
    }

    public final long a(long j10, long j11) {
        p4.c.c(j10 >= 0);
        p4.c.c(j11 >= 0);
        z zVarB = b(j10, j11);
        long j12 = zVarB.f20451c;
        if (!zVarB.f20452d) {
            if (j12 == -1) {
                j12 = Long.MAX_VALUE;
            }
            return -Math.min(j12, j11);
        }
        long j13 = j10 + j11;
        long j14 = j13 >= 0 ? j13 : Long.MAX_VALUE;
        long jMax = zVarB.f20450b + j12;
        if (jMax < j14) {
            for (z zVar : this.f20469c.tailSet(zVarB, false)) {
                long j15 = zVar.f20450b;
                if (j15 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j15 + zVar.f20451c);
                if (jMax >= j14) {
                    break;
                }
            }
        }
        return Math.min(jMax - j10, j11);
    }

    public final z b(long j10, long j11) {
        long jMin = j11;
        z zVar = new z(this.f20468b, j10, -1L, -9223372036854775807L, null);
        TreeSet treeSet = this.f20469c;
        z zVar2 = (z) treeSet.floor(zVar);
        if (zVar2 != null && zVar2.f20450b + zVar2.f20451c > j10) {
            return zVar2;
        }
        z zVar3 = (z) treeSet.ceiling(zVar);
        if (zVar3 != null) {
            long j12 = zVar3.f20450b - j10;
            jMin = jMin == -1 ? j12 : Math.min(j12, jMin);
        }
        return new z(this.f20468b, j10, jMin, -9223372036854775807L, null);
    }

    public final boolean c(long j10, long j11) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f20470d;
            if (i10 >= arrayList.size()) {
                return false;
            }
            n nVar = (n) arrayList.get(i10);
            long j12 = nVar.f20465a;
            long j13 = nVar.f20466b;
            if (j13 == -1) {
                if (j10 >= j12) {
                    return true;
                }
            } else if (j11 != -1 && j12 <= j10 && j10 + j11 <= j12 + j13) {
                return true;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f20467a == oVar.f20467a && this.f20468b.equals(oVar.f20468b) && this.f20469c.equals(oVar.f20469c) && this.f20471e.equals(oVar.f20471e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f20471e.hashCode() + h0.e(this.f20467a * 31, 31, this.f20468b);
    }
}
