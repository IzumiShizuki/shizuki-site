package s6;

import android.graphics.Color;
import com.tencent.bugly.beta.tinker.TinkerReport;
import j2.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f19532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f19533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f19534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f19535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f19536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f19537h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f19538i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f19539j;

    public d(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f19530a = str;
        this.f19531b = i10;
        this.f19532c = num;
        this.f19533d = num2;
        this.f19534e = f10;
        this.f19535f = z10;
        this.f19536g = z11;
        this.f19537h = z12;
        this.f19538i = z13;
        this.f19539j = i11;
    }

    public static int a(String str) {
        boolean z10;
        try {
            int i10 = Integer.parseInt(str.trim());
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                    z10 = true;
                    break;
                default:
                    z10 = false;
                    break;
            }
            if (z10) {
                return i10;
            }
        } catch (NumberFormatException unused) {
        }
        h0.v("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            p4.c.C("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            p4.c.c(j10 <= 4294967295L);
            return Integer.valueOf(Color.argb(g8.a.q(((j10 >> 24) & 255) ^ 255), g8.a.q(j10 & 255), g8.a.q((j10 >> 8) & 255), g8.a.q((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            p4.c.C("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }
}
