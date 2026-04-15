package androidx.media3.exoplayer.offline;

import android.graphics.Rect;
import android.view.View;
import b0.r0;
import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.j0;
import j2.u1;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import o.k0;
import p4.c0;
import x0.l0;
import ya.y0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f908a;

    public /* synthetic */ i(int i10) {
        this.f908a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f908a) {
            case 0:
                long j10 = ((d) obj).f894c;
                long j11 = ((d) obj2).f894c;
                int i10 = c0.f16548a;
                if (j10 < j11) {
                    return -1;
                }
                return j10 == j11 ? 0 : 1;
            case 1:
                return jc.l.g(((r0) obj).getIndex(), ((r0) obj2).getIndex());
            case 2:
                d7.f fVar = (d7.f) obj;
                d7.f fVar2 = (d7.f) obj2;
                int iCompare = Integer.compare(fVar2.f5501b, fVar.f5501b);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompareTo = fVar.f5502c.compareTo(fVar2.f5502c);
                return iCompareTo != 0 ? iCompareTo : fVar.f5503d.compareTo(fVar2.f5503d);
            case 3:
                d7.f fVar3 = (d7.f) obj;
                d7.f fVar4 = (d7.f) obj2;
                int iCompare2 = Integer.compare(fVar4.f5500a, fVar3.f5500a);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompareTo2 = fVar4.f5502c.compareTo(fVar3.f5502c);
                return iCompareTo2 != 0 ? iCompareTo2 : fVar4.f5503d.compareTo(fVar3.f5503d);
            case 4:
                j0 j0Var = (j0) obj;
                j0 j0Var2 = (j0) obj2;
                float f10 = j0Var.G.f8805p.F;
                float f11 = j0Var2.G.f8805p.F;
                return f10 == f11 ? jc.l.g(j0Var.w(), j0Var2.w()) : Float.compare(f10, f11);
            case 5:
                View view = (View) obj;
                View view2 = (View) obj2;
                if (view == view2) {
                    return 0;
                }
                k0 k0Var = u1.f10020d;
                Object objG = k0Var.g(view);
                jc.l.b(objG);
                Rect rect = (Rect) objG;
                Object objG2 = k0Var.g(view2);
                jc.l.b(objG2);
                Rect rect2 = (Rect) objG2;
                int i11 = rect.top - rect2.top;
                return i11 == 0 ? rect.bottom - rect2.bottom : i11;
            case 6:
                View view3 = (View) obj;
                View view4 = (View) obj2;
                if (view3 == view4) {
                    return 0;
                }
                k0 k0Var2 = u1.f10020d;
                Object objG3 = k0Var2.g(view3);
                jc.l.b(objG3);
                Rect rect3 = (Rect) objG3;
                Object objG4 = k0Var2.g(view4);
                jc.l.b(objG4);
                Rect rect4 = (Rect) objG4;
                int i12 = rect3.left - rect4.left;
                return i12 == 0 ? (rect3.right - rect4.right) * u1.f10019c : i12 * u1.f10019c;
            case 7:
                return ((m4.q) obj2).f14540j - ((m4.q) obj).f14540j;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                return Integer.compare(((m5.g) ((List) obj).get(0)).f14699f, ((m5.g) ((List) obj2).get(0)).f14699f);
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i13 = 13;
                int i14 = 14;
                return ya.w.f(m5.o.c((m5.o) Collections.max(list, new i(i13)), (m5.o) Collections.max(list2, new i(i13)))).a(list.size(), list2.size()).b((m5.o) Collections.max(list, new i(i14)), (m5.o) Collections.max(list2, new i(i14)), new i(i14)).e();
            case 11:
                return ((m5.f) Collections.max((List) obj)).compareTo((m5.f) Collections.max((List) obj2));
            case 12:
                return ((m5.l) ((List) obj).get(0)).compareTo((m5.l) ((List) obj2).get(0));
            case 13:
                return m5.o.c((m5.o) obj, (m5.o) obj2);
            case 14:
                m5.o oVar = (m5.o) obj;
                m5.o oVar2 = (m5.o) obj2;
                boolean z10 = oVar.f14727e;
                int i15 = oVar.f14732j;
                y0 y0VarA = (z10 && oVar.f14730h) ? m5.p.f14745j : m5.p.f14745j.a();
                boolean z11 = oVar.f14728f.f14475z;
                ya.y yVarB = ya.y.f26074a;
                if (z11) {
                    yVarB = yVarB.b(Integer.valueOf(i15), Integer.valueOf(oVar2.f14732j), m5.p.f14745j.a());
                }
                return yVarB.b(Integer.valueOf(oVar.f14733k), Integer.valueOf(oVar2.f14733k), y0VarA).b(Integer.valueOf(i15), Integer.valueOf(oVar2.f14732j), y0VarA).e();
            case 15:
                return ((n5.s) obj).f15381a - ((n5.s) obj2).f15381a;
            case 16:
                return Float.compare(((n5.s) obj).f15383c, ((n5.s) obj2).f15383c);
            case 17:
                return Integer.compare(((p6.d) obj2).f16802b, ((p6.d) obj).f16802b);
            case 18:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i16 = 0; i16 < bArr.length; i16++) {
                    byte b10 = bArr[i16];
                    byte b11 = bArr2[i16];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            case 19:
                ub.k kVar = (ub.k) obj;
                ub.k kVar2 = (ub.k) obj2;
                return (((Number) kVar.f21544b).intValue() - ((Number) kVar.f21543a).intValue()) - (((Number) kVar2.f21544b).intValue() - ((Number) kVar2.f21543a).intValue());
            case 20:
                return jc.l.g(((l0) obj).f24344b, ((l0) obj2).f24344b);
            case 21:
                return Integer.compare(((x6.d) obj).f24807a.f24810b, ((x6.d) obj2).f24807a.f24810b);
            case 22:
                return Long.compare(((x6.c) obj).f24804b, ((x6.c) obj2).f24804b);
            default:
                z4.b bVar = (z4.b) obj;
                z4.b bVar2 = (z4.b) obj2;
                int iCompare3 = Integer.compare(bVar.f26387c, bVar2.f26387c);
                return iCompare3 != 0 ? iCompare3 : bVar.f26386b.compareTo(bVar2.f26386b);
        }
    }
}
