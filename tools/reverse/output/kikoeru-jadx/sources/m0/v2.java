package m0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v2 implements j3.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f3.c f13733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.n f13734c;

    public v2(long j10, f3.c cVar, ic.n nVar) {
        this.f13732a = j10;
        this.f13733b = cVar;
        this.f13734c = nVar;
    }

    @Override // j3.x
    public final long a(f3.k kVar, long j10, f3.m mVar, long j11) {
        df.k kVarD0;
        Object next;
        Object obj;
        float f10 = f4.f12977b;
        f3.c cVar = this.f13733b;
        int iA0 = cVar.a0(f10);
        long j12 = this.f13732a;
        int iA02 = cVar.a0(Float.intBitsToFloat((int) (j12 >> 32)));
        f3.m mVar2 = f3.m.f6667a;
        int i10 = iA02 * (mVar == mVar2 ? 1 : -1);
        int iA03 = cVar.a0(Float.intBitsToFloat((int) (j12 & 4294967295L)));
        int i11 = kVar.f6662a;
        int i12 = kVar.f6664c;
        int i13 = i11 + i10;
        int i14 = (int) (j11 >> 32);
        int iIntValue = (i12 - i14) + i10;
        int i15 = (int) (j10 >> 32);
        int i16 = i15 - i14;
        if (mVar == mVar2) {
            Integer numValueOf = Integer.valueOf(i13);
            Integer numValueOf2 = Integer.valueOf(iIntValue);
            if (kVar.f6662a < 0) {
                i16 = 0;
            }
            kVarD0 = vb.l.d0(new Integer[]{numValueOf, numValueOf2, Integer.valueOf(i16)});
        } else {
            Integer numValueOf3 = Integer.valueOf(iIntValue);
            Integer numValueOf4 = Integer.valueOf(i13);
            if (i12 <= i15) {
                i16 = 0;
            }
            kVarD0 = vb.l.d0(new Integer[]{numValueOf3, numValueOf4, Integer.valueOf(i16)});
        }
        Iterator it = kVarD0.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int iIntValue2 = ((Number) next).intValue();
            if (iIntValue2 >= 0 && iIntValue2 + i14 <= i15) {
                break;
            }
        }
        Integer num = (Integer) next;
        if (num != null) {
            iIntValue = num.intValue();
        }
        int iMax = Math.max(kVar.f6665d + iA03, iA0);
        int i17 = kVar.f6663b;
        int i18 = (int) (j11 & 4294967295L);
        int i19 = (i17 - i18) + iA03;
        int i20 = (i17 - (i18 / 2)) + iA03;
        int i21 = (int) (j10 & 4294967295L);
        Iterator it2 = vb.l.d0(new Integer[]{Integer.valueOf(iMax), Integer.valueOf(i19), Integer.valueOf(i20), Integer.valueOf((i21 - i18) - iA0)}).iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            Object next2 = it2.next();
            int iIntValue3 = ((Number) next2).intValue();
            if (iIntValue3 >= iA0 && iIntValue3 + i18 <= i21 - iA0) {
                obj = next2;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        int iIntValue4 = num2 != null ? num2.intValue() : i19;
        this.f13734c.q(kVar, new f3.k(iIntValue, iIntValue4, i14 + iIntValue, i18 + iIntValue4));
        return (((long) iIntValue) << 32) | (((long) iIntValue4) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        return this.f13732a == v2Var.f13732a && jc.l.a(this.f13733b, v2Var.f13733b) && jc.l.a(this.f13734c, v2Var.f13734c);
    }

    public final int hashCode() {
        long j10 = this.f13732a;
        return this.f13734c.hashCode() + ((this.f13733b.hashCode() + (((int) (j10 ^ (j10 >>> 32))) * 31)) * 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) f3.g.a(this.f13732a)) + ", density=" + this.f13733b + ", onPositionCalculated=" + this.f13734c + ')';
    }
}
