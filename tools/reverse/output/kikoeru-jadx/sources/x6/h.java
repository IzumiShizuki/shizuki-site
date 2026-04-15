package x6;

import android.graphics.Color;
import android.text.TextUtils;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p4.s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f24826a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f24827b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f24828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f24829d;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK, TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK, TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK)));
        map.put("lime", Integer.valueOf(Color.rgb(0, TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK, TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK)));
        map.put("red", Integer.valueOf(Color.rgb(TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK, TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK, 0, TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f24828c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK, TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK, TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK, TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK, TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK, 0, TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f24829d = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.lang.String r19, x6.e r20, java.util.List r21, android.text.SpannableStringBuilder r22, java.util.List r23) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.h.a(java.lang.String, x6.e, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static ArrayList b(List list, String str, e eVar) {
        ?? size;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            b bVar = (b) list.get(i10);
            String str2 = eVar.f24809a;
            Set set = eVar.f24812d;
            String str3 = eVar.f24811c;
            if (bVar.f24786a.isEmpty() && bVar.f24787b.isEmpty() && bVar.f24788c.isEmpty() && bVar.f24789d.isEmpty()) {
                size = TextUtils.isEmpty(str2);
            } else {
                int iA = b.a(bVar.f24789d, b.a(bVar.f24787b, b.a(bVar.f24786a, 0, 1073741824, str), 2, str2), 4, str3);
                size = (iA == -1 || !set.containsAll(bVar.f24788c)) ? 0 : iA + (bVar.f24788c.size() * 4);
            }
            if (size > 0) {
                arrayList.add(new f(size, bVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, e eVar) {
        ArrayList arrayListB = b(list, str, eVar);
        for (int i10 = 0; i10 < arrayListB.size(); i10++) {
            int i11 = ((f) arrayListB.get(i10)).f24814b.f24801p;
            if (i11 != -1) {
                return i11;
            }
        }
        return -1;
    }

    public static c d(String str, Matcher matcher, s sVar, ArrayList arrayList) {
        g gVar = new g();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            gVar.f24815a = i.c(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            gVar.f24816b = i.c(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            e(strGroup3, gVar);
            StringBuilder sb = new StringBuilder();
            sVar.getClass();
            String strH = sVar.h(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strH)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strH.trim());
                strH = sVar.h(StandardCharsets.UTF_8);
            }
            gVar.f24817c = f(str, sb.toString(), arrayList);
            return new c(gVar.a().a(), gVar.f24815a, gVar.f24816b);
        } catch (IllegalArgumentException unused) {
            p4.c.B("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.lang.String r18, x6.g r19) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.h.e(java.lang.String, x6.g):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannedString f(java.lang.String r18, java.lang.String r19, java.util.List r20) {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.h.f(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static void g(String str, g gVar) {
        String strSubstring;
        int i10;
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            i10 = 2;
            switch (strSubstring) {
                case "center":
                case "middle":
                    i10 = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i10 = 0;
                    break;
                default:
                    p4.c.B("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i10 = Integer.MIN_VALUE;
                    break;
            }
            gVar.f24821g = i10;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            gVar.f24819e = i.b(str);
            gVar.f24820f = 0;
        } else {
            gVar.f24819e = Integer.parseInt(str);
            gVar.f24820f = 1;
        }
    }
}
