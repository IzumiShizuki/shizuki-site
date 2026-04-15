package m0;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g4 implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13018a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13021d;

    public /* synthetic */ g4(int i10, int i11, g2.g1 g1Var) {
        this.f13019b = i10;
        this.f13021d = g1Var;
        this.f13020c = i11;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f13018a) {
            case 0:
                ((g2.f1) obj).h((g2.g1) this.f13021d, lc.b.R((this.f13019b - r0.f7180a) / 2.0f), lc.b.R((this.f13020c - r0.f7181b) / 2.0f), 0.0f);
                break;
            default:
                q1.h hVar = (q1.h) this.f13021d;
                t2.p pVar = (t2.p) obj;
                t2.a aVar = pVar.f20377a;
                int iD = pVar.d(this.f13019b);
                int iD2 = pVar.d(this.f13020c);
                CharSequence charSequence = aVar.f20258e;
                if (iD < 0 || iD > iD2 || iD2 > charSequence.length()) {
                    z2.a.a("start(" + iD + ") or end(" + iD2 + ") is out of range [0.." + charSequence.length() + "], or start > end!");
                }
                Path path = new Path();
                u2.k kVar = aVar.f20257d;
                kVar.f21253f.getSelectionPath(iD, iD2, path);
                int i10 = kVar.f21255h;
                if (i10 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i10);
                }
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(pVar.f20382f)) & 4294967295L);
                Matrix matrix = new Matrix();
                matrix.setTranslate(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                path.transform(matrix);
                int i11 = (int) 0;
                hVar.f17511a.addPath(path, Float.intBitsToFloat(i11), Float.intBitsToFloat(i11));
                break;
        }
        return ub.a0.f21526a;
    }

    public /* synthetic */ g4(q1.h hVar, int i10, int i11) {
        this.f13021d = hVar;
        this.f13019b = i10;
        this.f13020c = i11;
    }
}
