package y9;

import com.cnl.kikoeru.R;
import com.tencent.bugly.beta.tinker.TinkerReport;
import ic.o;
import jc.l;
import m0.z8;
import na.q;
import ub.a0;
import x0.k;
import x0.r0;
import y.k1;
import y8.i;
import z8.e;
import z8.n;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25935a;

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        switch (this.f25935a) {
            case 0:
                x0.o oVar = (x0.o) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                l.e((i) obj, "$this$prefsItem");
                if (oVar.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    n.a("reverseAudio", q.g(R.string.reverse_audio), null, q.g(R.string.reverse_audio_summary), false, null, 0L, false, oVar, 24582, 484);
                    n.a("mergeAudio", q.g(R.string.merge_audio), null, q.g(R.string.merge_audio_summary), false, null, 0L, false, oVar, 24582, 484);
                    String strG = q.g(R.string.playback_speed);
                    Object objK = oVar.K();
                    r0 r0Var = k.f24334a;
                    if (objK == r0Var) {
                        objK = new t9.c(21);
                        oVar.h0(objK);
                    }
                    e.a("speedAudio", strG, null, null, "1", null, (ic.k) objK, null, 0L, 0L, false, false, false, oVar, 12779526, 16220);
                    String strG2 = q.g(R.string.loudness_ratio);
                    Object objK2 = oVar.K();
                    if (objK2 == r0Var) {
                        objK2 = new t9.c(22);
                        oVar.h0(objK2);
                    }
                    e.a("volumeAudio", strG2, null, null, "1", null, (ic.k) objK2, null, 0L, 0L, false, false, false, oVar, 12779526, 16220);
                } else {
                    oVar.Q();
                }
                break;
            case 1:
                x0.o oVar2 = (x0.o) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                l.e((i) obj, "$this$prefsItem");
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    String strG3 = q.g(R.string.decode_force_software);
                    String strG4 = q.g(R.string.decode_force_software_summary);
                    Object objK3 = oVar2.K();
                    if (objK3 == k.f24334a) {
                        objK3 = new t9.c(23);
                        oVar2.h0(objK3);
                    }
                    n.a("forceSoftwareDecode", strG3, null, strG4, false, (ic.k) objK3, 0L, false, oVar2, 221190, TinkerReport.KEY_LOADED_INTERPRET_TYPE_INTERPRET_OK);
                } else {
                    oVar2.Q();
                }
                break;
            case 2:
                x0.o oVar3 = (x0.o) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                l.e((i) obj, "$this$prefsItem");
                if (oVar3.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    n.a("ignoreAudioFocus", q.g(R.string.ignore_audio_focus), null, q.g(R.string.ignore_audio_focus_summary), false, null, 0L, false, oVar3, 24582, 484);
                } else {
                    oVar3.Q();
                }
                break;
            case 3:
                x0.o oVar4 = (x0.o) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                l.e((i) obj, "$this$prefsItem");
                if (oVar4.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    n.a("detectHeadsetUnplug", q.g(R.string.pause_when_unplug), null, null, true, null, 0L, false, oVar4, 24582, 492);
                } else {
                    oVar4.Q();
                }
                break;
            case 4:
                x0.o oVar5 = (x0.o) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                l.e((k1) obj, "$this$TextButton");
                if (oVar5.N(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    z8.b(q.g(R.string.btn_confirm), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar5, 0, 0, 131070);
                } else {
                    oVar5.Q();
                }
                break;
            case 5:
                x0.o oVar6 = (x0.o) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                l.e((k1) obj, "$this$TextButton");
                if (oVar6.N(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    z8.b(q.g(R.string.btn_cancel), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar6, 0, 0, 131070);
                } else {
                    oVar6.Q();
                }
                break;
            case 6:
                x0.o oVar7 = (x0.o) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                l.e((k1) obj, "$this$DropdownMenuItem");
                if (oVar7.N(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    z8.b(q.g(R.string.choose_name_encode), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar7, 0, 0, 131070);
                } else {
                    oVar7.Q();
                }
                break;
            case 7:
                x0.o oVar8 = (x0.o) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                l.e((k1) obj, "$this$DropdownMenuItem");
                if (oVar8.N(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    z8.b(q.g(R.string.choose_content_encode), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar8, 0, 0, 131070);
                } else {
                    oVar8.Q();
                }
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                x0.o oVar9 = (x0.o) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                l.e((k1) obj, "$this$TextButton");
                if (oVar9.N(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    z8.b(n7.e.E(R.string.btn_confirm, oVar9), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar9, 0, 0, 131070);
                } else {
                    oVar9.Q();
                }
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                x0.o oVar10 = (x0.o) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                l.e((k1) obj, "$this$TextButton");
                if (oVar10.N(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    z8.b(n7.e.E(R.string.btn_cancel, oVar10), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar10, 0, 0, 131070);
                } else {
                    oVar10.Q();
                }
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                x0.o oVar11 = (x0.o) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                l.e((k1) obj, "$this$TextButton");
                if (oVar11.N(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    z8.b(q.g(R.string.btn_delete), null, q1.q.f17572e, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar11, 384, 0, 131066);
                } else {
                    oVar11.Q();
                }
                break;
            case 11:
                x0.o oVar12 = (x0.o) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                l.e((k1) obj, "$this$TextButton");
                if (oVar12.N(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    z8.b(q.g(R.string.btn_cancel), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar12, 0, 0, 131070);
                } else {
                    oVar12.Q();
                }
                break;
            case 12:
                x0.o oVar13 = (x0.o) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                l.e((k1) obj, "$this$TextButton");
                if (oVar13.N(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    z8.b(q.g(R.string.btn_confirm), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar13, 0, 0, 131070);
                } else {
                    oVar13.Q();
                }
                break;
            default:
                x0.o oVar14 = (x0.o) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                l.e((k1) obj, "$this$DropdownMenuItem");
                if (oVar14.N(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    z8.b(q.g(R.string.btn_delete), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar14, 0, 0, 131070);
                } else {
                    oVar14.Q();
                }
                break;
        }
        return a0.f21526a;
    }
}
