package g0;

import f3.m;
import jc.l;
import n7.b0;
import q1.c0;
import q1.d0;
import q1.h0;
import q1.l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f7118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f7119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f7120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f7121d;

    public f(a aVar, a aVar2, a aVar3, a aVar4) {
        this.f7118a = aVar;
        this.f7119b = aVar2;
        this.f7120c = aVar3;
        this.f7121d = aVar4;
    }

    public static f b(f fVar, c cVar, a aVar, a aVar2, int i10) {
        a aVar3 = cVar;
        if ((i10 & 1) != 0) {
            aVar3 = fVar.f7118a;
        }
        a aVar4 = fVar.f7119b;
        if ((i10 & 4) != 0) {
            aVar = fVar.f7120c;
        }
        fVar.getClass();
        return new f(aVar3, aVar4, aVar, aVar2);
    }

    @Override // q1.l0
    public final h0 a(long j10, m mVar, f3.c cVar) {
        float fB = this.f7118a.b(j10, cVar);
        float fB2 = this.f7119b.b(j10, cVar);
        float fB3 = this.f7120c.b(j10, cVar);
        float fB4 = this.f7121d.b(j10, cVar);
        float fC = p1.e.c(j10);
        float f10 = fB + fB4;
        if (f10 > fC) {
            float f11 = fC / f10;
            fB *= f11;
            fB4 *= f11;
        }
        float f12 = fB2 + fB3;
        if (f12 > fC) {
            float f13 = fC / f12;
            fB2 *= f13;
            fB3 *= f13;
        }
        if (fB < 0.0f || fB2 < 0.0f || fB3 < 0.0f || fB4 < 0.0f) {
            x.a.a("Corner size in Px can't be negative(topStart = " + fB + ", topEnd = " + fB2 + ", bottomEnd = " + fB3 + ", bottomStart = " + fB4 + ")!");
        }
        if (fB + fB2 + fB3 + fB4 == 0.0f) {
            return new c0(b0.f(0L, j10));
        }
        p1.c cVarF = b0.f(0L, j10);
        m mVar2 = m.f6667a;
        float f14 = mVar == mVar2 ? fB : fB2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L);
        if (mVar == mVar2) {
            fB = fB2;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L);
        float f15 = mVar == mVar2 ? fB3 : fB4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L);
        if (mVar != mVar2) {
            fB4 = fB3;
        }
        return new d0(new p1.d(cVarF.f16483a, cVarF.f16484b, cVarF.f16485c, cVarF.f16486d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fB4)) << 32) | (((long) Float.floatToRawIntBits(fB4)) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f7118a, fVar.f7118a) && l.a(this.f7119b, fVar.f7119b) && l.a(this.f7120c, fVar.f7120c) && l.a(this.f7121d, fVar.f7121d);
    }

    public final int hashCode() {
        return this.f7121d.hashCode() + ((this.f7120c.hashCode() + ((this.f7119b.hashCode() + (this.f7118a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f7118a + ", topEnd = " + this.f7119b + ", bottomEnd = " + this.f7120c + ", bottomStart = " + this.f7121d + ')';
    }
}
