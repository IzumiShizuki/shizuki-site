package h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ch.z f7847a = new ch.z(y2.q.f25419a, 0, 0);

    public static final y2.d0 a(y2.g0 g0Var, t2.g gVar) {
        y2.d0 d0VarA = g0Var.a(gVar);
        int length = gVar.f20320b.length();
        t2.g gVar2 = d0VarA.f25401a;
        y2.r rVar = d0VarA.f25402b;
        int length2 = gVar2.f20320b.length();
        int iMin = Math.min(length, 100);
        for (int i10 = 0; i10 < iMin; i10++) {
            b(rVar.p(i10), length2, i10);
        }
        b(rVar.p(length), length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i11 = 0; i11 < iMin2; i11++) {
            c(rVar.i(i11), length, i11);
        }
        c(rVar.i(length2), length, length2);
        return new y2.d0(gVar2, new ch.z(rVar, gVar.f20320b.length(), gVar2.f20320b.length()));
    }

    public static final void b(int i10, int i11, int i12) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= i11) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        x.a.c("OffsetMapping.originalToTransformed returned invalid mapping: " + i12 + " -> " + i10 + " is not in range of transformed text [0, " + i11 + ']');
    }

    public static final void c(int i10, int i11, int i12) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= i11) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        x.a.c("OffsetMapping.transformedToOriginal returned invalid mapping: " + i12 + " -> " + i10 + " is not in range of original text [0, " + i11 + ']');
    }
}
