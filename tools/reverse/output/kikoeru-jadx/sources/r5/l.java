package r5;

import android.net.Uri;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import m4.d1;
import ya.a1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l implements r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f18850e = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m0.w f18851f = new m0.w(new d1(15));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m0.w f18852g = new m0.w(new d1(16));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a1 f18853a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18856d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m3.l f18855c = new m3.l(17);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18854b = true;

    public final void a(int i10, ArrayList arrayList) {
        switch (i10) {
            case 0:
                arrayList.add(new y6.a());
                break;
            case 1:
                arrayList.add(new y6.c());
                break;
            case 2:
                arrayList.add(new y6.d(0));
                break;
            case 3:
                arrayList.add(new s5.a());
                break;
            case 4:
                n nVarC = f18851f.C(0);
                if (nVarC == null) {
                    arrayList.add(new w5.b());
                } else {
                    arrayList.add(nVarC);
                }
                break;
            case 5:
                arrayList.add(new x5.b());
                break;
            case 6:
                arrayList.add(new j6.d(this.f18855c, this.f18854b ? 0 : 2));
                break;
            case 7:
                arrayList.add(new k6.d(0));
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                arrayList.add(new l6.j(this.f18855c, this.f18854b ? 0 : 32));
                arrayList.add(new l6.m(this.f18855c, this.f18854b ? 0 : 16));
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                arrayList.add(new m6.d());
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                arrayList.add(new y6.z());
                break;
            case 11:
                if (this.f18853a == null) {
                    ya.g0 g0Var = ya.i0.f25998b;
                    this.f18853a = a1.f25946e;
                }
                arrayList.add(new y6.d0(1, !this.f18854b ? 1 : 0, this.f18855c, new p4.y(0L), new s3.e(0, this.f18853a)));
                break;
            case 12:
                z6.d dVar = new z6.d();
                dVar.f26501c = 0;
                dVar.f26502d = -1L;
                dVar.f26504f = -1;
                dVar.f26505g = -1L;
                arrayList.add(dVar);
                break;
            case 14:
                arrayList.add(new j5.p(this.f18856d));
                break;
            case 15:
                n nVarC2 = f18852g.C(new Object[0]);
                if (nVarC2 != null) {
                    arrayList.add(nVarC2);
                }
                break;
            case 16:
                arrayList.add(new t5.b(!this.f18854b ? 1 : 0, this.f18855c));
                break;
            case 17:
                arrayList.add(new n6.a(0));
                break;
            case 18:
                arrayList.add(new a7.a(0));
                break;
            case 19:
                arrayList.add(new n6.a(1));
                break;
            case 20:
                arrayList.add(new a7.a(2));
                break;
            case 21:
                arrayList.add(new a7.a(1));
                break;
        }
    }

    @Override // r5.r
    public final synchronized n[] f(Uri uri, Map map) {
        ArrayList arrayList;
        try {
            int[] iArr = f18850e;
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            int iB = gh.g.B((list == null || list.isEmpty()) ? null : (String) list.get(0));
            if (iB != -1) {
                a(iB, arrayList);
            }
            int iC = gh.g.C(uri);
            if (iC != -1 && iC != iB) {
                a(iC, arrayList);
            }
            for (int i10 = 0; i10 < 21; i10++) {
                int i11 = iArr[i10];
                if (i11 != iB && i11 != iC) {
                    a(i11, arrayList);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (n[]) arrayList.toArray(new n[arrayList.size()]);
    }
}
