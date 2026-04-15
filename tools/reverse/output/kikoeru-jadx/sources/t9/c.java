package t9;

import android.os.Process;
import com.cnl.kikoeru.R;
import com.tencent.bugly.beta.tinker.TinkerReport;
import e7.y;
import ef.t;
import ic.k;
import ic.o;
import java.util.Map;
import jc.l;
import jc.z;
import ka.j;
import na.q;
import pc.f0;
import q9.j0;
import ub.a0;
import ub.p;
import ud.n;
import x0.e1;
import x0.v;
import xf.m;
import y8.i;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20578a;

    public /* synthetic */ c(int i10) {
        this.f20578a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ic.k
    public final Object a(Object obj) {
        int i10 = this.f20578a;
        int i11 = 24;
        final int i12 = 0;
        Float fValueOf = null;
        fValueOf = null;
        dValueOf = null;
        Double dValueOf = null;
        a0 a0Var = a0.f21526a;
        switch (i10) {
            case 0:
                l.e((String) obj, "it");
                break;
            case 1:
                l.e((ka.k) obj, "it");
                p pVar = q.f15736a;
                Process.killProcess(Process.myPid());
                break;
            case 2:
                p pVar2 = q.f15736a;
                Process.killProcess(Process.myPid());
                break;
            case 3:
                p pVar3 = q.f15736a;
                Process.killProcess(Process.myPid());
                break;
            case 4:
                y8.i iVar = (y8.i) obj;
                l.e(iVar, "$this$PrefsScreen");
                iVar.a("kikoeru.db", new c(5));
                iVar.a("mmkv.default", new c(6));
                break;
            case 5:
                y8.i iVar2 = (y8.i) obj;
                l.e(iVar2, "$this$prefsGroup");
                iVar2.b(v9.a.f22794g);
                iVar2.b(v9.a.f22795h);
                iVar2.b(v9.a.f22796i);
                iVar2.b(v9.a.f22797j);
                iVar2.b(v9.a.f22798k);
                break;
            case 6:
                y8.i iVar3 = (y8.i) obj;
                l.e(iVar3, "$this$prefsGroup");
                iVar3.b(v9.a.f22789b);
                iVar3.b(v9.a.f22790c);
                iVar3.b(v9.a.f22791d);
                iVar3.b(v9.a.f22792e);
                break;
            case 7:
                wg.b bVar = (wg.b) obj;
                l.e(bVar, "it");
                n nVar = bVar.f24223d;
                if (nVar instanceof wg.b) {
                }
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                wg.b bVar2 = (wg.b) obj;
                l.e(bVar2, "it");
                StringBuilder sb = new StringBuilder();
                sb.append(bVar2.f24221b);
                sb.append('=');
                sb.append(bVar2.f24222c);
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                y8.i iVar4 = (y8.i) obj;
                l.e(iVar4, "$this$PrefsScreen");
                iVar4.a(q.g(R.string.translate_settings), new c(11));
                iVar4.a(q.g(R.string.export_settings), new c(12));
                iVar4.a(q.g(R.string.network_settings), new c(13));
                iVar4.a(q.g(R.string.smart_path), new c(14));
                iVar4.a(q.g(R.string.video_settings), new c(15));
                iVar4.a(q.g(R.string.notification_settings), new c(16));
                iVar4.a(q.g(R.string.clipboard), new c(17));
                iVar4.a(q.g(R.string.cache), new c(18));
                iVar4.a(q.g(R.string.offline), new c(10));
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                y8.i iVar5 = (y8.i) obj;
                l.e(iVar5, "$this$prefsGroup");
                iVar5.b(x9.a.f24873n);
                iVar5.b(x9.a.f24874o);
                iVar5.b(x9.a.f24875p);
                break;
            case 11:
                y8.i iVar6 = (y8.i) obj;
                l.e(iVar6, "$this$prefsGroup");
                iVar6.b(x9.a.f24860a);
                iVar6.b(x9.a.f24861b);
                iVar6.b(x9.a.f24862c);
                break;
            case 12:
                y8.i iVar7 = (y8.i) obj;
                l.e(iVar7, "$this$prefsGroup");
                iVar7.b(x9.a.f24863d);
                break;
            case 13:
                y8.i iVar8 = (y8.i) obj;
                l.e(iVar8, "$this$prefsGroup");
                iVar8.b(x9.a.f24864e);
                break;
            case 14:
                y8.i iVar9 = (y8.i) obj;
                l.e(iVar9, "$this$prefsGroup");
                iVar9.b(x9.a.f24865f);
                iVar9.b(x9.a.f24866g);
                iVar9.b(x9.a.f24867h);
                break;
            case 15:
                y8.i iVar10 = (y8.i) obj;
                l.e(iVar10, "$this$prefsGroup");
                iVar10.b(x9.a.f24868i);
                break;
            case 16:
                y8.i iVar11 = (y8.i) obj;
                l.e(iVar11, "$this$prefsGroup");
                Boolean bool = (Boolean) a0.c.F(Boolean.TYPE, gg.c.a(), "disableNotification", Boolean.valueOf(g9.a.c()));
                bool.getClass();
                final e1 e1VarV = v.v(bool);
                final int i13 = 1;
                iVar11.b(new f1.f(new o() { // from class: x9.b
                    @Override // ic.o
                    public final Object g(Object obj2, Object obj3, Object obj4) {
                        int i14 = i12;
                        i iVar12 = (i) obj2;
                        x0.o oVar = (x0.o) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        switch (i14) {
                            case 0:
                                l.e(iVar12, "$this$prefsItem");
                                if (oVar.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    boolean zC = g9.a.c();
                                    String strG = q.g(R.string.disable_notification);
                                    String strG2 = q.g(R.string.disable_notification_summary);
                                    e1 e1Var = e1VarV;
                                    boolean zF = oVar.f(e1Var);
                                    Object objK = oVar.K();
                                    if (zF || objK == x0.k.f24334a) {
                                        objK = new y(25, e1Var);
                                        oVar.h0(objK);
                                    }
                                    z8.n.a("disableNotification", strG, null, strG2, zC, (k) objK, 0L, false, oVar, 6, TinkerReport.KEY_LOADED_INTERPRET_TYPE_INTERPRET_OK);
                                } else {
                                    oVar.Q();
                                }
                                break;
                            default:
                                l.e(iVar12, "$this$prefsItem");
                                if (oVar.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    z8.n.a("showNotificationStartup", q.g(R.string.show_notification_start), null, null, true, null, 0L, !((Boolean) e1VarV.getValue()).booleanValue(), oVar, 24582, 364);
                                } else {
                                    oVar.Q();
                                }
                                break;
                        }
                        return a0.f21526a;
                    }
                }, 1016073005, true));
                iVar11.b(new f1.f(new o() { // from class: x9.b
                    @Override // ic.o
                    public final Object g(Object obj2, Object obj3, Object obj4) {
                        int i14 = i13;
                        i iVar12 = (i) obj2;
                        x0.o oVar = (x0.o) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        switch (i14) {
                            case 0:
                                l.e(iVar12, "$this$prefsItem");
                                if (oVar.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    boolean zC = g9.a.c();
                                    String strG = q.g(R.string.disable_notification);
                                    String strG2 = q.g(R.string.disable_notification_summary);
                                    e1 e1Var = e1VarV;
                                    boolean zF = oVar.f(e1Var);
                                    Object objK = oVar.K();
                                    if (zF || objK == x0.k.f24334a) {
                                        objK = new y(25, e1Var);
                                        oVar.h0(objK);
                                    }
                                    z8.n.a("disableNotification", strG, null, strG2, zC, (k) objK, 0L, false, oVar, 6, TinkerReport.KEY_LOADED_INTERPRET_TYPE_INTERPRET_OK);
                                } else {
                                    oVar.Q();
                                }
                                break;
                            default:
                                l.e(iVar12, "$this$prefsItem");
                                if (oVar.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    z8.n.a("showNotificationStartup", q.g(R.string.show_notification_start), null, null, true, null, 0L, !((Boolean) e1VarV.getValue()).booleanValue(), oVar, 24582, 364);
                                } else {
                                    oVar.Q();
                                }
                                break;
                        }
                        return a0.f21526a;
                    }
                }, 1763434148, true));
                iVar11.b(x9.a.f24869j);
                break;
            case 17:
                y8.i iVar12 = (y8.i) obj;
                l.e(iVar12, "$this$prefsGroup");
                iVar12.b(x9.a.f24870k);
                iVar12.b(x9.a.f24871l);
                break;
            case 18:
                y8.i iVar13 = (y8.i) obj;
                l.e(iVar13, "$this$prefsGroup");
                iVar13.b(x9.a.f24872m);
                break;
            case 19:
                uf.a aVar = (uf.a) obj;
                l.e(aVar, "$this$buildSerialDescriptor");
                uf.a.a(aVar, "JsonPrimitive", new xf.p(new j0(21)));
                uf.a.a(aVar, "JsonNull", new xf.p(new j0(22)));
                uf.a.a(aVar, "JsonLiteral", new xf.p(new j0(23)));
                uf.a.a(aVar, "JsonObject", new xf.p(new j0(i11)));
                uf.a.a(aVar, "JsonArray", new xf.p(new j0(25)));
                break;
            case 20:
                Map.Entry entry = (Map.Entry) obj;
                l.e(entry, "<destruct>");
                String str = (String) entry.getKey();
                m mVar = (m) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                yf.v.a(str, sb2);
                sb2.append(':');
                sb2.append(mVar);
                break;
            case 21:
                String str2 = (String) obj;
                l.e(str2, "it");
                try {
                    if (t.b0(str2)) {
                        fValueOf = Float.valueOf(Float.parseFloat(str2));
                    }
                    break;
                } catch (NumberFormatException unused) {
                }
                float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 1.0f;
                ((androidx.lifecycle.q) h9.d.c()).y1(fFloatValue);
                f0.P(gg.c.a(), "speedAudioFloat", Float.valueOf(1.0f), z.a(Float.TYPE)).d(Float.valueOf(fFloatValue));
                break;
            case 22:
                String str3 = (String) obj;
                l.e(str3, "it");
                try {
                    if (t.b0(str3)) {
                        dValueOf = Double.valueOf(Double.parseDouble(str3));
                    }
                    break;
                } catch (NumberFormatException unused2) {
                }
                f0.P(gg.c.a(), "volumeAudioDouble", Double.valueOf(1.0d), z.a(Double.TYPE)).d(Double.valueOf(dValueOf != null ? dValueOf.doubleValue() : 1.0d));
                break;
            case 23:
                ((Boolean) obj).getClass();
                j.d(q.g(R.string.restart_app), null, new c(i11), null, null, 509);
                break;
            case 24:
                l.e((ka.g) obj, "it");
                p pVar4 = q.f15736a;
                Process.killProcess(Process.myPid());
                break;
            case 25:
                y8.i iVar14 = (y8.i) obj;
                l.e(iVar14, "$this$PrefsScreen");
                iVar14.a(q.g(R.string.audio_processor), new c(26));
                iVar14.a(q.g(R.string.decode_settings), new c(27));
                iVar14.a(q.g(R.string.audio_focus), new c(28));
                iVar14.a(q.g(R.string.headset), new c(29));
                iVar14.a(q.g(R.string.fast_skip), new y9.c(i12));
                break;
            case 26:
                y8.i iVar15 = (y8.i) obj;
                l.e(iVar15, "$this$prefsGroup");
                iVar15.b(y9.b.f25936a);
                break;
            case 27:
                y8.i iVar16 = (y8.i) obj;
                l.e(iVar16, "$this$prefsGroup");
                iVar16.b(y9.b.f25937b);
                break;
            case 28:
                y8.i iVar17 = (y8.i) obj;
                l.e(iVar17, "$this$prefsGroup");
                iVar17.b(y9.b.f25938c);
                break;
            default:
                y8.i iVar18 = (y8.i) obj;
                l.e(iVar18, "$this$prefsGroup");
                iVar18.b(y9.b.f25939d);
                break;
        }
        return a0Var;
    }
}
