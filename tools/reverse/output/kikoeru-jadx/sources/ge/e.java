package ge;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends o {
    @Override // ge.g
    public final se.w a(yc.y yVar) {
        jc.l.e(yVar, "module");
        vc.i iVarG = yVar.g();
        iVarG.getClass();
        return iVarG.s(vc.k.f22848g);
    }

    @Override // ge.g
    public final String toString() {
        String strValueOf;
        Object obj = this.f7527a;
        Integer numValueOf = Integer.valueOf(((Character) obj).charValue());
        char cCharValue = ((Character) obj).charValue();
        switch (cCharValue) {
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                strValueOf = "\\b";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                strValueOf = "\\t";
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                strValueOf = "\\n";
                break;
            case 11:
            default:
                byte type = (byte) Character.getType(cCharValue);
                strValueOf = (type != 0 && type != 13 && type != 14 && type != 15 && type != 16 && type != 18 && type != 19) ? String.valueOf(cCharValue) : "?";
                break;
            case '\f':
                strValueOf = "\\f";
                break;
            case '\r':
                strValueOf = "\\r";
                break;
        }
        return String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{numValueOf, strValueOf}, 2));
    }
}
