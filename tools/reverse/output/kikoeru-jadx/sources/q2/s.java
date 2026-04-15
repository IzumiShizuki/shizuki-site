package q2;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.ArrayList;
import java.util.List;
import q1.l0;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s extends jc.m implements ic.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f17650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f17651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s f17652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s f17653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final s f17654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final s f17655h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final s f17656i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final s f17657j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final s f17658k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final s f17659l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final s f17660m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final s f17661n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final s f17662o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final s f17663p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final s f17664q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final s f17665r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final s f17666s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final s f17667t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final s f17668u;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17669b;

    static {
        int i10 = 2;
        f17650c = new s(i10, 0);
        f17651d = new s(i10, 1);
        f17652e = new s(i10, 2);
        f17653f = new s(i10, 3);
        f17654g = new s(i10, 4);
        f17655h = new s(i10, 5);
        f17656i = new s(i10, 6);
        f17657j = new s(i10, 7);
        f17658k = new s(i10, 8);
        f17659l = new s(i10, 9);
        f17660m = new s(i10, 10);
        f17661n = new s(i10, 11);
        f17662o = new s(i10, 12);
        f17663p = new s(i10, 13);
        f17664q = new s(i10, 14);
        f17665r = new s(i10, 15);
        f17666s = new s(i10, 16);
        f17667t = new s(i10, 17);
        f17668u = new s(i10, 18);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i10, int i11) {
        super(i10);
        this.f17669b = i11;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        String str;
        ub.e eVar;
        switch (this.f17669b) {
            case 0:
                return (k1.c) obj;
            case 1:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList arrayListH0 = vb.m.H0(list);
                arrayListH0.addAll(list2);
                return arrayListH0;
            case 2:
                return (k1.n) obj;
            case 3:
                return (a0) obj;
            case 4:
                return (a0) obj;
            case 5:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 6:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 7:
                return (a0) obj;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                h hVar = (h) obj;
                int i10 = ((h) obj2).f17601a;
                return hVar;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                return (l0) obj;
            case 11:
                return (String) obj;
            case 12:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 == null) {
                    return list4;
                }
                ArrayList arrayListH02 = vb.m.H0(list3);
                arrayListH02.addAll(list4);
                return arrayListH02;
            case 13:
                Float f10 = (Float) obj;
                ((Number) obj2).floatValue();
                return f10;
            case 14:
                return (String) obj;
            case 15:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 16:
                a aVar = (a) obj;
                a aVar2 = (a) obj2;
                if (aVar == null || (str = aVar.f17586a) == null) {
                    str = aVar2.f17586a;
                }
                if (aVar == null || (eVar = aVar.f17587b) == null) {
                    eVar = aVar2.f17587b;
                }
                return new a(str, eVar);
            case 17:
                return obj == null ? obj2 : obj;
            default:
                o oVar = (o) obj2;
                Object objValueOf = Float.valueOf(0.0f);
                k kVar = ((o) obj).f17639d;
                w wVar = t.f17688s;
                Object objG = kVar.f17630a.g(wVar);
                if (objG == null) {
                    objG = objValueOf;
                }
                float fFloatValue = ((Number) objG).floatValue();
                Object objG2 = oVar.f17639d.f17630a.g(wVar);
                if (objG2 != null) {
                    objValueOf = objG2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
        }
    }
}
