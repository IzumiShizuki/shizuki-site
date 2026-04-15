package ug;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f21840k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f21841l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f21842m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f21843n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f21846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f21847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f21848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f21849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f21850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f21851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f21852i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f21853j;

    public o(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, String str5) {
        this.f21844a = str;
        this.f21845b = str2;
        this.f21846c = j10;
        this.f21847d = str3;
        this.f21848e = str4;
        this.f21849f = z10;
        this.f21850g = z11;
        this.f21851h = z12;
        this.f21852i = z13;
        this.f21853j = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return jc.l.a(oVar.f21844a, this.f21844a) && jc.l.a(oVar.f21845b, this.f21845b) && oVar.f21846c == this.f21846c && jc.l.a(oVar.f21847d, this.f21847d) && jc.l.a(oVar.f21848e, this.f21848e) && oVar.f21849f == this.f21849f && oVar.f21850g == this.f21850g && oVar.f21851h == this.f21851h && oVar.f21852i == this.f21852i && jc.l.a(oVar.f21853j, this.f21853j);
    }

    public final int hashCode() {
        int iE = j2.h0.e(j2.h0.e(527, 31, this.f21844a), 31, this.f21845b);
        long j10 = this.f21846c;
        int iE2 = (((((((j2.h0.e(j2.h0.e((iE + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31, this.f21847d), 31, this.f21848e) + (this.f21849f ? 1231 : 1237)) * 31) + (this.f21850g ? 1231 : 1237)) * 31) + (this.f21851h ? 1231 : 1237)) * 31) + (this.f21852i ? 1231 : 1237)) * 31;
        String str = this.f21853j;
        return iE2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f21844a);
        sb.append('=');
        sb.append(this.f21845b);
        if (this.f21851h) {
            long j10 = this.f21846c;
            if (j10 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = ((DateFormat) ah.d.f374a.get()).format(new Date(j10));
                jc.l.d(str, "format(...)");
                sb.append(str);
            }
        }
        if (!this.f21852i) {
            sb.append("; domain=");
            sb.append(this.f21847d);
        }
        sb.append("; path=");
        sb.append(this.f21848e);
        if (this.f21849f) {
            sb.append("; secure");
        }
        if (this.f21850g) {
            sb.append("; httponly");
        }
        String str2 = this.f21853j;
        if (str2 != null) {
            sb.append("; samesite=");
            sb.append(str2);
        }
        String string = sb.toString();
        jc.l.d(string, "toString(...)");
        return string;
    }
}
