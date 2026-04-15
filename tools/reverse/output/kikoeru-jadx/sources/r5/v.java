package r5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m4.m0;
import m4.n0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f18877c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18878a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18879b = -1;

    public final boolean a(String str) {
        Matcher matcher = f18877c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i10 = p4.c0.f16548a;
            int i11 = Integer.parseInt(strGroup, 16);
            int i12 = Integer.parseInt(matcher.group(2), 16);
            if (i11 <= 0 && i12 <= 0) {
                return false;
            }
            this.f18878a = i11;
            this.f18879b = i12;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(n0 n0Var) {
        int i10 = 0;
        while (true) {
            m0[] m0VarArr = n0Var.f14409a;
            if (i10 >= m0VarArr.length) {
                return;
            }
            m0 m0Var = m0VarArr[i10];
            if (m0Var instanceof f6.e) {
                f6.e eVar = (f6.e) m0Var;
                if ("iTunSMPB".equals(eVar.f6729c) && a(eVar.f6730d)) {
                    return;
                }
            } else if (m0Var instanceof f6.k) {
                f6.k kVar = (f6.k) m0Var;
                if ("com.apple.iTunes".equals(kVar.f6742b) && "iTunSMPB".equals(kVar.f6743c) && a(kVar.f6744d)) {
                    return;
                }
            } else {
                continue;
            }
            i10++;
        }
    }
}
