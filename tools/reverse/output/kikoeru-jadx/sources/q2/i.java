package q2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jc.m f17602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jc.m f17603b;

    /* JADX WARN: Multi-variable type inference failed */
    public i(ic.a aVar, ic.a aVar2) {
        this.f17602a = (jc.m) aVar;
        this.f17603b = (jc.m) aVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ic.a, jc.m] */
    public final ic.a a() {
        return this.f17603b;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ic.a, jc.m] */
    /* JADX WARN: Type inference failed for: r1v6, types: [ic.a, jc.m] */
    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.f17602a.b()).floatValue() + ", maxValue=" + ((Number) this.f17603b.b()).floatValue() + ", reverseScrolling=false)";
    }
}
