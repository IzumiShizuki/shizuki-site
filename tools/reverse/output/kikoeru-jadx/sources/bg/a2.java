package bg;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class a2 {
    public static final q1 Companion = new q1();
    public final String A;
    public final String B;
    public final List C;
    public final String D;
    public final String E;
    public final String F;
    public final String G;
    public final Integer H;
    public final String I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f2818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f2822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f2823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f2824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f2825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f2826i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f2827j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f2828k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f2829l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f2830m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f2831n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final double f2832o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f2833p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f2834q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f2835r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f2836s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f2837t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final List f2838u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f2839v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Integer f2840w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final List f2841x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f2842y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f2843z;

    public a2(int i10, int i11, c cVar, int i12, String str, int i13, boolean z10, long j10, String str2, String str3, String str4, String str5, boolean z11, int i14, String str6, List list, double d10, int i15, List list2, String str7, int i16, String str8, List list3, String str9, Integer num, List list4, String str10, String str11, String str12, String str13, List list5, String str14, String str15, String str16, String str17, Integer num2, String str18) {
        if (12054059 != (i10 & 12054059)) {
            int[] iArr = {i10, i11};
            int[] iArr2 = {12054059, 0};
            wf.b1 b1Var = p1.f2953b;
            jc.l.e(b1Var, "descriptor");
            ArrayList arrayList = new ArrayList();
            for (int i17 = 0; i17 < 2; i17++) {
                int i18 = iArr2[i17] & (~iArr[i17]);
                if (i18 != 0) {
                    for (int i19 = 0; i19 < 32; i19++) {
                        if ((i18 & 1) != 0) {
                            arrayList.add(b1Var.f24089e[(i17 * 32) + i19]);
                        }
                        i18 >>>= 1;
                    }
                }
            }
            throw new sf.b(b1Var.f24085a, arrayList);
        }
        this.f2818a = cVar;
        this.f2819b = i12;
        if ((i10 & 4) == 0) {
            this.f2820c = "";
        } else {
            this.f2820c = str;
        }
        this.f2821d = i13;
        if ((i10 & 16) == 0) {
            this.f2822e = false;
        } else {
            this.f2822e = z10;
        }
        this.f2823f = j10;
        if ((i10 & 64) == 0) {
            this.f2824g = null;
        } else {
            this.f2824g = str2;
        }
        if ((i10 & 128) == 0) {
            this.f2825h = null;
        } else {
            this.f2825h = str3;
        }
        if ((i10 & 256) == 0) {
            this.f2826i = null;
        } else {
            this.f2826i = str4;
        }
        this.f2827j = str5;
        this.f2828k = z11;
        this.f2829l = i14;
        if ((i10 & 4096) == 0) {
            this.f2830m = null;
        } else {
            this.f2830m = str6;
        }
        this.f2831n = list;
        this.f2832o = d10;
        this.f2833p = i15;
        this.f2834q = list2;
        this.f2835r = str7;
        this.f2836s = i16;
        if ((524288 & i10) == 0) {
            this.f2837t = null;
        } else {
            this.f2837t = str8;
        }
        this.f2838u = list3;
        this.f2839v = str9;
        if ((4194304 & i10) == 0) {
            this.f2840w = null;
        } else {
            this.f2840w = num;
        }
        this.f2841x = list4;
        if ((16777216 & i10) == 0) {
            this.f2842y = null;
        } else {
            this.f2842y = str10;
        }
        if ((33554432 & i10) == 0) {
            this.f2843z = null;
        } else {
            this.f2843z = str11;
        }
        if ((67108864 & i10) == 0) {
            this.A = null;
        } else {
            this.A = str12;
        }
        if ((134217728 & i10) == 0) {
            this.B = null;
        } else {
            this.B = str13;
        }
        if ((268435456 & i10) == 0) {
            this.C = null;
        } else {
            this.C = list5;
        }
        if ((536870912 & i10) == 0) {
            this.D = null;
        } else {
            this.D = str14;
        }
        if ((1073741824 & i10) == 0) {
            this.E = null;
        } else {
            this.E = str15;
        }
        if ((i10 & Integer.MIN_VALUE) == 0) {
            this.F = null;
        } else {
            this.F = str16;
        }
        if ((i11 & 1) == 0) {
            this.G = null;
        } else {
            this.G = str17;
        }
        if ((i11 & 2) == 0) {
            this.H = null;
        } else {
            this.H = num2;
        }
        if ((i11 & 4) != 0) {
            this.I = str18;
            return;
        }
        String str19 = this.f2824g;
        this.I = str19 == null ? ag.z.f369a + "/api/cover/" + j10 : str19;
    }

    public static a2 a(a2 a2Var, String str, int i10) {
        long j10;
        String str2;
        c cVar = a2Var.f2818a;
        int i11 = a2Var.f2819b;
        String str3 = a2Var.f2820c;
        int i12 = a2Var.f2821d;
        boolean z10 = a2Var.f2822e;
        long j11 = a2Var.f2823f;
        String str4 = a2Var.f2824g;
        String str5 = a2Var.f2825h;
        String str6 = a2Var.f2826i;
        String str7 = a2Var.f2827j;
        boolean z11 = a2Var.f2828k;
        int i13 = a2Var.f2829l;
        String str8 = a2Var.f2830m;
        List list = a2Var.f2831n;
        double d10 = a2Var.f2832o;
        int i14 = a2Var.f2833p;
        List list2 = a2Var.f2834q;
        String str9 = a2Var.f2835r;
        int i15 = a2Var.f2836s;
        String str10 = a2Var.f2837t;
        List list3 = a2Var.f2838u;
        if ((i10 & 2097152) != 0) {
            j10 = j11;
            str2 = a2Var.f2839v;
        } else {
            j10 = j11;
            str2 = str;
        }
        Integer num = a2Var.f2840w;
        List list4 = a2Var.f2841x;
        String str11 = a2Var.f2842y;
        String str12 = a2Var.f2843z;
        String str13 = a2Var.A;
        String str14 = a2Var.B;
        List list5 = a2Var.C;
        String str15 = a2Var.D;
        String str16 = a2Var.E;
        String str17 = a2Var.F;
        String str18 = a2Var.G;
        Integer num2 = a2Var.H;
        a2Var.getClass();
        jc.l.e(cVar, "circle");
        jc.l.e(str3, "create_date");
        jc.l.e(str7, "name");
        jc.l.e(list2, "rate_count_detail");
        jc.l.e(str9, "release");
        jc.l.e(list3, "tags");
        jc.l.e(str2, "title");
        jc.l.e(list4, "vas");
        return new a2(cVar, i11, str3, i12, z10, j10, str4, str5, str6, str7, z11, i13, str8, list, d10, i14, list2, str9, i15, str10, list3, str2, num, list4, str11, str12, str13, str14, list5, str15, str16, str17, str18, num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return jc.l.a(this.f2818a, a2Var.f2818a) && this.f2819b == a2Var.f2819b && jc.l.a(this.f2820c, a2Var.f2820c) && this.f2821d == a2Var.f2821d && this.f2822e == a2Var.f2822e && this.f2823f == a2Var.f2823f && jc.l.a(this.f2824g, a2Var.f2824g) && jc.l.a(this.f2825h, a2Var.f2825h) && jc.l.a(this.f2826i, a2Var.f2826i) && jc.l.a(this.f2827j, a2Var.f2827j) && this.f2828k == a2Var.f2828k && this.f2829l == a2Var.f2829l && jc.l.a(this.f2830m, a2Var.f2830m) && jc.l.a(this.f2831n, a2Var.f2831n) && Double.valueOf(this.f2832o).equals(Double.valueOf(a2Var.f2832o)) && this.f2833p == a2Var.f2833p && jc.l.a(this.f2834q, a2Var.f2834q) && jc.l.a(this.f2835r, a2Var.f2835r) && this.f2836s == a2Var.f2836s && jc.l.a(this.f2837t, a2Var.f2837t) && jc.l.a(this.f2838u, a2Var.f2838u) && jc.l.a(this.f2839v, a2Var.f2839v) && jc.l.a(this.f2840w, a2Var.f2840w) && jc.l.a(this.f2841x, a2Var.f2841x) && jc.l.a(this.f2842y, a2Var.f2842y) && jc.l.a(this.f2843z, a2Var.f2843z) && jc.l.a(this.A, a2Var.A) && jc.l.a(this.B, a2Var.B) && jc.l.a(this.C, a2Var.C) && jc.l.a(this.D, a2Var.D) && jc.l.a(this.E, a2Var.E) && jc.l.a(this.F, a2Var.F) && jc.l.a(this.G, a2Var.G) && jc.l.a(this.H, a2Var.H);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public final int hashCode() {
        int iE = (j2.h0.e(((this.f2818a.hashCode() * 31) + this.f2819b) * 31, 31, this.f2820c) + this.f2821d) * 31;
        boolean z10 = this.f2822e;
        ?? r32 = z10;
        if (z10) {
            r32 = 1;
        }
        int i10 = (iE + r32) * 31;
        long j10 = this.f2823f;
        int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        String str = this.f2824g;
        int iHashCode = (i11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f2825h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f2826i;
        int iE2 = j2.h0.e((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f2827j);
        boolean z11 = this.f2828k;
        int i12 = (((iE2 + (z11 ? 1 : z11)) * 31) + this.f2829l) * 31;
        String str4 = this.f2830m;
        int iHashCode3 = (i12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.f2831n;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        long jDoubleToLongBits = Double.doubleToLongBits(this.f2832o);
        int iE3 = (j2.h0.e(q.t0.z((((((iHashCode3 + iHashCode4) * 31) + ((int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits))) * 31) + this.f2833p) * 31, 31, this.f2834q), 31, this.f2835r) + this.f2836s) * 31;
        String str5 = this.f2837t;
        int iE4 = j2.h0.e(q.t0.z((iE3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.f2838u), 31, this.f2839v);
        Integer num = this.f2840w;
        int iZ = q.t0.z((iE4 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f2841x);
        String str6 = this.f2842y;
        int iHashCode5 = (iZ + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f2843z;
        int iHashCode6 = (iHashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.A;
        int iHashCode7 = (iHashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.B;
        int iHashCode8 = (iHashCode7 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List list2 = this.C;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str10 = this.D;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.E;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.F;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.G;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Integer num2 = this.H;
        return iHashCode13 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "Work(circle=" + this.f2818a + ", circle_id=" + this.f2819b + ", create_date=" + this.f2820c + ", dl_count=" + this.f2821d + ", has_subtitle=" + this.f2822e + ", id=" + this.f2823f + ", mainCoverUrl=" + this.f2824g + ", samCoverUrl=" + this.f2825h + ", thumbnailCoverUrl=" + this.f2826i + ", name=" + this.f2827j + ", nsfw=" + this.f2828k + ", price=" + this.f2829l + ", progress=" + this.f2830m + ", rank=" + this.f2831n + ", rate_average_2dp=" + this.f2832o + ", rate_count=" + this.f2833p + ", rate_count_detail=" + this.f2834q + ", release=" + this.f2835r + ", review_count=" + this.f2836s + ", review_text=" + this.f2837t + ", tags=" + this.f2838u + ", title=" + this.f2839v + ", userRating=" + this.f2840w + ", vas=" + this.f2841x + ", user_name=" + this.f2842y + ", updated_at=" + this.f2843z + ", age_category_string=" + this.A + ", original_workno=" + this.B + ", other_language_editions_in_db=" + this.C + ", work_attributes=" + this.D + ", source_id=" + this.E + ", source_type=" + this.F + ", source_url=" + this.G + ", duration=" + this.H + ')';
    }

    public a2(c cVar, int i10, String str, int i11, boolean z10, long j10, String str2, String str3, String str4, String str5, boolean z11, int i12, String str6, List list, double d10, int i13, List list2, String str7, int i14, String str8, List list3, String str9, Integer num, List list4, String str10, String str11, String str12, String str13, List list5, String str14, String str15, String str16, String str17, Integer num2) {
        String str18;
        jc.l.e(cVar, "circle");
        jc.l.e(str7, "release");
        jc.l.e(list3, "tags");
        jc.l.e(str9, "title");
        jc.l.e(list4, "vas");
        this.f2818a = cVar;
        this.f2819b = i10;
        this.f2820c = str;
        this.f2821d = i11;
        this.f2822e = z10;
        this.f2823f = j10;
        this.f2824g = str2;
        this.f2825h = str3;
        this.f2826i = str4;
        this.f2827j = str5;
        this.f2828k = z11;
        this.f2829l = i12;
        this.f2830m = str6;
        this.f2831n = list;
        this.f2832o = d10;
        this.f2833p = i13;
        this.f2834q = list2;
        this.f2835r = str7;
        this.f2836s = i14;
        this.f2837t = str8;
        this.f2838u = list3;
        this.f2839v = str9;
        this.f2840w = num;
        this.f2841x = list4;
        this.f2842y = str10;
        this.f2843z = str11;
        this.A = str12;
        this.B = str13;
        this.C = list5;
        this.D = str14;
        this.E = str15;
        this.F = str16;
        this.G = str17;
        this.H = num2;
        if (str2 == null) {
            str18 = ag.z.f369a + "/api/cover/" + j10;
        } else {
            str18 = str2;
        }
        this.I = str18;
    }

    public /* synthetic */ a2(c cVar, boolean z10, long j10, String str, String str2, String str3, boolean z11, String str4, List list, String str5, List list2) {
        this(cVar, 0, "", 0, z10, j10, str, str2, str3, "", z11, 0, null, null, 0.0d, 0, vb.r.f22819a, str4, 0, null, list, str5, null, list2, null, null, null, null, null, null, null, null, null, null);
    }
}
