package x6;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import m4.p0;
import p4.c0;
import p4.s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f24830a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(s sVar) {
        sVar.getClass();
        String strH = sVar.h(StandardCharsets.UTF_8);
        return strH != null && strH.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        int i10 = c0.f16548a;
        String[] strArrSplit = str.split("\\.", 2);
        long j10 = 0;
        for (String str2 : strArrSplit[0].split(":", -1)) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (strArrSplit.length == 2) {
            String strTrim = strArrSplit[1].trim();
            if (strTrim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(strTrim));
            }
            j11 += Long.parseLong(strTrim);
        }
        return j11 * 1000;
    }

    public static void d(s sVar) throws p0 {
        int i10 = sVar.f16612b;
        if (a(sVar)) {
            return;
        }
        sVar.G(i10);
        throw p0.a(null, "Expected WEBVTT. Got " + sVar.h(StandardCharsets.UTF_8));
    }
}
