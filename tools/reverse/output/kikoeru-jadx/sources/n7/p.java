package n7;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ba.x f15560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f15561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f15562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f15563d;

    public p(ba.x xVar, int[] iArr, String[] strArr) {
        jc.l.e(xVar, "observer");
        jc.l.e(iArr, "tableIds");
        jc.l.e(strArr, "tableNames");
        this.f15560a = xVar;
        this.f15561b = iArr;
        this.f15562c = strArr;
        if (iArr.length != strArr.length) {
            throw new IllegalStateException("Check failed.");
        }
        this.f15563d = !(strArr.length == 0) ? ud.e.X(strArr[0]) : vb.t.f22821a;
    }
}
