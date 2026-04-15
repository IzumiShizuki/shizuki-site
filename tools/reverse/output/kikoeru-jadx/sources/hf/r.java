package hf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f8580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.o f8581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f8582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f8583e;

    public r(Object obj, i iVar, ic.o oVar, Object obj2, Throwable th2) {
        this.f8579a = obj;
        this.f8580b = iVar;
        this.f8581c = oVar;
        this.f8582d = obj2;
        this.f8583e = th2;
    }

    public static r a(r rVar, i iVar, Throwable th2, int i10) {
        Object obj = rVar.f8579a;
        if ((i10 & 2) != 0) {
            iVar = rVar.f8580b;
        }
        i iVar2 = iVar;
        ic.o oVar = rVar.f8581c;
        Object obj2 = rVar.f8582d;
        if ((i10 & 16) != 0) {
            th2 = rVar.f8583e;
        }
        return new r(obj, iVar2, oVar, obj2, th2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return jc.l.a(this.f8579a, rVar.f8579a) && jc.l.a(this.f8580b, rVar.f8580b) && jc.l.a(this.f8581c, rVar.f8581c) && jc.l.a(this.f8582d, rVar.f8582d) && jc.l.a(this.f8583e, rVar.f8583e);
    }

    public final int hashCode() {
        Object obj = this.f8579a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        i iVar = this.f8580b;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        ic.o oVar = this.f8581c;
        int iHashCode3 = (iHashCode2 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        Object obj2 = this.f8582d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f8583e;
        return iHashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f8579a + ", cancelHandler=" + this.f8580b + ", onCancellation=" + this.f8581c + ", idempotentResume=" + this.f8582d + ", cancelCause=" + this.f8583e + ')';
    }

    public /* synthetic */ r(Object obj, i iVar, ic.o oVar, Throwable th2, int i10) {
        this(obj, (i10 & 2) != 0 ? null : iVar, (i10 & 4) != 0 ? null : oVar, (Object) null, (i10 & 16) != 0 ? null : th2);
    }
}
