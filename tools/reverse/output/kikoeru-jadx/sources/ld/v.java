package ld;

import com.tencent.bugly.beta.tinker.TinkerReport;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final be.c f12255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final be.b f12256b;

    static {
        be.c cVar = new be.c("kotlin.jvm.JvmField");
        f12255a = cVar;
        lc.b.X(cVar);
        lc.b.X(new be.c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f12256b = lc.b.v("kotlin/jvm/internal/RepeatableContainer", false);
    }

    public static final String a(String str) {
        jc.l.e(str, "propertyName");
        if (c(str)) {
            return str;
        }
        return "get" + ud.b.h(str);
    }

    public static final String b(String str) {
        String strH;
        StringBuilder sb = new StringBuilder("set");
        if (c(str)) {
            strH = str.substring(2);
            jc.l.d(strH, "substring(...)");
        } else {
            strH = ud.b.h(str);
        }
        sb.append(strH);
        return sb.toString();
    }

    public static final boolean c(String str) {
        jc.l.e(str, "name");
        if (ef.u.k0(str, "is", false) && str.length() != 2) {
            char cCharAt = str.charAt(2);
            if (jc.l.g(97, cCharAt) > 0 || jc.l.g(cCharAt, TinkerReport.KEY_APPLIED_DEXOPT_EXIST) > 0) {
                return true;
            }
        }
        return false;
    }
}
