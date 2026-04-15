package na;

import bg.e2;
import bg.p0;
import ce.j0;
import com.cnl.kikoeru.R;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f15728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f15729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f15730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ArrayList f15731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ub.p f15732e;

    static {
        int i10;
        int i11;
        int i12;
        bg.u[] uVarArrValues = bg.u.values();
        ArrayList arrayList = new ArrayList(uVarArrValues.length);
        for (bg.u uVar : uVarArrValues) {
            int iOrdinal = uVar.ordinal();
            if (iOrdinal == 0) {
                i12 = R.string.asc;
            } else {
                if (iOrdinal != 1) {
                    throw new j0();
                }
                i12 = R.string.desc;
            }
            arrayList.add(new ub.k(uVar, q.g(i12)));
        }
        f15728a = arrayList;
        e2[] e2VarArrValues = e2.values();
        ArrayList arrayList2 = new ArrayList(e2VarArrValues.length);
        int length = e2VarArrValues.length;
        int i13 = 0;
        while (true) {
            int i14 = R.string.order_release;
            if (i13 >= length) {
                f15729b = arrayList2;
                p0[] p0VarArrValues = p0.values();
                ArrayList arrayList3 = new ArrayList(p0VarArrValues.length);
                for (p0 p0Var : p0VarArrValues) {
                    int iOrdinal2 = p0Var.ordinal();
                    if (iOrdinal2 == 0) {
                        i11 = R.string.order_update;
                    } else if (iOrdinal2 == 1) {
                        i11 = R.string.order_rating;
                    } else if (iOrdinal2 == 2) {
                        i11 = R.string.order_release;
                    } else if (iOrdinal2 == 3) {
                        i11 = R.string.order_review;
                    } else if (iOrdinal2 == 4) {
                        i11 = R.string.order_dl;
                    } else {
                        if (iOrdinal2 != 5) {
                            throw new j0();
                        }
                        i11 = R.string.order_nsfw;
                    }
                    arrayList3.add(new ub.k(p0Var, q.g(i11)));
                }
                f15730c = arrayList3;
                bg.d[] dVarArrValues = bg.d.values();
                ArrayList arrayList4 = new ArrayList(dVarArrValues.length);
                for (bg.d dVar : dVarArrValues) {
                    int iOrdinal3 = dVar.ordinal();
                    if (iOrdinal3 == 0) {
                        i10 = R.string.listen_marked;
                    } else if (iOrdinal3 == 1) {
                        i10 = R.string.listen_listening;
                    } else if (iOrdinal3 == 2) {
                        i10 = R.string.listen_listened;
                    } else if (iOrdinal3 == 3) {
                        i10 = R.string.listen_replay;
                    } else {
                        if (iOrdinal3 != 4) {
                            throw new j0();
                        }
                        i10 = R.string.listen_postponed;
                    }
                    arrayList4.add(new ub.k(dVar, q.g(i10)));
                }
                f15731d = arrayList4;
                f15732e = ub.a.d(new i9.f(22));
                return;
            }
            e2 e2Var = e2VarArrValues[i13];
            switch (e2Var.ordinal()) {
                case 0:
                    break;
                case 1:
                case 2:
                    i14 = R.string.order_create;
                    break;
                case 3:
                    i14 = R.string.order_rating;
                    break;
                case 4:
                    i14 = R.string.order_dl;
                    break;
                case 5:
                    i14 = R.string.order_price;
                    break;
                case 6:
                    i14 = R.string.order_rate;
                    break;
                case 7:
                    i14 = R.string.order_review;
                    break;
                case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                    i14 = R.string.order_id;
                    break;
                case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                    i14 = R.string.order_nsfw;
                    break;
                case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                    i14 = R.string.order_random;
                    break;
                default:
                    throw new j0();
            }
            arrayList2.add(new ub.k(e2Var, q.g(i14)));
            i13++;
        }
    }

    public static final String a(bg.p pVar) {
        jc.l.e(pVar, "<this>");
        String str = pVar.f2942f;
        return jc.l.a(str, "__SYS_PLAYLIST_LIKED") ? q.g(R.string.playlist_sys_liked) : jc.l.a(str, "__SYS_PLAYLIST_MARKED") ? q.g(R.string.playlist_sys_marked) : str;
    }
}
