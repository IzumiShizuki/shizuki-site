package ge;

import se.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7537b = 0;

    public y(byte b10) {
        super(Byte.valueOf(b10));
    }

    @Override // ge.g
    public final se.w a(yc.y yVar) {
        a0 a0VarE;
        a0 a0VarE2;
        a0 a0VarE3;
        a0 a0VarE4;
        switch (this.f7537b) {
            case 0:
                jc.l.e(yVar, "module");
                yc.e eVarD = yc.v.d(yVar, vc.n.S);
                return (eVarD == null || (a0VarE = eVarD.E()) == null) ? ue.l.c(ue.k.NOT_FOUND_UNSIGNED_TYPE, "UByte") : a0VarE;
            case 1:
                jc.l.e(yVar, "module");
                yc.e eVarD2 = yc.v.d(yVar, vc.n.U);
                return (eVarD2 == null || (a0VarE2 = eVarD2.E()) == null) ? ue.l.c(ue.k.NOT_FOUND_UNSIGNED_TYPE, "UInt") : a0VarE2;
            case 2:
                jc.l.e(yVar, "module");
                yc.e eVarD3 = yc.v.d(yVar, vc.n.V);
                return (eVarD3 == null || (a0VarE3 = eVarD3.E()) == null) ? ue.l.c(ue.k.NOT_FOUND_UNSIGNED_TYPE, "ULong") : a0VarE3;
            default:
                jc.l.e(yVar, "module");
                yc.e eVarD4 = yc.v.d(yVar, vc.n.T);
                return (eVarD4 == null || (a0VarE4 = eVarD4.E()) == null) ? ue.l.c(ue.k.NOT_FOUND_UNSIGNED_TYPE, "UShort") : a0VarE4;
        }
    }

    @Override // ge.g
    public final String toString() {
        switch (this.f7537b) {
            case 0:
                return ((Number) this.f7527a).intValue() + ".toUByte()";
            case 1:
                return ((Number) this.f7527a).intValue() + ".toUInt()";
            case 2:
                return ((Number) this.f7527a).longValue() + ".toULong()";
            default:
                return ((Number) this.f7527a).intValue() + ".toUShort()";
        }
    }

    public y(short s10) {
        super(Short.valueOf(s10));
    }

    public y(int i10) {
        super(Integer.valueOf(i10));
    }

    public y(long j10) {
        super(Long.valueOf(j10));
    }
}
