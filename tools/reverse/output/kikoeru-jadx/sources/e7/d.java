package e7;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends k0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6310k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, boolean z10) {
        super(z10);
        this.f6310k = i10;
    }

    @Override // e7.k0
    public final Object a(String str, Bundle bundle) {
        switch (this.f6310k) {
            case 0:
                jc.l.e(bundle, "bundle");
                if (!bundle.containsKey(str) || ud.n.u(str, bundle)) {
                    return null;
                }
                boolean z10 = bundle.getBoolean(str, false);
                if (z10 || !bundle.getBoolean(str, true)) {
                    return Boolean.valueOf(z10);
                }
                ud.s.s(str);
                throw null;
            case 1:
                jc.l.e(bundle, "bundle");
                float f10 = bundle.getFloat(str, Float.MIN_VALUE);
                if (f10 != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
                    return Float.valueOf(f10);
                }
                ud.s.s(str);
                throw null;
            case 2:
                jc.l.e(bundle, "bundle");
                return Integer.valueOf(ud.n.n(str, bundle));
            case 3:
                jc.l.e(bundle, "bundle");
                long j10 = bundle.getLong(str, Long.MIN_VALUE);
                if (j10 != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
                    return Long.valueOf(j10);
                }
                ud.s.s(str);
                throw null;
            default:
                jc.l.e(bundle, "bundle");
                if (!bundle.containsKey(str) || ud.n.u(str, bundle)) {
                    return null;
                }
                String string = bundle.getString(str);
                if (string != null) {
                    return string;
                }
                ud.s.s(str);
                throw null;
        }
    }

    @Override // e7.k0
    public final String b() {
        switch (this.f6310k) {
            case 0:
                return "boolean";
            case 1:
                return "float";
            case 2:
                return "integer";
            case 3:
                return "long";
            default:
                return "string";
        }
    }

    @Override // e7.k0
    public final Object d(String str) {
        boolean z10;
        int i10;
        String strSubstring;
        long j10;
        switch (this.f6310k) {
            case 0:
                if (str.equals("true")) {
                    z10 = true;
                } else {
                    if (!str.equals("false")) {
                        throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                    }
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 1:
                return Float.valueOf(Float.parseFloat(str));
            case 2:
                if (ef.u.k0(str, "0x", false)) {
                    String strSubstring2 = str.substring(2);
                    jc.l.d(strSubstring2, "substring(...)");
                    gh.g.j(16);
                    i10 = Integer.parseInt(strSubstring2, 16);
                } else {
                    i10 = Integer.parseInt(str);
                }
                return Integer.valueOf(i10);
            case 3:
                if (ef.u.c0(str, "L", false)) {
                    strSubstring = str.substring(0, str.length() - 1);
                    jc.l.d(strSubstring, "substring(...)");
                } else {
                    strSubstring = str;
                }
                if (ef.u.k0(str, "0x", false)) {
                    String strSubstring3 = strSubstring.substring(2);
                    jc.l.d(strSubstring3, "substring(...)");
                    gh.g.j(16);
                    j10 = Long.parseLong(strSubstring3, 16);
                } else {
                    j10 = Long.parseLong(strSubstring);
                }
                return Long.valueOf(j10);
            default:
                if (str.equals("null")) {
                    return null;
                }
                return str;
        }
    }

    @Override // e7.k0
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.f6310k) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                jc.l.e(str, "key");
                bundle.putBoolean(str, zBooleanValue);
                break;
            case 1:
                float fFloatValue = ((Number) obj).floatValue();
                jc.l.e(str, "key");
                bundle.putFloat(str, fFloatValue);
                break;
            case 2:
                int iIntValue = ((Number) obj).intValue();
                jc.l.e(str, "key");
                bundle.putInt(str, iIntValue);
                break;
            case 3:
                long jLongValue = ((Number) obj).longValue();
                jc.l.e(str, "key");
                bundle.putLong(str, jLongValue);
                break;
            default:
                String str2 = (String) obj;
                jc.l.e(str, "key");
                if (str2 == null) {
                    ua.j.s(str, bundle);
                } else {
                    ua.j.u(bundle, str, str2);
                }
                break;
        }
    }
}
