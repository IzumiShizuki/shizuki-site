package u6;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f21399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f21400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f21401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f21402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f21403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f21404h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f21405i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f21406j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f21407k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f21408l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f21409m;

    public c(String str, String str2, long j10, long j11, g gVar, String[] strArr, String str3, String str4, c cVar) {
        this.f21397a = str;
        this.f21398b = str2;
        this.f21405i = str4;
        this.f21402f = gVar;
        this.f21403g = strArr;
        this.f21399c = str2 != null;
        this.f21400d = j10;
        this.f21401e = j11;
        str3.getClass();
        this.f21404h = str3;
        this.f21406j = cVar;
        this.f21407k = new HashMap();
        this.f21408l = new HashMap();
    }

    public static c a(String str) {
        return new c(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            o4.a aVar = new o4.a();
            aVar.f16171a = new SpannableStringBuilder();
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((o4.a) treeMap.get(str)).f16171a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final c b(int i10) {
        ArrayList arrayList = this.f21409m;
        if (arrayList != null) {
            return (c) arrayList.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f21409m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z10) {
        String str = this.f21397a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z10 || zEquals || (zEquals2 && this.f21405i != null)) {
            long j10 = this.f21400d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f21401e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f21409m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f21409m.size(); i10++) {
            ((c) this.f21409m.get(i10)).d(treeSet, z10 || zEquals);
        }
    }

    public final boolean f(long j10) {
        long j11 = this.f21401e;
        long j12 = this.f21400d;
        if (j12 == -9223372036854775807L && j11 == -9223372036854775807L) {
            return true;
        }
        if (j12 <= j10 && j11 == -9223372036854775807L) {
            return true;
        }
        if (j12 != -9223372036854775807L || j10 >= j11) {
            return j12 <= j10 && j10 < j11;
        }
        return true;
    }

    public final void g(long j10, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f21404h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j10) && "div".equals(this.f21397a) && (str2 = this.f21405i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i10 = 0; i10 < c(); i10++) {
            b(i10).g(j10, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(long r19, java.util.Map r21, java.util.HashMap r22, java.lang.String r23, java.util.TreeMap r24) {
        /*
            Method dump skipped, instruction units count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.c.h(long, java.util.Map, java.util.HashMap, java.lang.String, java.util.TreeMap):void");
    }

    public final void i(long j10, boolean z10, String str, TreeMap treeMap) {
        HashMap map = this.f21407k;
        map.clear();
        HashMap map2 = this.f21408l;
        map2.clear();
        String str2 = this.f21397a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f21404h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f21399c && z10) {
            SpannableStringBuilder spannableStringBuilderE = e(str4, treeMap);
            String str5 = this.f21398b;
            str5.getClass();
            spannableStringBuilderE.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z10) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j10)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((o4.a) entry.getValue()).f16171a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i10 = 0; i10 < c(); i10++) {
                b(i10).i(j10, z10 || zEquals, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderE2 = e(str4, treeMap);
                int length = spannableStringBuilderE2.length() - 1;
                while (length >= 0 && spannableStringBuilderE2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderE2.charAt(length) != '\n') {
                    spannableStringBuilderE2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((o4.a) entry2.getValue()).f16171a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
