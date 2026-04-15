package g1;

import androidx.lifecycle.m0;
import androidx.lifecycle.q;
import com.tencent.bugly.beta.tinker.TinkerReport;
import e7.u;
import e7.w;
import h1.n;
import java.util.Collection;
import java.util.Map;
import m0.s2;
import q2.v;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7137a;

    public /* synthetic */ d(int i10) {
        this.f7137a = i10;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f7137a) {
            case 0:
                return new e((Map) obj);
            case 1:
                return obj;
            case 2:
                synchronized (n.f8051c) {
                    ?? r12 = n.f8057i;
                    int size = ((Collection) r12).size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((ic.k) r12.get(i10)).a(obj);
                    }
                }
                return a0.f21526a;
            case 3:
                d dVar = n.f8049a;
                return a0.f21526a;
            case 4:
                i4.b bVar = (i4.b) obj;
                jc.l.e(bVar, "$this$initializer");
                return new h7.b(m0.b(bVar));
            case 5:
                u uVar = (u) obj;
                jc.l.e(uVar, "destination");
                w wVar = uVar.f6401c;
                if (wVar == null || wVar.f6409f.f8197b != uVar.f6400b.f8187a) {
                    return null;
                }
                return wVar;
            case 6:
                u uVar2 = (u) obj;
                jc.l.e(uVar2, "destination");
                w wVar2 = uVar2.f6401c;
                if (wVar2 == null || wVar2.f6409f.f8197b != uVar2.f6400b.f8187a) {
                    return null;
                }
                return wVar2;
            case 7:
                u uVar3 = (u) obj;
                jc.l.e(uVar3, "it");
                return Integer.valueOf(uVar3.f6400b.f8187a);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                yb.f fVar = (yb.f) obj;
                if (fVar instanceof hf.u) {
                    return (hf.u) fVar;
                }
                return null;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                return (i8.h) obj;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue == -2 || iIntValue == -1) {
                    ((q) h9.d.c()).p1();
                } else if (iIntValue == 1) {
                    ((q) h9.d.c()).k();
                }
                return a0.f21526a;
            case 11:
                Throwable th2 = (Throwable) obj;
                jc.l.e(th2, "it");
                th2.printStackTrace();
                return a0.f21526a;
            case 12:
                jc.l.e((String) obj, "it");
                return Boolean.valueOf(!r7.equals("[Events]"));
            case 13:
                jc.l.e((String) obj, "it");
                return Boolean.valueOf(!ef.u.k0(r7, "Format:", false));
            case 14:
                jc.l.e((String) obj, "it");
                return Boolean.valueOf(!ef.u.k0(r7, "Dialogue:", false));
            case 15:
                String str = (String) obj;
                jc.l.e(str, "it");
                return Boolean.valueOf(ef.u.k0(str, "Dialogue:", false));
            case 16:
                return Integer.valueOf(((Integer) obj).intValue() + TinkerReport.KEY_APPLIED_SUCC_COST_5S_LESS);
            case 17:
                return Integer.valueOf(((Integer) obj).intValue() + TinkerReport.KEY_APPLIED_SUCC_COST_5S_LESS);
            case 18:
                jc.l.e((String) obj, "it");
                return a0.f21526a;
            case 19:
                jc.l.e((q2.k) obj, "$this$semantics");
                return a0.f21526a;
            case 20:
                ((Integer) obj).getClass();
                return "SmallMusicCard";
            case 21:
                ((Integer) obj).getClass();
                return "BigMusicCard";
            case 22:
                return Long.valueOf(((String) obj).length() <= 0 ? 0L : 1000L);
            case 23:
                return 1000L;
            case 24:
                return Boolean.TRUE;
            case 25:
                v.e((q2.k) obj, 0);
                return a0.f21526a;
            case 26:
                return Boolean.TRUE;
            case 27:
                float f10 = s2.f13591a;
                return Boolean.TRUE;
            case 28:
                return Boolean.TRUE;
            default:
                return a0.f21526a;
        }
    }
}
