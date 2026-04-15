package d9;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.m0;
import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.l0;
import j9.f0;
import java.util.ArrayList;
import java.util.List;
import q.t0;
import q1.i0;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5570a;

    public /* synthetic */ i(int i10) {
        this.f5570a = i10;
    }

    @Override // ic.k
    public final Object a(Object obj) throws Exception {
        z7.c cVarD0;
        int i10 = this.f5570a;
        a0 a0Var = a0.f21526a;
        switch (i10) {
            case 0:
                z7.a aVar = (z7.a) obj;
                jc.l.e(aVar, "_connection");
                try {
                    aVar.d0("DELETE FROM BlacklistBean").Z();
                    return a0Var;
                } finally {
                }
            case 1:
                z7.a aVar2 = (z7.a) obj;
                jc.l.e(aVar2, "_connection");
                cVarD0 = aVar2.d0("SELECT * FROM BlacklistBean");
                try {
                    int iJ = vb.w.j(cVarD0, "id");
                    int iJ2 = vb.w.j(cVarD0, "type");
                    int iJ3 = vb.w.j(cVarD0, "value");
                    ArrayList arrayList = new ArrayList();
                    while (cVarD0.Z()) {
                        arrayList.add(new c9.b((int) cVarD0.getLong(iJ), cVarD0.M(iJ2), cVarD0.M(iJ3)));
                        break;
                    }
                    return arrayList;
                } finally {
                }
            case 2:
                z7.a aVar3 = (z7.a) obj;
                jc.l.e(aVar3, "_connection");
                cVarD0 = aVar3.d0("SELECT * FROM DownloadBean");
                try {
                    int iJ4 = vb.w.j(cVarD0, "id");
                    int iJ5 = vb.w.j(cVarD0, "timestamp");
                    int iJ6 = vb.w.j(cVarD0, "rj");
                    int iJ7 = vb.w.j(cVarD0, "sourceId");
                    int iJ8 = vb.w.j(cVarD0, "releaseTime");
                    int iJ9 = vb.w.j(cVarD0, "tags");
                    int iJ10 = vb.w.j(cVarD0, "vas");
                    int iJ11 = vb.w.j(cVarD0, "circle");
                    int iJ12 = vb.w.j(cVarD0, "nsfw");
                    int iJ13 = vb.w.j(cVarD0, "has_subtitle");
                    int iJ14 = vb.w.j(cVarD0, "icon");
                    int iJ15 = vb.w.j(cVarD0, "name");
                    int iJ16 = vb.w.j(cVarD0, "workJson");
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarD0.Z()) {
                        ArrayList arrayList3 = arrayList2;
                        int i11 = iJ11;
                        int i12 = iJ10;
                        arrayList3.add(new c9.c((int) cVarD0.getLong(iJ4), cVarD0.getLong(iJ5), cVarD0.getLong(iJ6), cVarD0.M(iJ7), cVarD0.M(iJ8), cVarD0.M(iJ9), cVarD0.M(iJ10), cVarD0.M(iJ11), ((int) cVarD0.getLong(iJ12)) != 0, ((int) cVarD0.getLong(iJ13)) != 0, cVarD0.M(iJ14), cVarD0.M(iJ15), cVarD0.M(iJ16)));
                        arrayList2 = arrayList3;
                        iJ10 = i12;
                        iJ11 = i11;
                        break;
                    }
                    return arrayList2;
                } finally {
                }
            case 3:
                z7.a aVar4 = (z7.a) obj;
                jc.l.e(aVar4, "_connection");
                try {
                    aVar4.d0("DELETE FROM HistoryBean").Z();
                    return a0Var;
                } finally {
                }
            case 4:
                z7.a aVar5 = (z7.a) obj;
                jc.l.e(aVar5, "_connection");
                cVarD0 = aVar5.d0("SELECT * FROM HistoryBean");
                try {
                    int iJ17 = vb.w.j(cVarD0, "id");
                    int iJ18 = vb.w.j(cVarD0, "timestamp");
                    int iJ19 = vb.w.j(cVarD0, "rj");
                    int iJ20 = vb.w.j(cVarD0, "sourceId");
                    int iJ21 = vb.w.j(cVarD0, "releaseTime");
                    int iJ22 = vb.w.j(cVarD0, "tags");
                    int iJ23 = vb.w.j(cVarD0, "vas");
                    int iJ24 = vb.w.j(cVarD0, "circle");
                    int iJ25 = vb.w.j(cVarD0, "nsfw");
                    int iJ26 = vb.w.j(cVarD0, "has_subtitle");
                    int iJ27 = vb.w.j(cVarD0, "icon");
                    int iJ28 = vb.w.j(cVarD0, "name");
                    int iJ29 = vb.w.j(cVarD0, "workJson");
                    ArrayList arrayList4 = new ArrayList();
                    while (cVarD0.Z()) {
                        int i13 = iJ29;
                        int i14 = iJ17;
                        arrayList4.add(new c9.d((int) cVarD0.getLong(iJ17), cVarD0.getLong(iJ18), cVarD0.getLong(iJ19), cVarD0.M(iJ20), cVarD0.M(iJ21), cVarD0.M(iJ22), cVarD0.M(iJ23), cVarD0.M(iJ24), ((int) cVarD0.getLong(iJ25)) != 0, ((int) cVarD0.getLong(iJ26)) != 0, cVarD0.M(iJ27), cVarD0.M(iJ28), cVarD0.M(i13)));
                        iJ29 = i13;
                        iJ17 = i14;
                        break;
                    }
                    return arrayList4;
                } finally {
                }
            case 5:
                z7.a aVar6 = (z7.a) obj;
                jc.l.e(aVar6, "_connection");
                cVarD0 = aVar6.d0("SELECT DISTINCT rj FROM LyricBean");
                try {
                    ArrayList arrayList5 = new ArrayList();
                    while (cVarD0.Z()) {
                        arrayList5.add(Long.valueOf(cVarD0.getLong(0)));
                        break;
                    }
                    return arrayList5;
                } finally {
                }
            case 6:
                z7.a aVar7 = (z7.a) obj;
                jc.l.e(aVar7, "_connection");
                cVarD0 = aVar7.d0("SELECT DISTINCT rj FROM LyricBean ORDER BY rj");
                try {
                    ArrayList arrayList6 = new ArrayList();
                    while (cVarD0.Z()) {
                        arrayList6.add(Long.valueOf(cVarD0.getLong(0)));
                        break;
                    }
                    return arrayList6;
                } finally {
                }
            case 7:
                z7.a aVar8 = (z7.a) obj;
                jc.l.e(aVar8, "_connection");
                cVarD0 = aVar8.d0("SELECT * FROM ManualLRCBean");
                try {
                    int iJ30 = vb.w.j(cVarD0, "id");
                    int iJ31 = vb.w.j(cVarD0, "rj");
                    int iJ32 = vb.w.j(cVarD0, "sourceId");
                    int iJ33 = vb.w.j(cVarD0, "name");
                    int iJ34 = vb.w.j(cVarD0, "docName");
                    int iJ35 = vb.w.j(cVarD0, "documentUri");
                    int iJ36 = vb.w.j(cVarD0, "zipInnerPath");
                    ArrayList arrayList7 = new ArrayList();
                    while (cVarD0.Z()) {
                        arrayList7.add(new c9.g((int) cVarD0.getLong(iJ30), cVarD0.getLong(iJ31), cVarD0.M(iJ32), cVarD0.M(iJ33), cVarD0.M(iJ34), cVarD0.M(iJ35), cVarD0.M(iJ36)));
                        break;
                    }
                    return arrayList7;
                } finally {
                }
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                z7.a aVar9 = (z7.a) obj;
                jc.l.e(aVar9, "_connection");
                try {
                    aVar9.d0("DELETE FROM SearchHistoryBean").Z();
                    return a0Var;
                } finally {
                }
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                df.k kVar = (df.k) obj;
                jc.l.e(kVar, "it");
                return kVar.iterator();
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                return Boolean.valueOf(obj == null);
            case 11:
                Context context = (Context) obj;
                jc.l.e(context, "it");
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 12:
                Context context2 = (Context) obj;
                jc.l.e(context2, "it");
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case 13:
                jc.l.e((i4.b) obj, "$this$initializer");
                return new e7.m();
            case 14:
                Context context3 = (Context) obj;
                jc.l.e(context3, "it");
                ContextWrapper contextWrapper = context3 instanceof ContextWrapper ? (ContextWrapper) context3 : null;
                if (contextWrapper != null) {
                    return contextWrapper.getBaseContext();
                }
                return null;
            case 15:
                Context context4 = (Context) obj;
                jc.l.e(context4, "it");
                if (context4 instanceof Activity) {
                    return (Activity) context4;
                }
                return null;
            case 16:
                e7.u uVar = (e7.u) obj;
                jc.l.e(uVar, "it");
                return uVar.f6401c;
            case 17:
                e7.u uVar2 = (e7.u) obj;
                jc.l.e(uVar2, "it");
                if (!(uVar2 instanceof e7.w)) {
                    return null;
                }
                h7.k kVar2 = ((e7.w) uVar2).f6409f;
                return kVar2.r(kVar2.f8197b);
            case 18:
                return new f7.a(m0.b((i4.b) obj));
            case 19:
                return ((e7.j) obj).f6338f;
            case 20:
                e7.u uVar3 = ((e7.j) ((q.m) obj).c()).f6334b;
                jc.l.c(uVar3, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                int i15 = e7.u.f6398e;
                for (e7.u uVar4 : e7.g.b((f7.h) uVar3)) {
                }
                return null;
            case 21:
                i0 i0Var = (i0) obj;
                jc.l.e(i0Var, "$this$graphicsLayer");
                i0Var.b(0.99f);
                return a0Var;
            case 22:
                l0 l0Var = (l0) obj;
                jc.l.e(l0Var, "$this$drawWithContent");
                long j10 = q1.q.f17574g;
                q1.q qVar = new q1.q(j10);
                long j11 = q1.q.f17569b;
                List listX = ud.b.x(qVar, new q1.q(j11), new q1.q(j11), new q1.q(j11), new q1.q(j11), new q1.q(j11), new q1.q(j11), new q1.q(j11), new q1.q(j10));
                l0Var.b();
                t0.p(l0Var, m3.l.y(listX), 0L, 0L, 0.0f, null, 62);
                return a0Var;
            case 23:
                f0 f0Var = (f0) obj;
                jc.l.e(f0Var, "it");
                ((androidx.lifecycle.q) h9.d.c()).s1(5, f0Var.f10694a);
                return a0Var;
            case 24:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 25:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 26:
                char cCharValue = ((Character) obj).charValue();
                if (cCharValue != 'T' && cCharValue != 't') {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 27:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 28:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            default:
                char cCharValue2 = ((Character) obj).charValue();
                return Boolean.valueOf('0' <= cCharValue2 && cCharValue2 < ':');
        }
    }
}
