package androidx.media;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.Arrays;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f837a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f838b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f839c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f840d = -1;

    public final boolean equals(Object obj) {
        int i10;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f838b == audioAttributesImplBase.f838b) {
            int i11 = this.f839c;
            int i12 = audioAttributesImplBase.f839c;
            int i13 = audioAttributesImplBase.f840d;
            if (i13 == -1) {
                int i14 = audioAttributesImplBase.f837a;
                int i15 = AudioAttributesCompat.f833b;
                if ((i12 & 1) != 1) {
                    i10 = 4;
                    if ((i12 & 4) != 4) {
                        switch (i14) {
                            case 2:
                                i10 = 0;
                                break;
                            case 3:
                                i10 = 8;
                                break;
                            case 4:
                                break;
                            case 5:
                            case 7:
                            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                                i10 = 5;
                                break;
                            case 6:
                                i10 = 2;
                                break;
                            case 11:
                                i10 = 10;
                                break;
                            case 12:
                            default:
                                i10 = 3;
                                break;
                            case 13:
                                i10 = 1;
                                break;
                        }
                    } else {
                        i10 = 6;
                    }
                } else {
                    i10 = 7;
                }
            } else {
                i10 = i13;
            }
            if (i10 == 6) {
                i12 |= 4;
            } else if (i10 == 7) {
                i12 |= 1;
            }
            if (i11 == (i12 & 273) && this.f837a == audioAttributesImplBase.f837a && this.f840d == i13) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f838b), Integer.valueOf(this.f839c), Integer.valueOf(this.f837a), Integer.valueOf(this.f840d)});
    }

    public final String toString() {
        String strB;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f840d != -1) {
            sb.append(" stream=");
            sb.append(this.f840d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i10 = this.f837a;
        int i11 = AudioAttributesCompat.f833b;
        switch (i10) {
            case 0:
                strB = "USAGE_UNKNOWN";
                break;
            case 1:
                strB = "USAGE_MEDIA";
                break;
            case 2:
                strB = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strB = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strB = "USAGE_ALARM";
                break;
            case 5:
                strB = "USAGE_NOTIFICATION";
                break;
            case 6:
                strB = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strB = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                strB = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                strB = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                strB = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strB = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strB = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strB = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strB = "USAGE_GAME";
                break;
            case 15:
            default:
                strB = t0.B(i10, "unknown usage ");
                break;
            case 16:
                strB = "USAGE_ASSISTANT";
                break;
        }
        sb.append(strB);
        sb.append(" content=");
        sb.append(this.f838b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f839c).toUpperCase());
        return sb.toString();
    }
}
